<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
15

Expected output:
23


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
			if (val % 10!= 0) {
				list.add(10*val + val%10 - 1);
			}
			list.add(10*val + val%10);
			if (val % 10!= 9) {
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
			return c =='' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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

python code:<fim_suffix><fim_middle>

```python
import sys

class Solution:
    def __init__(self):
        self.list = [1,2,3,4,5,6,7,8,9]
        self.k = 0
        self.val = -1

    def main(self):
        self.k = int(sys.stdin.readline())
        self.get_val()
        print(self.val)

    def get_val(self):
        while self.k > 0:
            self.val = self.list[0]
            self.list.remove(self.list[0])
            if self.val % 10!= 0:
                self.list.append(10*self.val + self.val%10 - 1)
            self.list.append(10*self.val + self.val%10)
            if self.val % 10!= 9:
                self.list.append(10*self.val + self.val%10 + 1)
            self.k -= 1

if __name__ == '__main__':
    sol = Solution()
    sol.main()
```
<|endoftext|>
