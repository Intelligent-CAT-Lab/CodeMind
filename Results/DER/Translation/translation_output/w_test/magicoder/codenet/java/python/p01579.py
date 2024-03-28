<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
((()())())

Expected output:
10


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

@@ Response
```python
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
    now = 0
    ans = 0
    for i in range(n):
        if s[i] == '(':
            now += 1
        else:
            now -= 1
        count[now + n] -= 1
        ans += count[now + n]
    return ans

s = input()
print(solve(s))
```

This Python code does the same thing as the Java code. It reads a string from the input, calculates the number of valid parentheses substrings, and then prints the result. The `solve` function is the equivalent of the `solve` method in the Java code.<｜end▁of▁sentence｜>
