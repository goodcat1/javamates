package edu.javamates.dao;

import java.math.BigDecimal;
import java.util.Date;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;

import org.junit.Test;

import edu.javamates.AbstractBeanTest;
import edu.javamates.entity.Claim;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link ClaimDaoBeanLocal}
 * 
 * @author shitov
 * 
 */
@ManagedBean
public class ClaimDaoBeanTest extends AbstractBeanTest<Claim> {
	@EJB
	private ClaimDaoBeanLocal beanLocal;

	@Override
	public AbstractDaoBeanLocal<Claim> createBeanForTest() {
		return beanLocal;
	}

	/**
	 * Test for {@link ClaimDaoBeanLocal#createNewClaim(Claim)}
	 */
	@Test
	public void createNewClaimTest() {
		Claim claim = new Claim();

		claim.setAmount(new BigDecimal("1000.00"));

		claim.setCreateDate(new Date());

		claim.setDescription("test");

		claim.setPeriod(15);

		claim.setPurposeId(0L);

		claim.setRate(new BigDecimal("1.6"));

		claim.setStatusId(0L);

		claim.setUserId(0L);

		Claim newClaim = beanLocal.createNewClaim(claim);

		Claim foundClaim = beanLocal.findById(newClaim.getId());

		assertNotNull(foundClaim);

		assertEquals(newClaim.getId(), foundClaim.getId());

		assertEquals(claim.getAmount(), foundClaim.getAmount());

		assertEquals(claim.getCreateDate(), foundClaim.getCreateDate());

		assertEquals(claim.getDescription(), foundClaim.getDescription());

		assertEquals(claim.getPeriod(), foundClaim.getPeriod());

		assertEquals(claim.getPurposeId(), foundClaim.getPurposeId());

		assertEquals(claim.getRate(), foundClaim.getRate());

		assertEquals(claim.getStatusId(), foundClaim.getStatusId());
	}
}
