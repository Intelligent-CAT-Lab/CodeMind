<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3 2

Expected output:
1


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

@@ Response
```java
import java.util.*;
import java.io.*;

public class Main {
    static class RollingHash {
        long mod;
        long[] pw;
        long[] h;

        RollingHash(String s, long base, long mod) {
            this.mod = mod;
            pw = new long[s.length() + 1];
            h = new long[s.length() + 1];

            long v = 0;
            for (int i = 0; i < s.length(); i++) {
                h[i + 1] = v = (v * base + s.charAt(i)) % mod;
            }
            v = 1;
            for (int i = 0; i < s.length(); i++) {
                pw[i + 1] = v = v * base % mod;
            }
        }

        long get(int l, int r) {
            return (h[r] - h[l] * pw[r - l]) % mod;
        }
    }

    static long solve(String A, String B, String C) {
        long MOD = (long) Math.pow(10, 9) + 7;
        int L = Math.max(B.length(), C.length());
        long[] pw10 = new long[L + 1];
        long r = 1;
        for (int i = 1; i <= L; i++) {
            pw10[i] = r = r * 10 % MOD;
        }

        long calc(String X, String Y) {
            long mod = (long) Math.pow(10, 9) + 9;
            int N = X.length();
            int M = Y.length();
            if (N < M) {
                return 0;
            }
            RollingHash hx = new RollingHash(X, 37, mod);
            RollingHash hy = new RollingHash(Y, 37, mod);
            long[] hY = new long[M + 1];
            for (int i = 0; i <= M; i++) {
                hY[i] = hy.get(0, i);
            }
            long res = 0;
            long cur = 0;
            for (int i = 0; i < N; i++) {
                int v = X.charAt(i) - '0';
                res = (res + cur * v * pw10[N - (i + 1)]) % MOD;
                for (int j = Math.max(0, i - M + 1); j <= i; j++) {
                    if (j + M > N) {
                        break;
                    }
                    int l = i - j;
                    if ((0 < l && hx.get(j, j + l) != hY[l]) || v <= Y.charAt(i - j) - '0') {
                        continue;
                    }
                    res = (res + pw10[N - (j + M)]) % MOD;
                }
                if (M + (i + 1) <= N) {
                    res = (res + v * pw10[N - (M + i + 1)] * (N - (i + 1) - M + 1)) % MOD;
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
                    res = (res - 9 * pw10[N - i - 1] * i) % MOD;
                }
                res = (res - N + 1) % MOD;
            }
            return res % MOD;
        }

        long ans = calc(B, C);
        int a = Integer.parseInt(A);
        if (a > 0) {
            A = String.valueOf(a - 1);
            ans = (ans - calc(A, C) + MOD) % MOD;
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        String C = st.nextToken();
        System.out.println(
