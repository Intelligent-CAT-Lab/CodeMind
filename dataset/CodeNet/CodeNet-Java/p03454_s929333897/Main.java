import java.util.*;

import java.io.*;

public class Main {

	int mod = 1000000007;

	static long[] pow10;
	{
		pow10 = new long[19];
		pow10[0] = 1;
		for (int i = 1; i < 19; i++) {
			pow10[i] = pow10[i - 1] * 10;
		}
	}

	long pow(long a, long b) {
		long res = 1;
		while (b > 0) {
			if ((b & 1) == 1) {
				res = res * a % mod;
			}
			a = a * a % mod;
			b >>>= 1;
		}
		return res;
	}

	long solve(int k, int l, int s) {
		int maxK = (int) (9 * pow10[k - 1]);
		long maxL = 9 * pow10[l - 1] * l;
		int res = 0;
		for (int i = 1; i <= maxK && s - i * k >= l; i++) {
			if ((s - i * k) % l == 0 && (s - i * k) <= maxL) {
				res++;
			}
		}
		return res;
	}

	void solve() {
		int s = in.nextInt();
		long result = 0;
		for (int i = 1; i * i <= s; i++) {
			if (s % i == 0) {
				int k = i;
				if (k > 18 || s / k <= 9 * pow10[k - 1]) {
					result += pow(10, k - 1) * 9 - (s / k) + 1;
					result = (result + mod) % mod;
				}
				if (i * i != s) {
					k = s / i;
					if (k > 18 || s / k <= 9 * pow10[k - 1]) {
						result += pow(10, k - 1) * 9 - (s / k) + 1;
						result = (result + mod) % mod;
					}
				}
			}
		}

		outer: for (int k = 1;; k++) {
			for (int l = k + 2;; l++) {
				long remS = s;
				for (int i = k + 1; i <= l - 1; i++) {
					remS -= pow10[i - 1] * 9 * i;
				}
				if (remS < 0) {
					if (l == k + 2) {
						break outer;
					} else {
						break;
					}
				}
//				System.err.println(k + " " + l + " " + remS);
				result += solve(k, l, (int) remS);
			}
		}
		
		for (int k = 1; k <= 17 && k <= (s - 1) / 2; k++) {
			long pow10X = k <= 18 ? pow10[k - 1] * 9 : (long) 3e18;
			long pow10Y = (k + 1) <= 18 ? pow10[k] * 9 : (long) 3e18;

			long x0 = (long) k * s;
			long y0 = (long) (1 - k) * s;
			long minT = (k - y0) / k;
			long maxT = (pow10Y - y0) / k;
			minT = Math.max(minT, (x0 - pow10X + k) / (k + 1));
			maxT = Math.min(maxT, (x0 - 1) / (k + 1));
			result += Math.max(0, maxT - minT + 1);
		}
		
		for (int k = 18; k <= (s - 1) / 2; k++) {
			long minT = (k + (long) (k - 1) * s) / k;
			long maxT = ((long) k * s - 1) / (k + 1);
			result += Math.max(0, maxT - minT + 1);
		}

		out.println((result % mod + mod) % mod);
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
