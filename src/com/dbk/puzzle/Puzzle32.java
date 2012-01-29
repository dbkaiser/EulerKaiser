package com.dbk.puzzle;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 
 * Analyze: only two possible solution: a*bbbb=cccc; aa* bbb= cccc
 * Then brute-force it!
 * 
 * @author edogboo
 *
 */
public class Puzzle32 {
	public static boolean[] taken = new boolean[9];
	
	public static void find(int level, int multis[]){
		if(level == 0){
			
		}
	}
	
	public static boolean varify(int[] multis, int left[]){
		int pro1 = (multis[0]*10+multis[1]) * (multis[2]*100 + multis[3]*10+multis[4]);
		int pro2 = multis[0] * (multis[1] * 1000 + multis[2]*100 + multis[3]*10+multis[4]);
		return varifyDigit(pro1, left)||varifyDigit(pro2, left);
	}
	
	//left length 4, ascend order
	public static boolean varifyDigit(int pro, int left[]){
		String strPro = Integer.toString(pro);
		if(strPro.length()!=4) return false;
		char[] arrays = strPro.toCharArray();
		Arrays.sort(arrays);
		for(int i = 0; i< 4; i++){
			if(((int)arrays[i]-48) != left[i]) return false;
		}
		return true;
	}
	
	public static void main(String args[]){
		
	}
}
