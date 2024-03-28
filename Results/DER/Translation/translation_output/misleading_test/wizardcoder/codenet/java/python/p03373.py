Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1500 2000 1600 3 2

Expected output:
7878

```
import java.io.*;
import java.util.*;


public class p03373 {

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
			int tmp = a * (Math.max(0, x - i)) + b * (Math.max(0, y - i)) + c * i * 2;
			min = Math.min(min, tmp);
		}

		pr.println(min);
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(INPUT == null? System.in : new ByteArrayInputStream(INPUT.getBytes()));
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
					} else if (fc!= '+') {
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

				return negative? res : -res;
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
					} else if (fc!= '+') {
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

				return negative? res : -res;
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

```

### Response:
Here's the Python code for the given Java code:

```python
import java.io.*;
import java.util.*;

class p03373:
    def __init__(self):
        self.sc = Scanner(System.in)
        self.pr = Printer(System.out)

    def solve(self):
        a = self.sc.nextInt()
        b = self.sc.nextInt()
        c = self.sc.nextInt()
        x = self.sc.nextInt()
        y = self.sc.nextInt()

        min = float('inf')
        for i in range(max(x, y) + 1):
            tmp = a * max(0, x - i) + b * max(0, y - i) + c * i * 2
            min = min(min, tmp)

        self.pr.println(min)

    def __del__(self):
        self.sc.close()
        self.pr.close()

class Scanner:
    def __init__(self, in_stream):
        self.br = BufferedReader(InputStreamReader(in_stream))

    def is_printable(self, ch):
        return ch >= '!' and ch <= '~'

    def is_crlf(self, ch):
        return ch == '\n' or ch == '\r' or ch == -1

    def next_printable(self):
        try:
            ch = self.br.read()
            while not self.is_printable(ch):
                if ch == -1:
                    raise NoSuchElementException()
                ch = self.br.read()
            return ch
        except IOException as e:
            raise NoSuchElementException()

    def next(self):
        try:
            ch = self.next_printable()
            sb = StringBuilder()
            while self.is_printable(ch):
                sb.appendCodePoint(ch)
                ch = self.br.read()
            return sb.toString()
        except IOException as e:
            raise NoSuchElementException()

    def next_int(self):
        try:
            # parseInt from Integer.parseInt()
            negative = False
            res = 0
            limit = -Integer.MAX_VALUE
            radix = 10

            fc = self.next_printable()
            if fc < '0':
                if fc == '-':
                    negative = True
                    limit = Integer.MIN_VALUE
                elif fc!= '+':
                    raise NumberFormatException()
                fc = self.br.read()
            multmin = limit // radix

            ch = fc
            while self.is_printable(ch):
                digit = ch - '0'
                if digit < 0 or digit >= radix:
                    raise NumberFormatException()
                if res < multmin:
                    raise NumberFormatException()
                res *= radix
                if res < limit
