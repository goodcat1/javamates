package edu.javamates.action;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;

import edu.javamates.dao.ClaimDaoBeanLocal;
import edu.javamates.dto.ActiveClaimDto;

public class ListActiveClaimsGridAction extends ActionSupport {
	private static final long serialVersionUID = 7359518837494694152L;

	private static final Logger log = LoggerFactory
			.getLogger(ListActiveClaimsGridAction.class);

	private List<ActiveClaimDto> claims;

	/**
	 * Направление сортировки (asc или desc)
	 */
	private String sord;
	/**
	 * Столбец, по которому выполняется сортировка
	 */
	private String sidx;

	/**
	 * Ограничение количества строк на страницу (атрибут rowNum таблицы)
	 */
	private String rows;
	/**
	 * Номер выбранной страницы (изначально запрашивается страница с номером 1)
	 */
	private String page;
	/**
	 * Общее количество страниц
	 */
	private Long total = 0L;
	/**
	 * Общее количество записей
	 */
	private Long records = 0L;

	@Inject
	ClaimDaoBeanLocal claimDao;

	@Override
	public String execute() throws Exception {

		setClaims(claimDao.listActiveClaims());

		log.debug("Active claims: [{}]", getClaims());

		return SUCCESS;
	}

	public List<ActiveClaimDto> getClaims() {
		return claims;
	}

	public void setClaims(List<ActiveClaimDto> claims) {
		this.claims = claims;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public String getRows() {
		return rows;
	}

	public void setRows(String rows) {
		this.rows = rows;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getRecords() {
		return records;
	}

	public void setRecords(Long records) {
		this.records = records;
	}

}
