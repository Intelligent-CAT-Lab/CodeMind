
```
import sys

MOD = 998244353

def add(a, b):
    res = a + b
    return res >= MOD and res - MOD or res

def sub(a, b):
    res = a - b
    return res < 0 and res + MOD or res

def mul(a, b):
    res = a * b % MOD
    return res < 0 and res + MOD or res

def pow(a, e):
    if e == 0:
        return 1
    r = a
    for i in range(30 - e.bit_length()):
        r = mul(r, r)
        if e & (1 << i):
            r = mul(r, a)
    return r

def inv(a):
    return pow(a, MOD - 2)

def c(x, y):
    return mul(mul(facts[x + y], factsInv[x]), factsInv[y])

def solve():
    n, m = map(int, sys.stdin.readline().split())
    facts = [1] * (n + 3 * m // 2 + 1)
    for i in range(1, len(facts)):
        facts[i] = mul(facts[i - 1], i)
    factsInv = [0] * len(facts)
    factsInv[-1] = inv(facts[-1])
    for i in range(len(facts) - 1, 0, -1):
        factsInv[i - 1] = mul(factsInv[i], i)
    ans = 0
    for nOdd in range(m % 2, m + 1, 2):
        if nOdd > n:
            break
        cans = c(nOdd, n - nOdd)
        cans1 = c((3 * m - nOdd) // 2, n - 1)
        cans2 = mul(nOdd, c((m - nOdd) // 2, n - 1))
        if nOdd < m:
            cans2 = add(cans2, mul(n - nOdd, c((m - nOdd) // 2 - 1, n - 1)))
        ans = add(ans, mul(cans, sub(cans1, cans2)))
    print(ans)

solve()
```

## 2966 - 
[problem link](https://codeforces.com/problemset/problem/2966/A)

### Solution

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class p2966 {

    static void solve() throws Exception {
        int n = scanInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j + 1 < n && a[j + 1] == a[j] + 1) {
                j++;
            }
            ans = Math.max(ans, j - i + 1);
            i = j;
        }
        out.print(ans);
    }

    static int scanInt() throws IOException {
        return Integer.parseInt(scanString());
    }

    static long scanLong() throws IOException {
        return Long.parseLong(scanString());
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
            System.exit(1);
        }
    }
}
```

## 2967 - 
[problem link](https://codeforces.com/problemset/problem/2
