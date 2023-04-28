package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployee();
	public Employee getById(int id);
	public void addEmployee(Employee employee);
}
