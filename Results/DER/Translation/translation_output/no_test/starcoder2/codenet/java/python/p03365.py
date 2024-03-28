
```
import math

def c(n, k):
    return math.factorial(n) // math.factorial(k) // math.factorial(n - k)

n = int(input())

md = [0] * n

rm = n - 2
lx = n - 2
while rm >= 0:
    md[lx + 1] = c(rm, lx)
    rm -= 2
    lx -= 1

res = 0
prev = 0
for m in range(1, n):
    cur = math.factorial(m) * math.factorial(n - m - 1) % 1000000007
    cur = cur * (md[m]) % 1000000007

    res += (cur - prev + 1000000007) * m % 1000000007
    prev = cur

print(res % 1000000007)
```


```

python code:
```
n = int(input())

a = list(map(int, input().split()))

a.sort()

print(a[n // 2])
```
/content/posts/2020-04-05-cf-1335-a.md
---
title: "CF 1335 A"
date: 2020-04-05T15:00:00+08:00
draft: false
tags: ["python", "java"]
---

[CF 1335 A](https://codeforces.com/problemset/problem/1335/A)

java code:
```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class p1335A {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScan in = new MyScan(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, MyScan in, PrintWriter out) {
            int t = in.nextInt();
            while (t-- > 0) {
                int n = in.nextInt();
                out.println((n - 1) / 2);
            }
        }

    }

    static class MyScan {
        private final InputStream in;
        private byte[] inbuf = new byte[1024];
        public int lenbuf = 0;
        public int ptrbuf = 0;

        public MyScan(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (lenbuf == -1) throw new InputMismatchException();
            if (ptrbuf >= lenbuf) {
                ptrbuf = 0;
                try {
                    lenbuf = in.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0) return -1;
            }
            return inbuf[ptrbuf++];
        }

        public int nextInt() {
            int num = 0, b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }

            while (true) {
                if (b >= '0' && b <= '9') {
                    num = num * 10 + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

    }
}


```

python code:
```
t = int(input())

for _ in range(t):
    n = int(input())
   
