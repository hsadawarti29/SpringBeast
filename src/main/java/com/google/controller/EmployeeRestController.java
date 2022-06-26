package com.google.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.entity.Employee;
import com.google.service.EmployeeService;

@RestController
public class EmployeeRestController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/saveEmployees")
	public List<Employee> savEmployees(@RequestBody List<Employee> employees){
		return employeeService.savEmployee(employees);
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
}
