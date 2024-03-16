Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
			if (s.length() == 0 || s.charAt(s.length() - 1)!= c[i]) {
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
			return c =='' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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
import java.io.IOException;
import java.util.InputMismatchException;

class p01772:
    def run(self):
        sc = MyScanner()

        c = sc.next().toCharArray()
        n = len(c)
        s = ''
        for i in range(n):
            if c[i] == 'A' or c[i] == 'Z':
                s += c[i]
        c = s.toCharArray()
        n = len(c)
        s = ''
        for i in range(n):
            if len(s) == 0 or s[-1]!= c[i]:
                s += c[i]
        if len(s) > 0 and s[0] == 'Z':
            s = s[1:]
        if len(s) > 0 and s[-1] == 'A':
            s = s[:-1]
        if len(s) > 0:
            print(s)
        else:
            print(-1)

    def mapDebug(self, a):
        print("--------map display---------")
        for i in range(len(a)):
            for j in range(len(a[i])):
                print("{:3d}".format(a[i][j]), end=' ')
            print()
        print("----------------------------\n")

class MyScanner:
    def read(self):
        try:
            return System.in.read()
        except IOException as e:
            raise InputMismatchException()

    def isSpaceChar(self, c):
        return c =='' or c == '\n' or c == '\r' or c == '\t' or c == -1

    def isEndline(self, c):
        return c == '\n' or c == '\r' or c == -1

    def nextInt(self):
        return int(self.next())

    def nextIntArray(self, n):
        array = [0] * n
        for i in range(n):
            array[i] = self.nextInt()
        return array

    def nextLong(self):
        return long(self.next())

    def nextLongArray(self, n):
        array = [0] * n
        for i in range(n):
            array[i] = self.nextLong()
        return array

    def nextDouble(self):
        return float(self.next())

    def nextDoubleArray(self, n):
        array = [0.0] * n
        for i in range(n):
            array[i] = self.nextDouble()
        return array

    def next(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        res = ''
        while not self.isSpaceChar(c):
            res += chr(c)
            c = self.read()
        return res

    def nextStringArray(self, n):
        array = [''] * n
        for i in range(n):
            array[i] = self.next()
        return array

    def nextLine(self):
        c = self.read()
        while self.isEndline(c):
            c = self.read()
        res = ''
        while not self.isEndline(c):
            res += chr(c)
            c = self.read()
        return res

if __name__ == '__main__':
    p01772().run()
```<|endoftext|>
