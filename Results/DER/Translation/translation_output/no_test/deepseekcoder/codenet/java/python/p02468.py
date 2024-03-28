<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

class InputReader:
    def __init__(self, input_stream = sys.stdin):
        self.input_stream = input_stream
        self.tokens = None

    def next_string(self):
        while True:
            if not self.tokens:
                self.tokens = self.input_stream.readline().split()
            if self.tokens:
                return self.tokens.pop(0)

    def next_int(self):
        return int(self.next_string())

    def next_long(self):
        return long(self.next_string())

    def next_double(self):
        return float(self.next_string())

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]


class TaskX:
    def solve(self, test_number, in_reader, out_writer):
        m = in_reader.next_int()
        n = in_reader.next_int()
        out_writer.write(str(self.power(m, n, 1000000007)) + '\n')

    @staticmethod
    def power(a, e, mod):
        ret = 1
        for _ in range(e):
            if e % 2 != 0:
                ret = (ret * a) % mod
            a = (a * a) % mod
        return ret


def main():
    input_reader = InputReader()
    out_writer = sys.stdout
    TaskX().solve(1, input_reader, out_writer)
    out_writer.close()


if __name__ == '__main__':
    main()
```
<|EOT|>
