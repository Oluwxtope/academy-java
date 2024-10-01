package com.bptn.course._06_oop;

class SalesDepartment extends Department {
	
	private double totalSalesAmt;

	public SalesDepartment(String nameOfDept, int numOfEmployees, double totalSalesAmt) {
		super(nameOfDept, numOfEmployees);
		this.totalSalesAmt = totalSalesAmt;
	}

}
