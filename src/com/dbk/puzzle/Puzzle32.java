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
	public static int bound = 9;
	public static boolean[] taken = new boolean[bound];
	public static Set<Integer> set = new HashSet<Integer>();
	
	//level start with 0 end with 5
	public static void find(int level, int multis[]){
		if(level == 5){
			int[] left = new int[4];
			int count = 0;
			for(int i = 0;i < bound; i++){
				if(!taken[i]) left[count++] = i+1;
			}
			int pro1 = (multis[0]*10+multis[1]) * (multis[2]*100 + multis[3]*10+multis[4]);
			if(varifyDigit(pro1, left)){
				System.out.println(" "+pro1);
				set.add(pro1);
			}
			int pro2 = multis[0] * (multis[1] * 1000 + multis[2]*100 + multis[3]*10+multis[4]);
			if(varifyDigit(pro2, left)){
				System.out.println(pro2);
				set.add(pro2);
			}
		}
		else{
			for(int i = 0; i < 9; i++){
				if(taken[i]) continue;
				taken[i] = true;
				multis[level] = i+1;
				find(level+1,multis);
				taken[i] = false;
			}
		}
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
		int multis[] = new int[5];
		find(0, multis);
		int sum = 0;
		for(int i : set){
			sum +=i;
		}
		System.out.println(sum);
	}
}
