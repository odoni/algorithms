package com.odoni.algorithms.string;

import com.odoni.algorithms.strings.UniqueCharacter;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class UniqueCharacterTest {

	@Test
	public void shouldReturnFalseForScenario1() {
		String scenario1 = "aaaaaaaBa";
		UniqueCharacter uniqueCharacter = new UniqueCharacter();
		boolean actual = uniqueCharacter.hasUniqueCharacter(scenario1);
		assertFalse(actual);
	}

	@Test
	public void shouldReturnFalseForScenario2() {
		String scenario2 = "#########%";
		UniqueCharacter uniqueCharacter = new UniqueCharacter();
		boolean actual = uniqueCharacter.hasUniqueCharacter(scenario2);
		assertFalse(actual);
	}

	@Test
	public void shouldReturnFalseForScenario3() {
		String scenario3 = "qQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ";
		UniqueCharacter uniqueCharacter = new UniqueCharacter();
		boolean actual = uniqueCharacter.hasUniqueCharacter(scenario3);
		assertFalse(actual);
	}

	@Test
	public void shouldReturnTrueForScenario4() {
		String scenario4 = "rrrrrrrrrrrrrrrrrrrrrrrr";
		UniqueCharacter uniqueCharacter = new UniqueCharacter();
		boolean actual = uniqueCharacter.hasUniqueCharacter(scenario4);
		assertTrue(actual);
	}

	@Test
	public void shouldReturnTrueForScenario5() {
		String scenario5 = "@@@@@@@@@@@@@@@@@@@@@";
		UniqueCharacter uniqueCharacter = new UniqueCharacter();
		boolean actual = uniqueCharacter.hasUniqueCharacter(scenario5);
		assertTrue(actual);
	}

	@Test
	public void shouldReturnTrueForScenario6() {
		String scenario6 = "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@";
		UniqueCharacter uniqueCharacter = new UniqueCharacter();
		boolean actual = uniqueCharacter.hasUniqueCharacter(scenario6);
		assertTrue(actual);
	}

}
