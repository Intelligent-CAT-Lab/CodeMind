import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class p03629 {

	static PrintWriter out;
	static InputReader ir;
	static boolean debug = false;

	static void solve() {
		char[] a = ir.next().toCharArray();
		int n = a.length;
		int[][][] dp = new int[n + 1][26][2];
		for (int i = 0; i < 26; i++)
			dp[n][i] = new int[] { i, 1 };
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < 26; j++)
				for (int k = 0; k < 2; k++)
					dp[i][j][k] = dp[i + 1][j][k];
			int cur = a[i] - 'a';
			int mi = 2 * n;
			for (int j = 0; j < 26; j++)
				mi = Math.min(mi, dp[i + 1][j][1]);
			for (int j = 0; j < 26; j++) {
				if (dp[i + 1][j][1] == mi) {
					dp[i][cur][0] = j;
					dp[i][cur][1] = dp[i + 1][j][1] + 1;
					break;
				}
			}
		}
		int mi = 2 * n, cur = -1;
		;
		for (int i = 0; i < 26; i++)
			mi = Math.min(mi, dp[0][i][1]);
		for (int i = 0; i < 26; i++)
			if (dp[0][i][1] == mi) {
				cur = i;
				break;
			}
		StringBuilder ret = new StringBuilder(Character.toString((char) ('a' + cur)));
		for (int i = 0; i < n; i++) {
			if (dp[i][cur][0] == dp[i + 1][cur][0] && dp[i][cur][1] == dp[i + 1][cur][1])
				continue;
			ret.append(Character.toString((char) ('a' + dp[i][cur][0])));
			cur = dp[i][cur][0];
		}
		out.println(ret);
	}

	public static void main(String[] args) {
		ir = new InputReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}

	static class InputReader {

		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}

	static void tr(Object... o) {
		if (debug)
			out.println(Arrays.deepToString(o));
	}
}
