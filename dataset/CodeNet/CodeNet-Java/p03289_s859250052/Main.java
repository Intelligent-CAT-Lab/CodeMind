import java.io.*;
import java.math.*;
import java.util.*;

import static java.util.Arrays.fill;
import static java.lang.Math.*;
import static java.util.Arrays.sort;
import static java.util.Collections.sort;

public class Main {

	public static int mod = 1000000007;
	public static long INF = (1L << 60);
	static FastScanner2 in = new FastScanner2();
	static OutputWriter out = new OutputWriter(System.out);

	public static void main(String[] args) {

		char[] a=in.nextLine().toCharArray();
		if(a[0]!='A')
		{
			System.out.println("WA");
			return;
		}
		boolean b=true;
		if(a[0]=='C'||a[1]=='C'||a[a.length-1]=='C')
		{
			b=false;
		}
		int c=0;
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]=='A'||(a[i]>='A'&&a[i]<='Z'&&a[i]!='C'))
			{
				b=false;
			}
			if(a[i]=='C')
				c++;
		}
		if(c>1||c==0)
			b=false;
		if(b)
		{
			System.out.println("AC");
		}
		else
		{
			System.out.println("WA");
		}
		out.close();

	}

	static class FastScanner2 {
		private byte[] buf = new byte[1024];
		private int curChar;
		private int snumChars;

		public int read() {
			if (snumChars == -1)
				throw new InputMismatchException();
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = System.in.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (snumChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public String nextLine() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndOfLine(c));
			return res.toString();
		}

		public String nextString() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public long nextLong() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int[] nextIntArray(int n) {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextInt();
			}
			return arr;
		}

		public long[] nextLongArray(int n) {
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextLong();
			}
			return arr;
		}

		private boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		private boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream inputstream) {
			reader = new BufferedReader(new InputStreamReader(inputstream));
			tokenizer = null;
		}

		public String nextLine() {
			String fullLine = null;
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					fullLine = reader.readLine();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
				return fullLine;
			}
			return fullLine;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int[] nextIntArray(int n) {
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = nextInt();
			}
			return a;
		}

		public long[] nextLongArray(int n) {
			long a[] = new long[n];
			for (int i = 0; i < n; i++) {
				a[i] = nextLong();
			}
			return a;
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}
	}

	static class OutputWriter {
		private final PrintWriter writer;

		public OutputWriter(OutputStream outputStream) {
			writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
		}

		public OutputWriter(Writer writer) {
			this.writer = new PrintWriter(writer);
		}

		public void print(Object... objects) {
			for (int i = 0; i < objects.length; i++) {
				if (i != 0)
					writer.print(' ');
				writer.print(objects[i]);
			}
		}

		public void println(Object... objects) {
			print(objects);
			writer.println();
		}

		public void close() {
			writer.close();
		}

		public void flush() {
			writer.flush();
		}
	}

	private static boolean oj = System.getProperty("ONLINE_JUDGE") != null;

	private static void debug(Object... o) {
		if (!oj)
			System.out.println(Arrays.deepToString(o));
	}

	private static void tr(Object... o) {
		if (!oj)
			System.out.println(Arrays.deepToString(o));
	}
}


