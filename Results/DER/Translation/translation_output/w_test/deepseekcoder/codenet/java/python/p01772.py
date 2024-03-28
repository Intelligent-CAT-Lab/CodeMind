<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
class MyScanner:
    def read(self):
        try:
            return sys.stdin.read(1)
        except:
            raise InputMismatchException()

    def isSpaceChar(self, c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == ''

    def isEndline(self, c):
        return c == '\n' or c == '\r' or c == ''

    def next(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        res = []
        while not self.isSpaceChar(c):
            res.append(c)
            c = self.read()
        return ''.join(res)

class p01772:
    def run(self):
        sc = MyScanner()

        c = sc.next()
        n = len(c)
        s = []
        for i in range(n):
            if c[i] == 'A' or c[i] == 'Z':
                s.append(c[i])
        c = ''.join(s)
        n = len(c)
        s = []
        for i in range(n):
            if not s or s[-1] != c[i]:
                s.append(c[i])
        if s and s[0] == 'Z':
            s = s[1:]
        if s and s[-1] == 'A':
            s = s[:-1]
        if s:
            print(''.join(s))
        else:
            print(-1)

    def main(self):
        self.run()

if __name__ == "__main__":
    p01772().main()
```

Please note that Python does not have a built-in `InputMismatchException`, so you may need to import it from the `exceptions` module. Also, Python's `sys.stdin.read(1)` reads a single character from the standard input, similar to Java's `System.in.read()`. The `isSpaceChar` and `isEndline` methods are used to check if a character is a space, newline, or end of input, respectively. The `next` method reads a string from the standard input until it encounters a space or end of input. The `join` method is used to concatenate a list of characters into a string.
<|EOT|>
