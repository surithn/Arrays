/**
 * 
 */
package com.arrays;

/**
 * Search for given key in Sorted Array
 * 
 * Binary search tree algorithm gives us result in O(logn) complexity
 * 
 * @author kxhb130
 * 
 *         Input : arr[] = {1, 2, 3, 5, 6, 7, 8, 9, 10}; key = 3 Output : Found
 *         at index 2
 *
 */
public class BinarySearchSortedArray {

	static int binarySearch(int[] arr, int min, int max, int key) {
		if (max < min)
			return -1;
		
		int mid = (min + (max-min)/2);
		if (arr[mid] == key)
			return mid;
		if (arr[mid] > key)
			return binarySearch(arr, min, mid-1, key);
		return binarySearch(arr, mid+1, max, key);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 5, 6, 7, 8, 9, 10};
		System.out.println(binarySearch(arr, 0, arr.length, 3));
	}

}
