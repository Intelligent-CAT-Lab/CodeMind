<s> Translate the following java code to python and enclose your solution inside ```python```:
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

### 解题思路

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

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p03813](https://leetcode-cn.com/problems/find-the-longest-substring-containing-all-characters/)
- [p03815](https://leetcode-cn.com/problems/find-the-longest-substring-containing-all-characters-ii/)
</s>
