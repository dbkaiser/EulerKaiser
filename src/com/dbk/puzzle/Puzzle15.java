package com.dbk.puzzle;

/**
 * Starting in the top left corner in a 20 by 20 grid, how many routes are there
 * to the bottom right corner?
 * 
 * @author dbkaiser
 *  
 *  clever way:
 *  
 *  C20/40 means: (40!)/((20!)(20!))
 */
public class Puzzle15 {
	
	public static int grid = 21;
	public static long[][] table = new long[grid][grid];
	
	public static void main(String args[]){
		countAll();
	}
	
	public static void countAll(){
		for(int i = 0; i < grid; i++){
			table[0][i] = 1;
		}
		for(int j = 1; j < grid; j++){
			for(int i = j; i < grid; i++){
				if(i == j) table[j][i] = 2* table [j-1][i];
				else table[j][i] = table[j-1][i] + table[j][i-1];
			}
		}
		System.out.println(table[grid-1][grid -1]);
	}
	
	//recursively count rows
	public static int countRow(int bound, int level, int startNum){
		
		if(level == bound){
			return bound - startNum + 1;
		}
		int sum = 0;
		for(int i = startNum; i <= bound; i++){
			sum += countRow(bound, level + 1, i);
		}
		
		return sum;
	}
}
