import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class DegreeArray {
	public static void main(String args[]) throws Exception {
		String inputData = "";
		String thisLine = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while ((thisLine = br.readLine()) != null) {
			inputData += thisLine + "\n";
		}
		// Output the solution to the console
		System.out.println(codeHere(inputData));
	}

	public static int codeHere(String inputData) {

		String[] data = inputData.split("\n");
		String actaulvalue = data[1].replace(" ", "");
		char[] array = new char[actaulvalue.length()];
		array = actaulvalue.toCharArray();
		int[] numberArray = new int[actaulvalue.length()];
		for (int i = 0; i < actaulvalue.length(); i++) {
			numberArray[i] = Character.digit(array[i], 10);
		}
		System.out.println(Arrays.toString(numberArray));
		HashMap<Integer, Integer> count = new HashMap<>();
		HashMap<Integer, Integer> rightIndex = new HashMap<>();
		HashMap<Integer, Integer> leftIndex = new HashMap<>();
		for (int i = 0; i < numberArray.length; i++) {
			if (count.containsKey(numberArray[i])) {
				count.put(numberArray[i], count.get(numberArray[i]) + 1);

			} else {
				count.put(numberArray[i], 1);
			}
		}

		for (int i = numberArray.length - 1; i >= 0; i--) {
			leftIndex.put(numberArray[i], i);
			System.out.println("Left index map value is " +leftIndex);
		}
		for (int i = 0; i < numberArray.length; i++) {
			rightIndex.put(numberArray[i], i);
		}
		int ans = numberArray.length;
		int cur_count = 0;
		for (int i = 0; i < numberArray.length; i++) {
			int n = numberArray[i];
			if (count.get(n) >= cur_count) {
				int dis = (rightIndex.get(n) - leftIndex.get(n) + 1);
				if (count.get(n) > cur_count)
					ans = dis;
				else if (dis < ans)
					ans = dis;
				cur_count = count.get(n);
			}
		}

		return ans;

		// Use this function to write your solution;

	}
}
