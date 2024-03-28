<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
AIZUNYANPEROPERO

Expected output:
,AZ

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

Here is the Python code that translates the Java code:
```python
import sys

class MyScanner:
    def __init__(self):
        self.input = sys.stdin.readline()
        self.index = 0

    def read(self):
        if self.index < len(self.input):
            c = self.input[self.index]
            self.index += 1
            return c
        else:
            return -1

    def is_space_char(self, c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

    def is_endline(self, c):
        return c == '\n' or c == '\r' or c == -1

    def next_int(self):
        return int(self.next())

    def next_int_array(self, n):
        array = []
        for i in range(n):
            array.append(self.next_int())
        return array

    def next_long(self):
        return long(self.next())

    def next_long_array(self, n):
        array = []
        for i in range(n):
            array.append(self.next_long())
        return array

    def next_double(self):
        return float(self.next())

    def next_double_array(self, n):
        array = []
        for i in range(n):
            array.append(self.next_double())
        return array

    def next(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        res = ''
        while not self.is_space_char(c):
            res += chr(c)
            c = self.read()
        return res

    def next_string_array(self, n):
        array = []
        for i in range(n):
            array.append(self.next())
        return array

    def next_line(self):
        c = self.read()
        while self.is_endline(c):
            c = self.read()
        res = ''
        while not self.is_endline(c):
            res += chr(c)
            c = self.read()
        return res

def run():
    sc = MyScanner()

    c = sc.next().to_char_array()
    n = len(c)
    s = ''
    for i in range(n):
        if c[i] == 'A' or c[i] == 'Z':
            s += c[i]
    c = s.to_char_array()
    n = len(c)
    s = ''
    for i in range(n):
        if s.length() == 
