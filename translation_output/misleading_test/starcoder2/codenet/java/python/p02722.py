

```python
import math

n = int(input())
ans = 0
primeFactors2 = {}
for p in range(2, int(math.sqrt(n)) + 1):
    if p * p == n:
        ans += 1
        continue
    if n % p == 0:
        if check(p, n):
            ans += 1
        if check(n // p, n):
            ans += 1
a1 = 1
for p, count in primeFactors2.items():
    a1 *= count + 1
print(a1 + ans)

def check(p, n):
    while n % p == 0:
        n //= p
        if n % p == 1:
            return True
    return False

def getPrimeFactors(n):
    primeFactors = {}
    c = n
    for i in range(2, int(math.sqrt(n)) + 1):
        count = 0
        while c % i == 0:
            count += 1
            c //= i
        if count > 0:
            primeFactors[i] = count
    if c > 1:
        primeFactors[c] = 1
    return primeFactors
```

## 2. 1000000007

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class p02723 {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        long n = in.nextLong();
        out.println(n);
    }

    public static void main(String[]$) {
        new p02723().solve();
        out.flush();
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[][] nextCharArray(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
           
