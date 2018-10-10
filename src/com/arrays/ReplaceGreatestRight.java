package com.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author kxhb130 Replace every element with the greatest element on right side
 * 
 *         statement: Given an array of integers, replace every element with the
 *         next greatest element (greatest element on the right side) in the
 *         array. Since there is no element next to the last element, replace it
 *         with -1. For example, if the array is {16, 17, 4, 3, 5, 2}, then it
 *         should be modified to {17, 5, 5, 5, 2, -1}.
 */
public class ReplaceGreatestRight {

	public static int[] shortestPath(int[] a) {
		int len = a.length;
		int largest = a[len-1];
		a[len-1] = -1;
		
		for (int i=len-2; i>=0; i--) {
			int temp = a[i];
			a[i] = largest;
			if (largest < temp)
				largest = temp;
		}
		return a;
	}

	public static int[] iterative(int[] a) {
		IntStream.range(0, a.length).forEach(i -> {
			int big = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > big)
					big = a[j];
			}
			if (i == a.length - 1)
				a[i] = -1;
			else
				a[i] = big;
		});
		return a;
	}

	public static void main(String[] args) {
		int[] a = { 16, 17, 4, 3, 5, 2 };
		System.out.println(Arrays.toString(shortestPath(a)));
		//System.out.println(Arrays.toString(iterative(a)));
	}

}
