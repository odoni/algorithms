package com.odoni.algorithms.sort.insertion;

import com.odoni.algorithms.sort.Sort;

public class InsertionSort implements Sort {

	@Override
	public int[] sort(int[] arrayToSort) {
		for (int i = 0; i < arrayToSort.length; i++) {
			int index = arrayToSort[i];
			int j = i;
			while (j > 0 && arrayToSort[j-1] > index) {
				arrayToSort[j] = arrayToSort[j-1];
				j--;
			}
			arrayToSort[j] = index;
		}
		return arrayToSort;
	}
}
