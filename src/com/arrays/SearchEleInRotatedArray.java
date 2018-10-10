/**
 * 
 */
package com.arrays;

/**
 * Search an element in a sorted and rotated array
 * 
 * An element in a sorted array can be found in O(log n) time via binary search.
 * But suppose we rotate an ascending order sorted array at some pivot unknown
 * to you beforehand. So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise
 * a way to find an element in the rotated array in O(log n) time.
 * 
 * @author kxhb130
 *
 *         Input : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}; key = 3 Output : Found
 *         at index 8
 */
public class SearchEleInRotatedArray {

	// find pivot 
	static int pivot(int[] arr, int min, int max) {
		if (max < min)
			return -1;
		if (max == min)
			return min;
		int mid = min+ (max-min)/2;
		if (mid < max && arr[mid] > arr[mid+1])
			return mid;
		if (mid > min && arr[mid] < arr[mid-1])
			return mid-1;
		if (arr[min] >= arr[mid])
			return pivot(arr, min, mid-1);
		return pivot(arr, mid+1, max);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		System.out.println(searchElement(arr, 3));
	}

	static int searchElement(int[] arr, int key) {
		if (arr == null)
			return -1;
		
		// find pivot - element index
		int pi = pivot(arr, 0, arr.length-1);
		
		// if -1 then array is not rotated at all
		if (pi == -1)
			BinarySearchSortedArray.binarySearch(arr, 0, arr.length-1, key);
			
		if (arr[pi] == key)
			return pi;
		
		if (arr[0] > key)
			return BinarySearchSortedArray.binarySearch(arr, pi+1, arr.length-1, key);
		return BinarySearchSortedArray.binarySearch(arr, 0, pi-1, key);
	}

}
