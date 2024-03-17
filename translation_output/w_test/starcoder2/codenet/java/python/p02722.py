

```python
import math

n = int(input())
ans = 0
primeFactors2 = {}
for i in range(2, int(math.sqrt(n)) + 1):
    count = 0
    while n % i == 0:
        count += 1
        n //= i
    if count > 0:
        primeFactors2[i] = count
if n > 1:
    primeFactors2[n] = 1

for p in primeFactors2:
    if p * p == n:
        ans += 1
        continue
    if n % p == 0:
        if check(p, n):
            ans += 1
        if check(n // p, n):
            ans += 1

a1 = 1
for p in primeFactors2:
    a1 *= primeFactors2[p] + 1

print(a1 + ans)

def check(p, n):
    while n % p == 0:
        n //= p
        if n % p == 1:
            return True
    return False
```

## 2723. 最长公共子序列

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 4
1 2 3
1 2 3 4

Expected output:
2


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
    static int mod = 1000000007;
    static int inf = 0x3f3f3f3f;

    void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = in.nextIntArray(n);
        int[] b = in.nextIntArray(m);
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a[i - 1] == b[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        out.println(dp[n][m]);
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
