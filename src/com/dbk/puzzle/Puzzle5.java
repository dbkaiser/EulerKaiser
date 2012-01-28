package com.dbk.puzzle;

public class Puzzle5 {
	/**
	 * 2520 is the smallest number that can be divided by each of the numbers
	 * from 1 to 10 without any remainder.
	 * 
	 * What is the smallest positive number that is evenly divisible by all of
	 * the numbers from 1 to 20?
	 * 
	 * @param args
	 * 
	 * the algorithm of this is to to find out the prime numbers of the list. 
	 * 
	 *  here the list would be 1 2 3 2 5 1 7 2 3 1 11 1 13 1 1 2 17 1 19 1
	 */
	public static void main(String args[]){
		int limit = 20;
		int[] list = new int[limit];
		for(int i = 1 ; i <= limit; i++){
			list[i-1] = i;
			for(int j = 1; j < i; j++){
				if(list[i-1] % list[j-1] == 0) list[i-1] /= list[j-1];
			}
		}
		int result = 1;
		for(int i = 1; i <= limit; i++){
			System.out.print(list[i - 1]+ " ");
			result *= list[i-1];
		}
		System.out.println(result);
	}
}
