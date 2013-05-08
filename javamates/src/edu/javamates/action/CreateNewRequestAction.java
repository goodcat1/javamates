package edu.javamates.action;

import java.util.Date;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;

import edu.javamates.converter.CreateNewClaimActionDtoToClaim;
import edu.javamates.dao.ClaimDaoBeanLocal;
import edu.javamates.dto.CreateNewClaimActionDto;
import edu.javamates.entity.Claim;

public class CreateNewRequestAction extends ActionSupport {
	private static final long serialVersionUID = 4212111665330054929L;

	private static final Logger log = LoggerFactory
			.getLogger(CreateNewRequestAction.class);

	private CreateNewClaimActionDto claim;

	private String message;

	private String status;

	@Inject
	ClaimDaoBeanLocal claimDaoBean;

	@Override
	public String execute() throws Exception {

		log.debug("Create claim [{}]", String.valueOf(claim));

		Claim claimEntity = CreateNewClaimActionDtoToClaim.toEntity(claim);
		
		claimEntity.setCreateDate(new Date());

		claimEntity.setUserId(0L);

		claimEntity = claimDaoBean.createNewClaim(claimEntity);

		message = String.format("Claim number %1$s created.",
				claimEntity.getId());

		status = "success";

		return SUCCESS;
	}

	public CreateNewClaimActionDto getClaim() {
		return claim;
	}

	public void setClaim(CreateNewClaimActionDto claim) {
		this.claim = claim;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
