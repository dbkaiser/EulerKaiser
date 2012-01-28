package com.dbk.puzzle;

/**
 * 
 * @author edogboo
 *
 */
public class Puzzle9 {
	public static void main(String args[]){
		int sum = 1000;
		for(int c = sum-1; c > sum/3; c--){
			for(int b = sum - c-1; b > (sum-c)/2 ; b--){
				int a = sum - c -b;
				if((a * a + b * b) == c * c){
					System.out.println(a*b*c);
					System.out.println(a);
					System.out.println(b);
					System.out.println(c);
				}
			}
		}
	}
}
