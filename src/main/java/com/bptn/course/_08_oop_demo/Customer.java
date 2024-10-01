package com.bptn.course._08_oop_demo;

public class Customer {
	private String customerId;
	private String customerName;
	private String customerEmail;
	private ShoppingCart cart;
	
	public Customer(String customerId, String customerName, String customerEmail) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.cart = new ShoppingCart();
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public ShoppingCart getCart() {
		return this.cart;
	}
	
	public void checkout() {
		System.out.println("Processing order for " + customerName + "...");
		
	}
	
	public void print() {
		System.out.println(customerId + " " + customerName + " " + customerEmail + " " + cart);
	}
}
