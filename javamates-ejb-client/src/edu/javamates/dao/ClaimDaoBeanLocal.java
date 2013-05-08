package edu.javamates.dao;

import java.util.List;

import javax.ejb.Local;

import edu.javamates.dto.ActiveClaimDto;
import edu.javamates.entity.Claim;

@Local
public interface ClaimDaoBeanLocal extends
		AbstractDaoBeanLocal<Claim> {
	List<ActiveClaimDto> listActiveClaims();
	
	Claim createNewClaim(Claim claim);
}
