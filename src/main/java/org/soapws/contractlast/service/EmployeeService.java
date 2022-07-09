package org.soapws.contractlast.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.soapws.contractlast.model.Employee;
@WebService(name = "EmployeeService")
public interface EmployeeService {
	@WebMethod
	public @WebResult(name = "Employee") Employee getDummyEmployee();

	@WebMethod
	public Employee getEmployeeById();

	@WebMethod
	public @WebResult(name = "Employee") List<Employee> getAllEmployees();

}
