package com.odoni.algorithms;

import com.odoni.algorithms.sort.Sort;
import com.odoni.algorithms.sort.bubble.BubbleSort;
import com.odoni.algorithms.sort.bucket.BucketSort;
import com.odoni.algorithms.sort.insertion.InsertionSort;
import com.odoni.algorithms.sort.selection.SelectionSort;

public class Application {

	private static Integer[] generateUnsortedArray(int length) {
		long startArray = System.currentTimeMillis();
		Integer[] numbers = new Integer[length];
		for (int i = 0; i < length; i++) {
			numbers[i]=(int)Math.random();
		}
		long endArray = System.currentTimeMillis();
		System.out.println("[" + length + "] Data generated in: " + (endArray - startArray) + " ms");
		return numbers;
	}

	public static void main(String... args) {
		Integer[] arrayToSort = generateUnsortedArray(100000);

		performBucketSort(arrayToSort);
		performBubbleSort(arrayToSort);
		performSelectionSort(arrayToSort);
		performInsertionSort(arrayToSort);
	}

	private static void performBucketSort(Integer[] arrayToSort) {
		Sort bucketSort = new BucketSort();
		long startBucket = System.currentTimeMillis();
		bucketSort.sort(arrayToSort);
		long endBucket = System.currentTimeMillis();
		System.out.println("Bucket sort in: " + (endBucket - startBucket) + " ms");
	}

	private static void performBubbleSort(Integer[] arrayToSort) {
		Sort bubbleSort = new BubbleSort();
		long startBubble = System.currentTimeMillis();
		bubbleSort.sort(arrayToSort);
		long endBubble = System.currentTimeMillis();
		System.out.println("Bubble sort in: " + (endBubble - startBubble) + " ms");
	}

	private static void performSelectionSort(Integer[] arrayToSort) {
		Sort selectionSort = new SelectionSort();
		long startSelection = System.currentTimeMillis();
		selectionSort.sort(arrayToSort);
		long endSelection = System.currentTimeMillis();
		System.out.println("Selection sort in: " + (endSelection - startSelection) + " ms");
	}

	private static void performInsertionSort(Integer[] arrayToSort) {
		Sort insertionSort = new InsertionSort();
		long startInsertion = System.currentTimeMillis();
		insertionSort.sort(arrayToSort);
		long endInsertion = System.currentTimeMillis();
		System.out.println("Insertion sort in: " + (endInsertion - startInsertion) + " ms");
	}
}
