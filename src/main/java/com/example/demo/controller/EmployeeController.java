package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeService;



@RestController
public class EmployeeController {
	
	
	 @Autowired
	 private EmployeeService service;
	 
	@RequestMapping(value = "/list",produces=MediaType.APPLICATION_XML_VALUE)
	public List<Employee> getEmployees(){
	    // System.out.println(employeeRepository.findAll());
	     return service.listAll();

	}
	@GetMapping("/insertEmp")
	public String insertEmployee() {
		
		//employeeRepository.saveAndFlush(new Employee(1, "kourmou", "ll", "ollla"));
		service.save(new Employee("kourmou", "ll", "ollla"));
		return 	"ok";
	} 
	
}
