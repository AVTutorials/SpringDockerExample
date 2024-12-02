package com.example.SpringDockerExample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringDockerExample.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	public Employee save(Employee stduent);
	public List<Employee> findAll();
}
