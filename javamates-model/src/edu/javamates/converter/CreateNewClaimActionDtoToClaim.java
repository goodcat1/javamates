package edu.javamates.converter;

import edu.javamates.dto.CreateNewClaimActionDto;
import edu.javamates.entity.Claim;

public class CreateNewClaimActionDtoToClaim {
	public static Claim toEntity(CreateNewClaimActionDto dto) {
		Claim claim = new Claim();

		claim.setAmount(dto.getAmount());

		claim.setCreateDate(dto.getCreateDate());

		claim.setDescription(dto.getDescription());

		claim.setPeriod(dto.getPeriod());

		claim.setPurposeId(dto.getPurposeId());

		claim.setRate(dto.getRate());

		claim.setStatusId(dto.getStatusId());

		return claim;
	}
}
