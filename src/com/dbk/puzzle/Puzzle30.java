package com.dbk.puzzle;

import java.util.Calendar;

/**
 * 
 * @author edogboo
 *
 */
public class Puzzle30 {
	public static void main(String args[]){
		long start = System.currentTimeMillis();
		int sum = 0;
		for(int i = 2; i < 999999; i++){
			if(varifyNumberString(i, 6,5)){
				System.out.println(i);
				sum+=i;
			}
		}
		long result = System.currentTimeMillis() - start;
		System.out.println(result);
		System.out.println(sum);
	}
	
//	/**
//	 * verify if m is the target number 
//	 * @param m an five digit number
//	 * @return
//	 */
//	public static boolean varifyNumber(int m, int count){
//		
//		int[] digits = new int[count];
//		
//		for(int k = (int)Math.pow(10, count-1); k>=1; k/=10){
//			digits[--count] = m/k;
//			m = m % k;
//		}
//		return false;
//	}
	
	/**
	 * String counting will be much faster than math counting.
	 * @param m the number
	 * @param count the number of digit
	 * @return
	 */
	public static boolean varifyNumberString(int m, int count, int pow){
		int[] digits = new int[count];
		String str = Integer.toString(m);
		for(int i = 0; i< str.length() ; i++){
			digits[i] = (int)str.charAt(i)-48;
		}
		int sum = 0;
		int limit = (int)Math.pow(10, count);
		for(int i = 0; i< digits.length; i++){
			sum += Math.pow(digits[i], pow);
			if(sum > limit) break;
		}
		if(sum == m) return true;
		return false;
	}
}
