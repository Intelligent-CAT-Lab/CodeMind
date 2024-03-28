import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

public class p03291 {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 30;
	static long LINF = 1L << 55;
	static int MOD = 1000000007;
	static int[] mh4 = { 0, -1, 1, 0 };
	static int[] mw4 = { -1, 0, 0, 1 };
	static int[] mh8 = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] mw8 = { -1, 0, 1, -1, 1, -1, 0, 1 };

	static class TaskX {

		public void solve(int testNumber, InputReader in, PrintWriter out) {

			char[] s = in.nextString().toCharArray();
			int n = s.length;
			long[] ac = new long[n+1];
			long[] bc = new long[n+1];
			long[] cc = new long[n+1];
			long[] xc = new long[n+1];
			for (int i = 0; i < n; i++) {
				ac[i+1] += ac[i];
				bc[i+1] += bc[i];
				cc[i+1] += cc[i];
				xc[i+1] += xc[i];
				if (s[i] == 'A') ac[i+1]++;
				if (s[i] == 'B') bc[i+1]++;
				if (s[i] == 'C') cc[i+1]++;
				if (s[i] == '?') xc[i+1]++;
			}

			long ans = 0;
			for (int i = 0; i < n; i++) {
				if (s[i] == 'B' || s[i] == '?') {
					long a = ac[i] - ac[0];
					long l = xc[i] - xc[0];
					long c = cc[n] - cc[i+1];
					long r = xc[n] - xc[i+1];

					ans += power(3, l+r, MOD) * a % MOD * c % MOD;
					ans += power(3, l+r-1, MOD) * a % MOD * r % MOD;
					ans += power(3, l+r-1, MOD) * l % MOD * c % MOD;
					ans += power(3, l+r-2, MOD) * l % MOD * r % MOD;
				}
			}

			out.println(ans % MOD);

		}

		/**
		 * 累乗[a^e (mod modP)]
		 *
		 * @param a : 被累乗数
		 * @param e : 累乗数
		 * @param modP : mod数
		 * */
		static long power(long a, long e, long modP) {
			long ret = 1;
			for (; e > 0; e /= 2) {
				if (e % 2 != 0) {
					ret = (ret * a) % modP;
				}
				a = (a * a) % modP;
			}
			return ret;
		}
	}

	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public double nextDouble() {
			return Double.parseDouble(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public int[] nextIntArrayDec(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt() - 1;
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public long[] nextLongArrayDec(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong() - 1;
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}
	}

}
