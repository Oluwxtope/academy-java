package com.bptn.course._08_oop_demo;

public class CartItem {
	
	private Product product;
	private int cartQuantity;
	
	public CartItem(Product product, int quantity) {
		this.product = product;
		this.cartQuantity = quantity;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public int getCartQuantity() {
		return this.cartQuantity;
	}
	
	public double getTotalPrice() {
		return product.getProductPrice() * cartQuantity;
	}

}
