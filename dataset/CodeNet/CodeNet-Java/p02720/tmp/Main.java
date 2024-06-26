import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		FasterScanner sc = new FasterScanner(System.in);

		int k = sc.nextInt();
		LinkedList<Long> list = new LinkedList<Long>();
		for (long i = 1; i <= 9; i++) {
			list.add(i);
System.out.println("[INST]16;None;list.add(i);"+list.add(i));
		}
		long val = -1;
		while(k > 0) {
			val = list.getFirst();
System.out.println("[INST]20;val;list.getFirst();"+val);
			list.removeFirst();
System.out.println("[INST]21;None;list.removeFirst();"+list.removeFirst());
			if (val % 10 != 0) {
				list.add(10*val + val%10 - 1);
System.out.println("[INST]23;None;list.add(10*val + val%10 - 1);"+list.add(10*val + val%10 - 1));
			}
			list.add(10*val + val%10);
System.out.println("[INST]25;None;list.add(10*val + val%10);"+list.add(10*val + val%10));
			if (val % 10 != 9) {
				list.add(10*val + val%10 + 1);
System.out.println("[INST]27;None;list.add(10*val + val%10 + 1);"+list.add(10*val + val%10 + 1));
			}
			k--;
		}
		System.out.println(val);
				
		sc.close();
	}
	
	class FasterScanner {
		private InputStream mIs;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FasterScanner() {
			this(System.in);
		}

		public FasterScanner(InputStream is) {
			mIs = is;
		}

		public int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = mIs.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
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
System.out.println("[INST]72;None;res.appendCodePoint(c);"+res.appendCodePoint(c));
				c = read();
			} while (!isEndOfLine(c));
			return res.toString();
System.out.println("[INST]75;None;res.toString();"+res.toString());
		}

		public String nextString() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
System.out.println("[INST]84;None;res.appendCodePoint(c);"+res.appendCodePoint(c));
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
System.out.println("[INST]87;None;res.toString();"+res.toString());
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

		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		public void close() {
			try {
				mIs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
