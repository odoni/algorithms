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
}
