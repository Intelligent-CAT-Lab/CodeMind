import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Math.max;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class p02965 {

	static final int MOD = 998244353;

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

	static int pow(int a, int e) {
		if (e == 0) {
			return 1;
		}
		int r = a;
		for (int i = 30 - Integer.numberOfLeadingZeros(e); i >= 0; i--) {
			r = mul(r, r);
			if ((e & (1 << i)) != 0) {
				r = mul(r, a);
			}
		}
		return r;
	}

	static int inv(int a) {
		return pow(a, MOD - 2);
	}

	static int facts[], factsInv[];

	static int c(int x, int y) {
		return mul(mul(facts[x + y], factsInv[x]), factsInv[y]);
	}

	static void solve() throws Exception {
		int n = scanInt(), m = scanInt();
		facts = new int[n + 3 * m / 2 + 1];
		facts[0] = 1;
		for (int i = 1; i < facts.length; i++) {
			facts[i] = mul(facts[i - 1], i);
		}
		factsInv = new int[facts.length];
		factsInv[facts.length - 1] = inv(facts[facts.length - 1]);
		for (int i = facts.length - 1; i > 0; i--) {
			factsInv[i - 1] = mul(factsInv[i], i);
		}
		int ans = 0;
		for (int nOdd = m % 2; nOdd <= m && nOdd <= n; nOdd += 2) {
			int cans = c(nOdd, n - nOdd);
			int cans1 = c((3 * m - nOdd) / 2, n - 1);
			int cans2 = mul(nOdd, c((m - nOdd) / 2, n - 1));
			if (nOdd < m) {
				cans2 = add(cans2, mul(n - nOdd, c((m - nOdd) / 2 - 1, n - 1)));
			}
			ans = add(ans, mul(cans, sub(cans1, cans2)));
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