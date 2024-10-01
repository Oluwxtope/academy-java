package com.bptn.course._07_this_keyword;

class Car {
	private String model;
	private int year;
	
	public Car setModel(String model) {
		this.model = model;
		return this;
	}
		
	public Car setYear(int year) {
		this.year = year;
		return this;
	}
	
	public void display() {
		System.out.println("Model: " + this.model + ", Year: " + this.year);
	}
}

public class ThisDemoThree {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		// Method chaining using 'this' to return current object
		myCar.setModel("Tesla Model S").setYear(2020);
		myCar.display();

	}

}
