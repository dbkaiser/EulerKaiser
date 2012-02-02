package com.dbk.puzzle;

/**
 * 
 * @author edogboo
 *
 */
public class Puzzle37 {
	public static int limit = 1000000;
	public static boolean[] mark = new boolean[limit+1];
	
	public static void main(String args[]){
		countPrime();
		int count = 0;
		for(int i = 10; i< limit; i++){
			int length = (int)Math.pow(10, (int)Math.log10(i));
			if(isTruable(i, true, length) && isTruable(i, false, length)) count += i;
		}
		System.out.println(count);
	}
	
	public static void countPrime(){
		for(int i = 2 ;i< Math.sqrt(limit)+1; i++){
			if(mark[i]) continue;
			for(int j = 2; i * j < limit; j++){
				mark[i*j] = true;
			}
		}
		mark[0] = true;
		mark[1] = true;
	}
	
	public static boolean isTruable(int num, boolean left, int length){
		if(num/10==0) return !mark[num];
		if(left) return !mark[num] && isTruable(num/10, left,length/10);
		else return !mark[num] && isTruable(num % length, left, length/10);
	}
}
