package com.odoni.algorithms.sort.bucket;

import com.odoni.algorithms.sort.Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class BucketSort implements Sort {

	public Integer[] sort(Integer[] arrayToSort) {
		int max = getMaxFromArray(arrayToSort);
		Map<Integer, Integer> bucketMap = new HashMap<>();
		for (int i = 0; i <= max; i++) {
			bucketMap.put(i, 0);
		}
		for (int i = 0; i < arrayToSort.length; i++) {
			bucketMap.put(arrayToSort[i], bucketMap.get(arrayToSort[i])+1);
		}
		int sortedArrayIndex = 0;
		for (Map.Entry<Integer, Integer> entry: bucketMap.entrySet()) {
			for (int i = 0; i < entry.getValue(); i++) {
				arrayToSort[sortedArrayIndex++] = entry.getKey();
			}
		}
		return arrayToSort;
	}

	protected int getMaxFromArray(Integer[] arrayToSort) {
		return Arrays.asList(arrayToSort).stream()
				.max(Comparator.comparingInt(Integer::intValue))
				.orElse(0);
	}
}
