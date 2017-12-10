package com.odoni.algorithms.sort.merge;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

	@Test
	public void shouldSortUsingMergeSort() {
		int[] arrayToSort = {1,4,13,5,8,9,6};
		int[] arrayExpected = {1,4,5,6,8,9,13};
		MergeSort mergeSort = new MergeSort();
		int[] arrayActual = mergeSort.sort(arrayToSort);
		assertArrayEquals(arrayExpected, arrayActual);
	}

	@Test
	public void shouldSortUsingMergeSortWithDuplicatedValues() {
		int[] arrayToSort = {1,4,13,5,8,9,5,6};
		int[] arrayExpected = {1,4,5,5,6,8,9,13};
		MergeSort mergeSort = new MergeSort();
		int[] arrayActual = mergeSort.sort(arrayToSort);
		assertArrayEquals(arrayExpected, arrayActual);
	}
}
