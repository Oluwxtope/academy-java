package com.bptn.course._25_multithreading;

public class MultiThreadSumCalcDemo {

	public static void main(String[] args) {
		// Create two SumCalculator threads to calculate the sum of two different ranges
		SumCalculator sumCalculator1 = new SumCalculator(1, 50000);
		SumCalculator sumCalculator2 = new SumCalculator(50001, 100000);

		long startTime = System.nanoTime();

		// Start both threads
		sumCalculator1.start();
		sumCalculator2.start();

		try {
			// Wait for both threads to finish using join() method of each thread.
			sumCalculator1.join();
			sumCalculator2.join();
		} catch (InterruptedException e) {
			// Print the stack trace if an interruption occurs
			e.printStackTrace();
		}

		// Calculate the total sum by adding the sum of both ranges
		int totalSum = sumCalculator1.getSum() + sumCalculator2.getSum();

		long endTime = System.nanoTime();

		long duration = (endTime - startTime);

		System.out.println("That took " + duration + " nanoseconds");

		// Print the total sum
		System.out.println("Total sum: " + totalSum);

		int sum2 = 0;

		long startTime2 = System.nanoTime();

		for (int i = 1; i <= 100000; i++) {
			sum2 += i;
		}

		long endTime2 = System.nanoTime();

		long duration2 = (endTime2 - startTime2);

		System.out.println("That took " + duration2 + " nanoseconds");

		// Print the total sum
		System.out.println("Total sum: " + sum2);

		String hola = "Hello World!";
		String hello = "Hello World!";
		boolean isEqual = !(hola == "Hello World!");
		System.out.println(isEqual);

	}

}
