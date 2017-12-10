package com.odoni.algorithms.sort.merge;

import com.odoni.algorithms.sort.Sort;

public class MergeSort implements Sort {

	@Override
	public int[] sort(int[] arrayToSort) {
		mergeSort(arrayToSort, new int[arrayToSort.length],0, arrayToSort.length - 1);
		return arrayToSort;
	}

	private void mergeSort(int[] arrayToSort, int[] temp, int leftStart, int rightEnd) {
		if (leftStart >= rightEnd) {
			return;
		}
		int middle = (leftStart + rightEnd) / 2;
		mergeSort(arrayToSort, temp, leftStart, middle);
		mergeSort(arrayToSort, temp, middle + 1, rightEnd);
		merge(arrayToSort, temp, leftStart, rightEnd);
	}

	private void merge(int[] arrayToMerge, int[] temp, int leftStart, int rightEnd) {
		int leftEnd = (rightEnd + leftStart) / 2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart + 1;

		int left = leftStart;
		int right = rightStart;
		int index = leftStart;

		while (left <= leftEnd && right <= rightEnd) {
			if (arrayToMerge[left] <= arrayToMerge[right]) {
				temp[index] = arrayToMerge[left];
				left++;
			} else {
				temp[index] = arrayToMerge[right];
				right++;
			}
			index++;
		}

		System.arraycopy(arrayToMerge, left, temp, index,leftEnd - left + 1);
		System.arraycopy(arrayToMerge, right, temp, index,rightEnd - right + 1);
		System.arraycopy(temp, leftStart, arrayToMerge, leftStart, size);
	}
}
