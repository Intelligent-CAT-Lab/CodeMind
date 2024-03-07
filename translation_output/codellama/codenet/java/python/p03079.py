<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03079 {
	public static void main(String[] args) throws IOException {
		p03079 mainObj = new p03079();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int a = fs.nextInt();
		int b = fs.nextInt();
		int c = fs.nextInt();
		
		if(a == b && b == c) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	

	public class FastScanner {

		BufferedReader reader;
		private StringTokenizer st;

		public FastScanner() {
			st = null;
			reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() throws IOException {
			if (st == null || !st.hasMoreElements()) {
				st = new StringTokenizer(reader.readLine());
			}
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			st = null;
			String readLine = null;
			readLine = reader.readLine();
			return readLine;
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		public int[] nextIntArr(int n) throws NumberFormatException, IOException {
			int[] retArr = new int[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextInt();
			}
			return retArr;
		}

		public long[] nextLongArr(int n) throws NumberFormatException, IOException {
			long[] retArr = new long[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextLong();
			}
			return retArr;
		}

		public void close() throws IOException {
			reader.close();
		}
	}


}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

class FastScanner:
    def __init__(self):
        self.reader = sys.stdin
        self.st = None

    def next(self):
        if self.st is None or not self.st.hasMoreElements():
            self.st = sys.stdin.readline()
        return self.st.nextToken()

    def nextLine(self):
        self.st = None
        return sys.stdin.readline()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextIntArr(self, n):
        retArr = [0] * n
        for i in range(n):
            retArr[i] = self.nextInt()
        return retArr

    def nextLongArr(self, n):
        retArr = [0] * n
        for i in range(n):
            retArr[i] = self.nextLong()
        return retArr

    def close(self):
        self.reader.close()

class p03079:
    def __init__(self):
        self.fastScanner = FastScanner()

    def solve(self):
        a = self.fastScanner.nextInt()
        b = self.fastScanner.nextInt()
        c = self.fastScanner.nextInt()

        if a == b and b == c:
            print("Yes")
        else:
            print("No")

if __name__ == "__main__":
    p03079().solve()
```
This is the Python code equivalent to the Java code you provided. It uses the `FastScanner` class to read input from the standard input stream, and the `p03079` class to solve the problem. The `solve` method reads the input, checks if the three numbers are equal, and prints "Yes" or "No" accordingly.</s>
