package com.odoni.algorithms.strings;

import java.util.HashSet;
import java.util.Set;

public class SubString {
	public int[] calculateHowManySubStrings(String string, int[][] subStringIndex) {
		int[] result = new int[subStringIndex.length];

		for (int i = 0; i < subStringIndex.length; i++) {
			String findSub = string.substring(subStringIndex[i][0],subStringIndex[i][1]+1);
			result[i] = calculateSubString(findSub);
		}

		return result;
	}

	private int calculateSubString(String sub) {
		Set<String> distString = new HashSet<>();

		for(int m=0;m<sub.length();m++){
			for(int j=m;j<sub.length();j++){
				distString.add(sub.substring(m,j+1));
			}
		}

		return distString.size();
	}
}
