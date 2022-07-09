package org.soapws.contractlast.repository;

import java.util.ArrayList;
import java.util.List;

import org.soapws.contractlast.model.Employee;


public class EmployeeRepository {
	
	public Employee getDummyEmployee() 
	{
		Employee employee = new Employee("1","Dummy Employee",1000,"Developer");
		//employee.setId("1");
		//employee.setName("Dummy Employee");
		return employee;
	}
	
	public Employee getEmployeeById() 
	{
		return null;
	}
	
	public List<Employee> getAllEmployees() 
	{
		
		List<Employee> employeeList = new ArrayList<>();
		Employee employee1 = new Employee("1","Dummy Employee",1000,"Developer");
		Employee employee2 = new Employee("1","Dummy Employee",1000,"Developer");
		Employee employee3 = new Employee("1","Dummy Employee",1000,"Developer");
		
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		
		return employeeList;
		
	}

}
