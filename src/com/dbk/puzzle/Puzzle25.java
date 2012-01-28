package com.dbk.puzzle;

/**
 * 
 * What is the first term in the Fibonacci sequence to contain 1000 digits?
 * 
 * @author edogboo
 *
 */
public class Puzzle25 {
	public static int digit = 1000;
	public static int[] first = new int[digit];
	public static int[] second = new int[digit];
	public static void main(String args[]){
		int[] next;
		//init
		for(int i = 0 ; i < digit; i++){
			first[i] = 0;
			second[i] = 0;
		}
		first[0] = 1;
		second[0] = 1;
		next = first;
		int count = 2;
		while(next[digit-1]==0){
			count ++;
			next = fibNext(first, second);
			first = second;
			second = next;
//			int i ;
//			for(i = digit -1; i>=0; i--){
//				if(next[i]!=0) break;
//			}
//			for(int j = i; j >=0 ; j--){
//				System.out.print(next[j]);
//			}
//			System.out.println();
		}
		System.out.println(count);
	}
	
	public static int[] fibNext(int[] first, int[] second){
		for(int i = 0; i< digit ; i++){
			first[i] = first[i] + second[i];
		}
		format(first);
		return first;
	}
	
	/**
	 * format into one number per digit 
	 * 0 as the lowest digit 
	 * @param nums
	 */
	
	public static void format(int[] nums){
		for(int i = 0; i< digit - 1; i++){
			nums[i+1] += nums[i]/10;
			nums[i] = nums[i] % 10;
		}
	}
}
