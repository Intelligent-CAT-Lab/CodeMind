import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static final int MOD = 1000000007;

	static int add(int a, int b) {
		int res = a + b;
		return res >= MOD ? res - MOD : res;
	}

	static int sub(int a, int b) {
		int res = a - b;
		return res < 0 ? res + MOD : res;
	}

	static int mul(int a, int b) {
		int res = (int) ((long) a * b % MOD);
		return res < 0 ? res + MOD : res;
	}

	static void solve() throws Exception {
		int n = scanInt(), a = scanInt(), b = scanInt();
		if (a < b) {
			int t = a;
			a = b;
			b = t;
		}
		System.err.println(a + " " + b);
		int dyn1[] = new int[n + 2];
		dyn1[0] = 1;
		for (int i = 1; i <= n + 1; i++) {
			int v = dyn1[i - 1];
			for (int j = i - b - 1; j >= 0; j--) {
				v = add(v, dyn1[j]);
			}
			dyn1[i] = v;
		}
		int res1[] = new int[n + 1];
		int res2[] = new int[n + 1];
		int res1g[] = new int[n + 1];
		int res2g[] = new int[n + 1];
		res1[0] = res2[0] = 1;
		for (int i = 0; i <= n; i++) {
			for (int j = 1; i + j <= n; j++) {
				int cres2[] = j >= a ? res2g : res2;
				cres2[i + j] = add(cres2[i + j], mul(res1[i], dyn1[j - 1 + (i == 0 ? 1 : 0) + (i + j == n ? 1 : 0)]));
				res2g[i + j] = add(res2g[i + j], mul(res1g[i], dyn1[j - 1 + (i == 0 ? 1 : 0) + (i + j == n ? 1 : 0)]));
			}
			for (int j = 1; j < b && i + j <= n; j++) {
				res1[i + j] = add(res1[i + j], res2[i]);
				res1g[i + j] = add(res1g[i + j], res2g[i]);
			}
		}
//		System.err.println(Arrays.toString(dyn1));
//		System.err.println(Arrays.toString(res1));
//		System.err.println(Arrays.toString(res2));
		out.print(add(res1g[n], res2g[n]));
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