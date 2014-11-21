package LoveLetterMystery;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {

		// Buffer reader to read from input
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// The number of test cases to be inputed
		int testCases = Integer.parseInt(bf.readLine());

		// An array of the testcases
		String messages[] = new String[testCases];

		// Read the test cases and save them on the array
		for (int i = 0; i < testCases; i++) {
			messages[i] = bf.readLine();
		}

		// Traverse the array of the test cases
		for (int i = 0; i < testCases; i++) {
			System.out.println(getShifts(messages[i]));

		}

	}

	private static int getShifts(String word) {
		int j = word.length() - 1;
		int result = 0;
		for (int i = 0; i < word.length() / 2; i++) {
			int difference = word.charAt(i) - word.charAt(j);
			if (difference < 0) {
				result -= difference;
			} else {
				result += difference;
			}

			if (j > word.length() / 2) {
				j--;
			}
		}

		return result;
	}

}
