package com.dbk.puzzle;

/**
 * 
 * Find the value of d < 1000 for which 1/d contains the longest recurring cycle.
 * 
 * @author edogboo
 *
 */
public class Puzzle26 {
	public static int digit = 1000;
	public static void main(String args[]){
		int max = 0;
		int counting = 0;
		int number = 0;
		for(int i =1; i <= digit; i++){
			counting = countLoopDigit(i);
			if(counting > max){
				max = counting;
				number = i;
			}
		}
		System.out.println(max);
		System.out.println(number);
			
	}
	
	public static int countLoopDigit(int number){
		boolean[] remains = new boolean[number+1];
		for(int i = 1; i<= number; i++){
			remains[i] = false;
		}
		int whole = 1;
		int remainder = 0;
		int count = -1;
		while(!remains[remainder]){
			remains[remainder] = true;
			while (whole < number) {
				whole *= 10;
			}
			remainder = whole % number;
			whole = remainder;
			count = whole==0? 0: (count+1);
		}
		return count;
	}
}
