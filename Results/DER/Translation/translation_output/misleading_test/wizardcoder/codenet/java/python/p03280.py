Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
-35

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
        self.buffer = ""
        self.buffer_size = 1024
        self.file = sys.stdin

    def readline(self):
        while True:
            if "\n" in self.buffer:
                pos = self.buffer.find("\n")
                line = self.buffer[:pos]
                self.buffer = self.buffer[pos+1:]
                return line
            else:
                new_buffer = self.file.read(self.buffer_size)
                if not new_buffer:
                    if self.buffer:
                        return self.buffer
                    else:
                        return None
                self.buffer += new_buffer

    def read(self):
        line = self.readline()
        if line:
            return line
        else:
            return None

    def readint(self):
        return int(self.read())

    def readlong(self):
        return long(self.read())

    def readfloat(self):
        return float(self.read())

class p03280:
    def __init__(self):
        self.sc = FastReader()
        self.out = sys.stdout

    def main(self):
        k = self.sc.readint()-1
        b = self.sc.readint()-1

        self.out.write(str(k*b))
        self.out.flush()

if __name__ == '__main__':
    p03280().main()
```<|endoftext|>
