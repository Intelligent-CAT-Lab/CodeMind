import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Alphametic - Accepted
 */
public class Main {

	static int[] nums;
	static boolean[] used;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		words = br.readLine().split(" ");

		nums = new int[9];
		used = new boolean[10];

		for (int i = 0; i < words.length; i++) {
			nums[i] = parseInt(words[i]);
			if (nums[i] != -1) used[nums[i]] = true;
		}

		System.out.println(solve(0));
	}

	static int solve(int idx) {

		if (idx == nums.length) {
			if (check()) return 1;
			else return 0;
		}

		//
		int ret = 0;

		if (nums[idx] == -1) {
			for (int k = 1; k <= 9; k++) {
				if (!used[k]) {
					nums[idx] = k;
					used[k] = true;
					ret += solve(idx + 1);
					nums[idx] = -1;
					used[k] = false;
				}
			}
		} else {
			ret = solve(idx + 1);
		}

		return ret;
	}

	static boolean check() {

		return nums[0]
				+ nums[1] * 10 + nums[2]
				+ nums[3] * 100 + nums[4] * 10 + nums[5]
				== nums[6] * 100 + nums[7] * 10 + nums[8];
	}
}