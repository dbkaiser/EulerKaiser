package com.dbk.puzzle;

import java.util.Stack;

/**
 * 
 * @author edogboo
 *
 *
 */
public class Puzzle31 {

	public static int routeCount = 0;
	public static int[] rock = {200,100,50,20,10,5,2,1};
	public static Stack<Integer> stack = new Stack<Integer>();
	public static int amount = 200;
	
	public static void main(String args[]){
		greedy(amount,0);
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
			if(!stack.isEmpty())
				left += stack.pop();
			return left;
		}
	}
	
	
}


///**** here is a better solution:
//int coins[8] = {200, 100, 50, 20, 10, 5,2,1};
//
//int findposs(int money, int maxcoin)
//{
//    int sum = 0;
//    if(maxcoin == 7) return 1;
//    for(int i = maxcoin; i<8;i++)
//    {
//        if (money-coins[i] == 0) sum+=1;
//        if (money-coins[i] > 0) sum+=findposs(money-coins[i], i);
//    }
//    return sum;     
//}
//
//int main()
//{
//    cout<<findposs(200, 0)<<endl;
//}
