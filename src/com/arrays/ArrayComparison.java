/**
 * 
 */
package com.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Compare two given array elements for equality.
 * 
 * @author kxhb130
 * 
 *         For ex: a1={1,1,2} && a2 = {1,2,2} out-put: false a1={1,2,5,4} &&
 *         a2={5,2,4,1} out-put: true
 * 
 *
 */
public class ArrayComparison {

	// efficient solution: store elements of arr1 in hashmap with count and iterate arr2 for equality
	static boolean isEqual(int[] arr1, int[] arr2) {
		int count;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i=0; i<arr1.length; i++) {
			if (!map.containsKey(arr1[i]))
				map.put(arr1[i], 1);
			else {
				map.put(arr1[i],	 map.get(arr1[i])+1);
			}
		}
		
		for (int i=0; i<arr2.length; i++) {
			if (!map.containsKey(arr2[i]))
				return false;
			else {
				count = map.get(arr2[i]);
				if (count == 0)
					return false;
				else if (count > 0)
					map.put(arr2[i], count-1);
			}
		}
		
		for (int i=0; i<arr1.length; i++) {
			if (map.get(arr1[i]) > 0)
				return false;
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 5, 4 };
		int[] arr2 = { 2, 5, 4, 1 };
		System.out.println(isEqual(arr1, arr2));
	}

}
