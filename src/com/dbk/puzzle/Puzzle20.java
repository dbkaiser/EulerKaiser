package com.dbk.puzzle;

/**
 * 
 * Find the sum of digits in 100!
 * 
 * @author edogboo
 *
 */
public class Puzzle20 {
	public static int crosNum = 100;
	public static int digit = 2 * crosNum;
	//0 pos as the low pos 
	public static int nums[] = new int [digit]; 
	public static void main(String args[]){
		nums[0] = 1;
		for(int i = 1; i< digit ; i++){
			nums[i] = 0;
		}
		for(int i =1; i < 101; i++){
			for(int j = 0; j < digit; j++){
				nums[j] *= i;
			}
			format();
			
		}
		int count = 0;
		for(int i = digit -1; i>= 0 ; i--) {
			count += nums[i];
			System.out.print(nums[i]);
		}
		System.out.println();
		System.out.println(count);
	}
	
	public static void format(){
		for(int i = 0; i< digit - 1; i++){
			nums[i+1] += nums[i]/10;
			nums[i] = nums[i] % 10;
		}
	}
}
