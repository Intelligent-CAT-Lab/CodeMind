<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3

Expected output:
37

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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class InputReader:
    def __init__(self, input_stream):
        self.in = input_stream
        self.tok = None

    def next_string(self):
        while not self.tok.has_more_tokens():
            try:
                self.tok = StringTokenizer(self.in.readline(), " ")
            except IOException:
                raise InputMismatchException()
        return self.tok.next_token()

    def next_int(self):
        return int(self.next_string())

    def next_long(self):
        return long(self.next_string())

    def next_double(self):
        return float(self.next_string())

    def next_int_array(self, n):
        res = [0] * n
        for i in range(n):
            res[i] = self.next_int()
        return res

    def next_long_array(self, n):
        res = [0] * n
        for i in range(n):
            res[i] = self.next_long()
        return res

class TaskX:
    def solve(self, test_number, in, out):
        m = in.next_int()
        n = in.next_int()
        out.println(self.power(m, n, modP))

    def power(self, a, e, modP):
        ret = 1
        for i in range(e):
            if e % 2 != 0:
                ret = (ret * a) % modP
            a = (a * a) % modP
        return ret

if __name__ == "__main__":
    input_stream = sys.stdin
    output_stream = sys.stdout
    in = InputReader(input_stream)
    out = PrintWriter(output_stream)
    solver = TaskX()
    solver.solve(1, in, out)
    out.close()
```
Note that the `InputReader` class is not included in the Python standard library, so you will need to define it yourself. Also, the `StringTokenizer` class is not included in the Python standard library, so you will need to define it yourself or use a different method to tokenize the input.</s>
