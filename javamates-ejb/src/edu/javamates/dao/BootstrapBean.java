package edu.javamates.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.jdbc.Work;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.javamates.entity.Claim;

@Stateless
public class BootstrapBean implements BootstrapBeanLocal {
	private static final Logger log = LoggerFactory
			.getLogger(BootstrapBean.class);

	@PersistenceContext(unitName = "javamates-model")
	protected EntityManager entityManager;

	@Override
	public void init() {
		log.info("-> init");

		for (int i = 0; i < 17; i++) {
			Claim claim = new Claim();

			claim.setAmount(new BigDecimal("1400"));

			claim.setCreateDate(new Date());

			claim.setDescription("Claim " + i);

			claim.setPeriod(14);

			claim.setPurpose_id(0L);

			claim.setRate(new BigDecimal("1.5"));

			claim.setStatusId(0L);

			claim.setUserId(0L);

			entityManager.persist(claim);
		}

		log.info("init -> OK");
	}

	private boolean tableExists(String tableName) {
		Session hibernateSession = entityManager.unwrap(Session.class);

		TableSearchWork work = new TableSearchWork(tableName);

		hibernateSession.doWork(work);

		return work.existFlag;
	}

	class TableSearchWork implements Work {
		boolean existFlag;

		String tableName;

		TableSearchWork(String tableName) {
			this.tableName = tableName;
		}

		@Override
		public void execute(Connection connection) throws SQLException {
			DatabaseMetaData metaData = null;
			try {
				metaData = connection.getMetaData();
			} catch (SQLException e) {
				throw new RuntimeException(e.getCause());
			}

			ResultSet tablesResultSet = null;
			try {
				tablesResultSet = metaData.getTables(null, null, tableName,
						new String[] { "TABLE", "SEQUENCE" });

				existFlag = tablesResultSet.next();
			} catch (SQLException e) {
				throw new RuntimeException(e.getCause());
			} finally {
				if (tablesResultSet != null)
					try {
						tablesResultSet.close();
					} catch (SQLException e) {
						log.error("Error closing tables ResultSet", e);
					}
			}
		}
	}

}
