package com.odoni.algorithms;

import com.odoni.algorithms.sort.Sort;
import com.odoni.algorithms.sort.bubble.BubbleSort;
import com.odoni.algorithms.sort.bucket.BucketSort;
import com.odoni.algorithms.sort.insertion.InsertionSort;
import com.odoni.algorithms.sort.merge.MergeSort;
import com.odoni.algorithms.sort.selection.SelectionSort;

import java.util.Arrays;
import java.util.Random;

public class Application {

	private static int[] generateUnsortedArray(int length) {
		long startArray = System.currentTimeMillis();
		int[] numbers = new Random().ints(length, 4, length).toArray();
		long endArray = System.currentTimeMillis();
		System.out.println("[" + length + "] Data generated in: " + (endArray - startArray) + " ms");
		return numbers;
	}

	public static void main(String... args) {
		int[] arrayToSort = generateUnsortedArray(100000);

		performBucketSort(arrayToSort);
		performBubbleSort(arrayToSort);
		performSelectionSort(arrayToSort);
		performInsertionSort(arrayToSort);
		performMergeSort(arrayToSort);
	}

	private static void performBucketSort(int[] arrayToSort) {
		Sort bucketSort = new BucketSort();
		int[] newArrayToSort = copyArray(arrayToSort);
		long startBucket = System.currentTimeMillis();
		bucketSort.sort(newArrayToSort);
		long endBucket = System.currentTimeMillis();
		System.out.println("Bucket sort in: " + (endBucket - startBucket) + " ms");
	}

	private static void performBubbleSort(int[] arrayToSort) {
		Sort bubbleSort = new BubbleSort();
		int[] newArrayToSort = copyArray(arrayToSort);
		long startBubble = System.currentTimeMillis();
		bubbleSort.sort(newArrayToSort);
		long endBubble = System.currentTimeMillis();
		System.out.println("Bubble sort in: " + (endBubble - startBubble) + " ms");
	}

	private static void performSelectionSort(int[] arrayToSort) {
		Sort selectionSort = new SelectionSort();
		int[] newArrayToSort = copyArray(arrayToSort);
		long startSelection = System.currentTimeMillis();
		selectionSort.sort(newArrayToSort);
		long endSelection = System.currentTimeMillis();
		System.out.println("Selection sort in: " + (endSelection - startSelection) + " ms");
	}

	private static void performInsertionSort(int[] arrayToSort) {
		Sort insertionSort = new InsertionSort();
		int[] newArrayToSort = copyArray(arrayToSort);
		long startInsertion = System.currentTimeMillis();
		insertionSort.sort(newArrayToSort);
		long endInsertion = System.currentTimeMillis();
		System.out.println("Insertion sort in: " + (endInsertion - startInsertion) + " ms");
	}

	private static void performMergeSort(int[] arrayToSort) {
		Sort mergeSort = new MergeSort();
		int[] newArrayToSort = copyArray(arrayToSort);
		long startMerge = System.currentTimeMillis();
		mergeSort.sort(newArrayToSort);
		long endMerge = System.currentTimeMillis();
		System.out.println("Merge sort in: " + (endMerge - startMerge) + " ms");
	}

	private static int[] copyArray(int[] arrayToCopy) {
		return Arrays.copyOf(arrayToCopy, arrayToCopy.length);
	}
}
