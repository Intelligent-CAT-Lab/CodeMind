import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, K, M;

	public static void main(String[] args) {
		N = sc.nextInt();
		K = sc.nextInt();
		M = sc.nextInt();
		int MASK = (1 << K) - 1;
		if (N < K) {
			System.out.println(naive());
			return;
		}
		long[][][] dp = new long[2][K + 1][1 << K];
		for (int i = 0; i < (1 << K); i++) {
			int c = 0;
			boolean ok = true;
			for (int j = 0; j < K; j++) {
				if ((i & (1 << (K - 1 - j))) == 0) {
					c--;
				} else {
					c++;
				}
				if (c < 0) {
					ok = false;
					break;
				}
			}
			if (!ok) continue;
			int u = Integer.bitCount(i);
			int l = K - u;
			if (u < l) continue;
			dp[0][u - l][i] = 1;
		}
		int t = 1;
		for (int i = K; i < 2 * N; i++, t = 1 - t) {
			for (long[] a : dp[t]) {
				Arrays.fill(a, 0);
			}
			for (int j = i % 2; j <= K; j += 2) {
				int l = (i - j) / 2;
				int u = l + j;
				for (int k = 0; k < (1 << K); k++) {
					int uc = Integer.bitCount(k);
					if (0 < j && j <= uc && (l == 0 || k != MASK)) { // put lower row
						dp[t][j - 1][(k << 1) & MASK] += dp[1 - t][j][k];
						dp[t][j - 1][(k << 1) & MASK] %= M;
					}
					if (u < N && j < K && k != 0) { // put upper row
						dp[t][j + 1][((k << 1) + 1) & MASK] += dp[1 - t][j][k];
						dp[t][j + 1][((k << 1) + 1) & MASK] %= M;
					}
				}
			}
//			System.err.println(Arrays.deepToString(dp[t]));
		}
		long ans = 0;
		for (long v : dp[1 - t][0]) {
			ans += v;
		}
		System.out.println(ans % M);
	}

	static long naive() {
		ArrayList<Integer> u = new ArrayList<>();
		ArrayList<Integer> l = new ArrayList<>();
var newVariable_0 = u.add(0);		return rec(u, l, 1);
	}

	static long rec(ArrayList<Integer> u, ArrayList<Integer> l, int cur) {
		if (cur == 2 * N) return 1;
		long ret = 0;
var newVariable_1 = u.size();		if (newVariable_1 < N) {
var newVariable_2 = u.add(cur);			ret += rec(u, l, cur + 1);
var newVariable_3 = u.remove(u.size() - 1);var newVariable_4 = u.size();			u.remove(newVariable_4 - 1);
		}
var newVariable_5 = l.size();var newVariable_6 = u.size();var newVariable_7 = u.get(l.size());var newVariable_8 = l.size();		if (newVariable_8 < u.size() && cur <= u.get(newVariable_8) + K) {
var newVariable_9 = l.add(cur);			ret += rec(u, l, cur + 1);
var newVariable_10 = l.remove(l.size() - 1);var newVariable_11 = l.size();			l.remove(newVariable_11 - 1);
		}
		return ret % M;
	}

}

