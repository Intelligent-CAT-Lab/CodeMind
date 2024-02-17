import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	void submit() {
		int a = nextInt();
		int b = nextInt();
		int c = nextInt();
		int d = nextInt();
		int e = nextInt();
		int f = nextInt();

		if (d % a != 0 || e % b != 0 || f % c != 0) {
			out.println(0);
			return;
		}

		int p = d / a;
		int q = e / b;
		int r = f / c;

		int[][] dp = new int[p + 1][q + 1];
		dp[p][q] = 1;

		int ans = 0;

		for (int x = p - 1; x >= 1; x--) {
			for (int y = q - 1; y >= 1; y--) {
				dp[x][y] = (int) ((long) ways[p][x] * ways[q][y] % P
						* pow(c, (p - x) * (q - y)) % P);

				for (int xb = x; xb <= p; xb++) {
					for (int yb = y; yb <= q; yb++) {
						if (xb + yb == x + y) {
							continue;
						}
						dp[x][y] -= (int) ((long) dp[xb][yb] * ways[xb][x] % P
								* ways[yb][y] % P);
						if (dp[x][y] < 0) {
							dp[x][y] += P;
						}
					}
				}

				int foo = pow(b, x);
				int bar = pow(a, y);

				int delta = 0;

				delta += pow(Math.floorMod(foo + bar - 1, P), r);
				if (delta >= P) {
					delta -= P;
				}

				delta -= pow(foo, r);
				if (delta < 0) {
					delta += P;
				}

				delta -= pow(bar, r);
				if (delta < 0) {
					delta += P;
				}

				delta++;
				if (delta >= P) {
					delta -= P;
				}

				delta = (int) ((long) delta * dp[x][y] % P);
				ans += delta;
				if (ans >= P) {
					ans -= P;
				}
			}
		}

		ans += (int) ((long) pow(one2D(a, p, b, q), r) * pow(a * b, r - 1) % P);
		if (ans >= P) {
			ans -= P;
		}

		ans += (int) ((long) pow(one2D(b, q, c, r), p) * pow(b * c, p - 1) % P);
		if (ans >= P) {
			ans -= P;
		}

		ans += (int) ((long) pow(one2D(c, r, a, p), q) * pow(c * a, q - 1) % P); // LOOOOOOOOOOOOOOL
		if (ans >= P) {
			ans -= P;
		}

		ans -= pow(a, q * r - 1);
		if (ans < 0) {
			ans += P;
		}

		ans -= pow(b, r * p - 1);
		if (ans < 0) {
			ans += P;
		}

		ans -= pow(c, p * q - 1);
		if (ans < 0) {
			ans += P;
		}

		ans++;
		if (ans >= P) {
			ans -= P;
		}
		ans = (int) ((long) ans * a % P * b % P * c % P);

		out.println(ans);
	}

	int one2D(int a, int p, int b, int q) {
		return Math.floorMod(pow(b, p - 1) + pow(a, q - 1) - 1, P);
	}

	int pow(int a, int b) {
		int ret = 1;
		for (; b > 0; b >>= 1) {
			if ((b & 1) == 1) {
				ret = (int) ((long) ret * a % P);
			}
			a = (int) ((long) a * a % P);
		}
		return ret;
	}

	static final int C = 110;
	static final int P = BigInteger.TEN.pow(9).intValueExact() + 7;
	int[][] ways;

	void preCalc() {
		ways = new int[C][];
		for (int i = 0; i < C; i++) {
			ways[i] = new int[i + 1];
			ways[i][0] = ways[i][i] = 1;
			for (int j = 1; j < i; j++) {
				ways[i][j] = (ways[i - 1][j] + ways[i - 1][j - 1]) % P;
			}
		}
	}

	void stress() {

	}

	void test() {

	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		// stress();
		// test();
		out.close();
	}

	static final Random rng = new Random();

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	int nextInt() {
		return Integer.parseInt(nextToken());
	}

	long nextLong() {
		return Long.parseLong(nextToken());
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}
