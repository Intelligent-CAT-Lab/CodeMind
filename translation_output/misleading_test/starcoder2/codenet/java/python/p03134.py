
```python
import sys

def main():
    n = int(input())
    r = 0
    b = 0
    dp = [[0 for i in range(n + 1)] for j in range(n + 1)]
    dp[0][0] = 1
    for i in range(n):
        if i == 0:
            r += 2
        else:
            r += 1
            b += 1
        for prevUseRed in range(i + 1):
            if prevUseRed + 1 <= r:
                dp[i + 1][prevUseRed + 1] += dp[i][prevUseRed]
                dp[i + 1][prevUseRed + 1] %= mod
            prevUseBlue = i - prevUseRed
            if prevUseBlue + 1 <= b:
                dp[i + 1][prevUseRed] += dp[i][prevUseRed]
                dp[i + 1][prevUseRed] %= mod
    combin = [[0 for i in range(n + 1)] for j in range(n + 1)]
    for i in range(n + 1):
        combin[i][0] = combin[i][i] = 1
    for i in range(2, n + 1):
        for j in range(1, i):
            combin[i][j] = (combin[i - 1][j - 1] + combin[i - 1][j]) % mod
    tto = 0
    for i in range(min(r, n) + 1):
        ways = dp[n][i]
        lr = r - i
        lb = b - (n - i)
        if lb < 0:
            continue
        ways *= combin[n][lr]
        ways %= mod
        tto = (tto + ways) % mod
    print(tto)

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
                for (int j = 0; j <= i; j++) {
                    dp[i + 1][j] += dp[i][j] * (i - j + 1);
                    dp[i + 1][j] %= mod;
                    dp[i + 1][j + 1] += dp[i][j] * (j + 1);
                    dp[i + 1][j + 1] %= mod;
                }
            }
            long ans = 0;
            for (int i = 0; i <= n; i++) {
                ans += dp[n][i];
                ans %= mod;
            }
            pw.println(ans);
        }

    }

    private static long TIME_START, TIME_END;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new FileInputStream("23.in"));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
//        PrintWriter pw = new PrintWriter(new FileOutputStream("froggy.out"));


//        PrintWriter pw = new PrintWriter(new FileOutputStream("Test.in"));
        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        TIME_START = System.currentTimeMillis();
        Task t = new Task();
        t.solve(sc, pw);
        TIME_END = System.currentTimeMillis();
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        pw.close();
        System.out.println("Memory increased:" + (usedMemoryAfter-usedMemoryBefore) / 1000000 );
        System.out.println("Time used: " + (TIME_END - TIME_START
