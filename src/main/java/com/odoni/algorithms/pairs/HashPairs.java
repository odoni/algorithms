package com.odoni.algorithms.pairs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashPairs {
	public int[] findPairs(int[] arrayToFind, int sumNumber) {
		List<Integer> lstPairs = new ArrayList<>();
		Map<Integer, Integer> hashToFind = new HashMap<>();
		int value;
		int diff;
		for (int i = 0; i < arrayToFind.length; i++) {
			value = arrayToFind[i];
			diff = sumNumber - value;
			hashToFind.put(value, i);
			if (value != diff && hashToFind.containsKey(diff)) {
				lstPairs.add(value);
				lstPairs.add(diff);
			}
		}
		return lstPairs.stream().mapToInt(Integer::intValue).toArray();
	}
}
