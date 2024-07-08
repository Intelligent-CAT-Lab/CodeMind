import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static final int MOD = 998244353;

	static int add(int a, int b) {
		int res = a + b;
		return res >= MOD ? res - MOD : res;
	}

	static void solve() throws Exception {
		String s = scanString();
		int n = s.length();
		boolean dyn1[][][] = new boolean[n + 1][n + 1][n + 1];
		dyn1[0][0][0] = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n; j++) {
				for (int k = 0; k <= n; k++) {
					if (dyn1[i][j][k]) {
						dyn1[i + 1][j][k] = true;
var newVariable_0 = s.charAt(i);						if (j > 0 && newVariable_0 == '1') {
							dyn1[i + 1][j - 1][k + 1] = true;
						}
var newVariable_1 = s.charAt(i);						if (k > 0 && newVariable_1 == '0') {
							dyn1[i + 1][j + 1][k - 1] = true;
						}
						if (i + 1 < n) {
var newVariable_2 = s.charAt(i);var newVariable_3 = s.charAt(i + 1);							if (s.charAt(i) == '0' || newVariable_3 == '0') {
								dyn1[i + 2][j + 1][k] = true;
							}
var newVariable_4 = s.charAt(i);var newVariable_5 = s.charAt(i + 1);							if (s.charAt(i) == '1' || newVariable_5 == '1') {
								dyn1[i + 2][j][k + 1] = true;
							}
						}
					}
				}
			}
		}
		int dyn2[][][] = new int[n + 1][n + 1][n + 1];
		dyn2[n][0][0] = 1;
		int ans = MOD - 1;
		for (int i = n; i >= 0; i--) {
			for (int j = 0; j <= n; j++) {
				for (int k = 0; k <= n; k++) {
					if (dyn1[i][j][k]) {
						ans = add(ans, dyn2[i][j][k]);
					}
var newVariable_6 = s.charAt(i - 1);					if (i > 0 && newVariable_6 == '0') {
						dyn2[i - 1][j][k] = add(dyn2[i - 1][j][k], dyn2[i][j][k]);
					} else if (j < n) {
						dyn2[i][j + 1][k] = add(dyn2[i][j + 1][k], dyn2[i][j][k]);
					}
var newVariable_7 = s.charAt(i - 1);					if (i > 0 && newVariable_7 == '1') {
						dyn2[i - 1][j][k] = add(dyn2[i - 1][j][k], dyn2[i][j][k]);
					} else if (k < n) {
						dyn2[i][j][k + 1] = add(dyn2[i][j][k + 1], dyn2[i][j][k]);
					}
				}
			}
		}
		out.print(ans);
	}

	static int scanInt() throws IOException {
		return parseInt(scanString());
	}

	static long scanLong() throws IOException {
		return parseLong(scanString());
	}

	static String scanString() throws IOException {
var newVariable_8 = tok.hasMoreTokens();		while (tok == null || !newVariable_8) {
var newVariable_9 = in.readLine();			tok = new StringTokenizer(newVariable_9);
		}
var newVariable_10 = tok.nextToken();		return newVariable_10;
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