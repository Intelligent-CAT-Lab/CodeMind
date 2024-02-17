import java.util.Scanner;

public class Main {

	public static String Y = "Yes";
	public static String N = "No";
	public static long MOD = (long) (Math.pow(10, 9) + 7);
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String n = n();
		char[] nn = n.toCharArray();
		int len = n.length();

		if (nn[len - 1] == 's') {
			out(n + "es");
		} else {
			out(n + "s");
		}

	}

	/*
	 * 以下メソッド集
	 */

	public static int[] kousokusoinnsuubunkaihairetsu(int a) {
		int[] d = new int[a];
		for (int i = 0; i < a; i++) {
			d[i] = i;
		}
		for (int i = 2; i * i < a; i++) {
			for (int j = i * i; j < a; j += i) {
				if (d[j] == j)
					d[j] = i;
			}

		}

		return d;
	}

	public static void permutation(String q, String ans) {
		// Base Case
		if (q.length() <= 1) {
			System.out.println(ans + q);
		}
		// General Case
		else {
			for (int i = 0; i < q.length(); i++) {
				permutation(q.substring(0, i) + q.substring(i + 1),
						ans + q.charAt(i));
			}
		}
	}

	static char[][] same(char[][] c, int h, int w) {

		char[][] a = new char[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				a[i][j] = c[i][j];
			}
		}
		return a;

	}

	static int countkuro(char[][] c) {

		int count = 0;
		for (char[] cc : c) {
			for (char ccc : cc) {
				if ('#' == ccc) {
					count++;
				}
			}
		}
		return count;
	}

	static void debug() {

		out("---");
	}

	static void debug(Object a) {

		out("-------");
		out(a);
		out("-------");
	}

	static int ketasuu(int n) {

		String str = "" + n;
		return str.length();
	}

	static int account(String str) {

		String target = "2";
		int count = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (target.equals(str.substring(i, i + target.length()))) {
				count++;
			}
		}
		return count;
	}

	static int ni() {

		return sc.nextInt();
	}

	static long nl() {

		return sc.nextLong();
	}

	static double nd() {

		return sc.nextDouble();
	}

	static String n() {

		return sc.next();
	}

	static char[] nc() {

		return sc.next().toCharArray();
	}

	static int kaijo(int n) {

		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * kaijo(n - 1);
		}
	}

	static long kaijo(long n) {

		debug(n);

		if (n == 0l || n == 1l) {
			return 1l;
		} else {
			return n * kaijo(n - 1l);
		}
	}

	static int fib(int n) {

		return (n == 1 || n == 0) ? n : fib(n - 2) + fib(n - 1);
	}

	static long lcm(long m, long n) {

		return m * n / gcd(m, n);
	}

	static int lcm(int m, int n) {

		return m * n / gcd(m, n);
	}

	static long gcd(long a, long b) {

		return (b == 0) ? a : gcd(b, a % b);
	}

	static int gcd(int a, int b) {

		return (b == 0) ? a : gcd(b, a % b);
	}

	static void out(Object obj) {
		System.out.println(obj);
	}

	static void outn(Object obj) {
		System.out.print(obj);
	}

	static double max(double d, double e) {

		return Math.max(d, e);
	}

	static long max(long a, long b) {

		return Math.max(a, b);
	}

	static long min(long d, long e) {

		return Math.min(d, e);
	}

	static int min(int a, int b) {

		return Math.min(a, b);
	}
}

class XY {

	int h;
	int w;
	int d;

	XY(int h, int w, int d) {
		this.h = h;
		this.w = w;
		this.d = d;
	}
}
