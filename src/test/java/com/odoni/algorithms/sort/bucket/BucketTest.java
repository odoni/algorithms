package com.odoni.algorithms.sort.bucket;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BucketTest {

	@Test
	public void shouldSortUsingBucketSort() {
		Integer[] arrayToSort = {1,4,13,5,8,9};
		Integer[] arrayExpected = {1,4,5,8,9,13};
		BucketSort bucketSort = new BucketSort();
		Integer[] arrayActual = bucketSort.sort(arrayToSort);
		assertArrayEquals(arrayExpected, arrayActual);
	}

	@Test
	public void shouldSortUsingBucketSortWithDuplicatedValues() {
		Integer[] arrayToSort = {1,4,13,5,8,9,5};
		Integer[] arrayExpected = {1,4,5,5,8,9,13};
		BucketSort bucketSort = new BucketSort();
		Integer[] arrayActual = bucketSort.sort(arrayToSort);
		assertArrayEquals(arrayExpected, arrayActual);
	}

	@Test
	public void shouldReturn13FromGivenList() {
		Integer[] numbers = {1,4,13,5,8,9};
		BucketSort bucketSort = new BucketSort();
		int max = bucketSort.getMaxFromArray(numbers);
		assertEquals(13, max);
	}

	@Test
	public void shouldReturn15FromGivenList() {
		Integer[] numbers = {15,4,13,5,8,9};
		BucketSort bucketSort = new BucketSort();
		int max = bucketSort.getMaxFromArray(numbers);
		assertEquals(15, max);
	}

	@Test
	public void shouldReturn17FromGivenList() {
		Integer[] numbers = {15,4,13,5,8,9,17};
		BucketSort bucketSort = new BucketSort();
		int max = bucketSort.getMaxFromArray(numbers);
		assertEquals(17, max);
	}

	@Test
	public void shouldReturn20FromGivenList() {
		Integer[] numbers = {15,4,20,5,8,9,20};
		BucketSort bucketSort = new BucketSort();
		int max = bucketSort.getMaxFromArray(numbers);
		assertEquals(20, max);
	}
}
