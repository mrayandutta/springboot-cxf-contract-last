package org.soapws.contractlast.service;

import java.util.List;

import org.soapws.contractlast.model.Employee;
import org.soapws.contractlast.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	// @Autowired
	// EmployeeRepository employeeRepository;

	EmployeeRepository employeeRepository = new EmployeeRepository();

	@Override
	public Employee getDummyEmployee() {
		return employeeRepository.getDummyEmployee();
	}

	@Override
	public Employee getEmployeeById() {
		return employeeRepository.getEmployeeById();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.getAllEmployees();
	}

}
