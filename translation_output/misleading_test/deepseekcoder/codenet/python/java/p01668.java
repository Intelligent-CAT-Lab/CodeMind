<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3 2

Expected output:
-70

```
import sys
readline = sys.stdin.readline
write = sys.stdout.write
class RollingHash():
    def __init__(self, s, base, mod):
        self.mod = mod
        self.pw = pw = [1]*(len(s)+1)

        l = len(s)
        self.h = h = [0]*(l+1)

        v = 0
        for i in range(l):
            h[i+1] = v = (v * base + ord(s[i])) % mod
        v = 1
        for i in range(l):
            pw[i+1] = v = v * base % mod
    def get(self, l, r):
        return (self.h[r] - self.h[l] * self.pw[r-l]) % self.mod

def solve():
    MOD = 10**9 + 7
    A, B, C = readline().strip().split()
    L = max(len(A), len(B))
    pw10 = [1]*(L+1)
    r = 1
    for i in range(1, L+1):
        pw10[i] = r = r * 10 % MOD
    def calc(X, Y):
        mod = 10**9 + 9
        N = len(X)
        M = len(Y)
        if N < M:
            return 0
        hx = RollingHash(X, 37, mod)
        hy = RollingHash(Y, 37, mod)
        hY = [hy.get(0, i) for i in range(M+1)]
        res = cur = 0
        for i in range(N):
            v = int(X[i])
            res += cur * v * pw10[N - (i+1)] % MOD
            for j in range(i-M+1, i+1):
                if j+M > N:
                    break
                l = i-j
                if (0 < l and hx.get(j, j+l) != hY[l]) or v <= int(Y[i-j]):
                    continue
                res += pw10[N - (j+M)]
            if M + (i+1) <= N:
                res += v * pw10[N - (M + i+1)] * (N - (i+1) - M + 1) % MOD
            if i-M+1 >= 0 and hx.get(i-M+1, i+1) == hY[M]:
                cur += 1
        for j in range(N-M+1):
            if hx.get(j, j+M) != hY[M]:
                continue
            res += 1
        if Y == "0":
            for i in range(1, N):
                res -= 9 * pw10[N - i - 1] * i % MOD
            res -= N - 1
        return res % MOD
    ans = calc(B, C)
    a = int(A)
    if a > 0:
        A = str(a-1)
        ans -= calc(A, C)
    write("%d\n" % (ans % MOD))
solve()

```

### Response:
Here is the Java version of your Python code:

```java
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    static final long MOD = (long) Math.pow(10, 9) + 7;
    static final long BASE = 37;

    static class RollingHash {
        long[] h, pw;
        int mod;

        RollingHash(String s, int mod) {
            this.mod = mod;
            int l = s.length();
            h = new long[l + 1];
            pw = new long[l + 1];

            long v = 0;
            for (int i = 0; i < l; i++) {
                h[i + 1] = v = (v * BASE + s.charAt(i)) % mod;
            }
            v = 1;
            for (int i = 0; i < l; i++) {
                pw[i + 1] = v = v * BASE % mod;
            }
        }

        long get(int l, int r) {
            return (h[r] - h[l] * pw[r - l]) % mod;
        }
    }

    static long calc(String X, String Y) throws IOException {
        int mod = (int) Math.pow(10, 9) + 9;
        int N = X.length();
        int M = Y.length();
        if (N < M) {
            return 0;
        }
        RollingHash hx = new RollingHash(X, mod);
        long[] hY = new long[M + 1];
        for (int i = 0; i < M; i++) {
            hY[i + 1] = hx.get(0, i + 1);
        }
        long res = 0, cur = 0;
        for (int i = 0; i < N; i++) {
            int v = X.charAt(i) - '0';
            res = (res + cur * v * pow10(N - i - 1, MOD)) % MOD;
            for (int j = Math.max(i - M + 1, 0); j <= i; j++) {
                int l = i - j;
                if ((j > 0 && hx.get(j, j + l) != hY[l]) || v <= X.charAt(j) - '0') {
                    continue;
                }
                res = (res + pow10(N - j - M, MOD)) % MOD;
            }
            if (i - M + 1 >= 0) {
                res = (res + v * pow10(N - i - M, MOD) * (N - i - M)) % MOD;
            }
            if (i - M + 1 >= 0 && hx.get(i - M + 1, i + 1) == hY[M]) {
                cur++;
            }
        }
        for (int j = 0; j <= N - M; j++) {
            if (hx.get(j, j + M) != hY[M]) {
                continue;
            }
            res++;
        }
        if (Y.equals("0")) {
            for (int i = 1; i < N; i++) {
                res = (res - 9 * pow10(N - i - 1, MOD) * i) % MOD;
            }
            res = (res - (N - 1)) % MOD;
        }
        return (res + MOD) % MOD;
    }

    static long pow10(int n, long mod) {
        long res = 1, pw = 10;
        while (n > 0) {
            if ((n & 1) != 0) {
                res = (res * pw) % mod;
            }
            pw = (pw * pw) % mod;
            n >>= 1;
        }
        return res;
    }

    static void solve() throws IOException {
        String[] input = br.readLine().split(" ");
        String A = input[0], B = input[1], C = input[2];
        long ans = calc(B, C);
        int a = Integer.parseInt(A);
        if (a > 0) {
            A = String.valueOf(a - 1);
            ans = (ans - calc(A, C) + MOD) % MOD;
        }
        pr.println(ans);
