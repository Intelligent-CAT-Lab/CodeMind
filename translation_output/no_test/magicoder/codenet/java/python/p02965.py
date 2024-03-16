<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Math.max;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class p02965 {

	static final int MOD = 998244353;

	static int add(int a, int b) {
		int res = a + b;
		return res >= MOD ? res - MOD : res;
	}

	static int sub(int a, int b) {
		int res = a - b;
		return res < 0 ? res + MOD : res;
	}

	static int mul(int a, int b) {
		int res = (int) ((long) a * b % MOD);
		return res < 0 ? res + MOD : res;
	}

	static int pow(int a, int e) {
		if (e == 0) {
			return 1;
		}
		int r = a;
		for (int i = 30 - Integer.numberOfLeadingZeros(e); i >= 0; i--) {
			r = mul(r, r);
			if ((e & (1 << i)) != 0) {
				r = mul(r, a);
			}
		}
		return r;
	}

	static int inv(int a) {
		return pow(a, MOD - 2);
	}

	static int facts[], factsInv[];

	static int c(int x, int y) {
		return mul(mul(facts[x + y], factsInv[x]), factsInv[y]);
	}

	static void solve() throws Exception {
		int n = scanInt(), m = scanInt();
		facts = new int[n + 3 * m / 2 + 1];
		facts[0] = 1;
		for (int i = 1; i < facts.length; i++) {
			facts[i] = mul(facts[i - 1], i);
		}
		factsInv = new int[facts.length];
		factsInv[facts.length - 1] = inv(facts[facts.length - 1]);
		for (int i = facts.length - 1; i > 0; i--) {
			factsInv[i - 1] = mul(factsInv[i], i);
		}
		int ans = 0;
		for (int nOdd = m % 2; nOdd <= m && nOdd <= n; nOdd += 2) {
			int cans = c(nOdd, n - nOdd);
			int cans1 = c((3 * m - nOdd) / 2, n - 1);
			int cans2 = mul(nOdd, c((m - nOdd) / 2, n - 1));
			if (nOdd < m) {
				cans2 = add(cans2, mul(n - nOdd, c((m - nOdd) / 2 - 1, n - 1)));
			}
			ans = add(ans, mul(cans, sub(cans1, cans2)));
		}
		out.print(ans);
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

@@ Response
```python
import sys

MOD = 998244353

def add(a, b):
    res = a + b
    return res if res < MOD else res - MOD

def sub(a, b):
    res = a - b
    return res if res >= 0 else res + MOD

def mul(a, b):
    res = (a * b) % MOD
    return res if res >= 0 else res + MOD

def pow(a, e):
    if e == 0:
        return 1
    r = a
    for i in range(30 - a.bit_length(), -1, -1):
        r = mul(r, r)
        if (e & (1 << i)) != 0:
            r = mul(r, a)
    return r

def inv(a):
    return pow(a, MOD - 2)

def c(x, y):
    return mul(facts[x + y], mul(factsInv[x], factsInv[y]))

def solve():
    n, m = map(int, sys.stdin.readline().split())
    facts = [1] * (n + 3 * m // 2 + 1)
    for i in range(1, len(facts)):
        facts[i] = mul(facts[i - 1], i)
    factsInv = [0] * len(facts)
    factsInv[-1] = inv(facts[-1])
    for i in range(len(facts) - 2, -1, -1):
        factsInv[i] = mul(factsInv[i + 1], i + 1)
    ans = 0
    for nOdd in range(m % 2, m + 1, 2):
        cans = c(nOdd, n - nOdd)
        cans1 = c((3 * m - nOdd) // 2, n - 1)
        cans2 = mul(nOdd, c((m - nOdd) // 2, n - 1))
        if nOdd < m:
            cans2 = add(cans2, mul(n - nOdd, c((m - nOdd) // 2 - 1, n - 1)))
        ans = add(ans, mul(cans, sub(cans1, cans2)))
    print(ans)

if __name__ == "__main__":
    solve()
```

This Python code is a direct translation of the given Java code. It uses the `sys` module for input/output operations and the `map` function to convert the input string into integers. The `bit_length` method is used to calculate the number of leading zeros in a binary representation of an integer. The `add`, `sub`, `mul`, `pow`, and `inv` functions are the same as in the Java code. The `c` function is also the same as in the Java code. The `solve` function is also the same as in the Java code. The `if __name__ == "__main__":` block is used to call the `solve` function when the script is run directly.<｜end▁of▁sentence｜>
