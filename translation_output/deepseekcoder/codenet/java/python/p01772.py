<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

class p01772:
    def run(self):
        sc = self.MyScanner()

        c = sc.next()
        n = len(c)
        s = []
        for i in range(n):
            if c[i] == 'A' or c[i] == 'Z':
                s.append(c[i])
        c = "".join(s)
        n = len(c)
        s = []
        for i in range(n):
            if not s or s[-1] != c[i]:
                s.append(c[i])
        if s and s[0] == 'Z':
            s.pop(0)
        if s and s[-1] == 'A':
            s.pop()
        if s:
            print("".join(s))
        else:
            print(-1)

    def main(self):
        self.run()

    def mapDebug(self, a):
        print("--------map display---------")
        for i in range(len(a)):
            for j in range(len(a[i])):
                print("%3d " % a[i][j], end="")
            print()
        print("----------------------------\n")

    class MyScanner:
        def read(self):
            try:
                return sys.stdin.read(1)
            except:
                raise Exception("InputMismatchException")

        def isSpaceChar(self, c):
            return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

        def isEndline(self, c):
            return c == '\n' or c == '\r' or c == -1

        def nextInt(self):
            return int(self.next())

        def nextIntArray(self, n):
            array = [0]*n
            for i in range(n):
                array[i] = self.nextInt()
            return array

        def nextLong(self):
            return long(self.next())

        def nextLongArray(self, n):
            array = [0]*n
            for i in range(n):
                array[i] = self.nextLong()
            return array

        def nextDouble(self):
            return float(self.next())

        def nextDoubleArray(self, n):
            array = [0.0]*n
            for i in range(n):
                array[i] = self.nextDouble()
            return array

        def next(self):
            c = self.read()
            while self.isSpaceChar(ord(c[0])):
                c = self.read()
            res = []
            while not self.isSpaceChar(ord(c[0])):
                res.append(c)
                c = self.read()
            return "".join(res)

        def nextStringArray(self, n):
            array = [""]*n
            for i in range(n):
                array[i] = self.next()
            return array

        def nextLine(self):
            c = self.read()
            while self.isEndline(ord(c[0])):
                c = self.read()
            res = []
            while not self.isEndline(ord(c[0])):
                res.append(c)
                c = self.read()
            return "".join(res)

if __name__ == "__main__":
    p01772().main()
```

Please note that Python
