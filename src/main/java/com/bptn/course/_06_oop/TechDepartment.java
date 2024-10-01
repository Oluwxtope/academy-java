package com.bptn.course._06_oop;

class TechDepartment extends Department {
	
	private double totalPurchaseAmt;
	
	public TechDepartment(String nameOfDept, int numOfEmployees, double totalPurchaseAmt) {
		super(nameOfDept, numOfEmployees);
		this.totalPurchaseAmt = totalPurchaseAmt;
	}

}
