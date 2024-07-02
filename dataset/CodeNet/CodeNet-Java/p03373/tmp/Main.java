import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= Math.max(x, y); i++) {
System.out.println("[INST]17;None;Math.max(x, y);"+Math.max(x, y));
			int tmp = a * (Math.max(0, x - i)) + b * (Math.max(0, y - i)) + c * i * 2;
System.out.println("[INST]18;None;Math.max(0, x - i);"+Math.max(0, x - i));
System.out.println("[INST]18;None;Math.max(0, y - i);"+Math.max(0, y - i));
			min = Math.min(min, tmp);
System.out.println("[INST]19;min;Math.min(min, tmp);"+min);
		}

		pr.println(min);
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(INPUT == null ? System.in : new ByteArrayInputStream(INPUT.getBytes()));
System.out.println("[INST]27;None;INPUT.getBytes();"+INPUT.getBytes());
		pr = new Printer(System.out);

		solve();

//		pr.close();
		pr.flush();
System.out.println("[INST]33;None;pr.flush();"+pr.flush());
//		sc.close();
	}

	static String INPUT = null;

	@SuppressWarnings("unused")
	private static class Scanner {
		BufferedReader br;

		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}

		private boolean isPrintable(int ch) {
			return ch >= '!' && ch <= '~';
		}

		private boolean isCRLF(int ch) {
			return ch == '\n' || ch == '\r' || ch == -1;
		}

		private int nextPrintable() {
			try {
				int ch;
				while (!isPrintable(ch = br.read())) {
System.out.println("[INST]58;ch;br.read();"+ch);
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}

				return ch;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		String next() {
			try {
				int ch = nextPrintable();
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
System.out.println("[INST]75;None;sb.appendCodePoint(ch);"+sb.appendCodePoint(ch));
				} while (isPrintable(ch = br.read()));
System.out.println("[INST]76;ch;br.read();"+ch);

				return sb.toString();
System.out.println("[INST]78;None;sb.toString();"+sb.toString());
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		int nextInt() {
			try {
				// parseInt from Integer.parseInt()
				boolean negative = false;
				int res = 0;
				int limit = -Integer.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Integer.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
System.out.println("[INST]100;fc;br.read();"+fc);
				}
				int multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));
System.out.println("[INST]119;ch;br.read();"+ch);

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		long nextLong() {
			try {
				// parseLong from Long.parseLong()
				boolean negative = false;
				long res = 0;
				long limit = -Long.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Long.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
System.out.println("[INST]143;fc;br.read();"+fc);
				}
				long multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));
System.out.println("[INST]162;ch;br.read();"+ch);

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		float nextFloat() {
			return Float.parseFloat(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			try {
				int ch;
				while (isCRLF(ch = br.read())) {
System.out.println("[INST]181;ch;br.read();"+ch);
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
System.out.println("[INST]188;None;sb.appendCodePoint(ch);"+sb.appendCodePoint(ch));
				} while (!isCRLF(ch = br.read()));
System.out.println("[INST]189;ch;br.read();"+ch);

				return sb.toString();
System.out.println("[INST]191;None;sb.toString();"+sb.toString());
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new NoSuchElementException();
			}
		}
	}

	private static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
