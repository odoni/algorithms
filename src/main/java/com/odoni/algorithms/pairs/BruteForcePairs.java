package com.odoni.algorithms.pairs;

import java.util.ArrayList;
import java.util.List;

public class BruteForcePairs {

	public int[] findPairs(int[] arrayToFind, int sumNumber) {
		List<Integer> lstPairs = new ArrayList<>();
		for(int i = 0; i < arrayToFind.length; i++) {
			for (int j = i; j < arrayToFind.length; j++) {
				if (arrayToFind[i] != arrayToFind[j] &&
						arrayToFind[i] + arrayToFind[j] == sumNumber) {
					lstPairs.add(arrayToFind[i]);
					lstPairs.add(arrayToFind[j]);
				}
			}
		}
		int[] pairArray = lstPairs.stream().mapToInt(Integer::intValue).toArray();
		return pairArray;
	}

}
