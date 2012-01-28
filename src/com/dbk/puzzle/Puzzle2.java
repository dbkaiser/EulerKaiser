package com.dbk.puzzle;

public class Puzzle2 {
	private long a = 0;
	private long b = 1;
	
	public long findNext(){
		long c = a + b;
		a = b;
		b = c;
		return c;
	}
	public static void main(String args[]){
		Puzzle2 p2 = new Puzzle2();
		long sum = 0;
		while(true){
			long m = p2.findNext();
			if(m > 4000000){
				break;
			}
			if(m % 2 ==0) sum += m; 
		}
		System.out.println(sum);
	}
}
