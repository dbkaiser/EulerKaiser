package com.dbk.puzzle;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 * 
 * @author edogboo
 * 
 */
public class Puzzle24 {
	public static int pos = 1000000;
	public static int nums = 10;
	public static int resultPos[] = new int[nums];

	public static void main(String args[]) {
		List<Integer> lists = new LinkedList<Integer>(); // list store all the
															// left numbers, big
															// at first
		for (int i = 9; i >= 0; i--) {
			lists.add(i);
		}
		System.out.println(lists.get(0));
		int remain = pos;
		// 0 as the upper digits
		for (int i = 0; i < nums; i++) {
			// count the i! if i! is bigger than remaining number
			int curSum = stepCross(nums - i);
			if (curSum >= remain) {
				if (i > 0)
					resultPos[i - 1] = lists.remove(lists.size() - 1);
			} else {
				if (i > 0) {
					resultPos[i - 1] = lists.remove(lists.size() - remain
							/ curSum - (remain % curSum == 0 ? 0 : 1));
					remain = remain % curSum;
					if (remain == 0) {
						setBigest(lists, i);
						break;
					}
				} else {
					System.out.println("error: exceed");
					break;
				}
			}
			if (curSum == remain) {
				setBigest(lists, i);
				break;
			}
		}
		for (int i = 0; i < resultPos.length; i++) {
			System.out.print(resultPos[i]);
		}
	}

	public static void setLowest(List<Integer> leftnums, int pos) {
		for (int i = pos; i < nums; i++) {
			resultPos[i] = leftnums.remove(leftnums.size() - 1);
		}
	}

	public static void setBigest(List<Integer> leftnums, int pos) {
		for (int i = pos; i < nums; i++) {
			resultPos[i] = leftnums.remove(0);
		}
	}

	/**
	 * count the n!
	 * 
	 * @param num
	 * @return
	 */
	public static int stepCross(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}
}
