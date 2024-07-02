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
System.out.println("[INST]43;numChars;stream.read (buf);"+numChars);
			}
			
			if (numChars == -1)
				return numChars;

			return buf[curChar++];
		}

		public int iscan () throws IOException {
			int c = cscan (), sgn = 1;
System.out.println("[INST]53;c;cscan ();"+c);
			
			while (space (c))
System.out.println("[INST]55;None;space (c);"+space (c));
				c = cscan ();
System.out.println("[INST]56;c;cscan ();"+c);

			if (c == '-') {
				sgn = -1;
				c = cscan ();
System.out.println("[INST]60;c;cscan ();"+c);
			}

			int res = 0;

			do {
				res = (res << 1) + (res << 3);
				res += c - '0';
				c = cscan ();
System.out.println("[INST]68;c;cscan ();"+c);
			}
			while (!space (c));
System.out.println("[INST]70;None;space (c);"+space (c));

			return res * sgn;
		}

		public String sscan () throws IOException {
			int c = cscan ();
System.out.println("[INST]76;c;cscan ();"+c);
			
			while (space (c))
System.out.println("[INST]78;None;space (c);"+space (c));
				c = cscan ();
System.out.println("[INST]79;c;cscan ();"+c);

			StringBuilder res = new StringBuilder ();

			do {
				res.appendCodePoint (c);
System.out.println("[INST]84;None;res.appendCodePoint (c);"+res.appendCodePoint (c));
				c = cscan ();
System.out.println("[INST]85;c;cscan ();"+c);
			}
			while (!space (c));
System.out.println("[INST]87;None;space (c);"+space (c));

			return res.toString ();
System.out.println("[INST]89;None;res.toString ();"+res.toString ());
		}

		public double dscan () throws IOException {
			int c = cscan (), sgn = 1;
System.out.println("[INST]93;c;cscan ();"+c);
			
			while (space (c))
System.out.println("[INST]95;None;space (c);"+space (c));
				c = cscan ();
System.out.println("[INST]96;c;cscan ();"+c);

			if (c == '-') {
				sgn = -1;
				c = cscan ();
System.out.println("[INST]100;c;cscan ();"+c);
			}

			double res = 0;

			while (!space (c) && c != '.') {
System.out.println("[INST]105;None;space (c);"+space (c));
				if (c == 'e' || c == 'E')
					return res * UTILITIES.fast_pow (10, iscan ());
System.out.println("[INST]107;None;UTILITIES.fast_pow (10, iscan ());"+UTILITIES.fast_pow (10, iscan ()));
System.out.println("[INST]107;None;iscan ();"+iscan ());
				
				res *= 10;
				res += c - '0';
				c = cscan ();
System.out.println("[INST]111;c;cscan ();"+c);
			}

			if (c == '.') {
				c = cscan ();
System.out.println("[INST]115;c;cscan ();"+c);
				double m = 1;

				while (!space (c)) {
System.out.println("[INST]118;None;space (c);"+space (c));
					if (c == 'e' || c == 'E')
						return res * UTILITIES.fast_pow (10, iscan ());
System.out.println("[INST]120;None;UTILITIES.fast_pow (10, iscan ());"+UTILITIES.fast_pow (10, iscan ()));
System.out.println("[INST]120;None;iscan ();"+iscan ());

					m /= 10;
					res += (c - '0') * m;
					c = cscan ();
System.out.println("[INST]124;c;cscan ();"+c);
				}
			}

			return res * sgn;
		}

		public long lscan () throws IOException {
			int c = cscan (), sgn = 1;
System.out.println("[INST]132;c;cscan ();"+c);
			
			while (space (c))
System.out.println("[INST]134;None;space (c);"+space (c));
				c = cscan ();
System.out.println("[INST]135;c;cscan ();"+c);

			if (c == '-') {
				sgn = -1;
				c = cscan ();
System.out.println("[INST]139;c;cscan ();"+c);
			}

			long res = 0;

			do {
				res = (res << 1) + (res << 3);
				res += c - '0';
				c = cscan ();
System.out.println("[INST]147;c;cscan ();"+c);
			}
			while (!space (c));
System.out.println("[INST]149;None;space (c);"+space (c));

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
			return b == 0 ? a : gcd (b, a % b);
System.out.println("[INST]194;None;gcd (b, a % b);"+gcd (b, a % b));
		}

		public static int lcm (int a, int b) {
			return a * b / gcd (a, b);
System.out.println("[INST]198;None;gcd (a, b);"+gcd (a, b));
		}

		public static long fast_pow_mod (long b, long x, int mod) {
			if (x == 0) return 1;
			if (x == 1) return b;
			if (x % 2 == 0) return fast_pow_mod (b * b % mod, x / 2, mod) % mod;
System.out.println("[INST]204;None;fast_pow_mod (b * b % mod, x / 2, mod);"+fast_pow_mod (b * b % mod, x / 2, mod));

			return b * fast_pow_mod (b * b % mod, x / 2, mod) % mod;
System.out.println("[INST]206;None;fast_pow_mod (b * b % mod, x / 2, mod);"+fast_pow_mod (b * b % mod, x / 2, mod));
		}

		public static int fast_pow (int b, int x) {
			if (x == 0) return 1;
			if (x == 1) return b;
			if (x % 2 == 0) return fast_pow (b * b, x / 2);
System.out.println("[INST]212;None;fast_pow (b * b, x / 2);"+fast_pow (b * b, x / 2));

			return b * fast_pow (b * b, x / 2);
System.out.println("[INST]214;None;fast_pow (b * b, x / 2);"+fast_pow (b * b, x / 2));
		}

		public static long choose (long n, long k) {
			k = Math.min (k, n - k);
System.out.println("[INST]218;k;Math.min (k, n - k);"+k);
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