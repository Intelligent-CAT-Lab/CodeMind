<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
AIZUNYANPEROPERO

Expected output:
AZ


```
import java.io.IOException;
import java.util.InputMismatchException;

public class p01772 {
	void run() {
		MyScanner sc = new MyScanner();

		char[] c = sc.next().toCharArray();
		int n = c.length;
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (c[i] == 'A' || c[i] == 'Z') {
				s.append(c[i]);
			}
		}
		c = s.toString().toCharArray();
		n = c.length;
		s = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (s.length() == 0 || s.charAt(s.length() - 1) != c[i]) {
				s.append(c[i]);
			}
		}
		if (0 < s.length() && s.charAt(0) == 'Z') {
			s.deleteCharAt(0);
		}
		if (0 < s.length() && s.charAt(s.length() - 1) == 'A') {
			s.deleteCharAt(s.length() - 1);
		}
		if (0 < s.length()) {
			System.out.println(s);
		} else {
			System.out.println(-1);
		}
	}

	public static void main(String[] args) {
		new p01772().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------" + '\n');
	}

	class MyScanner {
		int read() {
			try {
				return System.in.read();
			} catch (IOException e) {
				throw new InputMismatchException();
			}
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();
			return array;
		}

		String next() {
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

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}
```
[/INST]
```python
def run():
    sc = MyScanner()
    c = sc.next().tochar()
    n = len(c)
    s = ""
    for i in range(n):
        if c[i] == 'A' or c[i] == 'Z':
            s += c[i]
    c = s.tochar()
    n = len(c)
    s = ""
    for i in range(n):
        if s == "" or s[-1] != c[i]:
            s += c[i]
    if len(s) > 0 and s[0] == 'Z':
        s = s[1:]
    if len(s) > 0 and s[-1] == 'A':
        s = s[:-1]
    if len(s) > 0:
        print(s)
    else:
        print(-1)


def main():
    run()


class MyScanner:
    def read(self):
        try:
            return sys.stdin.read()
        except IOError:
            raise InputMismatchException()

    def isspacechar(self, c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

    def isendline(self, c):
        return c == '\n' or c == '\r' or c == -1

    def nextint(self):
        return int(self.next())

    def nextintarray(self, n):
        array = [0] * n
        for i in range(n):
            array[i] = self.nextint()
        return array

    def nextlong(self):
        return long(self.next())

    def nextlongarray(self, n):
        array = [0] * n
        for i in range(n):
            array[i] = self.nextlong()
        return array

    def nextdouble(self):
        return float(self.next())

    def nextdoublearray(self, n):
        array = [0] * n
        for i in range(n):
            array[i] = self.nextdouble()
        return array

    def next(self):
        c = self.read()
        while self.isspacechar(c):
            c = self.read()
        res = ""
        do:
            res += chr(c)
            c = self.read()
        while not self.isspacechar(c)
        return res

    def nextstringarray(self, n):
        array = []
        for i in range(n):
            array.append(self.next())
        return array

    def nextline(self):
        c = self.read()
        while self.isendline(c):
            c = self.read()
        res = ""
        do:
            res += chr(c)
            c = self.read()
       
