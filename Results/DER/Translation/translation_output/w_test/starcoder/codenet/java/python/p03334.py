<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

def solve():
    n, d1, d2 = map(int, raw_input().split())
    d1s, d2s = 0, 0
    while d1 & 3 == 0:
        d1 >>= 2
        d1s += 1
    while d2 & 3 == 0:
        d2 >>= 2
        d2s += 1
    need = n * n
    for i in xrange(2 * n):
        for j in xrange(2 * n):
            if d1 & 3 == 1 and (((i >> d1s) ^ (j >> d1s)) & 1)!= 0:
                continue
            if d1 & 3 == 2 and (i >> d1s) & 1!= 0:
                continue
            if d2 & 3 == 1 and (((i >> d2s) ^ (j >> d2s)) & 1)!= 0:
                continue
            if d2 & 3 == 2 and (i >> d2s) & 1!= 0:
                continue
            print i, j
            need -= 1
            if need == 0:
                return

def main():
    solve()

if __name__ == '__main__':
    main()
    sys.exit(0)
```

'''
<|endoftext|>
