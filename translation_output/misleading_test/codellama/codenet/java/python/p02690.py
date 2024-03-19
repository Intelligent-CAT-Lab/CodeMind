<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
33

Expected output:
-1

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class p02690 {
	
	long maxDiff = 1_000_000_000;

	public static void main(String[] args) throws IOException {
		p02690 mainObj = new p02690();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int x = fs.nextInt();
		
		HashMap<Long, Integer> powMap = new HashMap<>();
		powMap.put(0L, 0);
		powMap.put(1L, 1);
		
		long beforePow = 1;
		long base = 2;
		while(true) {
			long powVal = pow(base, 5);
			powMap.put(powVal, (int)base);
			if(powVal - beforePow > x) {
				break;
			}
			base++;
			beforePow = powVal;
		}
		
		for(Map.Entry<Long, Integer> mapEntry : powMap.entrySet()) {
			long powVal = mapEntry.getKey();
			
			long diff = Math.abs(x - powVal);
			if(powMap.containsKey(diff)) {
				System.out.print(powMap.get(powVal));
				if(powVal - x < 0) {
					System.out.print(" -"+powMap.get(diff));
				}else {
					System.out.print(" "+powMap.get(diff));
				}
				System.out.print("\n");
				return;
			}
		}
		
	}

	public long pow(long base, int n) {
		long retVal = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				retVal *= base;
			}
			n >>= 1;
			base *= base;
		}
		return retVal;
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
[/INST]

Here is the Python code that translates the Java code:
```python
import math

class FastScanner:
    def __init__(self):
        self.reader = open("input.txt", "r")
        self.st = None

    def next(self):
        if self.st is None or not self.st.hasMoreElements():
            self.st = StringTokenizer(self.reader.readline())
        return self.st.nextToken()

    def nextLine(self):
        self.st = None
        return self.reader.readline()

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

class p02690:
    def __init__(self):
        self.maxDiff = 1000000000

    def solve(self):
        fs = FastScanner()
        x = fs.nextInt()

        powMap = {}
        powMap[0] = 0
        powMap[1] = 1

        beforePow = 1
        base = 2
        while True:
            powVal = pow(base, 5)
            powMap[powVal] = base
            if powVal - beforePow > x:
                break
            base += 1
            beforePow = powVal

        for powVal, base in powMap.items():
            diff = abs(x - powVal)
            if diff in powMap:
                print(base, end="")
                if powVal - x < 0:
                    print(" -", powMap[diff], sep="")
                else:
                    print(" ", powMap[diff], sep="")
                print()
                return

def pow(base, n):
    retVal = 1
    while n > 0:
        if n & 1 == 1:
            retVal *= base
        n >>= 1
        base *= base
    return retVal

if __name__ == "__main__":
    p02690().solve()
```
Note that the `FastScanner` class is not included in the Python standard library, so you will need to define it yourself. Also, the `StringTokenizer` class is not included in the Python standard library, so you will need to define it yourself or use a different method to tokenize the input.</s>
