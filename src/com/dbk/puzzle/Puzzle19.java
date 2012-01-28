package com.dbk.puzzle;

/**
 * How many Sundays fell on the first of the month during the twentieth century?
 * 
 * @author edogboo
 *
 */
public class Puzzle19 {
	public static int month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	public static int startYear = 1900;
	public static void main(String args[]){
		//from 1901
		int sum = (1 + 365) % 7;
		int count = 0;
		System.out.println(sum);
		System.out.println(sum % 7);
		for(int y = 1901; y <= 2000; y++){
			for(int i = 1; i< month.length; i++){
				if(sum % 7 ==0 ) {
					count++;
					System.out.println(i + " " + y);
				}
				if(i == 2 && y % 4 == 0) sum += 1;
				sum += month[i];
				
			}
		}
		System.out.println(count);
	}
}
