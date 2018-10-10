/**
 * 
 */
package com.arrays;

import java.util.Arrays;

/**
 * for given array 22,16,34,22,54 & k=22, find k in arr, remove it and move ele
 * on left of it to right
 * 
 * @author trimble
 * 
 *         out-put for above problem is [1, 1, 16, 34, 54]
 */
public class RearrangingArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 22, 16, 34, 22, 54 };
		System.out.println(Arrays.toString(rearrange(arr, 22)));
	}

	public static int[] rearrange(int[] arr, int k) {
		int[] res = new int[arr.length];
		Arrays.fill(res, 1);
		int count = arr.length-1;
		for (int i=arr.length-1; i>=0; i--) {
			if (arr[i] != k) {
				res[count] = arr[i];
				count--;
			}
		}
		return res;
	}

}
