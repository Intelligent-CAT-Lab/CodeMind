System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 10 1

Expected output:
1024


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
    m,n,k = LI()
    if n < k:
        print(0)
        return
    if m < k:
        print(0)
        return
    ans = pow(m,n,mod)
    p = [pow(i,n,mod) for i in range(k+1)]
    c = m
    comb = [[0 for i in range(i+1)] for i in range(k+1)]
    comb[0][0] = 1
    for i in range(k):
        for j in range(i+1):
            comb[i+1][j] += comb[i][j]
            comb[i+1][j+1] += comb[i][j]
    for i in range(1,k):
        k = 0
        for j in range(1,i+1)[::-1]:
            if (i+j)&1:
                k -= comb[i][j]*p[j]
            else:
                k += comb[i][j]*p[j]
        k *= c
        c *= (m-i)
        c *= pow(i+1,mod-2,mod)
        c %= mod
        ans -= k
        ans %= mod
    print(ans)
    return


if __name__ == "__main__":
    solve()


```


Answer:
```java
import java.io.*;
import java.util.*;

public class Main {
    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;
        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null ||!tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null ||!tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
             return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
    static FastScanner in = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    static int mod = 998244353;

    public static void main(String[] args) {
        int m = in.nextInt();
        int n = in.nextInt();
        int k = in.nextInt();
        long ans = pow(m, n, mod);
        long[] p = new long[k+1];
        for (int i = 0; i <= k; i++) {
            p[i] = pow(i, n, mod);
        }
        long[] comb = new long[k+1];
        comb[0] = 1;
        for (int i = 1; i <= k; i++) {
            comb[i] = comb[i-1] * (k-i+1) % mod * pow(i, mod-2, mod) % mod;
        }
        long c = m;
        for (int i = 1; i < k; i++) {
            long k_ = 0;
            for (int j = 1; j <= i; j++) {
                if ((i+j) % 2 == 1) {
                    k_ = (k_ - comb[i] * p[j] % mod + mod) % mod;
                } else {
                    k_ = (k_ + comb[i] * p[j] % mod) % mod;
                }
            }
            k_ = k_ * c % mod;
            c = c * (m-i) % mod * pow(i+1, mod-2, mod) % mod;
            ans = (ans - k_ + mod) % mod;
        }
        out.println(ans);
        out.flush();
    }

    static long pow(long a, long b, long mod) {
        long ret = 1;
        a %= mod;
        while (b > 0) {
            if ((b & 1) == 1) {
                ret = ret * a % mod;
            }
            a = a * a % mod;
            b >>= 1;
        }
        return ret;
    }
}
```<|endoftext|>
