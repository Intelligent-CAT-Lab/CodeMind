System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class RollingHash {
        static final long MOD = (long) 1e9 + 9;
        static final long BASE = 10;
        long[] hash, pow;
        int len;

        RollingHash(char[] s) {
            len = s.length;
            hash = new long[len + 1];
            pow = new long[len + 1];
            pow[0] = 1;
            for (int i = 0; i < len; i++) {
                hash[i + 1] = (hash[i] * BASE + s[i]) % MOD;
                pow[i + 1] = pow[i] * BASE % MOD;
            }
        }

        long get(int l, int r) {
            return (hash[r] - hash[l] * pow[r - l] % MOD + MOD) % MOD;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int max = Math.max(b.toString().length(), c.toString().length());
        long[] pow10 = new long[max];
        pow10[0] = 1;
        for (int i = 1; i < max; i++) {
            pow10[i] = pow10[i - 1] * 10 % RollingHash.MOD;
        }
        RollingHash rhB = new RollingHash(String.valueOf(b).toCharArray());
        RollingHash rhC = new RollingHash(String.valueOf(c).toCharArray());
        long ans = 0;
        for (int i = 0; i < a; i++) {
            int len = String.valueOf(i).length();
            for (int j = 1; j <= len; j++) {
                if (i + j > a) {
                    break;
                }
                String sub = String.valueOf(i).substring(len - j);
                if (sub.length() < c.toString().length()) {
                    continue;
                }
                if (rhB.get(0, j) == rhC.get(0, j) && (sub.length() == c.toString().length() || sub.compareTo(c.toString()) < 0)) {
                    ans += pow10[max - j - 1] * (a - i - j + 1) % RollingHash.MOD;
                }
            }
        }
        if (c == 0) {
            for (int i = 1; i < a; i++) {
                ans -= (a - i) * 9 * pow10[max - 2] % RollingHash.MOD;
            }
            ans -= (a - 1) * 9 % RollingHash.MOD;
        }
        System.out.println(ans % RollingHash.MOD);
    }
}
<|endoftext|>
