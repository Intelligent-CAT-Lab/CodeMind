import java.io.*;
import java.util.*;

public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		pr.println(Euler.totient((long)n));
	}

	static class Euler {
		private int[] phi;

		Euler(int n) {
			phi = new int[n];
			for (int i = 1; i <= n; i++) {
				phi[i - 1] = i;
			}

			for (int i = 2; i <= n; i++) {
				if (phi[i - 1] == i) {
					for (int j = i; j <= n; j += i) {
						phi[j - 1] = phi[j - 1] / i * (i - 1);
					}
				}
			}
		}

		int totient(int n) {
			return phi[n - 1];
		}

		static long totient(long n) {
			long i = n;
			long phi = n;
			if (i % 2 == 0) {
				phi = phi / 2;
				while (i % 2 == 0) {
					i /= 2;
				}
			}
			if (i % 3 == 0) {
				phi = phi / 3 * 2;
				while (i % 3 == 0) {
					i /= 3;
				}
			}
			for (long j = 1; true; j++) {
				long tmp = j * 6 - 1;
				if (tmp * tmp > n) {
					break;
				}
				if (i % tmp == 0) {
					phi = phi / tmp * (tmp - 1);
					while (i % tmp == 0) {
						i /= tmp;
					}
				}

				tmp = j * 6 + 1;
				if (tmp * tmp > n) {
					break;
				}
				if (i % tmp == 0) {
					phi = phi / tmp * (tmp - 1);
					while (i % tmp == 0) {
						i /= tmp;
					}
				}
			}
			if (i != 1) {
				phi = phi / i * (i - 1);
			}

//			long phi = n;
//			for (long e : hs) {
//				phi /= e;
//				phi *= (e - 1);
//			}

			return phi;
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(INPUT == null ? System.in : new ByteArrayInputStream(INPUT.getBytes()));
		pr = new Printer(System.out);

		solve();

//		pr.close();
		pr.flush();
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
				} while (isPrintable(ch = br.read()));

				return sb.toString();
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
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (!isCRLF(ch = br.read()));

				return sb.toString();
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

