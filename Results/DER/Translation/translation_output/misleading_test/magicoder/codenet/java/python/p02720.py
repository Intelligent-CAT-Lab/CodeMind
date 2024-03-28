<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
15

Expected output:
-65

```
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.LinkedList;

public class p02720 {
	public static void main(String[] args) {
		new p02720();
	}

	public p02720() {
		FasterScanner sc = new FasterScanner(System.in);

		int k = sc.nextInt();
		LinkedList<Long> list = new LinkedList<Long>();
		for (long i = 1; i <= 9; i++) {
			list.add(i);
		}
		long val = -1;
		while(k > 0) {
			val = list.getFirst();
			list.removeFirst();
			if (val % 10 != 0) {
				list.add(10*val + val%10 - 1);
			}
			list.add(10*val + val%10);
			if (val % 10 != 9) {
				list.add(10*val + val%10 + 1);
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

```

@@ Response
```python
import sys

class FasterScanner:
    def __init__(self, is_):
        self.is_ = is_
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == -1:
            raise ValueError("No more data")
        if self.curChar >= self.numChars:
            self.curChar = 0
            self.numChars = self.is_.readinto(self.buf)
            if self.numChars <= 0:
                return -1
        return self.buf[self.curChar]

    def next_line(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        res = []
        while not self.is_end_of_line(c):
            res.append(chr(c))
            c = self.read()
        return ''.join(res)

    def next_string(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        res = []
        while not self.is_space_char(c):
            res.append(chr(c))
            c = self.read()
        return ''.join(res)

    def next_long(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        sgn = 1
        if c == ord('-'):
            sgn = -1
            c = self.read()
        res = 0
        while not self.is_space_char(c):
            if c < ord('0') or c > ord('9'):
                raise ValueError("Invalid input")
            res *= 10
            res += c - ord('0')
            c = self.read()
        return res * sgn

    def next_int(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        sgn = 1
        if c == ord('-'):
            sgn = -1
            c = self.read()
        res = 0
        while not self.is_space_char(c):
            if c < ord('0') or c > ord('9'):
                raise ValueError("Invalid input")
            res *= 10
            res += c - ord('0')
            c = self.read()
        return res * sgn

    def is_space_char(self, c):
        return c == ord(' ') or c == ord('\n') or c == ord('\r') or c == ord('\t') or c == -1

    def is_end_of_line(self, c):
        return c == ord('\n') or c == ord('\r') or c == -1

    def close(self):
        self.is_.close()


def main():
    sc = FasterScanner(sys.stdin)

    k = sc.next_int()
    list_ = [i for i in range(1, 10)]
    val = -1
    while k > 0:
        val = list_.pop(0)
        if val % 10 != 0:
