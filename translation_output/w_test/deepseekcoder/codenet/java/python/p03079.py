<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2 2

Expected output:
Yes


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
class FastScanner:
    def __init__(self):
        self.st = None
        self.reader = self._get_reader()

    def _get_reader(self):
        import sys
        import io
        return io.BufferedReader(io.InputStreamReader(sys.stdin))

    async def next(self):
        import io
        if self.st is None or not self.st.hasMoreElements():
            line = await self.reader.readLine()
            self.st = io.StringTokenizer(line)
        return self.st.nextToken()

    async def nextInt(self):
        return int(await self.next())

    async def nextLine(self):
        self.st = None
        return await self.reader.readLine()

    async def nextIntArr(self, n):
        return [await self.nextInt() for _ in range(n)]

    async def nextLongArr(self, n):
        return [await self.nextLong() for _ in range(n)]

    async def close(self):
        await self.reader.close()


class p03079:
    async def solve(self):
        fs = FastScanner()
        a = await fs.nextInt()
        b = await fs.nextInt()
        c = await fs.nextInt()

        if a == b == c:
            print("Yes")
        else:
            print("No")


if __name__ == "__main__":
    import asyncio
    loop = asyncio.get_event_loop()
    mainObj = p03079()
    try:
        loop.run_until_complete(mainObj.solve())
    finally:
        loop.close()
```

Please note that Python's asyncio library is used to handle the IO operations as they are non-blocking. The Java code is translated to Python using asyncio library.
<|EOT|>
