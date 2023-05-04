package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepo.save(employee);
	}

}
