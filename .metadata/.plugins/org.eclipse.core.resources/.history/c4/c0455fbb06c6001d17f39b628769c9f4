package org.fibonacci;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {

		int n = 10; // the number of Fibonacci numbers to generate
		int[] fib = new int[n];
		fib[0] = 0;
		fib[1] = 1;

		// generate the Fibonacci series
		for (int i = 2; i < n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		// filter the series based on a condition
		for (int i = 0; i < n; i++) {
			if (fib[i] % 2 == 0) {
				fib[i] = 0;
			}
		}

		// print the filtered series
		System.out.println(Arrays.toString(fib));
	}
}
