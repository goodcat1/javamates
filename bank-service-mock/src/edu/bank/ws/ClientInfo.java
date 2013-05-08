package edu.bank.ws;

import javax.jws.WebService;

@WebService(targetNamespace = "http://ws.bank.edu/wsdl")
public interface ClientInfo {
	boolean hasAccount(Long clientId);
}
