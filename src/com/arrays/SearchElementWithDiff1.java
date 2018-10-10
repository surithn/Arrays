/**
 * 
 */
package com.arrays;

/**
 * Search an element in an array where difference between adjacent elements is 1
 * 
 * @author kxhb130
 *
 *         Given an array where difference between adjacent elements is 1, write
 *         an algorithm to search for an element in the array and return the
 *         position of the element (return the first occurrence).
 * 
 *         Let element to be searched be x
 * 
 *         Input: arr[] = {8, 7, 6, 7, 6, 5, 4, 3, 2, 3, 4, 3} x = 3 Output:
 *         Element 3 found at index 7
 */
public class SearchElementWithDiff1 {

	// simple solution is to traverse arr and find index if ele is equal
	static int simple(int[] arr, int find) {
		if (arr == null || find == 0)
			return 0;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == find)
				return i;
		}
		
		return -1;
	}
	
	// efficient solution: utilise the fact that diff b/w adjacent is 1
	// find the diff b/w cur ele and find ele and jump to that diff and check if value is equal or repeat
	static int efficient(int[] arr, int find) {
		if (arr == null)
			return -1;
		if (find == 0)
			return 0;
		
		int diff = 0;
		for (int i=0; i<arr.length; i++) {
			diff = diff + (arr[i] - find);
			if (arr[diff] == find)
				return diff;
			i= (i+diff-1);
		}
		return -1;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {8, 7, 6, 7, 6, 5, 4, 3, 2, 3, 4, 3};
		System.out.println(simple(arr, 4));
		System.out.println(efficient(arr, 4));
	}

}
