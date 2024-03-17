

```python
a, b, c = map(int, input().split())
if (c >= a and c <= b) or (c >= b and c <= a):
    print("Yes")
else:
    print("No")
```


```

python code:

```python
n = int(input())
print(n * 800 - int(n / 15) * 200)
```
/source/_posts/2019-08-25-AtCoder-Beginner-Contest-138-A.md
---
title: AtCoder Beginner Contest 138 A
date: 2019-08-25 10:00:00
tags:
- AtCoder
- Python
categories:
- [AtCoder,ABC]
- [AtCoder,ABC138]
---

# A

[A - Red or Not](https://atcoder.jp/contests/abc138/tasks/abc138_a)

<!-- more -->

## 题目描述

You are given an integer $A$ and a string $S$.

If $A$ is greater than or equal to $3200$, print $S$.

If $A$ is less than $3200$, print `red`.

## 输入

Input is given from Standard Input in the following format:

```
A
S
```

## 输出

Print the answer as described in the Problem Statement.

## 限制

* $1 \leq A \leq 3199$
* $S$ is a string of length between $1$ and $10$ (inclusive), consisting of lowercase English letters.

## 题解

题目很简单，直接判断即可。

## 代码

```java
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author L_aka_ryuga
 */
public class p03067 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        AOnTheWay solver = new AOnTheWay();
        solver.solve(1, in, out);
        out.close();
    }

    static class AOnTheWay {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int a = in.ni();
            String s = in.next();
            if (a >= 3200) out.println(s);
            else out.println("red");
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int ni() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class OutputWriter {
