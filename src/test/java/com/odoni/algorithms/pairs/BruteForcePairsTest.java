package com.odoni.algorithms.pairs;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class BruteForcePairsTest {

	@Test
	public void shouldFindPairsForGivenNumberWithBruteForce() {
		int givenNumber = 10;
		int[] givenArray = {1,9,2,8,3,7,4,6,5};
		int[] expectedArray = {1,9,2,8,3,7,4,6};
		BruteForcePairs bruteForcePairs = new BruteForcePairs();
		int[] actualArray = bruteForcePairs.findPairs(givenArray, givenNumber);
		assertArrayEquals(expectedArray, actualArray);
	}

	@Test
	public void shouldFindPairsForGivenNumberWithBruteForceComplexScenario() {
		int givenNumber = 20;
		int[] givenArray = {10,3,5,7,9,15,12,11,8,4,17};
		int[] expectedArray = {3,17,5,15,9,11,12,8};
		BruteForcePairs bruteForcePairs = new BruteForcePairs();
		int[] actualArray = bruteForcePairs.findPairs(givenArray, givenNumber);
		assertArrayEquals(expectedArray, actualArray);
	}

}
