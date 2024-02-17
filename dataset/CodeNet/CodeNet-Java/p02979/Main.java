import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.System.exit;
import static java.util.Arrays.fill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static int add(int a, int b) {
		int res = a + b;
		return res >= mod ? res - mod : res;
	}

	static int mul(int a, int b) {
		int res = (int) ((long) a * b % mod);
		return res < 0 ? res + mod : res;
	}

	static int mod;

	static void solve() throws Exception {
		int n = scanInt(), k = scanInt();
		mod = scanInt();
		if (k % 2 == 0) {
			out.print(mul(solve2(n / 2, k / 2 + 1), solve2((n + 1) / 2, k / 2 + 1)));
		} else {
			int dyn[][] = new int[k + 2][k + 2];
			dyn[0][0] = 1;
			int ndyn[][] = new int[k + 2][k + 2];
			for (int i = 0; i < (n | 1) / 2 + k / 2 + 2; i++) {
				for (int a[]: ndyn) {
					fill(a, 0);
				}
				int mask = (i < (n + 1) / 2 ? 1 : 0) + (i >= k / 2 + 2 ? 2 : 0);
				for (int m = mask;; m = (m - 1) & mask) {
					for (int j = 0; j < k + 2; j++) {
						for (int jj = 0; jj < k + 2; jj++) {
							int nj = (m & 1) != 0 ? min(j + 1, k + 1) : 0;
							int njj = (m & 2) != 0 && (j != 0 || jj != 0) ? max(j, jj) + 1 : 0;
							if (nj < k + 2 && njj < k + 2) {
								ndyn[nj][njj] = add(ndyn[nj][njj], dyn[j][jj]);
							}
						}
					}
					if (m == 0) {
						break;
					}
				}
				int t[][] = dyn;
				dyn = ndyn;
				ndyn = t;
			}
			int ans = 0;
			for (int i = 0; i < k + 2; i++) {
				for (int j = 0; j < k + 2; j++) {
					ans = add(ans, dyn[i][j]);
				}
			}
			out.print(ans);
		}
	}

	static int solve2(int n, int k) {
		int dyn[] = new int[k];
		fill(dyn, 1);
		for (int i = 0; i < n; i++) {
			int v = dyn[k - 1];
			for (int j = k - 2; j >= 0; j--) {
				dyn[j + 1] = add(dyn[j], v);
			}
			dyn[0] = v;
		}
		return dyn[k - 1];
	}

	static int scanInt() throws IOException {
		return parseInt(scanString());
	}

	static long scanLong() throws IOException {
		return parseLong(scanString());
	}

	static String scanString() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	public static void main(String[] args) {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			solve();
			in.close();
			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
			exit(1);
		}
	}
}