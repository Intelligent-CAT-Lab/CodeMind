<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
12

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
[/INST]

Here is the Python code that implements the same logic as the Java code:
```python
import math

MOD = 998244353

def add(a, b):
    res = a + b
    return res % MOD if res >= MOD else res

def sub(a, b):
    res = a - b
    return res + MOD if res < 0 else res

def mul(a, b):
    res = a * b % MOD
    return res + MOD if res < 0 else res

def pow(a, e):
    if e == 0:
        return 1
    r = a
    for i in range(30 - math.numberOfLeadingZeros(e)):
        r = mul(r, r)
        if (e & (1 << i)) != 0:
            r = mul(r, a)
    return r

def inv(a):
    return pow(a, MOD - 2)

def c(x, y):
    return mul(mul(facts[x + y], factsInv[x]), factsInv[y])

def solve():
    n = int(input())
    m = int(input())
    facts = [1]
    for i in range(1, n + 3 * m // 2 + 1):
        facts.append(mul(facts[i - 1], i))
    factsInv = [inv(facts[i]) for i in range(len(facts))]
    ans = 0
    for nOdd in range(m % 2, min(m, n) + 1, 2):
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
Note that the Python code uses the `math` module to perform the modular arithmetic operations, and it also uses the `numberOfLeadingZeros` function from the `math` module to compute the number of leading zeros in an integer. The `c` function is defined in the same way as in the Java code, and the `solve` function is implemented in a similar way, but it uses the `input` function to read the input from the user and the `print` function to print the output.</s>
