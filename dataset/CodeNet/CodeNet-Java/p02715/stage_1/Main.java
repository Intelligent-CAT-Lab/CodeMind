// Utilities
import java.io.*;
import java.util.*;

public class Main {
	static int N, K;
	static long res = 0;
	static final int MOD = (int)1e9+7;

	public static void main(String[] args) throws IOException {
		N = in.iscan(); K = in.iscan(); 
		long[] x = new long[K+1];
		for (int i = K; i >= 1; i--) {
			x[i] = UTILITIES.fast_pow_mod(K/i, N, MOD);
			for (int j = i*2; j <= K; j += i) {
				x[i] -= x[j];
				if (x[i] < 0) x[i] += MOD;
			}
			res = (res + i*x[i]%MOD) % MOD;
		}
		out.println(res);
		out.close();
	} 
	
	static INPUT in = new INPUT(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	private static class INPUT {

		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar, numChars;

		public INPUT (InputStream stream) {
			this.stream = stream;
		}

		public INPUT (String file) throws IOException {
			this.stream = new FileInputStream (file);
		}

		public int cscan () throws IOException {
			if (curChar >= numChars) {
				curChar = 0;
				numChars = stream.read (buf);
			}
			
			if (numChars == -1)
				return numChars;

			return buf[curChar++];
		}

		public int iscan () throws IOException {
			int c = cscan (), sgn = 1;
			
var newVariable_0 = space (c);			while (newVariable_0)
				c = cscan ();

			if (c == '-') {
				sgn = -1;
				c = cscan ();
			}

			int res = 0;

			do {
				res = (res << 1) + (res << 3);
				res += c - '0';
				c = cscan ();
			}
var newVariable_1 = space (c);			while (!newVariable_1);

			return res * sgn;
		}

		public String sscan () throws IOException {
			int c = cscan ();
			
var newVariable_2 = space (c);			while (newVariable_2)
				c = cscan ();

			StringBuilder res = new StringBuilder ();

			do {
var newVariable_3 = res.appendCodePoint (c);				c = cscan ();
			}
var newVariable_4 = space (c);			while (!newVariable_4);

var newVariable_5 = res.toString ();			return newVariable_5;
		}

		public double dscan () throws IOException {
			int c = cscan (), sgn = 1;
			
var newVariable_6 = space (c);			while (newVariable_6)
				c = cscan ();

			if (c == '-') {
				sgn = -1;
				c = cscan ();
			}

			double res = 0;

var newVariable_7 = space (c);			while (!newVariable_7 && c != '.') {
				if (c == 'e' || c == 'E')
var newVariable_8 = UTILITIES.fast_pow (10, iscan ());var newVariable_9 = iscan ();					return res * UTILITIES.fast_pow (10, newVariable_9);
				
				res *= 10;
				res += c - '0';
				c = cscan ();
			}

			if (c == '.') {
				c = cscan ();
				double m = 1;

var newVariable_10 = space (c);				while (!newVariable_10) {
					if (c == 'e' || c == 'E')
var newVariable_11 = UTILITIES.fast_pow (10, iscan ());var newVariable_12 = iscan ();						return res * UTILITIES.fast_pow (10, newVariable_12);

					m /= 10;
					res += (c - '0') * m;
					c = cscan ();
				}
			}

			return res * sgn;
		}

		public long lscan () throws IOException {
			int c = cscan (), sgn = 1;
			
var newVariable_13 = space (c);			while (newVariable_13)
				c = cscan ();

			if (c == '-') {
				sgn = -1;
				c = cscan ();
			}

			long res = 0;

			do {
				res = (res << 1) + (res << 3);
				res += c - '0';
				c = cscan ();
			}
var newVariable_14 = space (c);			while (!newVariable_14);

			return res * sgn;
		}

		public boolean space (int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
	}

	public static class UTILITIES {

		static final double EPS = 10e-6;

		public static int lower_bound (int[] arr, int x) {
			int low = 0, high = arr.length, mid = -1;

			while (low < high) {
				mid = (low + high) / 2;

				if (arr[mid] >= x)
					high = mid;
				else
					low = mid + 1;
			}

			return low;
		}

		public static int upper_bound (int[] arr, int x) {
			int low = 0, high = arr.length, mid = -1;

			while (low < high) {
				mid = (low + high) / 2;

				if (arr[mid] > x)
					high = mid;
				else
					low = mid + 1;
			}

			return low;
		}

		public static int gcd (int a, int b) {
var newVariable_15 = gcd (b, a % b);			return b == 0 ? a : newVariable_15;
		}

		public static int lcm (int a, int b) {
var newVariable_16 = gcd (a, b);			return a * b / newVariable_16;
		}

		public static long fast_pow_mod (long b, long x, int mod) {
			if (x == 0) return 1;
			if (x == 1) return b;
var newVariable_17 = fast_pow_mod (b * b % mod, x / 2, mod);			if (x % 2 == 0) return newVariable_17 % mod;

var newVariable_18 = fast_pow_mod (b * b % mod, x / 2, mod);			return b * newVariable_18 % mod;
		}

		public static int fast_pow (int b, int x) {
			if (x == 0) return 1;
			if (x == 1) return b;
var newVariable_19 = fast_pow (b * b, x / 2);			if (x % 2 == 0) return newVariable_19;

var newVariable_20 = fast_pow (b * b, x / 2);			return b * newVariable_20;
		}

		public static long choose (long n, long k) {
			k = Math.min (k, n - k);
			long val = 1;

			for (int i = 0; i < k; ++i)
				val = val * (n - i) / (i + 1);

			return val;
		}

		public static long permute (int n, int k) {
			if (n < k) return 0;
			long val = 1;

			for (int i = 0; i < k; ++i)
				val = (val * (n - i));

			return val;
		}
	}
}