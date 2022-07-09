package org.soapws.contractlast.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "DummyService")
public interface DummyService {
	@WebMethod
	public String getDummyResponse(String request);

}
