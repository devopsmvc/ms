package com.axisbank.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	
	@Autowired
	EmployeeRepository empRepository;
	
	public Employee createEmployee() {
		Employee e = new Employee(101, "Shubham", 10000.0);
		return e;
		
	}

	public Employee registerEmployee(Employee Employee) {
		return empRepository.save(Employee);
	}

	public Employee searchEmployee(int empID) {
		return empRepository.findById(empID).get();
	}

}
