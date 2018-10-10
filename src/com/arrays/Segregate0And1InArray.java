/**
 * 
 */
package com.arrays;

import java.util.Arrays;

/**
 * Segregate 0s and 1s in an array You are given an array of 0s and 1s in random
 * order. Segregate 0s on left side and 1s on right side of the array. Traverse
 * array only once.
 * 
 * Input array = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] Output array = [0, 0, 0, 0, 0,
 * 1, 1, 1, 1, 1]
 * 
 * @author kxhb130
 *
 */
public class Segregate0And1InArray {
	
	static int[] segregater(int[] arr) {
		int[] res = new int[arr.length];
		Arrays.fill(res, 0);
		int count = arr.length-1;
		for (int i=arr.length-1; i>=0; i--) {
			if (arr[i] == 1) {
				res[count] = arr[i];
				count--;
			}
		}
		return res;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		System.out.println(Arrays.toString(segregater(arr)));
	}

}
