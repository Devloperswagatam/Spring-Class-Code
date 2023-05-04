package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

//@RestController
//@RequestMapping("/employee")
@Controller
public class EmployeCtrl {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String showHomePage(Model model) {
		List<Employee> list =  employeeService.getAllEmployees();
		model.addAttribute("employees", list);
		return "HomePage";
	}
	
	@GetMapping("/employee")
	public String showNewEmployeeForm(Model model) {
		Employee emp = new Employee();
		model.addAttribute("employee", emp);
		return "NewEmployee";
	}
	
	@PostMapping("/saveEmp")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/HomePage";
	}
}
