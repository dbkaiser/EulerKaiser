package com.dbk.puzzle;

/**
 * 
 * 	Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 * 
 * @author edogboo
 *
 */
public class Puzzle23 {
	public static int bound = 28123;//
	public static int divSum[] = new int[bound + 1];
	public static boolean isAbun[] = new boolean[bound + 1];
	public static boolean isSum[] = new boolean[bound + 1];
	public static void main(String args[]){
		//init
		for(int i = 0; i< isAbun.length; i++){
			isAbun[i] = false;
		}
		for(int i = 0; i< isSum.length; i++){
			isSum[i] = false;
		}
		//count is abundant
		for(int i = 1 ; i<= bound; i++){
			divSum[i] = coundDivSum(i);
			if(i < divSum[i]) isAbun[i] = true;
		}
		//count sum
		for(int i = 1; i<= bound; i++){
			for(int j=i ; j<= bound; j++){
				if(isAbun[i] && isAbun[j] && i + j <= bound){
//					if(i + j > bound) System.out.println("error : " + i+ " " + j);
					isSum[i + j] = true;
				}
			}
		}
		System.out.println("hello");
		int sum = 0;
		for(int i = 1; i <= bound; i++){
			System.out.println(i);
			if(!isSum[i]){
				sum+= i;
			}
		}
		System.out.println();
		System.out.println(sum);
	}
	
	public static int coundDivSum(int num){
		int result = 0;
		for(int i = 1; i<= num/2; i++){
			if(num % i == 0) result += i;
		}
		return result;
	}
	
	
}
