/**
 * 
 */
package com.arrays;

import java.util.Arrays;

/**
 * Given an array, the task is to reverse the array.
 * 
 * @author kxhb130
 *
 */
public class ArrayReversal {

	static int[] reversal(int[] arr) {
		if (arr == null || arr.length == 1)
			return arr;
		int mid = (arr.length/2);
		for (int i=0; i<mid; i++) {
			arr[i] = arr[i] + arr[arr.length-1-i];
			arr[arr.length-1-i] = arr[i] - arr[arr.length-1-i];
			arr[i] = arr[i] - arr[arr.length-1-i];
		}
		return arr;
	}
	
	static void recursive(int[] arr, int min, int max) {
		if (min >= max)
			return;
		int temp = arr[min];
		arr[min] = arr[max];
		arr[max] = temp;
		
		recursive(arr, min+1, max-1);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(reversal(arr)));
		recursive(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
