package com.odoni.algorithms.sort.bubble;

import com.odoni.algorithms.sort.bucket.BucketSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

	@Test
	public void shouldSortUsingBucketSort() {
		Integer[] arrayToSort = {1,4,13,5,8,9};
		Integer[] arrayExpected = {1,4,5,8,9,13};
		BubbleSort bubbleSort = new BubbleSort();
		Integer[] arrayActual = bubbleSort.sort(arrayToSort);
		assertArrayEquals(arrayExpected, arrayActual);
	}

	@Test
	public void shouldSortUsingBucketSortWithDuplicatedValues() {
		Integer[] arrayToSort = {1,4,13,5,8,9,5};
		Integer[] arrayExpected = {1,4,5,5,8,9,13};
		BubbleSort bubbleSort = new BubbleSort();
		Integer[] arrayActual = bubbleSort.sort(arrayToSort);
		assertArrayEquals(arrayExpected, arrayActual);
	}
}
