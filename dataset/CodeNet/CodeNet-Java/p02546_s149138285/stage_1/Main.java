import java.util.Scanner;

public class Main {

	public static String Y = "Yes";
	public static String N = "No";
var newVariable_0 = Math.pow(10, 9);	public static long MOD = (long) (newVariable_0 + 7);
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
var newVariable_1 = q.length();		if (newVariable_1 <= 1) {
			System.out.println(ans + q);
		}
		// General Case
		else {
var newVariable_2 = q.length();			for (int i = 0; i < newVariable_2; i++) {
var newVariable_3 = q.substring(0, i);var newVariable_4 = q.substring(i + 1);				permutation(q.substring(0, i) + newVariable_4,
var newVariable_5 = q.charAt(i);						ans + newVariable_5);
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
var newVariable_6 = str.length();		return newVariable_6;
	}

	static int account(String str) {

		String target = "2";
		int count = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {
var newVariable_7 = target.equals(str.substring(i, i + target.length()));var newVariable_8 = str.substring(i, i + target.length());var newVariable_9 = target.length();			if (target.equals(str.substring(i, i + newVariable_9))) {
				count++;
			}
		}
		return count;
	}

	static int ni() {

var newVariable_10 = sc.nextInt();		return newVariable_10;
	}

	static long nl() {

var newVariable_11 = sc.nextLong();		return newVariable_11;
	}

	static double nd() {

var newVariable_12 = sc.nextDouble();		return newVariable_12;
	}

	static String n() {

var newVariable_13 = sc.next();		return newVariable_13;
	}

	static char[] nc() {

var newVariable_14 = sc.next().toCharArray();var newVariable_15 = sc.next();		return newVariable_15.toCharArray();
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
