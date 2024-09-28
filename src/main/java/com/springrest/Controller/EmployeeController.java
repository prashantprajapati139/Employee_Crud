package com.springrest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.Entites.Employee;
import com.springrest.Service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String greeting() {
		 return "Hello";
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}
	
	@PostMapping("/employee")
	public Employee insertEmployee(@RequestBody Employee employee) {
		return employeeService.insertEmployee(employee);
	}
	
	@PutMapping("/employee")
	public String updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		return "Employee Updated Successfully...";
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable("id") Integer id) {
		employeeService.deleteEmployee(id);
		return "Employee Deleted";
	}
}
