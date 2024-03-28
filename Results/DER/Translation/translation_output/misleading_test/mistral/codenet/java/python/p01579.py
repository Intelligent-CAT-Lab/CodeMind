<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
((()())())

Expected output:
-22

```
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class p01579 {
	Scanner sc = new Scanner(System.in);

	int INF = 1 << 28;
	double EPS = 1e-9;

	String s;

	void run() {
		s = sc.nextLine();
		solve();
	}

	void solve() {
		int n = s.length();
		int[] count = new int[2 * n + 1];
		int now = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '(') {
				now++;
			} else {
				now--;
			}
			count[now + n]++;
		}
		// debug(count);
		now = 0;
		long ans = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '(') {
				now++;
			} else {
				now--;
			}
			count[now + n]--;
			// debug(now, count[now + n]);
			ans += count[now + n];
		}
		println(ans + "");
	}

	void println(String s) {
		System.out.println(s);
	}

	void print(String s) {
		System.out.print(s);
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

	public static void main(String[] args) {
		new p01579().run();
	}
}
```
[/INST]
```python
import sys

def run():
    s = input()
    solve(s)

def solve(s):
    n = len(s)
    count = [0] * (2 * n + 1)
    now = 0
    for i in range(n):
        if s[i] == '(':
            now += 1
        else:
            now -= 1
        count[now + n] += 1
    # debug(count)
    now = 0
    ans = 0
    for i in range(n):
        if s[i] == '(':
            now += 1
        else:
            now -= 1
        count[now + n] -= 1
        # debug(now, count[now + n])
        ans += count[now + n]
    print(ans)

def debug(count):
    print(count)

if __name__ == '__main__':
    run()
```</s>
