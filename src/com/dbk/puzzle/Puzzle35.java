package com.dbk.puzzle;

/**
 * 
 * @author edogboo
 *
 */
public class Puzzle35 {
	
	public static int limit = 1000000;
	public static boolean[] mark = new boolean[limit+1];
	public static void main(String args[]){
		long start = System.currentTimeMillis();
		countPrime();
		int count = 0;
		for(int i = 2; i< limit; i++){
			if(mark[i]) continue;
			if(isCircle(i)) count++;
		}
		System.out.println(System.currentTimeMillis()-start);
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
	public static boolean isCircle(int num){
		String strNum = Integer.toString(num);
		return isCirRec(num,strNum.length(),0);
	}
	
	public static boolean isCirRec(int num, int length, int level){
		if(level == length) return !mark[num];
		else
			return !mark[num] && isCirRec(num/10+ num%10*(int)Math.pow(10, length-1),length, level+1);
	}
}
