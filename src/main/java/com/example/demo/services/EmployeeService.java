package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.model.Employee;


@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeRepository  employeeRepository;
	
	public List<Employee> listAll(){
		return employeeRepository.findAll();
	}
	
	 public void save(Employee employee) {
		 employeeRepository.saveAndFlush(employee);
	 }
	     
}
