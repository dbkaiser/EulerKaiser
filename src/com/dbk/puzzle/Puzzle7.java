package com.dbk.puzzle;

public class Puzzle7 {

	/**
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can
	 * see that the 6th prime is 13.
	 * 
	 * What is the 10 001st prime number?
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		int limit = 10001; int count = 2;
		long [] primes = new long[limit];
		for(int i = 0; i < limit; i++){
			primes[i] = -1;
		}
		primes[0] = 2; 
		primes[1] = 3;
		for (long i = 5 ; count < limit ; i+=2){
			if(isPrime(primes, count, i)){
				primes[count++] = i;
			}
		}
		System.out.println(primes[count-1]);
	}
	
	public static boolean isPrime(long[] nums, int count, long value){
		for(int i = 0 ; i< count; i ++){
			if(value % nums[i] == 0 ) return false;
		}
		return true;
	}
}
