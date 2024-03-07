<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class p04030 {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		String s = sc.next();
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'B') {
				t += s.substring(i, i + 1);
			} else if (t.equals("")) {
				continue;
			} else {
				t = t.substring(0, t.length() - 1);
			}
		}
		System.out.println(t);

	}

	//ä»¥ä¸ãèªä½ã©ã¤ãã©ãª

	//éä¹
	public static int fact(int n) {
		if (n == 1 || n == 0)
			return 1;
		else
			return n * fact(n - 1);
	}

	//æå®ããå¤ä»¥ä¸ã®è¦ç´ ãæåã«ç¾ããä½ç½®
	//è¦ç´ ã®æ°ã¯+1ï¼éåã®ãºã¬)
	public static long lowerBound(int n, long[] x, long y) {
		int left = 0;
		int right = n;
		while (left < right) {
			int mid = (left + right) / 2;
			if (x[mid] < y) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return left;
	}

	//æå®ããå¤ããå¤§ããè¦ç´ ãæåã«ç¾ããä½ç½®
	//è¦ç´ ã®æ°ã¯+1ï¼éåã®ãºã¬)
	public static long upperBound(int n, long[] x, long y) {
		int left = 0;
		int right = n;
		while (left < right) {
			int mid = (left + right) / 2;
			if (x[mid] <= y) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return left;
	}

	//æå¤§å¬ç´æ°
	public static long gcd(long a, long b) {
		if (a < b)
			return gcd(b, a);
		long c = 0;
		c = a % b;
		if (c == 0)
			return b;
		return gcd(b, c);
	}

	//æå°å¬åæ°
	public static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}

	//ç´ æ°å¤å®
	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;

		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}

//ä»¥ä¸ãé«éã¹ã­ã£ãã¼ã¯ã©ã¹
class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}

	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

class FastScanner:
    def __init__(self, file=sys.stdin):
        self.file = file
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buflen
