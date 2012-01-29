package com.dbk.puzzle;

import java.util.Stack;

/**
 * 
 * @author edogboo
 *
 */
public class Puzzle31 {

	public static int routeCount = 0;
	public static int[] rock = {200,100,50,20,10,5,2,1};
	public static Stack<Integer> stack = new Stack<Integer>();
	public static int amount = 200;
	
	public static void main(String args[]){
		greedy(4,0);
		System.out.println(routeCount);
	}
	
	public static int greedy(int left, int biggest){
		if(left == 0){
			routeCount++;
			left += stack.pop();
			return left;
		}
		else if(left < 0){
			left += stack.pop();
			return left;
		}
		else {
			for(int i = biggest; i< rock.length; i++){
				stack.push(rock[i]);
				left = left - rock[i];
				left = greedy(left, i);
			}
			left += stack.pop();
			return left;
		}
	}
	
	
}
