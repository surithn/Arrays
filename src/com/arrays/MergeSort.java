/**
 * 
 */
package com.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Divide and merge algorithm
 * 
 * @author kxhb130
 * 	
 * 		Time complexity: O(nlogn)
 *
 */
public class MergeSort {

	public static int[] divider(int[] arr, int min, int max) {
		if (max > min) {
			int mid = min + (max - min)/2;
			divider(arr, min, mid);
			divider(arr, mid+1, max);
			merger(arr, min, mid, max);
		}
		return arr;
	}
	
	private static void merger(int[] arr, int min, int mid, int max) {
		int size1 = mid-min+1; // add one to include arr till mid
		int size2 = max-mid;
		int[] arr1 = new int[size1];
		int[] arr2 = new int[size2];
		IntStream.range(0, size1).forEach(i -> arr1[i] = arr[min+i]);
		IntStream.range(0, size2).forEach(i -> arr2[i] = arr[mid+i+1]);
		
		int i=0,j=0,k=min;
		while (i<size1 && j<size2) {
			if (arr1[i] < arr2[j]) {
				arr[k] = arr1[i];
				i++;
			} else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while (i<size1) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		
		while (j<size2) {
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7};
		System.out.println(Arrays.toString(divider(arr, 0, arr.length-1)));
	}

}
