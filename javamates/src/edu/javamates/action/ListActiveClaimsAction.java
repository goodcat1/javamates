package edu.javamates.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import edu.javamates.dto.ActiveClaimDto;

public class ListActiveClaimsAction extends ActionSupport {
	private static final long serialVersionUID = 7359518837494694152L;

	private List<ActiveClaimDto> claims;
	
	

	@Override
	public String execute() throws Exception {
		return "success";
	}

	public List<ActiveClaimDto> getClaims() {
		return claims;
	}

	public void setClaims(List<ActiveClaimDto> claims) {
		this.claims = claims;
	}
	
	
}
