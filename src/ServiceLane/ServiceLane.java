package ServiceLane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServiceLane {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String NandT = bf.readLine();
		int NT[] = splitIntegers(NandT);
		int N = NT[0];
		int T = NT[1];

		String widthInput = bf.readLine();
		int width[] = splitIntegers(widthInput);

		if (width.length < N) {
			System.err.println("Error, the width array does not match the N.");
		} else {
			String inputs[] = new String[T];
			for (int i = 0; i < T; i++) {
				inputs[i] = bf.readLine();
			}

			for (int k = 0; k < T; k++) {
				int testCase[] = splitIntegers(inputs[k]);
				System.out.println(findLower(width, testCase[0], testCase[1]));
			}
			
		}

	}

	private static int[] splitIntegers(String toSplit) {
		String splitted[] = toSplit.split(" ");
		int result[] = new int[splitted.length];
		for (int i = 0; i < splitted.length; i++) {
			result[i] = Integer.parseInt(splitted[i]);
		}

		return result;
	}

	private static int findLower(int array[], int i, int j) {
		int result = 0;
		for (int index = i; index <= j; index++) {
			if (array[index] == 1) {
				result = 1;
				break;
			} else if (index == i) {
				result = array[index];
			} else {
				if (array[index] < result) {
					result = array[index];
				}
			}
		}
		return result;
	}

}
