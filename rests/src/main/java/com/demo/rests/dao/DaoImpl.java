package com.demo.rests.dao;

import java.util.LinkedHashSet;
import java.util.Set;

import com.demo.rests.pojo.Employee;

public class DaoImpl implements Dao {

	Set<Employee> set=new LinkedHashSet<>();
	@Override
	public void addNewEmployee(Employee emp) {
		set.add(emp);
	}

	@Override
	public Set<Employee> viewAllEmployee() {

		return set;
	}

	@Override
	public void deleteEmployee(int empId) {
		
		for(Employee emp:set)
		{
			if(emp.getEmpId()==empId)
				set.remove(emp);
				
		}
		
	}

	public void updateEmployee(int empId, String empName) {
		// TODO Auto-generated method stub
		for(Employee emps:set)
		{
			if(emps.getEmpId()==empId)
				//set.remove(emp);
				set.add(emps);
				
		}
	}

}
