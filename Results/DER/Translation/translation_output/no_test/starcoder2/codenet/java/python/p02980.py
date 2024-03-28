
```
import math
MODULO = 998244353

def nCr(n, r):
    return math.factorial(n) // (math.factorial(r) * math.factorial(n - r))

def nPr(n, r):
    return math.factorial(n) // math.factorial(n - r)

def nHr(n, r):
    return nCr(n + r - 1, r)

def nCrMod(n, r):
    return nPrMod(n, r) // math.factorial(r)

def nPrMod(n, r):
    return math.factorial(n) % MODULO // math.factorial(n - r) % MODULO

def nHrMod(n, r):
    return nCrMod(n + r - 1, r)

def inv(n):
    return pow(n, MODULO - 2, MODULO)

def invs():
    invs = [1] * (500002)
    for i in range(2, 500002):
        invs[i] = (MODULO - (MODULO // i) * invs[MODULO % i] % MODULO) % MODULO
    return invs

def facts():
    facts = [1] * (500002)
    for i in range(1, 500002):
        facts[i] = (facts[i - 1] * i) % MODULO
    return facts

def invfacts():
    invfacts = [1] * (500002)
    for i in range(1, 500002):
        invfacts[i] = (invfacts[i - 1] * invs[i]) % MODULO
    return invfacts

def nCrMod(n, r):
    return facts[n] * invfacts[r] * invfacts[n - r] % MODULO

def nPrMod(n, r):
    return facts[n] * invfacts[n - r] % MODULO

def nHrMod(n, r):
    return nCrMod(n + r - 1, r)

invs = invs()
facts = facts()
invfacts = invfacts()

height, width = map(int, input().split())
ph = [1] * (width + 1)
for i in range(1, width + 1):
    ph[i] = ph[i - 1] * (height + 1) % MODULO
pw = [1] * (height + 1)
for i in range(1, height + 1):
    pw[i] = pw[i - 1] * (width + 1) % MODULO
res = 0
for common in range(min(height, width) + 1):
    ways = nCrMod(height, common) * nCrMod(width, width - common) * ph[width - common] * pw[height - common]
    if common % 2 == 0:
        res += ways
    else:
        res -= ways
res %= MODULO
if res < 0:
    res += MODULO
print(res)
```

## 2981 - Divisors

### 题目大意

给定一个数n，求出所有能整除n的数。

### 解题思路

枚举所有因子，判断是否能整除n。

### 代码

java code:
```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class p02981 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskG solver = new TaskG();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskG {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            for (int i = 1; i * i <= n; ++i) {
                if (n % i == 0) {
                    out.print(i + " ");
                    if (i * i != n) {
