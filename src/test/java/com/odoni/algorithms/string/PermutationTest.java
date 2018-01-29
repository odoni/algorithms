package com.odoni.algorithms.string;

import com.odoni.algorithms.strings.Permutation;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PermutationTest {

	@Test
	public void shouldReturnFalseForScenario1() {
		String string1 = "asdjlkasjdlkjaslkdjalkjsdkljaklsjdkjasd";
		String permutationString = "bbb";
		Permutation permutation = new Permutation();
		boolean isPermutation = permutation.isPermutation(string1, permutationString);
		assertFalse(isPermutation);
	}

	@Test
	public void shouldReturnFalseForScenario2() {
		String string1 = "qqqqqqqwwwwwwwweeeeeeee";
		String permutationString = "c";
		Permutation permutation = new Permutation();
		boolean isPermutation = permutation.isPermutation(string1, permutationString);
		assertFalse(isPermutation);
	}

	@Test
	public void shouldReturnFalseForScenario3() {
		String string1 = "uuuuuuuuuuuuuuuuuuuuuuuu";
		String permutationString = "bbb";
		Permutation permutation = new Permutation();
		boolean isPermutation = permutation.isPermutation(string1, permutationString);
		assertFalse(isPermutation);
	}

	@Test
	public void shouldReturnTrueForScenario4() {
		String string1 = "asdfghjkl";
		String permutationString = "lkjasdhfg";
		Permutation permutation = new Permutation();
		boolean isPermutation = permutation.isPermutation(string1, permutationString);
		assertTrue(isPermutation);
	}

	@Test
	public void shouldReturnTrueForScenario5() {
		String string1 = "qwertyuiop";
		String permutationString = "poiqweruty";
		Permutation permutation = new Permutation();
		boolean isPermutation = permutation.isPermutation(string1, permutationString);
		assertTrue(isPermutation);
	}

	@Test
	public void shouldReturnTrueForScenario6() {
		String string1 = "zxcvbnm";
		String permutationString = "zmxncbv";
		Permutation permutation = new Permutation();
		boolean isPermutation = permutation.isPermutation(string1, permutationString);
		assertTrue(isPermutation);
	}
}
