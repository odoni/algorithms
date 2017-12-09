package com.odoni.algorithms;

import com.odoni.algorithms.sort.Sort;
import com.odoni.algorithms.sort.bubble.BubbleSort;
import com.odoni.algorithms.sort.bucket.BucketSort;

public class Application {
	private static Sort bucketSort = new BucketSort();
	private static Sort bubbleSort = new BubbleSort();

	private static Integer[] generateUnsortedArray(int length) {
		long startArray = System.currentTimeMillis();
		Integer[] numbers = new Integer[length];
		for (int i = 0; i < length; i++) {
			numbers[i]=(int)Math.random();
		}
		long endArray = System.currentTimeMillis();
		System.out.println("Data generated in: " + (endArray - startArray) + " ms");
		return numbers;
	}

	public static void main(String... args) {
		Integer[] arrayToSort = generateUnsortedArray(100000);

		performBucketSort(arrayToSort);
		performBubbleSort(arrayToSort);

	}

	private static void performBucketSort(Integer[] arrayToSort) {
		long startBucket = System.currentTimeMillis();
		bucketSort.sort(arrayToSort);
		long endBucket = System.currentTimeMillis();
		System.out.println("Bucket sort in: " + (endBucket - startBucket) + " ms");
	}

	private static void performBubbleSort(Integer[] arrayToSort) {
		long startBubble = System.currentTimeMillis();
		bubbleSort.sort(arrayToSort);
		long endBubble = System.currentTimeMillis();
		System.out.println("Bubble sort in: " + (endBubble - startBubble) + " ms");
	}
}
