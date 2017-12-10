package com.odoni.algorithms.sort.bubble;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

	@Test
	public void shouldSortUsingBucketSort() {
		int[] arrayToSort = {1,4,13,5,8,9};
		int[] arrayExpected = {1,4,5,8,9,13};
		BubbleSort bubbleSort = new BubbleSort();
		int[] arrayActual = bubbleSort.sort(arrayToSort);
		assertArrayEquals(arrayExpected, arrayActual);
	}

	@Test
	public void shouldSortUsingBucketSortWithDuplicatedValues() {
		int[] arrayToSort = {1,4,13,5,8,9,5};
		int[] arrayExpected = {1,4,5,5,8,9,13};
		BubbleSort bubbleSort = new BubbleSort();
		int[] arrayActual = bubbleSort.sort(arrayToSort);
		assertArrayEquals(arrayExpected, arrayActual);
	}
}
