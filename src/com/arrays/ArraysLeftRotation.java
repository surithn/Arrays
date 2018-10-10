/**
 * 
 */
package com.arrays;

import java.util.Arrays;

/**
 * 
 * A left rotation operation on an array shifts each of the array's elements
 * unit to the left. For example, if left rotations are performed on array ,
 * then the array would become .
 * 
 * Given an array of integers and a number, , perform left rotations on the
 * array. Return the updated array to be printed as a single line of
 * space-separated integers.
 * 
 * Function Description
 * 
 * Complete the function rotLeft in the editor below. It should return the
 * resulting array of integers.
 * 
 * rotLeft has the following parameter(s):
 * 
 * An array of integers . An integer , the number of rotations.
 * 
 * The first line contains two space-separated integers and , the size of and
 * the number of left rotations you must perform. The second line contains
 * space-separated integers .
 * 
 * @author Surith
 *
 */
public class ArraysLeftRotation {

	
	/**
	 * A Juggling Algorithm - Instead of moving one by one, divide the array in
	 * different sets where number of sets is equal to GCD of n and d and move
	 * the elements within sets.
	 * 
	 * @param arr
	 * @param d
	 * @return
	 */
	static int[] jugglingAlgorithm(int[] arr, int d) {
		int j,k,temp;
		for (int i=0; i<gcd(d,arr.length); i++) {
			j=i;
			temp = arr[i];
			while(true) {
				k=j+d;
				if (k>=arr.length)
					k=k-arr.length;
				if (k==i)
					break;
				arr[j] = arr[k];
				j=k;
			}
			arr[j] = temp;
		}
		return arr;
	}
	
	static int gcd(int a, int b) {
		if (b==0)
			return a;
		return gcd(b,a%b);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(jugglingAlgorithm(arr, 2)));
	}

}
