<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
QWERTYASDFZXCV

Expected output:
5


```
import java.io.*;
import java.util.*;


public class p03814 {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] s = sc.next().toCharArray();
		int n = s.length;

		int from = 0;
		int to = n - 1;
		for (int i = 0; i < n; i++) {
			if (s[i] == 'A') {
				from = i;
				break;
			}
		}
		for (int i = n - 1; i >= 0; i--) {
			if (s[i] == 'Z') {
				to = i;
				break;
			}
		}

		pr.println(to - from + 1);
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}

```
[/INST]
```python
import sys

def solve():
    s = input()
    n = len(s)

    from_index = 0
    to_index = n - 1
    for i in range(n):
        if s[i] == 'A':
            from_index = i
            break
    for i in range(n - 1, -1, -1):
        if s[i] == 'Z':
            to_index = i
            break

    print(to_index - from_index + 1)

if __name__ == "__main__":
    solve()
```</s>
