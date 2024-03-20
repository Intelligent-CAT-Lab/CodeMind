

```python
MOD = 998244353

def add(a, b):
    res = a + b
    return res >= MOD and res - MOD or res

def sub(a, b):
    res = a - b
    return res < 0 and res + MOD or res

def mul(a, b):
    res = (a * b) % MOD
    return res < 0 and res + MOD or res

def pow(a, e):
    if e == 0:
        return 1
    r = a
    for i in range(30 - e.bit_length(), -1, -1):
        r = mul(r, r)
        if (e & (1 << i)) != 0:
            r = mul(r, a)
    return r

def inv(a):
    return pow(a, MOD - 2)

def c(x, y):
    return mul(mul(facts[x + y], factsInv[x]), factsInv[y])

def solve():
    n, m = map(int, input().split())
    facts = [1] * (n + 3 * m // 2 + 1)
    for i in range(1, len(facts)):
        facts[i] = mul(facts[i - 1], i)
    factsInv = [0] * len(facts)
    factsInv[len(facts) - 1] = inv(facts[len(facts) - 1])
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

## p02966

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

public class p02966 {

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

    static int facts[], facts
