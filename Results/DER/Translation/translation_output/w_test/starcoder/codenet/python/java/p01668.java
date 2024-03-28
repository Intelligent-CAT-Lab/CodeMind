<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int MOD = 1000000007;
        String[] s = in.nextLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        int l = Math.max(s[0].length(), s[1].length());
        int[] pw10 = new int[l+1];
        pw10[0] = 1;
        for (int i = 1; i <= l; i++) {
            pw10[i] = pw10[i-1] * 10 % MOD;
        }
        int calc(int x, int y) {
            int mod = 1000000009;
            int n = (int) Math.log10(x) + 1;
            int m = (int) Math.log10(y) + 1;
            if (n < m) return 0;
            int[] h = new int[m+1];
            for (int i = 0; i <= m; i++) {
                h[i] = (int) (h[i-1] * 37 % mod + y % mod) % mod;
            }
            int res = 0;
            int cur = 0;
            for (int i = 0; i < n; i++) {
                int v = x % 10;
                res = (res + cur * v * pw10[n - i - 1]) % mod;
                for (int j = i - m + 1; j <= i; j++) {
                    if (j + m > n) break;
                    int l = i - j;
                    if (l > 0 && (h[l]!= h[0] || v <= y % 10)) continue;
                    res = (res + pw10[n - j - m]) % mod;
                }
                if (m + i + 1 <= n) {
                    res = (res + v * pw10[n - m - i - 1] * (n - i - m + 1)) % mod;
                }
                if (i - m + 1 >= 0 && h[m] == h[0]) {
                    cur = (cur + 1) % mod;
                }
            }
            for (int j = 0; j < n - m + 1; j++) {
                if (h[0]!= h[m]) continue;
                res = (res + 1) % mod;
            }
            if (y == 0) {
                for (int i = 1; i < n; i++) {
                    res = (res - 9 * pw10[n - i - 1] * i) % mod;
                }
                res = (res - n + 1) % mod;
            }
            return res;
        }
        int ans = calc(b, c);
        if (a > 0) {
            ans = (ans - calc(a - 1, c)) % MOD;
        }
        System.out.println(ans);
    }
}

```

'''
<|endoftext|>
