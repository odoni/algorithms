package com.odoni.algorithms.string;

import com.odoni.algorithms.strings.SubString;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.assertArrayEquals;

public class SubStringTest {

	static int[][] indexes = new int[3000][2];
	static int[] expectedResults = new int[3000];

	@BeforeClass
	public static void setUp() {
		ClassLoader classLoader = SubStringTest.class.getClassLoader();
		File inputFile = new File(classLoader.getResource("inputIndexes.txt").getFile());
		File outputFile = new File(classLoader.getResource("expectedResults.txt").getFile());
		int i = 0;
		try (Scanner scanner = new Scanner(inputFile)) {

			while (scanner.hasNextLine()) {
				String[] line = scanner.nextLine().split(" ");
				indexes[i][0] = Integer.valueOf(line[0].trim());
				indexes[i][1] = Integer.valueOf(line[1].trim());
				i++;
			}

			scanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		i = 0;
		try (Scanner scanner = new Scanner(outputFile)) {

			while (scanner.hasNextLine()) {
				expectedResults[i++] = Integer.valueOf(scanner.nextLine().trim());
			}

			scanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void ShouldReturnRightValue() {
		SubString subString = new SubString();
		String string = "aabaa";
		int[][] indexes = new int[5][2];
		indexes[0][0] = 1;
		indexes[0][1] = 1;
		indexes[1][0] = 1;
		indexes[1][1] = 4;
		indexes[2][0] = 1;
		indexes[2][1] = 1;
		indexes[3][0] = 1;
		indexes[3][1] = 4;
		indexes[4][0] = 0;
		indexes[4][1] = 2;
		int[] actualValues = subString.calculateHowManySubStrings(string, indexes);
		int[] expectedValues = {1,8,1,8,5};
		assertArrayEquals(expectedValues, actualValues);
	}

//	@Test
	public void ShouldReturnRightValueForMassiveInput() {
		SubString subString = new SubString();
		String string = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbfefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefeefeefefeefefeefeefefvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvddvddvdvddvdvddvddvdvddvdvddvddvdvdtbtbbtbtbbtbbtbtbbtbtbbtbbtbtbbtbbtbtbbtbtbbtbbtbtbbtbtbbtbbtbtbbtbbtbtbbtbtbbkrkrrkrkrrkrrkrkrrkrkrrkrrkrkrrkrrkdsdssdsdssdssdsdssdsdsbbbbbbbbbbbbbbbbbbbbbbbbbbbpbpihmiqoyrufakigfvuygumaxadgulmhvgjwkvwztiitrzeekjwofeweljjpovbxcsptoubkbwdhuevenunkdihviazzniynifemteabxzzhbgesjxjwlinoswmplbzqxdskndmbojzmwszzgzavjgfxxtlvtilsncpilivurbkfryjywbwjuohfckgavuflwnjhofthtkwowqfdfdlunousyvengfefdkccmjwajrxzvzbqykfqewbywskdqvdcnfwifebmxrmpdcwwwwvxwvsijnexvlalavsuxtojamyelihms";
		int[] actualValues = subString.calculateHowManySubStrings(string, indexes);
		assertArrayEquals(expectedResults, actualValues);
	}
}
