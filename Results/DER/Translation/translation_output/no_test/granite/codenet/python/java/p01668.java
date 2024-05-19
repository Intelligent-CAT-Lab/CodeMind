System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
                if (0 < l and hx.get(j, j+l)!= hY[l]) or v <= int(Y[i-j]):
                    continue
                res += pw10[N - (j+M)]
            if M + (i+1) <= N:
                res += v * pw10[N - (M + i+1)] * (N - (i+1) - M + 1) % MOD
            if i-M+1 >= 0 and hx.get(i-M+1, i+1) == hY[M]:
                cur += 1
        for j in range(N-M+1):
            if hx.get(j, j+M)!= hY[M]:
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


Answer:
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    static final int MOD = 100000009;
    static final int BASE = 10;

    static class RollingHash {
        int[] h, pw;
        int mod;

        RollingHash(String s, int base, int mod) {
            this.mod = mod;
            pw = new int[s.length() + 1];
            h = new int[s.length() + 1];
            int v = 0;
            for (int i = 0; i < s.length(); i++) {
                h[i + 1] = v = (int) ((v * (long) base + s.charAt(i)) % mod);
            }
            v = 1;
            for (int i = 0; i < s.length(); i++) {
                pw[i + 1] = v = (int) (v * (long) base % mod);
            }
        }

        int get(int l, int r) {
            return (h[r] - (int) ((h[l] * (long) pw[r - l]) % mod) + mod) % mod;
        }
    }

    static int solve(String A, String B, String C) {
        int L = Math.max(A.length(), B.length());
        int[] pw10 = new int[L + 1];
        pw10[0] = 1;
        for (int i = 1; i <= L; i++) {
            pw10[i] = (int) ((pw10[i - 1] * (long) BASE) % MOD);
        }
        RollingHash hx = new RollingHash(A, BASE, MOD);
        RollingHash hy = new RollingHash(B, BASE, MOD);
        int[] hY = new int[C.length() + 1];
        for (int i = 0; i < C.length(); i++) {
            hY[i + 1] = hy.get(0, i + 1);
        }
        int res = 0, cur = 0;
        for (int i = 0; i < A.length(); i++) {
            int v = A.charAt(i) - '0';
            res = (int) ((res + (long) cur * v * pw10[A.length() - i - 1]) % MOD);
            for (int j = i - B.length() + 1; j <= i; j++) {
                if (j + B.length() > A.length()) {
                    break;
                }
                int l = i - j;
                if ((l > 0 && hx.get(j, j + l)!= hY[l]) || v < C.charAt(i - j) - '0') {
                    continue;
                }
                res = (int) ((res + pw10[A.length() - (j + B.length())]) % MOD);
            }
            if (i - B.length() + 1 >= 0 && hx.get(i - B.length() + 1, i + 1) == hY[B.length()]) {
                cur++;
            }
        }
        for (int j = 0; j <= A.length() - B.length(); j++) {
            if (hx.get(j, j + B.length()) == hY[B.length()]) {
                res = (res + 1) % MOD;
            }
        }
        if (C.equals("0")) {
            for (int i = 1; i < A.length(); i++) {
                res = (int) ((res - (long) 9 * pw10[A.length() - i - 1] * i) % MOD);
            }
            res = (int) ((res - (A.length() - 1)) % MOD);
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] tokens = in.readLine().split(" ");
        int ans = solve(tokens[0], tokens[1], tokens[2]);
        int a = Integer.parseInt(tokens[0]);
        if (a > 0) {
            ans = (ans - solve(String.valueOf(a - 1), tokens[1], tokens[2]) + MOD) % MOD;
        }
        out.println(ans);
        in.close();
        out.close();
    }
}
```<|endoftext|>
