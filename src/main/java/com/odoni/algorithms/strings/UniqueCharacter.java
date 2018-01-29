package com.odoni.algorithms.strings;

import java.util.ArrayList;
import java.util.List;

public class UniqueCharacter {
	public boolean hasUniqueCharacter(String string) {
		return isUnique(string);
	}

	private boolean isUnique(String string) {
		char[] array = string.toCharArray();
		char firstChar = array[0];
		for (int i = 1; i < array.length; i++) {
			if (firstChar != array[i]) {
				return false;
			}
		}
		return true;
	}

	private boolean isUniqueWithHash(String string) {
		List<Character> charList = new ArrayList<>();
		char[] array = string.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				charList.add(array[i]);
			} else if (!charList.contains(array[i])) {
				return false;
			}
		}
		return true;
	}
}
