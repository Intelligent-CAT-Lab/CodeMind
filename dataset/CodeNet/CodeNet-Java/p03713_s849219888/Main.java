import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) {
		FastScanner cin = new FastScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(FastScanner cin, PrintWriter cout) {
		assert solve(3, 5) == 0;
		assert solve(4, 5) == 2;
		assert solve(5, 5) == 4;

		assert solve(100000, 100000) == 50000;
		assert solve(100000, 2) == 1;
		long h = cin.nextInt();
		long w = cin.nextInt();
		long ans = solve(h, w);
		cout.println(ans);
	}

	private static long solve(long h, long w) {
		long ans = Long.MAX_VALUE;
		for (long i = Math.max(1, w / 3); i < Math.min(w / 3 + 2, w); i++) {
			for (long j = Math.max(1, h / 2); j < Math.min(h / 2 + 2, h); j++) {
				long sq1 = i * h;
				long sq2 = (w - i) * j;
				long sq3 = (w - i) * (h - j);
				long[] sqs = { sq1, sq2, sq3 };
				Arrays.sort(sqs);
				ans = Math.min(ans, sqs[2] - sqs[0]);
			}
			long ww = w - i;
			for (long j = Math.max(1, ww / 2); j < Math.min(ww / 2 + 2, ww); j++) {
				long sq1 = i * h;
				long sq2 = j * h;
				long sq3 = (ww - j) * h;
				long[] sqs = { sq1, sq2, sq3 };
				Arrays.sort(sqs);
				ans = Math.min(ans, sqs[2] - sqs[0]);
			}
		}
		for (long i = Math.max(1, h / 3); i < Math.min(h / 3 + 2, h); i++) {
			for (long j = Math.max(1, w / 2); j < Math.min(w / 2 + 2, w); j++) {
				long sq1 = i * w;
				long sq2 = (h - i) * j;
				long sq3 = (h - i) * (w - j);
				long[] sqs = { sq1, sq2, sq3 };
				Arrays.sort(sqs);
				ans = Math.min(ans, sqs[2] - sqs[0]);
			}
			long hh = h - i;
			for (long j = Math.max(1, hh / 2); j < Math.min(hh / 2 + 2, hh); j++) {
				long sq1 = i * w;
				long sq2 = j * w;
				long sq3 = (hh - j) * w;
				long[] sqs = { sq1, sq2, sq3 };
				Arrays.sort(sqs);
				ans = Math.min(ans, sqs[2] - sqs[0]);
			}
		}
		return ans;
	}

	/**
	 * How to read input in Java — tutorial <br />
	 * By Flatfoot<br />
	 * http://codeforces.com/blog/entry/7018
	 */
	static class FastScanner {
		private BufferedReader br;
		private StringTokenizer st;

		FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new IllegalStateException(e);
				}
			return st.nextToken();
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				throw new IllegalStateException(e);
			}
			return str;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
