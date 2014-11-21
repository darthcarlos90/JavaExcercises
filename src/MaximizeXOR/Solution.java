package MaximizeXOR;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int low = Integer.parseInt(in.nextLine());
		int high = Integer.parseInt(in.nextLine());
		System.out.println(maxXOR(low, high));

	}

	static String addZero(int wantedLength, String toAdd) {
		String result = toAdd;
		while (result.length() < wantedLength) {
			result = "0" + result;
		}
		return result;
	}

	static int maxXOR(int l, int r) {
		int result = 0;
		int range[] = new int[(r - l) + 1];
		int index = 0;
		int number = l;
		while (index < range.length || number <= r) {
			range[index] = number;
			index++;
			number++;
		}
		for (int i = 0; i < range.length; i++) {
			for (int j = i + 1; j < range.length; j++) {
				// Para debuggear, todo lo pondremos en variables
				int a = range[i];
				int b = range[j];
				String as = convertToBinary(a);
				String bs = convertToBinary(b);
				String xorab = XOR(as, bs);
				int xorResult = convertToDecimal(xorab);
				if (xorResult > result) {
					result = xorResult;
				}
			}
		}

		return result;
	}

	static String XOR(String n1, String n2) {
		String result = "";
		if (n1.length() < n2.length()) {
			n1 = addZero(n2.length(), n1);
		} else if (n2.length() < n1.length()) {
			n2 = addZero(n1.length(), n2);
		}

		for (int i = 0; i < n1.length(); i++) {
			if (n1.charAt(i) != n2.charAt(i)) {
				result += "1";
			} else {
				result += "0";
			}
		}
		return result;
	}

	static int convertToDecimal(String binary) {
		int result = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				result += Math.pow(2, i);
			}
		}
		return result;
	}

	static String convertToBinary(int decimal) {
		String result = "";

		while (decimal > 1) {
			result = (decimal % 2) + result;
			decimal = decimal / 2;
		}
		result = decimal + result;

		return result;
	}

}
