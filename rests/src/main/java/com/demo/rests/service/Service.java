package com.demo.rests.service;

import java.util.Set;

import com.demo.rests.pojo.Employee;

public interface Service {

	public void addNewEmployee(Employee emp);
	public Set<Employee> viewAllEmployee();
	public void deleteEmployee(int empId);
}
