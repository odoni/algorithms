package com.odoni.algorithms.sort.bubble;

import com.odoni.algorithms.sort.Sort;

public class BubbleSort implements Sort {

	@Override
	public int[] sort(int[] arrayToSort) {
		for (int i = arrayToSort.length - 1; i >= 0 ; i--) {
			for (int j = 1; j <= i; j++) {
				if (arrayToSort[j-1] > arrayToSort[j]) {
					int temp = arrayToSort[j-1];
					arrayToSort[j-1] = arrayToSort[j];
					arrayToSort[j] = temp;
				}
			}
		}

		return arrayToSort;
	}
}
