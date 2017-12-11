package com.odoni.algorithms;

import com.odoni.algorithms.pairs.AverageForcePairs;
import com.odoni.algorithms.pairs.BruteForcePairs;
import com.odoni.algorithms.pairs.HashPairs;

import static com.odoni.algorithms.ArrayUtils.copyArray;
import static com.odoni.algorithms.ArrayUtils.generateUnsortedArrayWithoutRepetedValues;

public class PairsApplication {

	public static void main(String... args) {
		int[] arrayToFindPairs = generateUnsortedArrayWithoutRepetedValues(100000);
		performBruteForce(arrayToFindPairs);
		performAverageForce(arrayToFindPairs);
		performHashForce(arrayToFindPairs);
	}

	private static void performBruteForce(int[] arrayToFindPairs) {
		BruteForcePairs bruteForcePairs = new BruteForcePairs();
		int[] newArrayToFindPairs = copyArray(arrayToFindPairs);
		long startBruteForce = System.currentTimeMillis();
		int[] pairs = bruteForcePairs.findPairs(newArrayToFindPairs, 100);
		long endBruteForce = System.currentTimeMillis();
		System.out.println("BruteForce find " + pairs.length + " in: " + (endBruteForce - startBruteForce) + " ms");
	}

	private static void performAverageForce(int[] arrayToFindPairs) {
		AverageForcePairs averageForcePairs = new AverageForcePairs();
		int[] newArrayToFindPairs = copyArray(arrayToFindPairs);
		long startAverageForce = System.currentTimeMillis();
		int[] pairs = averageForcePairs.findPairs(newArrayToFindPairs, 100);
		long endAverageForce = System.currentTimeMillis();
		System.out.println("AverageForce find " + pairs.length + " in: " + (endAverageForce - startAverageForce) + " ms");
	}

	private static void performHashForce(int[] arrayToFindPairs) {
		HashPairs hashPairs = new HashPairs();
		int[] newArrayToFindPairs = copyArray(arrayToFindPairs);
		long startHashForce = System.currentTimeMillis();
		int[] pairs = hashPairs.findPairs(newArrayToFindPairs, 100);
		long endHashForce = System.currentTimeMillis();
		System.out.println("HashForce find " + pairs.length + " in: " + (endHashForce - startHashForce) + " ms");
	}
}
