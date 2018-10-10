/**
 * 
 */
package com.arrays;

/**
 * You are given a list of n-1 integers and these integers are in the range of 1
 * to n. There are no duplicates in list. One of the integers is missing in the
 * list. Write an efficient code to find the missing integer.
 * 
 * @author kxhb130
 *
 *         a[] = {1,2,4,5,6} out-put: 3
 * 
 *         Sum Formula: (n+1)*(n+2)/2; find sum using formula and subtract
 *         elements from sum to get remaining/missing number
 */
public class MissingNumberInArray {

	static int getMissing(int[] arr) {
		int n = arr.length;
		int sum = ((n+1)*(n+2))/2;
		for (int i=0; i<arr.length; i++) {
			sum -= arr[i];
		}
		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 6 };
		System.out.println(getMissing(a));
	}

}
