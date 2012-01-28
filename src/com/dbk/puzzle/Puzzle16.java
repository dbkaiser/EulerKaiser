package com.dbk.puzzle;

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 2^1000?
 * 
 * @author dbkaiser
 * 
 * In fact, python support very very big number. even 2^2000
 */
public class Puzzle16 {
	
	public static int expNum = 1000;
	public static int pace = 50;
	public static long[] temp = new long[expNum];
	public static void main(String args[]){ 
		count();
		//sum
		long sum = 0;
		for(int i = expNum - 1; i >= 0 ; i--){
			sum+= temp[i];
//			System.out.print(temp[expNum-1]);
		}
		System.out.println(sum);
	}
	public static void count(){
		//init;
		for(int i = 0; i< expNum ; i++){
			temp[i]=0;
		}
		temp[0] = 1;
		//count 0 as the lowest position
		for(int i = 0; i < expNum / pace; i++){
			for(int j = 0; j< expNum ; j ++){
				temp [j] = temp[j] << pace;
			}
			format();
//			printNum();
//			System.out.println();
		}
	}
	
	public static void printNum(){
		int i;
		for(i = expNum -1; i >= 0; i--){
			if(temp[i]!=0) break;
		}
		for(; i >= 0; i--){
			System.out.print(temp[i]);
		}
	}
	
	public static void format(){
		for(int i = 0; i< expNum - 1; i++){
			temp[i+1] += temp[i]/10;
			temp[i] = temp[i] % 10;
		}
	}
}
