package com.odoni.algorithms.pairs;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AverageForcePairsTest {

	@Test
	public void shouldFindPairsForGivenNumberWithAverageForce() {
		int givenNumber = 10;
		int[] givenArray = {1,9,2,8,3,7,4,6,5};
		int[] expectedArray = {1,9,2,8,3,7,4,6};
		AverageForcePairs averageForcePairs = new AverageForcePairs();
		int[] actualArray = averageForcePairs.findPairs(givenArray, givenNumber);
		assertArrayEquals(expectedArray, actualArray);
	}

	@Test
	public void shouldFindPairsForGivenNumberWithAverageForceComplexScenario() {
		int givenNumber = 20;
		int[] givenArray = {10,3,5,7,9,15,12,11,8,4,17};
		int[] expectedArray = {3,17,5,15,8,12,9,11};
		AverageForcePairs averageForcePairs = new AverageForcePairs();
		int[] actualArray = averageForcePairs.findPairs(givenArray, givenNumber);
		assertArrayEquals(expectedArray, actualArray);
	}
}
