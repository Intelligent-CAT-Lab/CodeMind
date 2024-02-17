import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Alphametic
 */
public class Main {

	static int[][] nums;
	static boolean[] used;

	static int[][] pos = {
			{0, 2},
			{1, 1}, {1, 2},
			{2, 0}, {2, 1}, {2, 2},
			{3, 0}, {3, 1}, {3, 2},
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		words = br.readLine().split(" ");

		nums = new int[4][3];
		used = new boolean[10];

		for (int i = 0; i < words.length; i++) {
			int n = parseInt(words[i]);
			if (n != -1) used[n] = true;
			nums[pos[i][0]][pos[i][1]] = n;
		}

		System.out.println(solve(0));
	}

	static int solve(int idx) {

		if (idx == pos.length) {
			if (check()) return 1;
			else return 0;
		}

		//
		int i = pos[idx][0];
		int j = pos[idx][1];
		
		int ret = 0;

		outer:
		if (nums[i][j] == -1) {
			for (int k = 1; k <= 9; k++) {
				if (!used[k]) {
					nums[i][j] = k;
					used[k] = true;
					ret += solve(idx + 1);
					nums[i][j] = -1;
					used[k] = false;
				}
			}
		} else {
			ret = solve(idx + 1);
		}

		return ret;
	}

	static boolean check() {

		int[] a = new int[4];

		for (int i = 0; i < 4; i++) {
			a[i] = nums[i][0] * 100 + nums[i][1] * 10 + nums[i][2];
		}

		return a[0] + a[1] + a[2] == a[3];
	}
}