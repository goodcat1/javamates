package edu.javamates.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.javamates.dto.ActiveClaimDto;

public class ClaimDaoBean implements ClaimDaoBeanLocal {

	@Override
	public List<ActiveClaimDto> listActiveClaims() {
		List<ActiveClaimDto> claims = new ArrayList<>();

		ActiveClaimDto dto = new ActiveClaimDto();

		dto.setAmount(new BigDecimal("1000"));
		dto.setCreateDate(new Date());
		dto.setDescription("Test claim");
		dto.setId(1L);
		dto.setPeriod(10);
		dto.setPurpose("Test purpose");
		dto.setRate(new BigDecimal("1.5"));
		dto.setState("New");

		claims.add(dto);

		return claims;
	}

}
