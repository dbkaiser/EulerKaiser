package com.dbk.puzzle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * 	What is the total of all the name scores in the file of first names?
 * 
 * @author edogboo
 *
 */
public class Puzzle22 {
	public static void main(String args[]){
		
			try {
				int[][] maps = read("names22.txt");
				long result = 0;
				for(int i =0 ; i < maps.length; i++){
					int sum =0;
					for(int j = 0; j < maps[i].length; j++){
						sum += maps[i][j];
					}
					result += sum * (i +1);
					if(result < 0) System.out.println("error " + result);
				}
				System.out.println(result);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public static int[][] read(String filename) throws IOException{
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		StringBuilder sb = new StringBuilder();
		while(br.ready()){
			sb.append(br.readLine());
		}
		String result = sb.toString().replace("\"", "");
		String arrays[] = result.split(",");
		List<String> list = new LinkedList<String>();
		int max = 0;
		for(String a : arrays){
			list.add(a);
			if(a.length()> max) max = a.length();
		}
		Collections.sort(list);
		int[][] resultint = new int[list.size()][max]; 
		
		for(int i = 0; i< list.size(); i++){
			for(int j = 0 ; j < list.get(i).length(); j++){
				resultint[i][j] = (int)list.get(i).charAt(j) - 64;
			}
		}
		return resultint;
	}
}
