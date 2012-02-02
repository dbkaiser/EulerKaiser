package com.dbk.puzzle;

/**
 * 
 * @author edogboo
 *
 * algorithm analyze: if a^2 + b^2 = c^2, and a+b+c = m where m <1000; then could get : a = (m^2-2*m*b)/2(m-b), 
 * then we could test for every possible b , a is an integer, b is in [1,m/2)
 */
public class Puzzle39 {
	
	public static void main(String args[]){
		int max = 0;
		int result = 0;
		for(int m = 5; m< 1000; m++){
			int count =0;
			for(int b =1; b < (double)m/(double)(2+Math.sqrt(2));b++){
				if(isInteRight(b, m)){count++;}
			}
			if(count> max) {result = m;max = count;}
		}
		System.out.println(result);
		System.out.println(max);
	}
	
	public static boolean isInteRight(int b, int m){
		return (m*m - 2*m * b) % (2*(m-b))==0;
	}
}
