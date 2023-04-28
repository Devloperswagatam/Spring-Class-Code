package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
@Service
public class EmployeeServiceImp implements EmployeeService{
	
	List<Employee>list;
	
	public EmployeeServiceImp() {
		list = new ArrayList<Employee>();
		list.add(new Employee(1,"Swagatam",2000));
		list.add(new Employee(2,"aaaaaa",5000));
		list.add(new Employee(3,"ttttt",9000));
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		Employee employee = null;
		for(Employee emp:list) {
			if(emp.getId()==id) {
				employee = emp;
				break;
			}
		}
		return employee;
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		list.add(employee);
	}

}
