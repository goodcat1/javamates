package edu.javamates.dao;

import java.util.List;

import javax.ejb.Local;

import edu.javamates.dto.ActiveClaimDto;

@Local
public interface ClaimDaoBeanLocal {
	List<ActiveClaimDto> listActiveClaims();
}
