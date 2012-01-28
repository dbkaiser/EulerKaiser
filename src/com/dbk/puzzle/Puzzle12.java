package com.dbk.puzzle;

/**
 * What is the value of the first triangle number to have over five hundred divisors?
 * @author edogboo
 *
 */
public class Puzzle12 {

	public static int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
			41 };
	public static int[] nums = { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	public static void main(String args[]){
		int limit = 500;
		long product = 1;
		double boundUp = Math.log(limit);
		double boundDown = Math.log(2);
		int bound = (int)(boundUp / boundDown) + 1;
	}
	
	public static boolean isTriNum(long num){
		double result = Math.sqrt(2 * num);
		System.out.println(result);
		if(Math.ceil(result) * Math.floor(result) == num * 2) return true;
		return false;
	}
}
