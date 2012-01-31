package com.dbk.puzzle;

/**
 * 
 * @author edogboo
 *
 */
public class Puzzle34 {
	public static void main(String args[]){
		int sum = 0;
		for(int i = 3; i <= 2540160; i++){
			sum += isFrable(i)?i:0;
		}
		System.out.println(sum);
		
	}
	
	public static boolean isFrable(int number){
		String strNum = Integer.toString(number);
		int sum = 0;
		for(int i = 0 ; i< strNum.length(); i++){
			sum += jc((int)strNum.charAt(i)-48);
		}
		return sum == number;
	}
	
	public static int jc(int m){
		return m<=1?1:m*jc(m-1);
	}
}
