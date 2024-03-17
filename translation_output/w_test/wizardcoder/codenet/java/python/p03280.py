Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
1


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
			while (st == null ||!st.hasMoreElements()) {
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
        self.buf = sys.stdin.buffer
        self.tokenizer = None

    def readline(self):
        return self.buf.readline().rstrip()

    def read_int(self):
        return int(self.readline())

    def read_ints(self):
        return list(map(int, self.readline().split()))

    def read_long(self):
        return int(self.readline())

    def read_longs(self):
        return list(map(int, self.readline().split()))

    def read_float(self):
        return float(self.readline())

    def read_floats(self):
        return list(map(float, self.readline().split()))

    def read_string(self):
        return self.readline().decode()

    def read_strings(self):
        return self.readline().decode().split()

class FastWriter:
    def __init__(self, file):
        self.file = file

    def write(self, data):
        self.file.write(data)

    def flush(self):
        self.file.flush()

def main():
    sc = FastReader()
    out = FastWriter(sys.stdout.buffer)
    k = sc.read_int() - 1
    b = sc.read_int() - 1
    out.write(str(k * b) + '\n')
    out.flush()

if __name__ == '__main__':
    main()
```<|endoftext|>
