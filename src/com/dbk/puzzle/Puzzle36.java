package com.dbk.puzzle;

/**
 * 
 * @author edogboo
 *
 */
public class Puzzle36 {
	public static int limit = 1000000;
	public static void main(String args[]){
		int sum = 0;
		for(int i = 1; i<= limit; i++){
			if(isPaliAll(i)) sum+=i;
		}
		System.out.println(sum);
	}
	
	public static boolean isPaliAll(int num){
		String strNum = Integer.toString(num);
		String strBi = Integer.toBinaryString(num);
		return isPali(strNum.toCharArray()) && isPali(strBi.toCharArray());
		
	}
	
	public static boolean isPali(char[] array){
		for(int i = 0; i < array.length/2; i++){
			if(!(array[i]==array[array.length-i-1])) return false;
		}
		return true;
	}
}
