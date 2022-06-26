package com.google.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
