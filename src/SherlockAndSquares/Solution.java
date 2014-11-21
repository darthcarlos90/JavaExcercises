package SherlockAndSquares;

import java.util.Scanner;

public class Solution {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		String testCases[] = new String[t];
		for (int i = 0; i < testCases.length; i++) {
			testCases[i] = in.nextLine();
		}

		for (int i = 0; i < testCases.length; i++) {
			int min = Integer.parseInt(testCases[i].split(" ")[0]);
			int max = Integer.parseInt(testCases[i].split(" ")[1]);
			int counter = 0;
			for (int j = min; j <= max; j++) {
				int squareRoot = (int) (Math.sqrt(j));
				if (j == Math.pow(squareRoot, 2)) {
					counter++;
				}
			}
			
			System.out.println(counter);
		}

	}

}
