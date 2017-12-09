package com.odoni.algorithms.sort;

public interface Sort {
	Integer[] sort(Integer[] arrayToSort);

	default void printArray(Integer[] arrayToSort) {
		System.out.print("[");
		for (int i = 0; i < arrayToSort.length; i++) {
			if (i == arrayToSort.length-1) {
				System.out.print(i);
			} else {
				System.out.print(i+",");
			}
		}
		System.out.println("]");
	}
}
