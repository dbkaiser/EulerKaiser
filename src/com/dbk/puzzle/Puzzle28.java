package com.dbk.puzzle;

/**
 * 
 * What is the sum of both diagonals in a 1001 by 1001 spiral?
 * 
 * It is easy to prove that number on the top-right cornor is (2n-1)^2, where n is the layer number.
 * So the sum of 4 numbers on the n layer is 4(2n-1)^2-(2+4+6)(n-1).
 * And The result (sum of every layer numbers in the cornor) would be a function of triple function.
 * We can get it by either way: define a*n^3 + b*n^2 + c*n + d = f(n) where f(1) = 1; f(2) = 25; f(3) = 101; f(4) = 261;
 * 
 *  Or We use the sum fomulat of Sigma n^2 = n*(n+1)*(2n+1)/6; and Sigma n = n(n+1)/2 into the n layer summation: Sigma n = 16n^2 - 28n + 16
 *  
 *  Finally we get:
 *  f(n) = 16/3*n^3 - 6n^2 +14/3n - 3
 *  then it's over.
 *  for 1001 by 1001, it has 501 layers
 *  
 * @author edogboo
 *
 */
public class Puzzle28 {
	public static void main(String args[]){
		double n = 1001;
		double y = (double)16/3*n*n*n - 6*n*n + (double)14/3*n -3;
//		double y = (double)16/3;
		System.out.println(y);
		long m = 501;
		long result = (m*m*m*16+m *14)/3 -3-6*m*m;
		System.out.println(result);
		
	}
}
