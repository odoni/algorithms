package com.odoni.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ArrayUtils {

	public static void printArray(int[] arrayToSort) {
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

	public static int[] generateUnsortedArray(int length) {
		long startArray = System.currentTimeMillis();
		int[] numbers = new Random().ints(length, 4, length).toArray();
		long endArray = System.currentTimeMillis();
		System.out.println("[" + length + "] Data generated in: " + (endArray - startArray) + " ms");
		return numbers;
	}

	public static int[] generateUnsortedArrayWithoutRepetedValues(int length) {
		long startArray = System.currentTimeMillis();
		List<Integer> lstNumbers = new ArrayList<>(length);
		for (int i = 1; i <= length; i++) {
			lstNumbers.add(i);
		}
		Collections.shuffle(lstNumbers);
		long endArray = System.currentTimeMillis();
		System.out.println("[" + length + "] Data generated in: " + (endArray - startArray) + " ms");
		return lstNumbers.stream().mapToInt(Integer::intValue).toArray();
	}

	public static int[] generateUnsortedArrayWithoutRepetedValuesUsingHash(int length) {
		long startArray = System.currentTimeMillis();
		List<Integer> lstNumbers = new ArrayList<>();
		while (lstNumbers.size() <= length) {
			Integer randomNumber = new Random().nextInt(length*2	);
			if (!lstNumbers.contains(randomNumber)) {
				lstNumbers.add(randomNumber);
			}
		}
		long endArray = System.currentTimeMillis();
		System.out.println("[" + length + "] Data generated in: " + (endArray - startArray) + " ms");
		return lstNumbers.stream().mapToInt(Integer::intValue).toArray();
	}

	public static int[] copyArray(int[] arrayToCopy) {
		return Arrays.copyOf(arrayToCopy, arrayToCopy.length);
	}
}
