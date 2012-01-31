package com.dbk.puzzle;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author edogboo
 *
 * The inspiration is from a python code. The shining point is the way of find gcd.
 */
public class Puzzle33 {
	
	public static Set<int[]> set = new HashSet<int[]>();
	public static void main(String args[]){
		int n = 1, d = 1;
		for(int i = 10; i<=99; i++){
			for(int j = i+1; j<=99; j++){
				if(isCur(i, j)){
					n *= i;
					d *= j;
				}
			}
		}
		int t = gcd(d,n);
		System.out.println(d/t);
		
	}
	
	public static boolean isCur(int numer, int domin){
		int tenNum = numer /10;
		int diNum = numer% 10;
		int tenDom = domin / 10;
		int diDom = domin % 10;
		return isNoDiv(numer, domin, tenNum, tenDom, diNum, diDom) 
				|| isNoDiv(numer, domin, diNum, tenDom, tenNum, diDom)
				|| isNoDiv(numer, domin, tenNum, diDom, diNum, tenDom)
				|| isNoDiv(numer, domin, diNum, diDom, tenNum, tenDom);
	}
	
	public static boolean isNoDiv(int numer, int domin, int n, int d, int other1, int other2){
			return other1 == other2 && other1 != 0 && n*domin == d * numer;
	}
	// find the greatest common divisor
	//x > y
	public static int gcd(int x, int y){
		return y==0?x : gcd(y, x%y); 
	}
}
