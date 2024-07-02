import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] s = sc.next().toCharArray();

		int cnta = 0, cntb = 0, cntc = 0;
		for (char c : s) {
			if (c == 'a') {
				cnta++;
			} else if (c == 'b') {
				cntb++;
			} else if (c == 'c') {
				cntc++;
			}
		}

		if (Math.abs(cnta - cntb) > 1 || Math.abs(cntb - cntc) > 1 || Math.abs(cntc - cnta) > 1) {
System.out.println("[INST]23;None;Math.abs(cnta - cntb);"+Math.abs(cnta - cntb));
System.out.println("[INST]23;None;Math.abs(cntb - cntc);"+Math.abs(cntb - cntc));
System.out.println("[INST]23;None;Math.abs(cntc - cnta);"+Math.abs(cntc - cnta));
			pr.println("NO");
		} else {
			pr.println("YES");
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

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
System.out.println("[INST]60;ch;br.read();"+ch);
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
System.out.println("[INST]77;None;sb.appendCodePoint(ch);"+sb.appendCodePoint(ch));
				} while (isPrintable(ch = br.read()));
System.out.println("[INST]78;ch;br.read();"+ch);

				return sb.toString();
System.out.println("[INST]80;None;sb.toString();"+sb.toString());
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
System.out.println("[INST]102;fc;br.read();"+fc);
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
System.out.println("[INST]121;ch;br.read();"+ch);

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
System.out.println("[INST]145;fc;br.read();"+fc);
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
System.out.println("[INST]164;ch;br.read();"+ch);

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
System.out.println("[INST]183;ch;br.read();"+ch);
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
System.out.println("[INST]190;None;sb.appendCodePoint(ch);"+sb.appendCodePoint(ch));
				} while (!isCRLF(ch = br.read()));
System.out.println("[INST]191;ch;br.read();"+ch);

				return sb.toString();
System.out.println("[INST]193;None;sb.toString();"+sb.toString());
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
		Printer(PrintStream out) {
			super(out);
		}
	}
}
