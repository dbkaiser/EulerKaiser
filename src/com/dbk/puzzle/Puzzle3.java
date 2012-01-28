package com.dbk.puzzle;

public class Puzzle3 {
	public static void main(String args[]){
		long m = 600851475143l;
		long s = (long)Math.sqrt(m);
		for(long i = s; i > 0; i--){
			if(m % i == 0 && isPrime(i)){ 
				System.out.println(i);
				return;
			}
		}
	}
	
	public static boolean isPrime(long num){
		long q = (long)Math.sqrt(num);
		for(long i = 2; i <= q; i++){
			if(num % i == 0) return false;
		}
		return true;
	}
}
