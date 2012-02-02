package com.dbk.puzzle;

/**
 * 
 * @author edogboo
 *
 */
public class Puzzle40 {

	public static void main(String args[]){
		StringBuilder sb = new StringBuilder();
		for(int i =0; i< 1000000; i++){
			sb.append(i);
		}
		String big = sb.toString();
		int[] targets = {1,10,100,1000,10000,100000,1000000};
		int result = 1;
		for(int i : targets){
			result *= ((int)big.charAt(i)-48);
		}
		System.out.println(result);
		System.out.println(big.substring(0,200));
	}
	
//	public static 
}
