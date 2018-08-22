package com.demo.rests.dao;

import java.util.Set;

import com.demo.rests.pojo.Employee;

public interface Dao {

	public void addNewEmployee(Employee emp);
	public Set<Employee> viewAllEmployee();
	public void deleteEmployee(int empId);
}
