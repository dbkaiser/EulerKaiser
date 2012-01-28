package com.dbk.puzzle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Work out the first ten digits of the sum of the following one-hundred
 * 50-digit numbers.
 * 
 * @author dbkaiser
 * 
 */
public class Puzzle13 {
	public static void main(String args[]) {
		int length = 50;
		int count = 100;
		int[][] nums = null;
		try {
			nums = readNums("num13.txt", count, length);
		} catch (IOException e) {
			e.printStackTrace();
		}
		int[] sumBuffer = new int[length];
		for (int i = 0; i < length; i++) {
			sumBuffer[i] = 0;
			for (int j = 0; j < count; j++) {
				sumBuffer[i] += nums[j][i];
			}
		}
		//0 is the highest position 
		for (int i = length - 2; i >= 0; i--) {
			sumBuffer[i] += sumBuffer[i + 1] / 10;
		}
		System.out.print(sumBuffer[0]);
		for (int i = 1; i < length; i++) {
			System.out.print(sumBuffer[i] % 10);
		}
		System.out.println(nums[2][0]);
	}

	/**
	 * 
	 * @param filePath
	 * @param count
	 *            the sum number of the input numbers
	 * @param length
	 *            the numbers' length
	 * @return
	 * @throws IOException
	 */
	public static int[][] readNums(String filePath, int count, int length)
			throws IOException {
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		int[][] result = new int[count][length];
		for (int c = 0; br.ready() && c < count; c++) {
			String s = br.readLine();
			for (int i = 0; i < s.length() && i < length; i++) {
				result[c][i] = (int) s.charAt(i) - 48;
			}
		}

		return result;
	}
}
