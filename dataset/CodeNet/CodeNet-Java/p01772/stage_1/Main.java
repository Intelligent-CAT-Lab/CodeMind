import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	void run() {
		MyScanner sc = new MyScanner();

		char[] c = sc.next().toCharArray();
		int n = c.length;
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (c[i] == 'A' || c[i] == 'Z') {
var newVariable_0 = s.append(c[i]);			}
		}
var newVariable_1 = s.toString();		c = newVariable_1.toCharArray();
		n = c.length;
		s = new StringBuilder();
		for (int i = 0; i < n; i++) {
var newVariable_2 = s.length();var newVariable_3 = s.charAt(s.length() - 1);var newVariable_4 = s.length();			if (newVariable_4 == 0 || s.charAt(newVariable_4 - 1) != c[i]) {
var newVariable_5 = s.append(c[i]);			}
		}
var newVariable_6 = s.length();var newVariable_7 = s.charAt(0);		if (0 < s.length() && newVariable_7 == 'Z') {
var newVariable_8 = s.deleteCharAt(0);		}
var newVariable_9 = s.length();var newVariable_10 = s.charAt(s.length() - 1);var newVariable_11 = s.length();		if (0 < newVariable_11 && s.charAt(newVariable_11 - 1) == 'A') {
var newVariable_12 = s.deleteCharAt(s.length() - 1);var newVariable_13 = s.length();			s.deleteCharAt(newVariable_13 - 1);
		}
var newVariable_14 = s.length();		if (0 < newVariable_14) {
			System.out.println(s);
		} else {
			System.out.println(-1);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
var newVariable_15 = System.out.printf("%3d ", a[i][j]);			}
			System.out.println();
		}
		System.out.println("----------------------------" + '\n');
	}

	class MyScanner {
		int read() {
			try {
				return System.in.read();
			} catch (IOException e) {
				throw new InputMismatchException();
			}
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();
			return array;
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
var newVariable_16 = res.appendCodePoint(c);				c = read();
			} while (!isSpaceChar(c));
var newVariable_17 = res.toString();			return newVariable_17;
		}

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
var newVariable_18 = res.appendCodePoint(c);				c = read();
			} while (!isEndline(c));
var newVariable_19 = res.toString();			return newVariable_19;
		}
	}
}