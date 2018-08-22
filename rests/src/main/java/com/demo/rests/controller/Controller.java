package com.demo.rests.controller;

import java.util.Set;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.rests.pojo.Employee;
import com.demo.rests.service.ServiceImpl;

@RestController
public class Controller {

	ServiceImpl serviceImpl=new ServiceImpl();
	
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addNewEmployee(String empName, double empSalary) {
		Employee emp=new Employee(empName, empSalary);
		serviceImpl.addNewEmployee(emp);
	}

	@RequestMapping(value="/view", method=RequestMethod.GET)
	public Set<Employee> viewAllEmployee() {

		return serviceImpl.viewAllEmployee();
	}
	
	@RequestMapping(value="/delete/{empId}", method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable int empId) {

		 serviceImpl.deleteEmployee(empId);
	}
	
	@RequestMapping(value="/update/{empId}/{empName}", method=RequestMethod.PUT)
	public void updateEmployee(@PathVariable int empId, @PathVariable String empName) {

		 serviceImpl.updateEmployee(empId,empName);
	}
}
