package com.dbk.puzzle;

/**
 * 
 * @author edogboo
 *
 *algorithm analyze:
 * I'll run through 1 to 9999 which 4-digit is the maximum possible number to multiple by 1 and 2 and form a 9 pandigit number
 * and calculate each one if can organ a pandigit. 
 * 
 *  There must be a faster way.
 */
public class Puzzle38 {
	public static void main(String args[]){
		for(int i = 1; i<= 9999; i++){
			int m = countPan(i);
			if(m != -1) System.out.println(m);
		}
		
	}
	
	// return -1 is failure.
	public static int countPan(int num){
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i< 9; i++){
			sb.append(i*num);
			if(sb.length() > 9) return -1;
			if(sb.length() == 9 && isPan(sb.toString())) return Integer.parseInt(sb.toString()); 
		}
		return -1;
	}
	
	public static boolean isPan(String num){
		boolean[] digits = new boolean[9];
		char[] digit = num.toCharArray();
		for(char d : digit){
			if(d=='0') return false;
			if(digits[(int)d-49]) return false;
			digits[(int)d-49] = true;
		}
		return true;
	}
}
