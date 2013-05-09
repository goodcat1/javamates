package edu.javamates.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.javamates.dto.ActiveClaimDto;
import edu.javamates.entity.Claim;
import edu.javamates.mdb.MailNotificationsSenderLocal;
import edu.javamates.mdb.Notification;

@Stateless
public class ClaimDaoBean extends AbstractDaoBean<Claim> implements
		ClaimDaoBeanLocal {
	private static final Logger log = LoggerFactory
			.getLogger(ClaimDaoBean.class);

	@PersistenceContext(unitName = "javamates-model")
	protected EntityManager entityManager;

	@Inject
	private MailNotificationsSenderLocal mailSender;

	@Override
	public List<ActiveClaimDto> listActiveClaims() {
		TypedQuery<Claim> query = entityManager.createNamedQuery(
				"Claim.findByUserId", Claim.class).setParameter("userId",
				new Long(0));

		List<Claim> data = query.getResultList();

		return convert(data);
	}

	private List<ActiveClaimDto> convert(List<Claim> data) {
		List<ActiveClaimDto> claims = new ArrayList<>();

		for (Claim claim : data) {
			ActiveClaimDto claimDto = new ActiveClaimDto();

			claimDto.setId(claim.getId());
			claimDto.setAmount(claim.getAmount());
			claimDto.setCreateDate(claim.getCreateDate());
			claimDto.setDescription(claim.getDescription());
			claimDto.setPeriod(claim.getPeriod());
			claimDto.setPurpose("-");
			claimDto.setRate(claim.getRate());
			claimDto.setState("-");

			claims.add(claimDto);
		}

		return claims;
	}

	@Override
	public Claim createNewClaim(Claim claim) {

		log.debug("Create new Claim [{}]", claim);

		claim = super.update(claim);

		Notification notification = new Notification();

		notification.setMessage(String.format(
				"Claim ID = %1$s with AMOUNT = %2$s created", claim.getId(),
				claim.getAmount()));

		mailSender.sendMessage(notification);

		return claim;
	}

}
