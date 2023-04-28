package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeService;

@RestController
public class EmployeeCtrl {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getALlEmployee(){
		List<Employee> employee = employeeService.getAllEmployee();
		return employee;
	}
	
	@GetMapping("/employees/{id}")
	public Employee getById(@PathVariable("id") int idd) {
		Employee employee = employeeService.getById(idd);
		return employee;
	}
	@PostMapping("/employees/{employee}")
	public String addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return "data has been entered";
	}
}
