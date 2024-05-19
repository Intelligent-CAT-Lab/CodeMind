System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
QWERTYASDFZXCV

Expected output:
19

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


Answer:
```python
def solve():
    s = input()
    n = len(s)

    from_idx = 0
    to_idx = n - 1
    for i in range(n):
        if s[i] == 'A':
            from_idx = i
            break
    for i in range(n - 1, -1, -1):
        if s[i] == 'Z':
            to_idx = i
            break

    print(to_idx - from_idx + 1)

solve()
```<|endoftext|>
