System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class RollingHash {
        private static final long MOD = (long) 1e9 + 9;
        private static final long BASE = 10;
        private final long[] hash;
        private final long[] pow;
        private final String s;

        public RollingHash(String s) {
            this.s = s;
            int n = s.length();
            hash = new long[n + 1];
            pow = new long[n + 1];
            pow[0] = 1;
            for (int i = 0; i < n; i++) {
                hash[i + 1] = (hash[i] * BASE + s.charAt(i)) % MOD;
                pow[i + 1] = pow[i] * BASE % MOD;
            }
        }

        public long get(int l, int r) {
            return (hash[r] - hash[l] * pow[r - l] % MOD + MOD) % MOD;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int n = Math.max(b.toString().length(), c.toString().length());
        RollingHash rhB = new RollingHash(String.valueOf(b));
        RollingHash rhC = new RollingHash(String.valueOf(c));
        long[] pow10 = new long[n + 1];
        pow10[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow10[i] = pow10[i - 1] * 10 % RollingHash.MOD;
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int d = i < b.toString().length()? b.toString().charAt(i) - '0' : 0;
            for (int j = d; j <= 9; j++) {
                if (i < c.toString().length() && j > c.toString().charAt(i) - '0') {
                    break;
                }
                int l = i + 1, r = n - l;
                if (r >= 0 && rhB.get(i + 1, n + 1) == rhC.get(0, r) && (r == 0 || j < c.toString().charAt(i) - '0')) {
                    ans += pow10[r];
                    if (ans >= RollingHash.MOD) {
                        ans -= RollingHash.MOD;
                    }
                }
            }
        }
        if (c == 0) {
            for (int i = 1; i < n; i++) {
                ans -= 9 * pow10[i - 1] % RollingHash.MOD * i % RollingHash.MOD;
                if (ans < 0) {
                    ans += RollingHash.MOD;
                }
            }
            ans -= n - 1;
            if (ans < 0) {
                ans += RollingHash.MOD;
            }
        }
        long res = 0;
        for (int i = 1; i <= a; i++) {
            res += ans;
            if (res >= RollingHash.MOD) {
                res -= RollingHash.MOD;
            }
        }
        System.out.println(res);
    }
}
```<|endoftext|>
