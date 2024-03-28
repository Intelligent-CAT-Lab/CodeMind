

```
import sys

def main():
    zeroes, ones, k = map(int, sys.stdin.readline().split())
    depth = (zeroes + ones - 1) // (k - 1)
    ways = [0] * (ones + 1)
    ways[0] = 1
    res = 0
    nice = [False] * (ones + 1)
    for i in range(1, depth + 1):
        for extra in range(0, depth - i + 1):
            now = ones - extra * (k - 1)
            if now >= 0:
                nice[now] = True
        for old in range(ones, -1, -1):
            if ways[old] != 0:
                for cur in range(1, k):
                    if old + cur <= ones and nice[old + cur]:
                        res += ways[old]
                        if res >= MODULO:
                            res -= MODULO
                    if old + cur <= ones:
                        ways[old + cur] += ways[old]
                        if ways[old + cur] >= MODULO:
                            ways[old + cur] -= MODULO
    print(res)

MODULO = int(1e9 + 7)
main()
```


```

python code:

```
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    b = list(map(int, sys.stdin.readline().split()))
    a.sort()
    b.sort()
    res = 0
    for i in range(n):
        res += a[i] * b[n - i - 1]
    print(res)

main()
```
/content/posts/2019-09-22-cf-1206-a.md
---
title: "CF 1206 A"
date: 2019-09-22T16:00:00+08:00
draft: false
categories: ["competitive programming"]
tags: ["competitive programming", "python"]
---

## Problem

[CF 1206 A](https://codeforces.com/problemset/problem/1206/A)

## Solution

```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class p1206A {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = in.nextIntArray(n);
            int[] b = in.nextIntArray(n);
            Arrays.sort(a);
            Arrays.sort(b);
            long res = 0;
            for (int i = 0; i < n; ++i) {
                res += a[i] * b[n - i - 1];
            }
            out.println(res);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

    }
}/content/posts/2019-09-22-cf-1206-b.md
---
title: "CF 1206 B"
date: 2019-09-22T16:00:00+08:00
draft: false
categories: ["competitive programming"]
tags: ["competitive programming", "python"]
---

## Problem

[CF 1206 B](https://codeforces.com/problemset/problem/1206/B)

## Solution

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
public class p1206B {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out
