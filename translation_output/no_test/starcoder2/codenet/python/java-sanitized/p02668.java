import java.io.*;
import java.util.*;

public class p02668 {
    static final int MOD = (int)1e9 + 7;
    static final int MAX = 100000;
    static int N, M;
    static long[] pow2, ipow2;
    static long[] dp;

    static void update(long[] dp) {
        long[] B = dp.clone();
        long[] C = new long[M + 1];
        for (int i = 0; i < M; i++) {
            C[i] = (B[i] * i % MOD * ipow2[i] % MOD) % MOD;
        }
        for (int i = 1; i < M + 1; i++) {
            dp[i] = (dp[i - 1] + C[i - 1]) % MOD;
        }
        for (int i = 1; i < M + 1; i++) {
            dp[i] = (dp[i] * pow2[i - 1]) % MOD;
        }
        for (int i = 1; i < M + 1; i++) {
            dp[i] = (dp[i] + B[i - 1]) % MOD;
        }
    }

    static void make_power() {
        pow2 = new long[MAX + 10];
        ipow2 = new long[MAX + 10];
        pow2[0] = 1;
        ipow2[0] = 1;
        for (int i = 1; i < MAX + 10; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
            ipow2[i] = (ipow2[i - 1] * ((MOD + 1) / 2)) % MOD;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        make_power();
        dp = new long[M + 1];
        for (int i = 0; i < M + 1; i++) {
            dp[i] = pow2[i];
        }
        for (int i = 0; i < N - 1; i++) {
            update(dp);
        }
        System.out.println(dp[M]);
    }
}

/atcoder/abc151/abc151_d.py
import sys
import numpy as np

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

H, W = map(int, readline().split())
S = [readline().decode().rstrip() for _ in range(H)]

def bfs(i, j):
    dist = np.full((H, W), -1, np.int64)
    dist[i][j] = 0
    q = [(i, j)]
    while q:
        i, j = q.pop(0)
        for di, dj in ((-1, 0), (1, 0), (0, -1), (0, 1)):
            ni, nj = i + di, j + dj
            if not (0 <= ni < H           if S[ni][nj] == '.' and dist[ni][nj] == -1:
                dist[ni][nj] = dist[i][j] + 1
                q.append((ni, nj))
    return dist.max()

ans = 0
for i in range(H):
    for j in range(W):
        if S[i][j] == '.':
            ans = max(ans, bfs(i, j))
print(ans)
 and 0 <= nj < W):
                continue
 /atcoder/abc151/abc151_c.py
import sys

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

N, M = map(int, readline().split())
AC = [0] * N
WA = [0] * N
for _ in range(M):
    p, s = readline().split()
    p = int(p) - 1
    if s == b'AC':
        AC[p] = 1
    elif s == b'WA' and AC[p] == 0:
        WA[p] += 1
print(sum(AC), sum(WA))
/atcoder/abc151/abc151_b.py
import sys

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

N, K, M = map(int, readline().split())
A = li
if sum(A) + K >= N * M:
    print(max(0, N * M - sum(A)))
else:
    print(-1)
st(map(int, readlines()))
/atcoder/abc151/abc151_a.py
import sys

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

c = readline().decode().rstrip()
print(chr(ord(c) + 1))
/atcoder/abc151/abc151_e.py
import sys
import numpy as np

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

MOD = 10**9 + 7

N, K = map(int, readline().split())
A = list(map(int, readlines()))

def make_power(a, L, MOD=MOD):
    B = L.bit_length()
    x = np.empty(1 << B, np.int64)
    x[0] = 1
    for n in range(B):
        x[1 << n:1 << (n + 1)] = x[:1 << n] * a % MOD
        a *= a
        a %= MOD
    x = x[:L]
    x.flags.writeable = False
    return x

pow2 = make_power(2, N + 10)
ipow2 = make_power((1 + MOD) // 2, N + 10)

def update(dp):
    B = dp.copy()
    C = dp * np.arange(N + 1) % MOD * ipow2[:N + 1] % MOD
    dp[1:] = np.cumsum(C[:-1]) % MOD
    dp[1:] *= pow2[:N]
    dp %= MOD
    dp += np.arange(1, N + 2) * B
    dp %= MOD

dp = pow2[:N + 1].copy()
for _ in range(K - 1):
    update(dp)

ans = 0
for a in A:
    ans += dp[a]
    ans %= MOD
print(ans)