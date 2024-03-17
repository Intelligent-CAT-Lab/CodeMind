

```python
import sys

def main():
    n = int(sys.stdin.readline())
    r = 0
    b = 0
    dp = [[0 for i in range(n+1)] for j in range(n+1)]
    dp[0][0] = 1
    for i in range(n):
        c = sys.stdin.read(1)
        if c == '0':
            r += 2
        elif c == '1':
            r += 1
            b += 1
        else:
            b += 2
        for prevUseRed in range(i+1):
            if prevUseRed + 1 <= r:
                dp[i+1][prevUseRed+1] += dp[i][prevUseRed]
                dp[i+1][prevUseRed+1] %= mod
            prevUseBlue = i - prevUseRed
            if prevUseBlue + 1 <= b:
                dp[i+1][prevUseRed] += dp[i][prevUseRed]
                dp[i+1][prevUseRed] %= mod
    combin = [[0 for i in range(n+1)] for j in range(n+1)]
    for i in range(n+1):
        combin[i][0] = combin[i][i] = 1
    for i in range(2, n+1):
        for j in range(1, i):
            combin[i][j] = (combin[i-1][j-1] + combin[i-1][j]) % mod
    tto = 0
    for i in range(min(r, n)+1):
        ways = dp[n][i]
        lr = r - i
        lb = b - (n - i)
        if lb < 0:
            continue
        ways *= combin[n][lr]
        ways %= mod
        tto = (tto + ways) % mod
    print(tto)

mod = 998244353
if __name__ == '__main__':
    main()
```

## 3.13.5

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
//package com.company;

import java.io.*;
import java.util.*;


public class p03135 {
    public static class Task {
        int mod = 998244353;
        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            int n = sc.nextInt();
            long[][] dp = new long[n + 1][n + 1];
            dp[0][0] = 1;
            for (int i = 0; i < n; i++) {
                for (int prevUseRed = 0; prevUseRed <= i; prevUseRed++) {
                    int prevUseBlue = i - prevUseRed;
                    if (prevUseRed + 1 <= i) {
                        dp[i + 1][prevUseRed + 1] += dp[i][prevUseRed];
                        dp[i + 1][prevUseRed + 1] %= mod;
                    }
                    if (prevUseBlue + 1 <= i) {
                        dp[i + 1][prevUseRed] += dp[i][prevUseRed];
                        dp[i + 1][prevUseRed] %= mod;
                    }
                }
            }
            long[][] combin = new long[n + 1][n + 1];
            for (int i = 0; i <= n; i++) {
                combin[i][0] = combin[i][i] = 1;
            }
            for (int i = 2; i <= n; i++) {
                for (int j = 1; j < i; j++) {
                    combin[i][j] = (combin[i - 1][j - 1] + combin[i - 1][j]) % mod;
                }
            }
            long tto = 0;
            for (int i = 0; i <= n; i++) {
                long ways = dp[n][i];
                ways *= combin[n][i];
                ways %= mod;
                tto = (tto + ways) % mod;
            }
            pw.println(tto);

        }

    }

    private static long TIME_START, TIME_END;
    public static void main(String[]
