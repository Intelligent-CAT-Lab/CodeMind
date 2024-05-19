System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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
			if (st == null ||!st.hasMoreElements()) {
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


Answer:
```python
import math

class FastScanner:
    def __init__(self):
        self.st = None
        self.reader = None

    def next(self):
        if self.st is None or not self.st.hasMoreElements():
            self.st = StringTokenizer(self.reader.readLine())
        return self.st.nextToken()

    def next_line(self):
        self.st = None
        read_line = None
        read_line = self.reader.readLine()
        return read_line

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_int_arr(self, n):
        ret_arr = []
        for i in range(n):
            ret_arr.append(self.next_int())
        return ret_arr

    def next_long_arr(self, n):
        ret_arr = []
        for i in range(n):
            ret_arr.append(self.next_long())
        return ret_arr

    def close(self):
        self.reader.close()

def pow(base, n):
    retVal = 1
    while n > 0:
        if (n & 1) == 1:
            retVal *= base
        n >>= 1
        base *= base
    return retVal

def main():
    fs = FastScanner()
    x = fs.next_int()

    pow_map = {0: 0, 1: 1}
    before_pow = 1
    base = 2
    while True:
        pow_val = pow(base, 5)
        pow_map[pow_val] = base
        if pow_val - before_pow > x:
            break
        base += 1
        before_pow = pow_val

    for pow_val, base in pow_map.items():
        diff = abs(x - pow_val)
        if diff in pow_map:
            print(base, end=' ')
            if pow_val - x < 0:
                print('-', end=' ')
            print(pow_map[diff])
            fs.close()
            return

if __name__ == '__main__':
    main()
```<|endoftext|>
