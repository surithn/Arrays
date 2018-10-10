/**
 * 
 */
package com.arrays;

import java.util.Arrays;

/**
 * @author kxhb130
 *
 */
public class ArraysRightRotation {

	static int[] rotateRight(int[] arr, int k) {
		if (arr == null || arr.length >= 1000000 || k > 500)
			return arr;
		
		for (int i=0; i<k; i++) {
			int temp = arr[arr.length-1];
			for (int j=arr.length-1; j>0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
		return arr;
	}
	
	static int[] rotateRightReverse(int[] arr, int k) {
		if (arr == null || k <= 0 || arr.length >= 1000000)
			return arr;
		
		int mid = arr.length-k;
		reverse(arr, 0, mid-1);
		reverse(arr, mid, arr.length-1);
		reverse(arr, 0, arr.length-1);
		return arr;
	}
	
	private static void reverse(int[] arr, int i, int j) {
		if (i > j) 
			return;
		int temp = 0;
		while (i<j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(rotateRight(arr, 2)));
		arr = ArraysLeftRotation.jugglingAlgorithm(arr, 2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rotateRightReverse(arr, 2)));
	}

}
