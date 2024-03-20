Below is an instruction that describes a task. Write a response that appropriately completes the request.

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

### Response:
```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int ans = solve(arr);
        bw.write(ans + "\n");
        bw.close();
    }

    public static int solve(int[] arr) {
        int MOD = 1000000007;
        int A = arr[0];
        int B = arr[1];
        int C = arr[2];
        int L = Math.max(B.length(), C.length());
        int[] pw10 = new int[L+1];
        pw10[0] = 1;
        for (int i = 1; i <= L; i++) {
            pw10[i] = (pw10[i-1] * 10) % MOD;
        }
        class RollingHash {
            int mod;
            int[] pw;
            int[] h;
            public RollingHash(String s, int base, int mod) {
                this.mod = mod;
                this.pw = new int[s.length()+1];
                this.h = new int[s.length()+1];
                int v = 0;
                for (int i = 0; i < s.length(); i++) {
                    h[i+1] = v = (v * base + s.charAt(i)) % mod;
                }
                v = 1;
                for (int i = 0; i < s.length(); i++) {
                    pw[i+1] = v = (v * base) % mod;
                }
            }
            public int get(int l, int r) {
                return (h[r] - h[l] * pw[r-l]) % mod;
            }
        }
        RollingHash hx = new RollingHash(B, 37, MOD);
        RollingHash hy = new RollingHash(C, 37, MOD);
        int[] hY = new int[C.length()+1];
        for (int i = 0; i <= C.length(); i++) {
            hY[i] = hy.get(0, i);
        }
        int res = 0;
        int cur = 0;
        for (int i = 0; i < B.length(); i++) {
            int v = B.charAt(i) - '0';
            res = (res + cur * v * pw10[B.length() - (i+1)]) % MOD;
            for (int j = i-C.length()+1; j <= i; j++) {
                if (j+C.length() > B.length()) {
                    break;
                }
                int l = i-j;
                if (l > 0 && hx.get(j, j+l)!= hY[l]) {
                    continue;
                }
                res = (res + pw10[B.length() - (j+C.length())]) % MOD;
            }
            if (C.length() + (i+1) <= B.length()) {
                res = (res + v * pw10[B.length() - (C.length() + i+1)] * (B.length() - (i+1) - C.length() + 1)) % MOD;
            }
            if (i-C.length()+1 >= 0 && hx.get(i-C.length()+1, i+1) == hY[C.length()]) {
                cur = (cur + 1) % MOD;
            }
        }
        for (int j = 0; j < B.length()-C.length()+1; j++) {
            if (hx.get(j, j+C.length())!= hY[C.length()]) {
                continue;
            }
            res = (res + 1) % MOD;
        }
        if (C.equals("0")) {
            for (int i = 1; i < B.length(); i++) {
                res = (res - 9 * pw10[B.length() - i - 1] * i) % MOD;
            }
            res = (res - (B.length() - 1)) % MOD;
        }
        return res;
    }
}
```<|endoftext|>
