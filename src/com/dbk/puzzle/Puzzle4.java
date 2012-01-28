package com.dbk.puzzle;

public class Puzzle4 {
	public static void main(String args[]){
		long result = 0;
		for (long i = 999; i > 100; i-- ){
			for(long j = 999; j > 100; j-- ){
				long product = i * j;
				if(isPalin(product) && product > result) result = product;
			}
		}
		System.out.println(result);
	}
	
	public static boolean isPalin(long num){
		String str = Long.toString(num);
		int m = str.length();
		for(int i = 0;  i< m/2 ; i++){
			if(str.charAt(i) != str.charAt(m-i-1)) return false;
		}
		return true;
	}
}
