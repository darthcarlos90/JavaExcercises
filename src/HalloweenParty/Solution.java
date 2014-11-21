package HalloweenParty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int numberTestCases = Integer.parseInt(bf.readLine());
		long testCases[] = new long[numberTestCases];

		for (int i = 0; i < numberTestCases; i++) {
			testCases[i] = Long.parseLong(bf.readLine());
		}

		for (int i = 0; i < numberTestCases; i++) {

			long firstHalf = testCases[i] / 2;
			System.out.println(firstHalf * (testCases[i] - firstHalf));

		}

	}

}
