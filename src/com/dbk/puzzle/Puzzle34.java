package com.dbk.puzzle;

/**
 * 
 * @author edogboo
 * 
 * clearer way: count all factorial at the very beginning!!
 *  from 1! to 10!
 *  
 *
 */
public class Puzzle34 {
	public static void main(String args[]){
		int sum = 0;
		for(int i = 3; i <= 2540160; i++){
			sum += isFrable(i)?i:0;
		}
		System.out.println(sum);
		
	}
	
	public static boolean isFrable(int number){
		String strNum = Integer.toString(number);
		int sum = 0;
		for(int i = 0 ; i< strNum.length(); i++){
			sum += jc((int)strNum.charAt(i)-48);
		}
		return sum == number;
	}
	
	public static int jc(int m){
		return m<=1?1:m*jc(m-1);
	}
}

//following is a cleverer solution // in python:

//F = [1]
//for x in range(1, 10):
//  F.append(F[-1] * x)
//
//def special(x):
//  global F
//  s = 0
//  t = x
//  while t > 0:
//    s += F[t%10]
//    t //= 10
//
//  return s == x
//
//sol = 0
//for x in range(3, 10000000):
//  if special(x):
//    sol += x
//
//print sol 
