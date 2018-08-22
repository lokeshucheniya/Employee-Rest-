package com.demo.rests.pojo;

public class Employee {

	private String empName;
	private int empId;
	private double empSalary;
	private static int Id=100;
	
	public Employee(String empName, double empSalary) {
		super();
		this.empName = empName;
		this.empId = ++Id;
		this.empSalary = empSalary;
	}
	
	
	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empId;
	}
	public double getEmpSalary() {
		return empSalary;
	}

	
}
