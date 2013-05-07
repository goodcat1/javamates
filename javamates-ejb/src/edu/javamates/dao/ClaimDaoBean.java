package edu.javamates.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import edu.javamates.dto.ActiveClaimDto;
import edu.javamates.entity.Claim;

@Stateless
public class ClaimDaoBean implements ClaimDaoBeanLocal {

	@PersistenceContext(unitName = "javamates-model")
	protected EntityManager entityManager;

	@Override
	public List<ActiveClaimDto> listActiveClaims() {
		TypedQuery<Claim> query = entityManager.createNamedQuery(
				"Claim.findByUserId", Claim.class).setParameter("userId", new Long(0));

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

}
