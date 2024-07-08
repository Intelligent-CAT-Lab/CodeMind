import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solver();
	}

	static void solver() {
		Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.hasNext();		while (newVariable_0) {
			int n = sc.nextInt();
			if (n == 0)
				return;
			String[] s = new String[n];
			for (int i = 0; i < n; i++) {
var newVariable_1 = sc.next();				s[i] = newVariable_1;
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
var newVariable_2 = s[j].length();					out: for (int k = 0; k < newVariable_2; k++) {
var newVariable_3 = s[i].length();var newVariable_4 = s[j].length();						if (s[i].length() > newVariable_4)
							continue;
var newVariable_5 = s[i].length();var newVariable_6 = s[j].length();						if (k + s[i].length() > newVariable_6)
							continue;
var newVariable_7 = s[i].length();						String sj = s[j].substring(k, k + newVariable_7);
var newVariable_8 = sj.equals(s[i]);						if (newVariable_8) {
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
var newVariable_9 = Integer.bitCount(state);		if (newVariable_9 == 0)
var newVariable_10 = s[tail].length();			return newVariable_10;
		if (memo[state][tail] != -1) {
			return memo[state][tail];
		}
		int min = Integer.MAX_VALUE/4;
		for (int i = 0; i < n; i++) {
			if ((((state >> i) & 1) == 1) && (!unvalid[i])) {
				int bit = ~((~state) | (1 << i));
var newVariable_11 = s[tail].length();				min = Math.min(min, dp(bit, i, n, unvalid, s) - same_length(s[i], s[tail]) + newVariable_11);
			}
		}
		memo[state][tail] = min;
		return min;
	}

	static int same_length(String bottom, String tail) {
		int max = 0;
var newVariable_12 = bottom.length();		for (int i = 0; i < newVariable_12; i++) {
			int add = 0;
var newVariable_13 = bottom.charAt(i + add);var newVariable_14 = tail.charAt(add);			while (bottom.charAt(i + add) == newVariable_14) {
var newVariable_15 = bottom.length();				if (i + add == newVariable_15 - 1) {
					max = Math.max(add + 1, max);
					break;
var newVariable_16 = tail.length();				} else if (add == newVariable_16 - 1) {
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