<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

public class p02468 {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 30;
	static int modP = 1000000007;

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int m = in.nextInt();
			int n = in.nextInt();
			out.println(power(m, n, modP));

		}

		static long power(long a, long e, long modP) {
			long ret = 1;
			for (; e > 0; e /= 2) {
				if (e % 2 != 0) {
					ret = (ret * a) % modP;
				}
				a = (a * a) % modP;
			}
			return ret;
		}
	}

	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public double nextDouble() {
			return Double.parseDouble(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}

	}

}


```

@@ Response
```python
import sys

class InputReader:
    def __init__(self, inputStream):
        self.inp = inputStream
        self.tok = None

    def nextString(self):
        while not self.tok:
            self.tok = sys.stdin.readline().split()
        return self.tok.pop(0)

    def nextInt(self):
        return int(self.nextString())

    def nextLong(self):
        return long(self.nextString())

    def nextDouble(self):
        return float(self.nextString())

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

class TaskX:
    def solve(self, testNumber, inp, out):
        m = inp.nextInt()
        n = inp.nextInt()
        out.write(str(self.power(m, n, 1000000007)))

    def power(self, a, e, modP):
        ret = 1
        for _ in range(e):
            if e % 2 != 0:
                ret = (ret * a) % modP
            a = (a * a) % modP
        return ret

if __name__ == "__main__":
    inp = InputReader(sys.stdin)
    out = sys.stdout
    solver = TaskX()
    solver.solve(1, inp, out)
    out.close()
```

This Python code does the same thing as the Java code you provided. It reads two integers from the standard input, calculates the power of the first integer to the second integer modulo 1000000007, and writes the result to the standard output.<｜end▁of▁sentence｜>
