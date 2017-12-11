package com.odoni.algorithms.pairs;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class HashPairsTest {

	@Test
	public void shouldFindPairsForGivenNumberWithHashForce() {
		int givenNumber = 10;
		int[] givenArray = {1,9,2,8,3,7,4,6,5};
		int[] expectedArray = {9,1,8,2,7,3,6,4};
		HashPairs hashPairs = new HashPairs();
		int[] actualArray = hashPairs.findPairs(givenArray, givenNumber);
		assertArrayEquals(expectedArray, actualArray);
	}

	@Test
	public void shouldFindPairsForGivenNumberWithHashForceComplexScenario() {
		int givenNumber = 20;
		int[] givenArray = {10,3,5,7,9,15,12,11,8,4,17};
		int[] expectedArray = {15,5,11,9,8,12,17,3};
		HashPairs hashPairs = new HashPairs();
		int[] actualArray = hashPairs.findPairs(givenArray, givenNumber);
		assertArrayEquals(expectedArray, actualArray);
	}
}
