package org.soapws.contractlast.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.soapws.contractlast.service.DummyServiceImpl;
import org.soapws.contractlast.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServiceConfig {

	@Autowired
	private Bus bus;

	@Bean
	public Endpoint employeeServiceEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, new EmployeeServiceImpl());
		endpoint.publish("/EmployeeService");
		return endpoint;
	}

	@Bean
	public Endpoint dummyServiceEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, new DummyServiceImpl());
		endpoint.publish("/DummyService");
		return endpoint;
	}

}
