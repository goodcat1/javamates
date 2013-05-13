package edu.javamates.action;

import java.rmi.RemoteException;
import java.util.Date;

import javax.inject.Inject;

import org.apache.axis2.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;

import edu.bank.ws.ClientInfoStub;
import edu.bank.ws.ClientInfoStub.ClientStatus;
import edu.bank.ws.ClientInfoStub.ClientStatusResponse;
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

	private ClientInfoStub service;

	@Override
	public String execute() throws Exception {

		log.debug("Create claim [{}]", String.valueOf(claim));

		boolean isActive = checkClientStatus(1L);

		if (!isActive)
			throw new RuntimeException("Client blocked");

		Claim claimEntity = CreateNewClaimActionDtoToClaim.toEntity(claim);

		claimEntity.setCreateDate(new Date());

		claimEntity.setUserId(0L);

		claimEntity = claimDaoBean.createNewClaim(claimEntity);

		message = String.format("Claim number %1$s created.",
				claimEntity.getId());

		status = "success";

		return SUCCESS;
	}

	private boolean checkClientStatus(Long id) {
		try {
			ClientStatus request = new ClientStatus();

			request.setId(id);

			ClientStatusResponse response = getService().clientStatus(request);

			String status = response.get_return();

			log.debug("Client [{}] status is [{}]", id, status);

			return "ACTIVE".equals(status);

		} catch (RemoteException e) {

			log.error("Error calling web service for client status", e);

			throw new RuntimeException(e.getCause());
		}
	}

	private ClientInfoStub getService() {
		try {
			service = new ClientInfoStub();
		} catch (AxisFault e) {
			log.error("Failed create web service ref", e);

			throw new RuntimeException(e.getCause());
		}

		return service;
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
