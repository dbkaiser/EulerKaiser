package com.dbk.puzzle;

public class Puzzle6 {
	/**
	 * The sum of the squares of the first ten natural numbers is,
	 * 
	 * 1^2 + 2^2 + ... + 10^2 = 385 The square of the sum of the first ten natural
	 * numbers is,
	 * 
	 * (1 + 2 + ... + 10)^2 = 55^2 = 3025 Hence the difference between the sum of
	 * the squares of the first ten natural numbers and the square of the sum is
	 * 3025 - 385 = 2640.
	 * 
	 * Find the difference between the sum of the squares of the first one
	 * hundred natural numbers and the square of the sum.
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		long limit = 100;
		long sumsq = 0;
		for (long i = 1; i <= limit; i++){
			sumsq += (i * i);
		}
		long sqsum = (1+limit) * limit / 2;
		long result = Math.abs(sqsum * sqsum - sumsq);
		System.out.println(result);
		
	}
}
