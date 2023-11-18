package com.employee.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	
	//getting all employees
	public List<Employee> getAllEmployee()
	{
		return this.employeeDao.findAll();
	}
	
	//get one employee using id
	public Employee getOneEmployee(int id)
	{
		return this.employeeDao.findById(id);
	}
	
	//saving employee data in db
	public Employee saveEmployee(Employee emp)
	{
//		String employeeId = UUID.randomUUID().toString();
//		emp.setId(employeeId);
		return this.employeeDao.save(emp);
	}
	
	//delete the employee using id
	public void deleteEmployee(int id)
	{
		this.employeeDao.deleteById(id);
	}
	
	//updating employee using id
	public void updateEmployee(Employee emp,int id)
	{
		emp.setId(id);
		this.employeeDao.save(emp);
	}
	
	
}
