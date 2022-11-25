package com.axisbank.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	DemoService DemoService;
	
	@GetMapping("/helloworld")
	public String helloWorld() {  
		return "Hello World"; 
	}
	 
	@GetMapping("sayhi")
	public String sayhi() {
		return "Hi from Spring Boot";
	}
	
	
	@GetMapping("/createEmployee")
	public Employee createEmployee() {
		
		return DemoService.createEmployee();
	}
	
	@PostMapping("/registerEmployee")
	public Employee registerEmployee(@RequestBody Employee Employee) {
		
		return DemoService.registerEmployee(Employee);
	}
	
	@GetMapping("/getEmployee/{empID}")
	public Employee getEmployeeDetails(@PathVariable(value="empID") int empID) {
		return DemoService.searchEmployee(empID);
	}


}
