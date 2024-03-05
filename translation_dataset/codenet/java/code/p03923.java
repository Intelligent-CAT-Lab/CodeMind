import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class p03923 {
	public static void main(String[] args) {
		new p03923().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		System.out.println(solver(n, a));
	}

	long solver(long n, long a) {
		long ans = n;
		if (n == 1) {
			return 1;
		}
		for (int i = 1; i <= 40; ++i) {
			// min ( k1 + k2 + ... ki + a*(i-1) )
			// k1*k2*k3*...*ki>=n
			long t = a * (i - 1);
			long maxK = f(i, n);
			long curK = 1;
			for (int j = 0; j < i; ++j) {
				if (curK * pow(maxK - 1, i - j) / pow(maxK - 1, i - j) == curK && curK * pow(maxK - 1, i - j) < n) {
					t += maxK;
					if (curK != curK * maxK / maxK) {
						curK = n;
					} else {
						curK *= maxK;
					}
				} else {
					t += maxK - 1;
					if (curK != curK * (maxK - 1) / (maxK - 1)) {
						curK = n;
					} else {
						curK *= maxK - 1;
					}
				}
			}
			ans = Math.min(ans, t);
		}
		return ans;
	}

	long f(long i, long n) {
		long ok = n;
		long ng = 0;
		out: while (ok - ng > 1) {
			long middle = (ok + ng) / 2;
			long v = 1;
			for (int k = 0; k < i; ++k) {
				if (v != v * middle / middle) {
					ok = middle;
					continue out;
				}
				v *= middle;
			}
			if (v >= n) {
				ok = middle;
			} else {
				ng = middle;
			}
		}
		return ok;
	}

	long pow(long a, long n) {
		long ret = 1;
		for (; n > 0; n >>= 1, a *= a) {
			if (n % 2 == 1) {
				ret *= a;
			}
		}
		return ret;
	}

	int solver2(int n, int a) {
		int[] dp = new int[2 * n];
		Arrays.fill(dp, Integer.MAX_VALUE >> 3);
		dp[0] = 0;
		for (int i = 0; i < n; ++i) {
			if (i != 0)
				for (int j = i; j < 2 * n; j += i) {
					dp[j] = Math.min(dp[j], dp[i] + a + j / i);
				}
			else {
				for (int j = 1; j < 2 * n; ++j) {
					dp[j] = j;
				}
			}
		}
		int ans = Integer.MAX_VALUE >> 3;
		for (int i = n; i < 2 * n; ++i) {
			ans = Math.min(ans, dp[i]);
		}
		return ans;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}