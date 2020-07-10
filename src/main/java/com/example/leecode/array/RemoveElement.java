package com.example.leecode.array;

/*
 * Given an array and a value, remove all instances of that > value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement {

	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 3, 3};
		System.out.println("length:" + removeElement(arr, arr.length, 1));
	}
	
	private static int removeElement(int A[], int n, int elem) {
		int j = 0;
		for (int i=0; i<n; i++) {
			if (A[i] == elem) {
				continue;
			}
			
			A[j] = A[i];
			j++;
		}
		
		return j;
	}
}
