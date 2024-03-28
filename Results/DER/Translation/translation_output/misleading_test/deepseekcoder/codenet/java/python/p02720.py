<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

class FasterScanner:
    def __init__(self, is):
        self.mIs = is
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == -1:
            raise Exception("InputMismatchException")
        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.mIs.readinto(self.buf)
            except Exception as e:
                raise Exception("InputMismatchException")
            if self.numChars <= 0:
                return -1
        return self.buf[self.curChar]

    def nextLine(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        res = []
        while not self.isEndOfLine(c):
            res.append(chr(c))
            c = self.read()
        return "".join(res)

    def nextString(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        res = []
        while not self.isSpaceChar(c):
            res.append(chr(c))
            c = self.read()
        return "".join(res)

    def nextLong(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        sgn = 1 if c != '-' else -1
        if c == '-' or c == '+':
            c = self.read()
        res = 0
        while not self.isSpaceChar(c):
            if '0' <= chr(c) <= '9':
                res = res * 10 + ord(chr(c)) - ord('0')
            else:
                raise Exception("InputMismatchException")
            c = self.read()
        return res * sgn

    def nextInt(self):
        return int(self.nextLong())

    def isSpaceChar(self, c):
        return c in [32, 10, 13, 9, -1]

    def isEndOfLine(self, c):
        return c in [10, 13, -1]

    def close(self):
        try:
            self.mIs.close()
        except Exception as e:
            e.printStackTrace()


def main():
    sc = FasterScanner(sys.stdin)
    k = sc.nextInt()
    list = [i for i in range(1, 10)]
    val = -1
    while k > 0:
        val = list.pop(0)
        if val % 10 != 0:
            list.append(10*val + val%10 - 1)
        list.append(10*val + val%10)
        if val % 10 != 9:
            list.append(10*val + val%10 + 1)
        k -= 1
    print(val)
    sc.close()

if __name__ == "__main__":
    main()
```
<|EOT|>
