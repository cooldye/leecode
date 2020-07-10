package com.example.leecode.array;

/*
 * Given a sorted array, remove the duplicates in place such that > each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example, Given input array A = [1,1,2],
 * Your function should return length = 2, and A is now [1,2].
 */
public class RemoveDuplicatesFromSoredArray {

	public static void main(String[] args) {
		int arr[] = {1, 1, 2};
		int length = removeDuplicates(arr);
		for (int i=0; i<length && i<arr.length; i++) {
			System.out.println("arr[" + i + "]:" + arr[i]);
		}
	}
	
	private static int removeDuplicates(int arr[]) {
		if (arr.length == 0) {
			return 0; 
		}
		
		int j=0;
		for (int i=1; i < arr.length; i++) {
			if (arr[j] != arr[i]) {
				arr[++j] = arr[i];
			}
		}
		return j+1;
	}
}
