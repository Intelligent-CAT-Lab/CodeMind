import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solver();
	}

	static void solver() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0)
				return;
			String[] s = new String[n];
			for (int i = 0; i < n; i++) {
				s[i] = sc.next();
			}
			int bit = (1 << n) - 1;
			boolean[] unvalid = new boolean[n];
			for (int i = 0; i < n; i++) {
				if (((bit >> i) & 1) == 0)
					continue;
				for (int j = 0; j < n; j++) {
					if (i == j)
						continue;
					if (((bit >> j) & 1) == 0)
						continue;
					out: for (int k = 0; k < s[j].length(); k++) {
						if (s[i].length() > s[j].length())
							continue;
						if (k + s[i].length() > s[j].length())
							continue;
						String sj = s[j].substring(k, k + s[i].length());
						if (sj.equals(s[i])) {
							bit = ~((~(bit)) | (1 << i));
							break out;
						}
					}
				}
			}
			memo = new int[1 << n][n];
			for (int i = 0; i < memo.length; i++) {
				for (int j = 0; j < memo[0].length; j++) {
					memo[i][j] = -1;
				}
			}
			int min = Integer.MAX_VALUE/4;
			for (int i = 0; i < n; i++) {
				if (((bit >> i) & 1) == 1) {
					int d = ~((~bit) | (1 << i));
					min = Math.min(min, dp(d, i, n, unvalid, s));
				}
			}
			System.out.println(min);
		}
	}

	static int[][] memo;

	// state:0 indexed num is used
	// 1 indexed num is unused
	// return min value of the lenght of state + tail 
	static int dp(int state, int tail, int n, boolean[] unvalid, String[] s) {
		if (Integer.bitCount(state) == 0)
			return s[tail].length();
		if (memo[state][tail] != -1) {
			return memo[state][tail];
		}
		int min = Integer.MAX_VALUE/4;
		for (int i = 0; i < n; i++) {
			if ((((state >> i) & 1) == 1) && (!unvalid[i])) {
				int bit = ~((~state) | (1 << i));
				min = Math.min(min, dp(bit, i, n, unvalid, s) - same_length(s[i], s[tail]) + s[tail].length());
			}
		}
		memo[state][tail] = min;
		return min;
	}

	static int same_length(String bottom, String tail) {
		int max = 0;
		for (int i = 0; i < bottom.length(); i++) {
			int add = 0;
			while (bottom.charAt(i + add) == tail.charAt(add)) {
				if (i + add == bottom.length() - 1) {
					max = Math.max(add + 1, max);
					break;
				} else if (add == tail.length() - 1) {
					break;
				} else {
					add++;
				}
			}
		}
		return max;
	}

	static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}