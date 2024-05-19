System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
#!usr/bin/env python3
from collections import defaultdict,deque
from heapq import heappush, heappop
import sys
import math
import bisect
import random
def LI(): return [int(x) for x in sys.stdin.readline().split()]
def I(): return int(sys.stdin.readline())
def LS():return [list(x) for x in sys.stdin.readline().split()]
def S():
    res = list(sys.stdin.readline())
    if res[-1] == "\n":
        return res[:-1]
    return res
def IR(n):
    return [I() for i in range(n)]
def LIR(n):
    return [LI() for i in range(n)]
def SR(n):
    return [S() for i in range(n)]
def LSR(n):
    return [LS() for i in range(n)]

sys.setrecursionlimit(1000000)
mod = 998244353


def solve():
    n,k,a = LI()
    lst = [0]*(k+1)
    lst[-2] = 1
    A = a*pow(100*n,mod-2,mod)
    inv = pow(n,mod-2,mod)

    for i in range(k-1)[::-1]:
        if k > i + n:
            lst[i] = A*(lst[i+1] - lst[i+n+1]) + lst[i+1]
            lst[i] %= mod
        else:
            lst[i] = A*(lst[i+1] - lst[k]) + (n-(k-i)+1)*inv + lst[i+1]
            lst[i] %= mod
    print((lst[0] - lst[1])%mod)
    return


if __name__ == "__main__":
    solve()


```


Answer:
```java
import java.io.*;
import java.util.*;

public class Main {
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = in.i();
        int k = in.i();
        int a = in.i();

        long mod = 998244353;
        long[] dp = new long[k + 1];
        long A = a * modpow(100 * n, mod - 2, mod) % mod;
        long inv = modpow(n, mod - 2, mod);

        for (int i = k - 1; i >= 0; i--) {
            if (k > i + n) {
                dp[i] = (dp[i + 1] - dp[i + n + 1] + mod) * A % mod + dp[i + 1];
            } else {
                dp[i] = (dp[i + 1] - dp[k] + mod) * A % mod + (n - (k - i) + 1) * inv % mod + dp[i + 1];
            }
            dp[i] %= mod;
        }

        out.println((dp[0] - dp[1] + mod) % mod);
        out.flush();
    }

    static long modpow(long a, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            n >>= 1;
        }
        return res;
    }

    static class MyReader extends BufferedReader {
        char[] cbuf = new char[1024];
        int head = 0;
        int tail = 0;

        MyReader() {
            super(new InputStreamReader(System.in));
        }

        char next() {
            if (head == tail) {
                try {
                    tail = super.read(cbuf, 0, cbuf.length);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                head = 0;
            }
            return cbuf[head++];
        }

        void back() {
            head--;
        }

        boolean minus() {
            boolean minus;
            while (true) {
                char c = next();
                if (!isDelimiter(c)) {
                    if (!(minus = c == '-')) back();
                    return minus;
                }
            }
        }

        void skip() {
            while (isDelimiter(next()));
            back();
        }

        char[] s(int N) {
            char[] cbuf = new char[N];
            read(cbuf, 0, N);
            return cbuf;
        }

        public int read(char[] cbuf, int off, int len) {
            skip();
            int i;
            for (i = 0; i < cbuf.length; i++) {
                char c = next();
                if (isDelimiter(c)) {
                    break;
                }
                cbuf[i] = c;
            }
            return i;
        }

        boolean isDelimiter(char c) {
            return c =='' || c == '\n' || c == '\r';
        }

        int i() {
            boolean minus = minus();
            int n = 0;
            while (true) {
                int k = next() - '0';
                if (k < 0 || 9 < k) break;
                n = 10 * n + k;
            }
            return minus? -n : n;
        }

        int[] ii(final int N) {
            int[] a = new int[N];
            for (int j = 0; j < a.length; j++) a[j] = i();
            return a;
        }

        long l() {
            boolean minus = minus();
            long n = 0;
            while (true) {
                int k = next() - '0';
                if (k < 0 || 9 < k) break;
                n = 10 * n + k;
            }
            return minus? -n : n;
        }
    }
}
```<|endoftext|>
