package com.dbk.puzzle;

public class Puzzle10 {

	/**
	 * 
	 * Calculate the sum of all the primes below two million.
	 * 
	 * Sieve of Eratosthenes Algorithm
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 2000000;
		boolean[] mark = new boolean[limit];
		for (int i = 0 ; i < limit; i++){
			mark[i] = false;
		}
		mark[0] = true;
		for(int i = 2; i <= limit / 2 ; i++){
			if(mark[i-1]) continue;
			for(int j = 2; i * j <= limit; j++){
				mark[i*j-1] = true;
			}
		}
		long result = 0;
		for(int i = 0; i < limit; i++ ){
			if(!mark[i]) {
				result += (i+1);
				System.out.println(i+1);
			}
		}
		System.out.println(result);
	}

}
