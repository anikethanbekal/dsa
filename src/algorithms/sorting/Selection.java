package algorithms.sorting;

import java.util.Arrays;
import java.util.Iterator;

public class Selection {
	static void selection(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			// find the max item in the reamining array and swap with correct index
			int last = arr.length - i - 1;
			int maxIndex = getMaxIndex(arr, 0, last);
			swap(arr, maxIndex, last);
		}
	}

	static int getMaxIndex(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int max = start;
		for (int i = start; i <= end; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			}
		}
		return max;
	}

	static void swap(int arr[], int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 10, -90, 78, 5, 2, 15 };
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}
}
