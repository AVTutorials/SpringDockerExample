package com.example.SpringDockerExample.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.SpringDockerExample.entity.Employee;
import com.example.SpringDockerExample.service.EmployeeService;
import com.example.SpringDockerExample.service.FileStorageService;
@RestController
@RequestMapping(path = "/testemp")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	   @Autowired
	   private FileStorageService fileStorageService;
	   
	@PostMapping(value = "/save")
	public Employee save(@RequestBody Employee employee) {
		Employee save = employeeService.save(employee);
		return save;
	}

	@GetMapping(value = "/list")
	public List<Employee> getAllStudents() {
		System.out.println( employeeService.getAllStudents());
		return employeeService.getAllStudents();
		
	}
	
	 @PostMapping(value="/uploadFile")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            fileStorageService.storeFile(file);
            return "File uploaded successfully!";
        } catch (IOException e) {
            return "Failed to upload file: " + e.getMessage();
        }
    }
	
//	 @PostMapping(value="/uploadFile", consumes = "multipart/form-data",produces = "application/json")
//	    public String uploadFile(@RequestParam("file") MultipartFile file) {
//	        try {
//	            fileStorageService.storeFile(file);
//	            return "File uploaded successfully!";
//	        } catch (IOException e) {
//	            return "Failed to upload file: " + e.getMessage();
//	        }
//	    }
	
	
//	@PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//	public String uploadFile(@RequestParam("file") MultipartFile file) {
//	    try {
//	        fileStorageService.storeFile(file);
//	        return "File uploaded successfully!";
//	    } catch (IOException e) {
//	        return "Failed to upload file: " + e.getMessage();
//	    }
//	}


}
