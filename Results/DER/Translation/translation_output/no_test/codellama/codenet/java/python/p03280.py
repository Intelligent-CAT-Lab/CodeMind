<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:


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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

class FastReader:
    def __init__(self):
        self.br = sys.stdin
        self.st = None

    def next(self):
        while self.st is None or not self.st.hasMoreElements():
            try:
                self.st = sys.stdin.readline()
            except IOError:
                pass
        return self.st.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        str = ""
        try:
            str = sys.stdin.readline()
        except IOError:
            pass
        return str

def main():
    sc = FastReader()
    out = sys.stdout
    k = sc.nextInt() - 1
    b = sc.nextInt() - 1

    out.write(str(k * b) + "\n")
    out.flush()

if __name__ == "__main__":
    main()
```
This is the equivalent Python code for the given Java code. The `FastReader` class is used to read input from the standard input stream, and the `main` function is used to read the input and print the output. The `nextInt`, `nextLong`, `nextDouble`, and `nextLine` methods are used to read the input and convert it to the appropriate data type. The `flush` method is used to flush the output buffer.</s>
