package edu.bank.ws;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(portName = "ClientInfoPort", serviceName = "ClientInfoService", targetNamespace = "http://ws.bank.edu/wsdl", endpointInterface = "edu.bank.ws.ClientInfo")
public class ClientInfoImpl implements ClientInfo {

	@Override
	public boolean hasAccount(Long clientId) {
		return true;
	}

}
