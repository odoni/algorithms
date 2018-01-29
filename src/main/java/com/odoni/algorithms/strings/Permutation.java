package com.odoni.algorithms.strings;

import java.util.Arrays;

public class Permutation {
	public boolean isPermutation(String string, String permutationString) {
		if (string.length() != permutationString.length()) {
			return false;
		}

		int[] letters = new int[128];

		for (int i = 0; i < string.length(); i++) {
			letters[string.charAt(i)]++;
		}

		for (int i = 0; i < permutationString.length(); i++) {
			letters[string.charAt(i)]--;
			if (letters[string.charAt(i)] < 0) {
				return false;
			}
		}

		return true;

	}

	private boolean checkWithSort(String string, String permutationString) {
		if (string.length() != permutationString.length()) {
			return false;
		}

		return sort(string).equals(sort(permutationString));
	}

	private String sort(String s) {
		char[] array = s.toCharArray();
		Arrays.sort(array);
		return new String(array);
	}
}
