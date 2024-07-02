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
				s.append(c[i]);
System.out.println("[INST]12;None;s.append(c[i]);"+s.append(c[i]));
			}
		}
		c = s.toString().toCharArray();
System.out.println("[INST]15;c;s.toString().toCharArray();"+c);
System.out.println("[INST]15;None;s.toString();"+s.toString());
		n = c.length;
		s = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (s.length() == 0 || s.charAt(s.length() - 1) != c[i]) {
System.out.println("[INST]19;None;s.length();"+s.length());
System.out.println("[INST]19;None;s.charAt(s.length() - 1);"+s.charAt(s.length() - 1));
System.out.println("[INST]19;None;s.length();"+s.length());
				s.append(c[i]);
System.out.println("[INST]20;None;s.append(c[i]);"+s.append(c[i]));
			}
		}
		if (0 < s.length() && s.charAt(0) == 'Z') {
System.out.println("[INST]23;None;s.length();"+s.length());
System.out.println("[INST]23;None;s.charAt(0);"+s.charAt(0));
			s.deleteCharAt(0);
System.out.println("[INST]24;None;s.deleteCharAt(0);"+s.deleteCharAt(0));
		}
		if (0 < s.length() && s.charAt(s.length() - 1) == 'A') {
System.out.println("[INST]26;None;s.length();"+s.length());
System.out.println("[INST]26;None;s.charAt(s.length() - 1);"+s.charAt(s.length() - 1));
System.out.println("[INST]26;None;s.length();"+s.length());
			s.deleteCharAt(s.length() - 1);
System.out.println("[INST]27;None;s.deleteCharAt(s.length() - 1);"+s.deleteCharAt(s.length() - 1));
System.out.println("[INST]27;None;s.length();"+s.length());
		}
		if (0 < s.length()) {
System.out.println("[INST]29;None;s.length();"+s.length());
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
				System.out.printf("%3d ", a[i][j]);
System.out.println("[INST]44;None;System.out.printf('%3d ', a[i][j]);"+System.out.printf("%3d ", a[i][j]));
			}
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
				res.appendCodePoint(c);
System.out.println("[INST]107;None;res.appendCodePoint(c);"+res.appendCodePoint(c));
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
System.out.println("[INST]110;None;res.toString();"+res.toString());
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
				res.appendCodePoint(c);
System.out.println("[INST]127;None;res.appendCodePoint(c);"+res.appendCodePoint(c));
				c = read();
			} while (!isEndline(c));
			return res.toString();
System.out.println("[INST]130;None;res.toString();"+res.toString());
		}
	}
}