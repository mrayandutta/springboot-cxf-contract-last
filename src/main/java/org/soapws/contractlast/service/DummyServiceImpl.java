package org.soapws.contractlast.service;

public class DummyServiceImpl implements DummyService{

	@Override
	public String getDummyResponse(String request) {
		return "Hello " + request +" !!!!!!!!!!!!!!";
	}
	

}
