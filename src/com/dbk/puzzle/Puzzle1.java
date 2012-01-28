package com.dbk.puzzle;

public class Puzzle1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int limit =10;
		for(int i = 1 ; i < limit ; i++){
			if(i % 3 == 0 || i % 5 == 0){
				sum += i; 
			}
		}
		System.out.println(sum);
	}

}
