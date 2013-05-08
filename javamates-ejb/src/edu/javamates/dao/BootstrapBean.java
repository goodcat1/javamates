package edu.javamates.dao;

import java.math.BigDecimal;
import java.util.Date;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.javamates.entity.Claim;

@Stateless
public class BootstrapBean implements BootstrapBeanLocal {
	private static final Logger log = LoggerFactory
			.getLogger(BootstrapBean.class);

	private static final boolean DEBUG = true;

	@PersistenceContext(unitName = "javamates-model")
	protected EntityManager entityManager;

	@Override
	public void init() {
		log.info("-> init");

		if (!DEBUG) {
			log.info("init -> DEBUG == FALSE");

			return;
		}

		final Query deleteClaimsQuery = entityManager
				.createNativeQuery("DELETE FROM CLAIM");

		deleteClaimsQuery.executeUpdate();

		for (int i = 0; i < 17; i++) {
			Claim claim = new Claim();

			claim.setAmount(new BigDecimal("1400"));

			claim.setCreateDate(new Date());

			claim.setDescription("Claim " + i);

			claim.setPeriod(14);

			claim.setPurposeId(0L);

			claim.setRate(new BigDecimal("1.5"));

			claim.setStatusId(0L);

			claim.setUserId(0L);

			entityManager.persist(claim);
		}

		log.info("init -> OK");
	}
}
