/**
 * 
 */
package com.arrays;

/**
 * K’th Smallest/Largest Element in Unsorted Array
 * 
 * @author kxhb130
 * 
 *         A Simple Solution is to sort the given array using a O(nlogn) sorting
 *         algorithm like Merge Sort, Heap Sort, etc and return the element at
 *         index k-1 in the sorted array. Time Complexity of this solution is
 *         O(nLogn).
 *
 */
public class KthLargestAndSmallest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {7, 10, 4, 3, 20, 15};
		
		// sort the array
		HeapSort.maxHeap(arr);
		// find the 2nd highest ele in array
		int n = 2-1;
		System.out.println(arr[arr.length-1-n]);
		
		// find the 4th highest ele in array
		n = 4-1;
		System.out.println(arr[arr.length-1-n]);
	}

}
