<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class RollingHash {
    private int mod;
    private int[] pw;
    private int[] h;

    public RollingHash(String s, int base, int mod) {
        this.mod = mod;
        this.pw = new int[s.length() + 1];
        this.h = new int[s.length() + 1];

        int v = 0;
        for (int i = 0; i < s.length(); i++) {
            h[i + 1] = v = (v * base + s.charAt(i)) % mod;
        }
        v = 1;
        for (int i = 0; i < s.length(); i++) {
            pw[i + 1] = v = v * base % mod;
        }
    }

    public int get(int l, int r) {
        return (h[r] - h[l] * pw[r - l]) % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();

        int L = Math.max(A.length(), Math.max(B.length(), C.length()));
        int[] pw10 = new int[L + 1];
        int r = 1;
        for (int i = 1; i <= L; i++) {
            pw10[i] = r = r * 10 % (int) 1e9 + 7;
        }

        RollingHash rh = new RollingHash(A, 37, (int) 1e9 + 7);
        RollingHash rh2 = new RollingHash(B, 37, (int) 1e9 + 7);
        RollingHash rh3 = new RollingHash(C, 37, (int) 1e9 + 7);

        int ans = 0;
        for (int i = 0; i < L; i++) {
            int v = Integer.parseInt(A.substring(i, i + 1));
            ans += (rh.get(i, i + 1) - rh2.get(i, i + 1) * pw10[i + 1]) % (int) 1e9 + 7;
        }

        for (int i = 0; i < L - B.length() + 1; i++) {
            if (rh2.get(i, i + B.length()) != rh3.get(i, i + B.length())) {
                continue;
            }
            ans++;
        }

        if (B.equals("0")) {
            for (int i = 1; i < L - C.length() + 1; i++) {
                ans -= (pw10[L - i - 1] * i) % (int) 1e9 + 7;
            }
            ans -= L - 1;
        }

        ans %= (int) 1e9 + 7;
        System.out.println(ans);
    }
}
```</s>
