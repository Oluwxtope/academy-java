package com.bptn.course._08_oop_demo;

public class ShoppingCart {
	private CartItem[] items;
	private int itemCount;
	
	public ShoppingCart() {
		this.items = new CartItem[5];
		this.itemCount = 0;
	}
	
	// add product to cart
	public void addProductToCart(Product product, int quantity) {
		if (itemCount <= 4 ) {
			CartItem newItem = new CartItem(product, quantity);
			items[itemCount] = newItem;
			itemCount++;
			product.reduceStock(quantity);
		} else {
			throw new IllegalArgumentException("Cart full!");
		}
		
	}
	
	public CartItem[] showProductsInCart() {
		CartItem[] currentItems = new CartItem[itemCount];
		for (int i = 0; i < itemCount; i++) {
			currentItems[i] = items[i];
		}
		return currentItems;
	}
	
	public double getTotalPrice() {
		double totalPrice = 0;
		for (int i = 0; i < itemCount; i++) {
			totalPrice += items[i].getTotalPrice();
		}
		return totalPrice;
	} 
}
