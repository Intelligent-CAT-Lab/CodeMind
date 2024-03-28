Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1 2

Expected output:
0 0
0 2
2 0
2 2


```
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class p03334 {

	static void solve() throws Exception {
		int n = scanInt();
		int d1 = scanInt();
		int d2 = scanInt();
		int d1s = 0, d2s = 0;
		while ((d1 & 3) == 0) {
			++d1s;
			d1 >>= 2;
		}
		while ((d2 & 3) == 0) {
			++d2s;
			d2 >>= 2;
		}
		int need = n * n;
		for (int i = 0; i < 2 * n; i++) {
			for (int j = 0; j < 2 * n; j++) {
				if ((d1 & 3) == 1 && (((i >> d1s) ^ (j >> d1s)) & 1)!= 0) {
					continue;
				}
				if ((d1 & 3) == 2 && ((i >> d1s) & 1)!= 0) {
					continue;
				}
				if ((d2 & 3) == 1 && (((i >> d2s) ^ (j >> d2s)) & 1)!= 0) {
					continue;
				}
				if ((d2 & 3) == 2 && ((i >> d2s) & 1)!= 0) {
					continue;
				}
				out.println(i + " " + j);
				if (--need == 0) {
					return;
				}
			}
		}
		throw new AssertionError();
	}

	static int scanInt() throws IOException {
		return parseInt(scanString());
	}

	static long scanLong() throws IOException {
		return parseLong(scanString());
	}

	static String scanString() throws IOException {
		while (tok == null ||!tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	public static void main(String[] args) {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			solve();
			in.close();
			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
			exit(1);
		}
	}
}
```

### Response:
```python
import sys

def solve():
    n = int(input())
    d1 = int(input())
    d2 = int(input())
    d1s = 0
    d2s = 0
    while d1 % 4 == 0:
        d1s += 1
        d1 //= 4
    while d2 % 4 == 0:
        d2s += 1
        d2 //= 4
    need = n * n
    for i in range(2 * n):
        for j in range(2 * n):
            if d1 % 4 == 1 and ((i >> d1s) ^ (j >> d1s)) % 2!= 0:
                continue
            if d1 % 4 == 2 and (i >> d1s) % 2!= 0:
                continue
            if d2 % 4 == 1 and ((i >> d2s) ^ (j >> d2s)) % 2!= 0:
                continue
            if d2 % 4 == 2 and (i >> d2s) % 2!= 0:
                continue
            print(i, j)
            need -= 1
            if need == 0:
                return

def main():
    try:
        solve()
    except Exception as e:
        print(e)
        sys.exit(1)

if __name__ == '__main__':
    main()
```<|endoftext|>
