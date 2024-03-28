
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int MOD = 1000000007;
        int ans = 0;

        // l has <= 7 digits
        int r = 1;
        int tot = 1;
        for (int l = 1; l < 10000000; l++) {
            while (tot < S) {
                r++;
                tot += String.valueOf(r).length();
            }
            if (tot == S) ans++;
            tot -= String.valueOf(l).length();
        }

        // l has > 7 digits
        for (int cnt = 1; cnt <= S; cnt++) {
            int d = S / cnt;
            int m = S % cnt;
            if (d <= 7) break;
            if (m != 0) ans++;
            else {
                ans += (int)Math.pow(10, d, MOD) - (int)Math.pow(10, d-1, MOD) - cnt + 1;
                ans %= MOD;
            }
        }
        System.out.println(ans % MOD);
    }
}
```
/atcoder/abc/abc129/abc129_c.py
# https://atcoder.jp/contests/abc129/tasks/abc129_c
# C - Typical Stairs

import sys
sys.setrecursionlimit(10**6)

N, M = map(int, input().split())
A = [int(input()) for _ in range(M)]

MOD = 10**9+7

dp = [0] * (N+1)
dp[0] = 1

for i in range(1, N+1):
    if i in A:
        continue
    dp[i] = dp[i-1]
    if i >= 2:
        dp[i] += dp[i-2]
    dp[i] %= MOD

print(dp[N])
/atcoder/abc/abc129/abc129_b.py
# https://atcoder.jp/contests/abc129/tasks/abc129_b
# B - Balance

N = int(input())
W = list(map(int, input().split()))

ans = 10**9
for i in range(1, N):
  i]
    right = sum(W[i:])
    ans = min(ans, abs(left - right))

print(ans)
  left = sum(W[:i])
    # W[/atcoder/abc/abc129/abc129_d.py
# https://atcoder.jp/contests/abc129/tasks/abc129_d
# D - Lamp

import sys
sys.setrecursionlimit(10**6)

H, W = map(int, input().split())
S = [input() for _ in range(H)]

# 各マスから左右上下に何マス見えるか
# 左右
L = [[0] * W for _ in range(H)]
R = [[0] * W for _ in range(H)]
for i in range(H):
    for j in range(W):
        if S[i][j] == '#':
            continue
        if j == 0:
            L[i][j] = 1
        else:
            L[i][j] = L[i][j-1] + 1
for i in range(H):
    for j in range(W-1, -1, -1):
        if S[i][j] == '#':
            continue
        if j == W-1:
            R[i][j] = 1
        else:
            R[i][j] = R[i][j+1] + 1

# 上下
U = [[0] * W for _ in range(H)]
D = [[0] * W for _ in range(H)]
for j in range(W):
    for i in range(H):
        if S[i][j] == '#':
            continue
        if i == 0:
            U[i][j] = 1
        else:
            U[i][j] = U[i-1][j] + 1
for j in range(W):
    for i in range(H-1, -1, -1):
        if S[i][j] == '#':
            continue
        if i == H-1:
            D[i][j] = 1
        else:
            D[i][j] = D[i+1][j] + 1

ans = 0
for i in range(H):
    for j in range(W):
        if S[i][j] == '#':
            continue
        ans = max(ans, L[i][j] + R[i][j] + U[i][j] + D[i][j] - 3)

print(ans)
/atcoder/abc/abc129/abc129_a.py
# https://atcoder.jp/contests/abc129/tasks/abc129_a
# A - Airplane

P, Q, R = map(int, input().split())

ans = min(P+Q, Q+R, R+P)
print(ans)
 10**9+7

ans = 0
for i in range(1, N+1):
    ans += i * pow(10, i, MOD)
    ans %= MOD

print(ans)
/atcoder/abc/abc129/abc129_e.py
# https://atcoder.jp/contests/abc129/tasks/abc129_e
# E - 100 to 10^5

N = int(input())
MOD =
