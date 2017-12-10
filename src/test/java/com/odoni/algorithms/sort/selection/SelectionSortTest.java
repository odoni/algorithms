package com.odoni.algorithms.sort.selection;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

	@Test
	public void shouldSortUsingSelectionSort() {
		int[] arrayToSort = {1,4,13,5,8,9};
		int[] arrayExpected = {1,4,5,8,9,13};
		SelectionSort selectionSort = new SelectionSort();
		int[] arrayActual = selectionSort.sort(arrayToSort);
		assertArrayEquals(arrayExpected, arrayActual);
	}

	@Test
	public void shouldSortUsingSelectionSortWithDuplicatedValues() {
		int[] arrayToSort = {1,4,13,5,8,9,5};
		int[] arrayExpected = {1,4,5,5,8,9,13};
		SelectionSort selectionSort = new SelectionSort();
		int[] arrayActual = selectionSort.sort(arrayToSort);
		assertArrayEquals(arrayExpected, arrayActual);
	}
}
