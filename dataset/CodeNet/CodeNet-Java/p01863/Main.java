import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	long start = System.currentTimeMillis();
	long fin = System.currentTimeMillis();
	final int MOD = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	void run() {
		String s = sc.next();
		int N = s.length();
		RollingHash rh = new RollingHash();
		rh.init(s);
		int ans = Integer.MAX_VALUE;
		String res = "mitomerarenaiWA";
		int l = 0;
		int r = 0;
		for (int i = 0; i < N; i++) {
			int t = N - (i + 1) * 3;
			if (t > 0 && t % 2 == 0) {
				int A = i + 1;
				int B = t / 2;
				long a1 = rh.getHash2(0, A - 1);
				long b1 = rh.getHash2(A, A + B - 1);
				long a2 = rh.getHash2(A + B, A + B + A - 1);
				long b2 = rh.getHash2(A + B + A, A + B + A + B - 1);
				long a3 = rh.getHash2(A + B + A + B, N - 1);
				if (a1 == a2 && a2 == a3 && b1 == b2) {
					ans = Math.min(ans, i + t);
					l = A;
					r = B;
				}
			}
		}
		if (l != 0 && r != 0) res = "Love " + s.substring(0, l) + s.substring(l, l + r) + "!";
		System.out.println(res);
	}

	public class RollingHash {

		String S;
		int N, l, r;

		long B1 = 1007;
		long B2 = 1009;
		long H1 = 1000000007;
		long H2 = 1000000009;

		long[] Base1, Base2;
		long[] Hash1, Hash2;

		void init(String s) {
			S = s;
			N = s.length();
			l = 0;
			r = s.length() - 1;
			Base1 = new long[N + 1];
			Base2 = new long[N + 1];
			Hash1 = new long[N];
			Hash2 = new long[N];

			Base1[0] = Base2[0] = 1;
			Hash1[0] = Hash2[0] = s.charAt(0);
			for (int i = 1; i <= N; i++) Base1[i] = (Base1[i - 1] * B1) % H1;
			for (int i = 1; i <= N; i++) Base2[i] = (Base2[i - 1] * B2) % H2;
			for (int i = 1; i < N; i++) Hash1[i] = (Hash1[i - 1] * B1 + s.charAt(i)) % H1;
			for (int i = 1; i < N; i++) Hash2[i] = (Hash2[i - 1] * B2 + s.charAt(i)) % H2;
		}

		/*
		 * S(this)???T??????????????????(?????¬??????RollingHash)
		 */
		boolean contain1(String T) {
			int sl = S.length();
			int tl = T.length();
			if (tl > sl) return false;

			long b = 1;
			for (int i = 0; i < tl; i++) b = (b * B1) % H1;

			long sh = 0;
			long th = 0;
			for (int i = 0; i < tl; i++) sh = (sh * B1 + (S.charAt(i))) % H1;
			for (int i = 0; i < tl; i++) th = (th * B1 + (T.charAt(i))) % H1;

			for (int i = 0; i + tl <= sl; i++) {
				if (sh == th) return true;
				if (i + tl < sl) sh = sh * B1 - (S.charAt(i)) * b + (S.charAt(i + tl));
				sh = (sh + H1) % H1;
			}
			return false;
		}

		boolean contain2(String T) {
			int sl = N;
			int tl = T.length();
			if (tl > sl) return false;

			long th = 0;
			for (int i = 0; i < tl; i++) th = (th * B1 + (T.charAt(i))) % H1;

			r = tl - 1;
			l = 0;
			for (; r < N; r++, l++) {
				if (getHash1() == th) return true;
			}
			l = 0;
			r = S.length() - 1;
			return false;
		}

		long getHash1() {
			long res = Hash1[r] - ((l == 0) ? 0 : Hash1[l - 1] * Base1[r - l + 1]);
			if (res < 0) res = (res + ((-res / H1) + 1) * H1) % H1;
			return res;
		}

		long getHash1(int l, int r) {
			long res = Hash1[r] - ((l == 0) ? 0 : Hash1[l - 1] * Base1[r - l + 1]);
			if (res < 0) res = (res + ((-res / H1) + 1) * H1) % H1;
			return res;
		}

		long getHash2() {
			long res = Hash2[r] - ((l == 0) ? 0 : Hash2[l - 1] * Base2[r - l + 1]);
			if (res < 0) res = (res + ((-res / H2) + 1) * H2) % H2;
			return res;
		}

		long getHash2(int l, int r) {
			long res = Hash2[r] - ((l == 0) ? 0 : Hash2[l - 1] * Base2[r - l + 1]);
			if (res < 0) res = (res + ((-res / H2) + 1) * H2) % H2;
			return res;
		}

		void show() {
			System.out.println("---------show---------");
			System.out.println("String = " + S.substring(l, r + 1));
			System.out.println("l = " + l + " r = " + r);
			System.out.println("Hash1 = " + getHash1() + " Hash2 = " + getHash2());
			System.out.println("----------------------");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(char[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	boolean inner(int h, int w, int limH, int limW) {
		return 0 <= h && h < limH && 0 <= w && w < limW;
	}

	void swap(int[] x, int a, int b) {
		int tmp = x[a];
		x[a] = x[b];
		x[b] = tmp;
	}

	// find minimum i (k <= a[i])
	int lower_bound(int a[], int k) {
		int l = -1;
		int r = a.length;
		while (r - l > 1) {
			int mid = (l + r) / 2;
			if (k <= a[mid])
				r = mid;
			else
				l = mid;
		}
		// r = l + 1
		return r;
	}

	// find minimum i (k < a[i])
	int upper_bound(int a[], int k) {
		int l = -1;
		int r = a.length;
		while (r - l > 1) {
			int mid = (l + r) / 2;
			if (k < a[mid])
				r = mid;
			else
				l = mid;
		}
		// r = l + 1
		return r;
	}

	long gcd(long a, long b) {
		return a % b == 0 ? b : gcd(b, a % b);
	}

	long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}

	boolean palindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}

		int[] nextIntArray(int n) {
			int[] in = new int[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextInt();
			}
			return in;
		}

		int[][] nextInt2dArray(int n, int m) {
			int[][] in = new int[n][m];
			for (int i = 0; i < n; i++) {
				in[i] = nextIntArray(m);
			}
			return in;
		}

		double[] nextDoubleArray(int n) {
			double[] in = new double[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextDouble();
			}
			return in;
		}

		long[] nextLongArray(int n) {
			long[] in = new long[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextLong();
			}
			return in;
		}

		char[][] nextCharField(int n, int m) {
			char[][] in = new char[n][m];
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				for (int j = 0; j < m; j++) {
					in[i][j] = s.charAt(j);
				}
			}
			return in;
		}
	}
}