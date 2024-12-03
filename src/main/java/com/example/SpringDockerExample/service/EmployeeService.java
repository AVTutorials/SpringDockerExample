package com.example.SpringDockerExample.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringDockerExample.entity.Employee;
import com.example.SpringDockerExample.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee save(Employee employee) {
		Employee saveEmployee=employeeRepository.save(employee);
		return saveEmployee;
	}
	
	  public List<Employee> getAllStudents() {
	        List<Employee> allEmployee = employeeRepository.findAll();
			return allEmployee;
	    }
 
          public List<Employee> getAllDetails() {
	        List<Employee> allEmployee = employeeRepository.findAll();
			return allEmployee;
	    }
	  
          public List<Employee> getAllEmpDetails() {
  	        List<Employee> allEmployee = employeeRepository.findAll();
  			return allEmployee;
  	    }
}
