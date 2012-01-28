package com.dbk.puzzle;

/**
 * Find the longest sequence using a starting number under one million.
 * 
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * @author dbkaiser
 * 
 */
public class Puzzle14 {
	public static final int bound = 1000000;
	public static int maps[] = new int[bound];
	
	public static void main(String args[]){
		entrance();
		//TODO 
	}
	
	public static void test(){
		long max = 0;
		long num = 0;
		for(long i = 1000000; i>= 825714l; i--){
			
			long x = testChain(i);
			if(x > max) {
				max = x;
				num = i;
			}
		}
		System.out.println(testChain(999167));
		System.out.println(num+ " " + max);
	}
	
	public static int testChain(long num){
		
		if(num == 1) return 1;
		else if(num % 2 == 0) return testChain(num / 2) + 1;
		else return testChain(3 * num + 1) + 1;
		
	}
	
	// entrance of the program
	public static void entrance(){
		long tic = System.currentTimeMillis();
		//initial
		for(int i =0; i < bound; i++){
			maps[i]=0;
		}
		long startNum = 1;
		int count = 1;
		//put small number steps into the table
		nextStep(startNum, count);
		//deal with the left
		for(int i = 0; i < bound; i++ ){
			if(maps[i]!=0){
				continue;
			}
			maps[i] = testStep(i+1);
		}
		long max = 0;
		long result = 0;
		for(int i =0; i < bound; i++){
			if(maps[i] >= max) {
				max = maps[i];
				result = i + 1;
			}
		}
		long toc = System.currentTimeMillis();
		System.out.println(toc-tic);
		System.out.println(max);
		System.out.println(result);
	}
	
	//direct test current step
	public static int testStep(long num){
		if(num < bound && maps[(int)num-1] != 0) return maps[(int)num-1];
		else if(num % 2 == 0) return testStep(num / 2) + 1;
		else return testStep(3 * num + 1) +1;
	}
	
	public static void nextStep(long num, int count){
		
		if(isOver(num))
			return;
		if(num < bound)
			maps[(int)(num-1)] = count;
		if(canOdd(num)){
			nextStep(goOdd(num), count + 1);
		}
		nextStep(goEven(num), count + 1);
	}
	
	public static boolean canOdd(long num){
		return (num - 1) % 3 == 0 && ((num - 1)/ 3) % 2 != 0 && num != 4 && num != 1;
	}
	
	public static long goEven(long num){
		return num * 2;
	}
	
	public static long goOdd(long num){
		return (num - 1) / 3;
	}
	
	public static boolean isOver(long num){
		return num > bound && ((num-1)%3!=0||(2*num+1)%3!=0);
	}
}
