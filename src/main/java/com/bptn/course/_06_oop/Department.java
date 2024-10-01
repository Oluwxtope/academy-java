package com.bptn.course._06_oop;

class Department {
	private String nameOfDept;
	private int numOfEmployees;
	
	public Department (String nameOfDept, int numOfEmployees) {
		this.nameOfDept = nameOfDept;
		this.numOfEmployees = numOfEmployees;
	}
	
	public void info() {
		System.out.println("Name of Department: " +nameOfDept);
		System.out.println("Number of Employees: " +numOfEmployees);
		
	}
	

}
