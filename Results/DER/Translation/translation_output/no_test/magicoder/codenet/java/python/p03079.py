<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
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

```

@@ Response
```python
import sys

class FastScanner:
    def __init__(self):
        self.st = None
        self.reader = sys.stdin

    def next(self):
        if self.st is None or not self.st.strip():
            self.st = self.reader.readline()
        return self.st

    def nextInt(self):
        return int(self.next())

    def nextLine(self):
        self.st = None
        return self.reader.readline()

    def nextIntArr(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLongArr(self, n):
        return [self.nextLong() for _ in range(n)]

    def nextLong(self):
        return long(self.next())


def solve():
    fs = FastScanner()
    a = fs.nextInt()
    b = fs.nextInt()
    c = fs.nextInt()

    if a == b == c:
        print("Yes")
    else:
        print("No")


if __name__ == "__main__":
    solve()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, and then checks if they are all equal. If they are, it prints "Yes"; otherwise, it prints "No".<｜end▁of▁sentence｜>
