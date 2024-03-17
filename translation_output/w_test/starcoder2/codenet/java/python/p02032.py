

```
import re

def debug(s):
    if re.match(r"^.+\.debug\((.+)\\);.*$", s):
        print(s)

def main():
    n = int(input())
    pf = {}
    for i in range(2, int(n ** 0.5) + 1):
        c = 0
        while n % i == 0:
            n //= i
            c += 1
        if c > 0:
            pf[i] = c
    if n > 1:
        pf[n] = 1
    ans = 1
    for k, v in pf.items():
        ans *= (v + 1)
    print(len(pf), ans - 1)

if __name__ == '__main__':
    main()

```

## 2033. 最大的和

### 题目描述

给定一个长度为n的整数序列，请找出其中和最大的连续子序列，输出最大的和。

### 输入格式

第一行包含整数n。

第二行包含n个整数，表示整数序列。

### 输出格式

输出一个整数，表示最大的和。

### 数据范围

1≤n≤105,
−1000≤整数≤1000

### 输入样例：

```
7
-2 11 -4 13 -5 -2 2014
```

### 输出样例：

```
2016
```

### 题解

```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class p02033 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        CMaxSum solver = new CMaxSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMaxSum {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            int[] a = in.ints(n);
            int[] s = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                s[i] = s[i - 1] + a[i - 1];
            }
            int ans = Arrays.stream(s).min().getAsInt();
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    ans = Math.max(ans, s[j] - s[i]);
                }
            }
            out.ans(ans).ln();
        }

    }

    static class LightWriter implements AutoCloseable {
        private final PrintWriter out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = new PrintWriter(out);
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out)));
        }

        public LightWriter print(char c) {
            out.print(c);
            breaked = false;
            return this;
        }

        public LightWriter print(String s) {
            out.print(s);
            breaked = false;
            return this;
