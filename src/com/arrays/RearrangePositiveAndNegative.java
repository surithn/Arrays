/**
 * 
 */
package com.arrays;

import java.util.Arrays;

/**
 * 
 * Rearrange positive and negative numbers with constant extra space
 * 
 * Given an array of positive and negative numbers, arrange them such that all
 * negative integers appear before all the positive integers in the array
 * without using any additional data structure like hash table, arrays, etc. The
 * order of appearance should be maintained.
 * 
 * @author kxhb130
 * 
 *         Input: [12 11 -13 -5 6 -7 5 -3 -6]
 * 
 *         Output: [-13 -5 -7 -3 -6 12 11 6 5]
 *
 *
 *         Loop from i = 1 to n - 1. a) If the current element is positive, do
 *         nothing. b) If the current element arr[i] is negative, we insert it
 *         into sequence arr[0..i-1] such that all positive elements in
 *         arr[0..i-1] are shifted one position to their right and arr[i] is
 *         inserted at index of first positive element.
 */
public class RearrangePositiveAndNegative {

	static int[] rearrange(int[] arr) {
		int j,key;
		// loop from 1 to len-1
		for (int i=1; i<arr.length; i++) {
			key = arr[i];
			
			// if key is positive, do nothing
			if (key > 0)
				continue;
			
			// else if negative, loop to move positive ele to right by 1 step
			j=i-1;
			while (j>=0 && arr[j] > 0) {
				arr[j+1] = arr[j];
				j -= 1;
			}
			// insert key at index of first element
			arr[j+1] = key;
		}
		return arr;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 }; 
		System.out.println(Arrays.toString(rearrange(arr)));
	}

}
