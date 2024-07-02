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
System.out.println("[INST]21;n;s.length();"+n);
		boolean dyn1[][][] = new boolean[n + 1][n + 1][n + 1];
		dyn1[0][0][0] = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n; j++) {
				for (int k = 0; k <= n; k++) {
					if (dyn1[i][j][k]) {
						dyn1[i + 1][j][k] = true;
						if (j > 0 && s.charAt(i) == '1') {
System.out.println("[INST]29;None;s.charAt(i);"+s.charAt(i));
							dyn1[i + 1][j - 1][k + 1] = true;
						}
						if (k > 0 && s.charAt(i) == '0') {
System.out.println("[INST]32;None;s.charAt(i);"+s.charAt(i));
							dyn1[i + 1][j + 1][k - 1] = true;
						}
						if (i + 1 < n) {
							if (s.charAt(i) == '0' || s.charAt(i + 1) == '0') {
System.out.println("[INST]36;None;s.charAt(i);"+s.charAt(i));
System.out.println("[INST]36;None;s.charAt(i + 1);"+s.charAt(i + 1));
								dyn1[i + 2][j + 1][k] = true;
							}
							if (s.charAt(i) == '1' || s.charAt(i + 1) == '1') {
System.out.println("[INST]39;None;s.charAt(i);"+s.charAt(i));
System.out.println("[INST]39;None;s.charAt(i + 1);"+s.charAt(i + 1));
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
					if (i > 0 && s.charAt(i - 1) == '0') {
System.out.println("[INST]56;None;s.charAt(i - 1);"+s.charAt(i - 1));
						dyn2[i - 1][j][k] = add(dyn2[i - 1][j][k], dyn2[i][j][k]);
					} else if (j < n) {
						dyn2[i][j + 1][k] = add(dyn2[i][j + 1][k], dyn2[i][j][k]);
					}
					if (i > 0 && s.charAt(i - 1) == '1') {
System.out.println("[INST]61;None;s.charAt(i - 1);"+s.charAt(i - 1));
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
		while (tok == null || !tok.hasMoreTokens()) {
System.out.println("[INST]81;None;tok.hasMoreTokens();"+tok.hasMoreTokens());
			tok = new StringTokenizer(in.readLine());
System.out.println("[INST]82;None;in.readLine();"+in.readLine());
		}
		return tok.nextToken();
System.out.println("[INST]84;None;tok.nextToken();"+tok.nextToken());
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
System.out.println("[INST]100;None;exit(1);"+exit(1));
		}
	}
}