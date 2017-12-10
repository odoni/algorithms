package com.odoni.algorithms.sort.selection;

import com.odoni.algorithms.sort.Sort;

public class SelectionSort implements Sort {

	@Override
	public Integer[] sort(Integer[] arrayToSort) {
		for (int i = 0; i < arrayToSort.length-1; i++) {
			int min = i;
			for (int j = i + 1; j < arrayToSort.length; j++) {
				if (arrayToSort[j] < arrayToSort[min]) {
					min = j;
				}
			}
			int temp = arrayToSort[i];
			arrayToSort[i] = arrayToSort[min];
			arrayToSort[min] = temp;
		}
		return arrayToSort;
	}
}
