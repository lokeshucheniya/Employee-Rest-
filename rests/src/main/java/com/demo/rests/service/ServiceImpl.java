package com.demo.rests.service;

import java.util.Set;

import com.demo.rests.dao.DaoImpl;
import com.demo.rests.pojo.Employee;


public class ServiceImpl implements Service {
	DaoImpl dao= new DaoImpl();
	
	@Override
	
	public void addNewEmployee(Employee emp) {
		
		dao.addNewEmployee(emp);
	}

	@Override
	public Set<Employee> viewAllEmployee() {

		return dao.viewAllEmployee();
	}

	@Override
	public void deleteEmployee(int empId) {
		
		dao.deleteEmployee(empId);
		
	}

	public void updateEmployee(int empId, String empName) {
		
		dao.updateEmployee(empId, empName);
	}

}
