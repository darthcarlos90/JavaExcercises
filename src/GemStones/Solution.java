package GemStones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int counter = 0;
		String repeatedChars = "";
		int numberStones = Integer.parseInt(bf.readLine());
		String stones[] = new String[numberStones];
		for (int i = 0; i < numberStones; i++) {
			stones[i] = bf.readLine();
		}

		boolean breakFlag = false;
		for (int i = 0; i < stones[0].length(); i++) {
			char a = stones[0].charAt(i);
			boolean repeatedFlag = false;
			for (int k = 0; k < repeatedChars.length(); k++) {
				if (repeatedChars.charAt(k) == a) {
					repeatedFlag = true;
				}
			}
			if (repeatedFlag != true) {
				for (int n = 1; n < numberStones; n++) {
					for (int j = 0; j < stones[n].length(); j++) {
						char b = stones[n].charAt(j);
						if (a == b) {
							if (n == numberStones - 1) {
								counter++;
								repeatedChars += a;
							}
							break;
						}

						if (j == stones[n].length() - 1) {
							breakFlag = true;
						}
					}

					if (breakFlag == true) {
						breakFlag = false;
						break;
					}
				}
			}
		}

		System.out.println(counter);

	}

}
