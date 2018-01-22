package com.odoni.algorithms.pairs;

import com.odoni.algorithms.sort.Sort;
import com.odoni.algorithms.sort.merge.MergeSort;

import java.util.ArrayList;
import java.util.List;

public class AverageForcePairs {
	public int[] findPairs(int[] arrayToFind, int sumNumber) {
		Sort mergeSort = new MergeSort();
		int[] sortedArray = mergeSort.sort(arrayToFind);
		int leftStart = 0;
		int rightEnd = sortedArray.length - 1;
		List<Integer> lstPairs = new ArrayList<>();
		while (leftStart < rightEnd) {
			int sum = sortedArray[leftStart] + sortedArray[rightEnd];
			if (sum == sumNumber) {
				lstPairs.add(sortedArray[leftStart++]);
				lstPairs.add(sortedArray[rightEnd--]);
			} else if (sum > sumNumber) {
				rightEnd--;
			} else if (sum < sumNumber) {
				leftStart++;
			}
		}
		return lstPairs.stream().mapToInt(Integer::intValue).toArray();
	}

	public int[] findPairsWithoutStructures(int[] arrayToFind, int sumNumber) {
		Sort mergeSort = new MergeSort();
		int[] sortedArray = mergeSort.sort(arrayToFind);
		int leftStart = 0;
		int rightEnd = sortedArray.length - 1;
		int[] pairsArray = new int[sortedArray.length*2];
		int index = 0;
		while (leftStart < rightEnd) {
			int sum = sortedArray[leftStart] + sortedArray[rightEnd];
			if (sum == sumNumber) {
				pairsArray[index++] = sortedArray[leftStart++];
				pairsArray[index++] = sortedArray[rightEnd--];
			} else if (sum > sumNumber) {
				rightEnd--;
			} else if (sum < sumNumber) {
				leftStart++;
			}
		}
		return cropLeftZerosFromArray(pairsArray);
	}

	private int[] cropLeftZerosFromArray(int[] arrayToClean) {
		int croppedArrayLength = 0;
		int zerosCount = 0;
		for (int i = arrayToClean.length - 1; i >= 0; i--) {
			if (arrayToClean[i] == 0) {
				zerosCount++;
			} else {
				break;
			}
		}
		croppedArrayLength = arrayToClean.length - zerosCount;
		int[] cleanedArray = new int[croppedArrayLength];
		for (int i = 0; i < croppedArrayLength; i++) {
			cleanedArray[i] = arrayToClean[i];
		}
		return cleanedArray;
	}

}
