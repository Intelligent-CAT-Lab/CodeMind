
```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = 924844033;
    static int rng = 2010;
    static int[] fctr = new int[rng];
    static int[] finv = new int[rng];
    static int cmb(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return (int) (((long) fctr[n] * finv[n - k] % mod) * finv[k] % mod);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        fctr[0] = 1;
        finv[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = (int) ((long) fctr[i - 1] * i % mod);
        }
        for (int i = 1; i < rng; i++) {
            finv[i] = (int) (Math.pow(fctr[i], mod - 2) % mod);
        }
        if ((n - k) * 2 <= n) {
            int x = (n - k) * 2;
            int ans = 0;
            for (int i = 0; i <= x; i++) {
                if (i % 2 == 0) {
                    ans += cmb(x, i) * fctr[n - i];
                } else {
                    ans -= cmb(x, i) * fctr[n - i];
                }
                ans %= mod;
            }
            System.out.println(ans);
            return;
        }
        HashMap<Integer, Integer> dc = new HashMap<>();
        for (int j = 1; j <= k; j++) {
            int a = j;
            int b = k + j;
            int cnt = 0;
            while (a <= n && b <= n) {
                if (a > b) {
                    b += 2 * k;
                } else {
                    a += 2 * k;
                }
                cnt++;
            }
            dc.put(cnt, dc.getOrDefault(cnt, 0) + 2);
        }
        int nn = (n - k) * 2;
        HashSet<Integer> cp = new HashSet<>();
        int cpp = 1;
        for (int i : dc.keySet()) {
            for (int j = 0; j < dc.get(i); j++) {
                cpp += i;
                cp.add(cpp);
            }
        }
        cp.add(1);
        int[][] dp = new int[nn + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= nn; i++) {
            dp[i] = dp[i - 1].clone();
            if (!cp.contains(i)) {
                for (int j = 1; j <= Math.min(i, n); j++) {
                    dp[i][j] += dp[i - 2][j - 1];
                    dp[i][j] %= mod;
                }
            } else {
                for (int j = 1; j <= Math.min(i, n); j++) {
                    dp[i][j] += dp[i - 1][j - 1];
                    dp[i][j] %= mod;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                ans += fctr[n - i] * dp[nn][i];
            } else {
                ans -= fctr[n - i] * dp[nn][i];
            }
            ans %= mod;
        }
        System.out.println(ans);
    }
}
```
/content/posts/2020-04-05-python-and-java-code-for-problem-1000.md
---
title: Python and Java code for problem 1000
date: 2020-04-05T16:00:00+08:00
---

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
a = list(map(int,input().split()))
b = list(map(int,input().split()))
c = list(map(int,input().split()))
d = list(map(int,input().split()))
ans = 0
for i in range(n):
  for j in range(n):
    ans += b[i]*d[j]*(a[i]+c[j])
print(ans)
```

java code:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        s = br.readLine().split(" ");
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(s[i]);
        }
        s = br.readLine().split(" ");
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(s[i]);
        }
        s = br.readLine().split(" ");
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = Integer.parseInt(s[i]);
