package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
public class Employeectrl {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int employeeId){
		Optional<Employee> employee = employeeRepository.findById(employeeId);
		if(employee.isPresent()) {
			return ResponseEntity.ok().body(employee.get());
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		Employee addemployee = employeeRepository.save(employee);
		return ResponseEntity.ok().body(addemployee);
		
	}
	
	@PutMapping("/employee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		Optional<Employee> putEmp = employeeRepository.findById(employee.getId());
		if(putEmp.isPresent()) {
			Employee updateEmployee = putEmp.get();
			updateEmployee.setName(employee.getName());
			updateEmployee.setSalary(employee.getSalary());
			Employee savedEmp = employeeRepository.save(updateEmployee);
			return ResponseEntity.ok().body(savedEmp);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/employee")
	public ResponseEntity<Employee> deleteEmployee(@RequestBody Employee employee){
		Optional<Employee> emp = employeeRepository.findById(employee.getId());
		if(emp.isPresent()) {
			employeeRepository.delete(emp.get());
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
}
