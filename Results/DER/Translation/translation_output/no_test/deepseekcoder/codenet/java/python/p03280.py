<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class p03280 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int k = sc.nextInt()-1;
		int b = sc.nextInt()-1;

		out.println(k*b);
		out.flush();

	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}

```

### Response:
```python
import sys

class FastReader:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        return self.br.readline().rstrip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.next()


def main():
    sc = FastReader()
    k = sc.next_int()-1
    b = sc.next_int()-1
    print(k*b)


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, subtracts 1 from each, and then prints the product of the two results. The FastReader class is a Python equivalent of the FastReader class in the Java code, which provides methods for reading different types of input from the standard input. The main function uses an instance of FastReader to read the input and print the result.
<|EOT|>
