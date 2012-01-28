package com.dbk.puzzle;

/**
 * Evaluate the sum of all amicable pairs under 10000.
 * 
 * @author edogboo
 *
 */
public class Puzzle21 {
	public static int bound = 10000;
	public static int[] tables = new int[bound+1];
	public static void main(String args[]){
		for(int i = 1 ; i<= bound; i++){
			tables[i] = countDivisor(i);
		}
		int sum = 0;
		for(int i = 1; i<= bound; i++){
			if(tables[i]>0 && tables[i] <= bound && tables[tables[i]]==i && tables[i] != i){
				System.out.println(tables[i]);
				sum += tables[i];
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isAmicable(int a, int b){
		return countDivisor(a) == b && countDivisor(b) == a;
	}
	
	public static int countDivisor(int num){
		int result = 0;
		for(int i = 1; i<= num/2; i++){
			if(num % i == 0) result += i;
		}
		return result;
	}
}
