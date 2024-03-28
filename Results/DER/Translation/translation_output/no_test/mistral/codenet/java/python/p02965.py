<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
```python
import sys

MOD = 998244353

def add(a, b):
    res = a + b
    return res % MOD if res >= MOD else res

def sub(a, b):
    res = a - b
    return res % MOD if res < 0 else res + MOD

def mul(a, b):
    res = (a * b) % MOD
    return res % MOD if res < 0 else res

def pow(a, e):
    if e == 0:
        return 1
    r = a
    for i in range(31 - len(bin(e)) + 1, -1, -1):
        r = mul(r, r)
        if (e & (1 << i)) != 0:
            r = mul(r, a)
    return r

def inv(a):
    return pow(a, MOD - 2)

facts = [1]
factsInv = [inv(facts[0])]

for i in range(1, len(facts)):
    facts[i] = facts[i - 1] * i
    factsInv[i] = factsInv[i - 1] * i

def c(x, y):
    return mul(mul(facts[x + y], factsInv[x]), factsInv[y])

def solve():
    n, m = map(int, input().split())
    for i in range(1, len(facts)):
        facts[i] *= i
    for i in range(1, len(facts)):
        factsInv[i] *= i
    ans = 0
    for nOdd in range(min(m, n) // 2 + 1, min(m, n) + 1, 2):
        cans = c(nOdd, n - nOdd)
        cans1 = c((3 * m - nOdd) // 2, n - 1)
        cans2 = mul(nOdd, c((m - nOdd) // 2, n - 1))
        if nOdd < m:
            cans2 += mul(n - nOdd, c((m - nOdd) // 2 - 1, n - 1))
        ans += mul(cans, sub(cans1, cans2))
    print(ans)

if __name__ == "__main__":
    sys.stdin.buffer = sys.stdin
    sys.stdout.buffer = sys.stdout
    solve()
```</s>
