package com.google.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.entity.Employee;
import com.google.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public List<Employee> savEmployee(List<Employee> employees) {
		return employeeRepository.saveAll(employees);
	}
}
