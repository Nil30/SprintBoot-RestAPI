package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
public class MyController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAll()
	{
		List<Employee> list = this.employeeService.getAllEmployee();
		return list;
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable int id)
	{
		return this.employeeService.getOneEmployee(id);
	}
	
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee emp)
	{
		Employee result = this.employeeService.saveEmployee(emp);
		System.out.println("employee data saved successfully...");
		return result;
	}
	
	@DeleteMapping("/employee/{id}")
	public String EmployeeDelete(@PathVariable int id)
	{
		this.employeeService.deleteEmployee(id);
		return "data deleted Successfully";
	}
	
	@PutMapping("/employee/{id}")
	public Employee EmployeeUpdate(@RequestBody Employee emp,@PathVariable int id)
	{
		this.employeeService.updateEmployee(emp, id);
		return emp;
	}

	@GetMapping("/test")
	public String Test()
	{
		return "Testing api";
	}
	
}
