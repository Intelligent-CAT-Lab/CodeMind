
```
import sys

n = int(input())
if n == 2:
    print(-1)
    sys.exit()

for i in range(n):
    for j in range(n - 1):
        if i == j:
            print(n, end=' ')
        else:
            print(j + 1, end=' ')
    print()

```

# 总结

python 代码比 java 代码短很多，但是 java 代码的可读性更好。

# 参考资料

[CF1006D - I3Y3s Challenge](https://codeforces.com/contest/1006/problem/D)


# 参考资料

[CF1006D - I3Y3s Challenge](https://codeforces.com/contest/1006/problem/D)

# 总结

python 代码比 java 代码短很多，但是 java 代码的可读性更好。

# 参考资料

[CF1006D - I3Y3s Challenge](https://codeforces.com/contest/1006/problem/D)
/content/post/codeforces/1006D - I3Y3s Challenge.md
---
title: "1006D - I3Y3s Challenge"
date: 2019-03-03T10:00:00+08:00
draft: false
author: "caicai"
tags:
  - python
  - java
categories:
  - codeforces
---

# 题目

题目链接：[CF1006D - I3Y3s Challenge](https://codeforces.com/contest/1006/problem/D)

# 题意

给定一个长度为 $n$ 的字符串 $s$，$s$ 由 $n$ 个小写字母组成。

定义一个字符串 $t$ 是 $s$ 的一个子序列，当且仅当 $t$ 可以从 $s$ 中删除一些字符（可以不删除）后得到。

给定一个长度为 $n$ 的字符串 $t$，$t$ 由 $n$ 个小写字母组成。

求 $t$ 是 $s$ 的子序列的方案数。

# 题解

## 思路

$t$ 是 $s$ 的子序列，那么 $t$ 的每个字符都在 $s$ 中出现过。

假设 $t$ 的第 $i$ 个字符在 $s$ 中出现的位置为 $p_i$，那么 $p_1 < p_2 < ... < p_n$。

那么 $t$ 是 $s$ 的子序列的方案数就是 $p_1$ 的取值方案数乘以 $p_2$ 的取值方案数乘以 ... 乘以 $p_n$ 的取值方案数。

$p_1$ 的取值方案数为 $n$，$p_2$ 的取值方案数为 $n - 1$，...，$p_n$ 的取值方案数为 $n - (n - 1) = 1$。

所以 $t$ 是 $s$ 的子序列的方案数为 $n!$。

## 代码

java 代码：
```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class p03896 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        I3y3
