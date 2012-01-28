package com.dbk.puzzle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Puzzle11 {

	public static int bound = 20;
	public static int length = 4;

	/**
	 * What is the greatest product of four adjacent numbers on the same
	 * straight line in the 20 by 20 grid?
	 * 
	 * @param filePath
	 *            file name
	 * @throws IOException
	 */
	public static int[][] readNumbers(String filePath) throws IOException {
		int[][] nums = new int[bound][bound];
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		int countline = 0;
		for (; br.ready(); countline++) {
			String curline = br.readLine();
			String[] strnums = curline.split(" ");
			for (int i = 0; i < strnums.length; i++) {
				nums[countline][i] = Integer.parseInt(strnums[i]);
			}
		}
		return nums;
	}

	/**
	 * brute force
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			int maxNum = 0;
			int dir = 0;
			int maxI = 0, maxJ = 0;
			int nums[][] = readNumbers("nums11.txt");
			for (int i = 0; i < bound - length; i++) {
				for (int j = 0; j < bound; j++) {
					int product = nums[i][j] * nums[i + 1][j] * nums[i + 2][j]
							* nums[i + 3][j];
					if (product > maxNum){
						maxNum = product;
						dir = 1;
						maxI = i;
						maxJ = j;
					}
				}
			}
			for (int i = 0; i < bound - length; i++) {
				for (int j = 0; j < bound; j++) {
					int product = nums[j][i] * nums[j][i + 1] * nums[j][i + 2]
							* nums[j][i + 3];
					if (product > maxNum){
						maxNum = product;
						dir = 2;
						maxI = i;
						maxJ = j;
					}
				}
			}
			for (int i = 0; i < bound - length; i++) {
				for (int j = 0; j < bound - length; j++) {
					int product = nums[j][i] * nums[j + 1][i + 1]
							* nums[j + 2][i + 2] * nums[j + 3][i + 3];
					
					if (product > maxNum){
						maxNum = product;
						dir = 3;
						maxI = i;
						maxJ = j;
					}
				}
			}
			for (int i = 0; i < bound - length; i++) {
				for (int j = 0; j < bound - length; j++) {
					int product = nums[length + j - 1][length + i - 4]
							* nums[length + j - 2][length + i - 3]
							* nums[length + j - 3][length + i - 2]
							* nums[length + j - 4][length + i - 1];
					if (product > maxNum){
						maxNum = product;
						dir = 4;
						maxI = i;
						maxJ = j;
					}
				}
			}
			System.out.println(maxNum);
			System.out.println(dir);
			System.out.println("I :" + maxI + " J :" + maxJ);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
