package com.bptn.course._10_access_modifier;

class PublicDemo {
	
	String name;
	
	public PublicDemo(String name) {
		this.name = name;
	}
	
	public void displayName() {
		System.out.println("Name is " +name);
	}
}
