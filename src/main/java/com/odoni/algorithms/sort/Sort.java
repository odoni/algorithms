package com.odoni.algorithms.sort;

public interface Sort {
	int[] sort(int[] arrayToSort);

	default void printArray(int[] arrayToSort) {
		System.out.print("[");
		for (int i = 0; i < arrayToSort.length; i++) {
			if (i == arrayToSort.length-1) {
				System.out.print(arrayToSort[i]);
			} else {
				System.out.print(arrayToSort[i]+",");
			}
		}
		System.out.println("]");
	}
}
