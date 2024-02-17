import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {

	void submit() {
		int n = nextInt();
		int k = nextInt();

		boolean[][] bad = new boolean[2 * n][2 * n];
		int[][] ins = new int[2 * n][2 * n];

		for (int i = 0; i < k; i++) {
			int l = nextInt() - 1;
			int r = nextInt() - 1;
			if (l > r) {
				int tmp = l;
				l = r;
				r = tmp;
			}

			for (int x = 0; x < 2 * n; x++) {
				for (int y = x + 1; y < 2 * n; y += 2) {
					bad[x][y] |= (x <= l && l <= y) != (x <= r && r <= y);
					if (x <= l && r <= y) {
						ins[x][y]++;
					}
				}
			}
		}

		int[][] dp = new int[2 * n][2 * n];

		int[] pars = new int[n + 1];
		pars[0] = 1;
		for (int i = 1; i <= n; i++) {
			pars[i] = (int) ((long) pars[i - 1] * (2 * i - 1) % P);
		}

		long outp = 0;

		for (int len = 2; len <= 2 * n; len += 2) {
			for (int i = 0; i + len <= 2 * n; i++) {
				int j = i + len - 1;

				if (bad[i][j]) {
					continue;
				}

				int ret = pars[len / 2 - ins[i][j]];

				for (int m = i + 1; m < j; m += 2) {
					// System.err.println(i + " " + m + " " + j);
					// System.err.println((j - m) / 2 - ins[i][m]);
					ret -= (int) ((long) dp[i][m]
							* pars[(j - m) / 2 - ins[m + 1][j]] % P);
					if (ret < 0) {
						ret += P;
					}
				}

				dp[i][j] = ret;

//				System.err.println(i + " " + j + " " + ret);

				outp += (long) ret * pars[n - len / 2 - (k - ins[i][j])] % P;
			}
		}

		out.println(outp % P);
	}

	static final int P = 1_000_000_007;

	void test() {

	}

	void stress() {
		for (int tst = 0;; tst++) {
			if (false) {
				throw new AssertionError();
			}
			System.err.println(tst);
		}
	}

	Main() throws IOException {
		is = System.in;
		out = new PrintWriter(System.out);
		submit();
		// stress();
		// test();
		out.close();
	}

	static final Random rng = new Random();
	static final int C = 5;

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	private InputStream is;
	PrintWriter out;

	private byte[] buf = new byte[1 << 14];
	private int bufSz = 0, bufPtr = 0;

	private int readByte() {
		if (bufSz == -1)
			throw new RuntimeException("Reading past EOF");
		if (bufPtr >= bufSz) {
			bufPtr = 0;
			try {
				bufSz = is.read(buf);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			if (bufSz <= 0)
				return -1;
		}
		return buf[bufPtr++];
	}

	private boolean isTrash(int c) {
		return c < 33 || c > 126;
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isTrash(b))
			;
		return b;
	}

	String nextToken() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!isTrash(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	String nextString() {
		int b = readByte();
		StringBuilder sb = new StringBuilder();
		while (!isTrash(b) || b == ' ') {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}

	char nextChar() {
		return (char) skip();
	}

	int nextInt() {
		int ret = 0;
		int b = skip();
		if (b != '-' && (b < '0' || b > '9')) {
			throw new InputMismatchException();
		}
		boolean neg = false;
		if (b == '-') {
			neg = true;
			b = readByte();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				ret = ret * 10 + (b - '0');
			} else {
				if (b != -1 && !isTrash(b)) {
					throw new InputMismatchException();
				}
				return neg ? -ret : ret;
			}
			b = readByte();
		}
	}

	long nextLong() {
		long ret = 0;
		int b = skip();
		if (b != '-' && (b < '0' || b > '9')) {
			throw new InputMismatchException();
		}
		boolean neg = false;
		if (b == '-') {
			neg = true;
			b = readByte();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				ret = ret * 10 + (b - '0');
			} else {
				if (b != -1 && !isTrash(b)) {
					throw new InputMismatchException();
				}
				return neg ? -ret : ret;
			}
			b = readByte();
		}
	}
}
