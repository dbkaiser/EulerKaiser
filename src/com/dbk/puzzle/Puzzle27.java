package com.dbk.puzzle;

/**
 * 
 * Find a quadratic formula that produces the maximum number of primes for consecutive values of n.
 * 
 * 
 * @author edogboo
 *
 */
public class Puzzle27 {
	public static int n = 80;
	public static int range = n * n + 1000* n +1000; // presumption of biggest prime is by 80 in the range
	public static boolean[] primes;
	
	public static void main(String args[]){
		primes = calcPrimes(range);
		int max = 0;
		int maxA = 0;
		int maxB = 0;
		for(int a = -1000; a<=1000; a++){
			for(int b = 0; b <= 1000; b++){
				int length = countLength(a, b);
				if(length > max){
					max = length;
					maxA = a;
					maxB = b;
				}
			}
		}
		System.out.println(max);
		System.out.println(maxA);
		System.out.println(maxB);
		System.out.println(maxA* maxB);
	}
	
	/**
	 * counting the required length of n^2 + a*n + b by n all prime
	 * @param primes
	 * @param a
	 * @param b
	 * @return
	 */
	public static int countLength(int a, int b){
		int count = 0;
		for(int i = 0; ;i++){
			// out of range! default is 80
			if (i > n){
				n = i;
				primes = calcPrimes(n * n + 1000* n +1000);
			}
			int num = i*i+a*i+b;
			if(num<0 || num > primes.length || primes[num]) return i - 1;
		}
	}
	/**
	 * calculate all prime numbers under range using Sieve of Eratosthenes Algorithm
	 * @param range
	 * @return array of boolean, result[i] is true means i is not prime, verse visa 
	 */
	public static boolean[] calcPrimes(int range){
		boolean[] mark = new boolean[range+1];
		int ele = (int)Math.sqrt(range)+1;
		for (int i = 0 ; i <= range; i++){
			mark[i] = false;
		}
		mark[0] = true;
		mark[1] = true;
		for(int i = 2; i <= ele ; i++){
			if(mark[i]) continue;
			for(int j = 2; i * j <= range; j++){
				mark[i*j] = true;
			}
		}
		
		return mark;
	}
}
