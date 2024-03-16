<s> Translate the following java code to python and enclose your solution inside ```python```:
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
				if ((d1 & 3) == 1 && (((i >> d1s) ^ (j >> d1s)) & 1) != 0) {
					continue;
				}
				if ((d1 & 3) == 2 && ((i >> d1s) & 1) != 0) {
					continue;
				}
				if ((d2 & 3) == 1 && (((i >> d2s) ^ (j >> d2s)) & 1) != 0) {
					continue;
				}
				if ((d2 & 3) == 2 && ((i >> d2s) & 1) != 0) {
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
		while (tok == null || !tok.hasMoreTokens()) {
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

### 解析

```python
import sys

def solve():
    n = int(sys.stdin.readline())
    d1 = int(sys.stdin.readline())
    d2 = int(sys.stdin.readline())
    d1s = 0
    d2s = 0
    while d1 & 3 == 0:
        d1s += 1
        d1 >>= 2
    while d2 & 3 == 0:
        d2s += 1
        d2 >>= 2
    need = n * n
    for i in range(2 * n):
        for j in range(2 * n):
            if d1 & 3 == 1 and ((i >> d1s) ^ (j >> d1s)) & 1 != 0:
                continue
            if d1 & 3 == 2 and ((i >> d1s) & 1) != 0:
                continue
            if d2 & 3 == 1 and ((i >> d2s) ^ (j >> d2s)) & 1 != 0:
                continue
            if d2 & 3 == 2 and ((i >> d2s) & 1) != 0:
                continue
            print(i, j)
            if need == 0:
                return
    raise AssertionError()

def scanInt():
    return int(sys.stdin.readline())

def scanLong():
    return long(sys.stdin.readline())

def scanString():
    while tok == None or not tok.hasMoreTokens():
        tok = StringTokenizer(sys.stdin.readline())
    return tok.nextToken()

in = sys.stdin
out = sys.stdout
tok = StringTokenizer(in.readline())

solve()

in.close()
out.close()
```

### 复杂度分析

* 时间复杂度：$O(n^2)$。
* 空间复杂度：$O(1)$。

### 相关题目

1. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting/)
2. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-ii/)
3. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-iii/)
4. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-iv/)
5. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-v/)
6. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-vi/)
7. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-vii/)
8. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-viii/)
9. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-ix/)
10. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-x/)
11. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-xi/)
12. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-xii/)
13. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-xiii/)
14. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-xiv/)
15. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-xv/)
16. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-xvi/)
17. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-xvii/)
18. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-xviii/)
19. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-xix/)
20. [矩形](https://leetcode-cn.com/problems/rectangle-tile-painting-xx/)
21. [矩
