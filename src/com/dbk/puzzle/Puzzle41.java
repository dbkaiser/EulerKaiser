package com.dbk.puzzle;

/**
 * 
 * @author edogboo
 *
 * the length of 999999999 will exceed the heap space, so cannot count Prime previously, so i'll use count prime directly. This is stupid i think
 */
public class Puzzle41 {
	
	public static int limit = 999999999;
	
	
	public static void main(String args[]){
		for(int i = limit; i>0; i--){
			if(isPanPrime(i)) {
				System.out.println(i);
				break;
			}
		}
	}
	
	public static boolean isPrime(int num){
		for(int i = 2 ;i< Math.sqrt(limit)+1; i++){
			if(num % i == 0) return false;
		}
		return true;
	}
	
	public static boolean isPanPrime(int num){
		boolean[] digits = new boolean[9];
		char[] digit = Integer.toString(num).toCharArray();
		for(char d : digit){
			if(d=='0') return false;
			if(digits[(int)d-49]) return false;
			digits[(int)d-49] = true;
		}
		return !isPrime(num);
	}
}
