/**
 * 
 */
package com.arrays;

/**
 * Find the Rotation Count in Rotated Sorted array
 * 
 * Consider an array of distinct numbers sorted in increasing order. The array
 * has been rotated (clockwise) k number of times. Given such an array, find the
 * value of k.
 * 
 * @author kxhb130
 *
 *         Input : arr[] = {15, 18, 2, 3, 6, 12} Output: 2
 * 
 * 
 *         A simple linear solution is to *find minimum element* and returns its
 *         index.
 */
public class FindRotationCountOfRotatedArray {

	// find minimum element and return its index
	// O(n)
	static int simple(int[] arr) {
		int small = arr[0];
		int index = 0;
		for (int i=1; i<arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
				index = i;
			}
		}
		return index;
	}
	
	// efficient solution: to find the pivot i.e find the mid and get small index
	static int findPivot(int[] arr, int min, int max) {
		if (max < min)
			return -1;
		if (min == max)
			return min;
		int mid = min + (max-min)/2;
		if (mid < max && arr[mid] > arr[mid+1])
			return mid+1;
		if (mid > min && arr[mid] < arr[mid-1])
			return mid;
		
		if (arr[min] >= arr[mid])
			return findPivot(arr, min, mid-1);
		return findPivot(arr, mid+1, max);
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {15, 18, 2, 3, 6, 12};
		System.out.println(simple(arr));
		System.out.println(findPivot(arr,0, arr.length-1));
	}

}
