package edu.bank.ws;

public class ClientInfo {
	public String clientStatus(Long id) {
		return Long.valueOf(0).equals(id) ? "ACTIVE" : "BLOCKED";
	}
}
