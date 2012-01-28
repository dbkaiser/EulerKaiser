package com.dbk.puzzle;

/**
 * 
 * @author edogboo
 *
 */
public class Puzzle17 {
	public static String single[] = {"", "one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	public static String tenth[] = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	public static String hundred = "hundred";
	public static String and = "and";
	public static String thousand = "thousand";
	public static void main(String args[]){
		int[] singleLeng = new int[single.length];
		int[] tenthLeng = new int[tenth.length];
		for(int i = 0; i< single.length; i++){
			singleLeng[i] = single[i].length();
		}
		for(int i = 0; i< tenth.length; i++){
			tenthLeng[i] = tenth[i].length();
		}
		long sum =0;
		for(int i= 1; i<= 999; i++){
			int singleNum = i % 10;
			int tenthNum = i % 100;
			int hundredNum = i % 1000;
			if(tenthNum > 20 || tenthNum < 10){
				sum += singleLeng[singleNum];
//				System.out.println(single[singleNum]);
			}
			else if(tenthNum < 20){
				sum += singleLeng[tenthNum];
//				System.out.println(single[tenthNum]);
			}
			sum += tenthLeng[tenthNum / 10];
//			System.out.println(tenth[tenthNum / 10]);
			if(hundredNum > 99){
				sum += singleLeng[hundredNum / 100];
				sum += 7;
//				System.out.println(single[hundredNum / 100] + "hundred");
				if(tenthNum != 0) {
//					System.out.println("and");
					sum +=3;
				}
//				System.out.println();
			}
		}
		//add one thousand
		sum += 11;
		System.out.println(sum);
	}
	public static void test(){
		
	}
}
