package com.axisbank.microservice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	
	@Id
	private int empID;
	
	private String empName;
	
	private double empSalary;
	
	//Private //public //protected //default
	
	public Employee() {
		
		
	}
	
	public Employee(int id, String empName, double empSalary) {
		
		this.empID=id;
		this.empName=empName;
		this.empSalary=empSalary;
	}

	public int getEmpID() { 
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	
	
}
