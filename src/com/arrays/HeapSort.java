/**
 * 
 */
package com.arrays;

import java.util.Arrays;

/**
 * Heap sort is a comparison based sorting technique based on Binary Heap data
 * structure. It is similar to selection sort where we first find the maximum
 * element and place the maximum element at the end. We repeat the same process
 * for remaining element.
 * 
 * 	Time complexity: O(nlogn)
 * 
 * @author surith
 * 
 * 
 *         Heap Sort Algorithm for sorting in increasing order: 1. Build a max
 *         heap from the input data. 2. At this point, the largest item is
 *         stored at the root of the heap. Replace it with the last item of the
 *         heap followed by reducing the size of heap by 1. Finally, heapify the
 *         root of tree. 3. Repeat above steps while size of heap is greater
 *         than 1.
 *
 */
public class HeapSort {

	// max heap: ascending order of sorting
	public static int[] maxHeap(int[] arr) {
		// find the max using heapify
		for (int i=(arr.length/2)-1; i>=0; i--) 
			maxHeapify(arr, arr.length, i);
		// swap the max at root with last ele
		// and heapify rest of array
		for (int i=arr.length-1; i>=0; i--) {
			swap(arr, i, 0);
			maxHeapify(arr, i, 0);
		}
		
		return arr;
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void maxHeapify(int[] arr, int len, int i) {
		int largest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		
		if (left < len && arr[left] > arr[largest])
			largest = left;
		if (right < len && arr[right] > arr[largest])
			largest = right;
		if (largest != i) {
			swap(arr, i, largest);
			maxHeapify(arr, len, largest);
		}
	}

	// min heap: Descending order of sorting
	public static int[] minHeap(int[] arr) {
		// find the min and place it at root
		for (int i=(arr.length/2)-1; i>=0; i--) 
			minHeapify(arr, arr.length, i);
		
		// swap min at root with last ele and heapify the rest array
		for (int i= arr.length-1; i>=0; i--) {
			swap(arr, i, 0);
			minHeapify(arr, i, 0);
		}
		return arr;
	}
	

	private static void minHeapify(int[] arr, int len, int i) {
		int smallest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		
		if (left < len && arr[left] < arr[smallest])
			smallest = left;
		if (right < len && arr[right] < arr[smallest])
			smallest = right;
		if (smallest != i) {
			swap(arr, i, smallest);
			minHeapify(arr, len, smallest);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7};
		System.out.println(Arrays.toString(maxHeap(arr)));
		System.out.println(Arrays.toString(minHeap(arr)));
	}

}
