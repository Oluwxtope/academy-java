package com.bptn.course._16_array_list;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
		ArrayList<String> myBooks = new ArrayList<String>();
		
		myBooks.add("The Three-Body Problem");
		myBooks.add("Elements of Computing");
		myBooks.add("Book 3");
		
		System.out.println("My books: " +myBooks);
		
		System.out.println("Size of the book is: " +myBooks.size());
		
	}

}
