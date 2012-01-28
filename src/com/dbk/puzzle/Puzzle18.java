package com.dbk.puzzle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * 	Find the maximum sum travelling from the top of the triangle to the base.
 * 
 * @author edogboo
 *
 */
public class Puzzle18 {
	public static int[][] maps;
	public static int max = 0;
	public static int[] maxRoute;
	public static void main(String args[]){
		try {
			maps = readMap("num18.txt");
			int route[] = new int[maps.length];
			tryRoute(0, 0, 0, route);
			System.out.println(max);
			System.out.println(maxRoute);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void tryRoute(int sum, int level, int pos, int[] route){
		sum += maps[level][pos];
		route[level] = pos;
		if(level == maps.length - 1){
			if(sum > max){
				maxRoute = route.clone();
				max = sum;
			}
			return;
		}
		tryRoute(sum, level+1, pos, route);
		tryRoute(sum, level + 1, pos + 1, route);
	}
	
	public static int[][] readMap(String filename) throws IOException{
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		List<String> strings = new LinkedList<String>();
		while(br.ready()){
			strings.add(br.readLine());
		}
		int size = strings.size();
		int [][] maps = new int[size][size];
		for(int i = 0; i < size; i ++){
			String s = strings.get(i);
			String slist[] = s.split(" ");
			for(int j = 0 ; j < slist.length; j++){
				maps[i][j] = Integer.parseInt(slist[j]);
			}
		}
		return maps;
	}
}
