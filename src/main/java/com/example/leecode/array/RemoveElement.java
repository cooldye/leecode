package com.example.leecode.array;

/*
 * Given an array and a value, remove all instances of that > value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement {

	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 3, 3};
		int length = removeElement(arr, 1);
		for (int i=0; i<length && i<arr.length; i++) {
			System.out.println("arr[" + i + "]:" + arr[i]);
		}
	}
	
	private static int removeElement(int arr[], int elem) {
		int j = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == elem) {
				continue;
			}
			
			arr[j] = arr[i];
			j++;
		}
		
		return j;
	}
}
