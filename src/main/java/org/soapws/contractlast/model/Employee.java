package org.soapws.contractlast.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Employee")
public class Employee {
	
	private String id ;
	private String name;
	private int salary ;
	private String designtion;
	
	
	public Employee(String id, String name, int salary, String designtion) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designtion = designtion;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesigntion() {
		return designtion;
	}
	public void setDesigntion(String designtion) {
		this.designtion = designtion;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designtion=" + designtion + "]";
	}
	
	

}
