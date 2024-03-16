<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

class FastScanner:
    def __init__(self, input=sys.stdin):
        self.input = input
        self.buffer = []

    def next(self):
        if not self.buffer:
            self.buffer = self.input.readline().split()
        return self.buffer.pop(0)

    def next_int(self):
        return int(self.next())

    def next_line(self):
        return self.input.readline().rstrip('\n')


class p03079:
    def solve(self):
        fs = FastScanner()
        a = fs.next_int()
        b = fs.next_int()
        c = fs.next_int()

        if a == b == c:
            print("Yes")
        else:
            print("No")


if __name__ == "__main__":
    main_obj = p03079()
    main_obj.solve()
```
<|EOT|>
