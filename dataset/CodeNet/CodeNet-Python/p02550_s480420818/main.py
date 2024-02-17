'''
Doubling

nxt[i][r] = the value of r mod M after 2 ** i squaring
dp[i][r] = the sum of sequence of lenght 2 ** i starting from r

We split sequence A into multiple disjoint parts, 
where the lengths of each parts are the binary decomposition of N.

e.g.
N = 11 = 1 + 2 + 8
A = A[0:1], A[1:3], A[3:11]
Sum of each parts are:
sum(A[0:1]) = dp[0][A[0] % M]
sum(A[1:3]) = dp[1][A[1] % M]
sum(A[3:11]) = dp[3][A[3] % M]
'''

import math

N, X, M = map(int, input().split())

H = math.ceil(math.log2(N)) + 1

nxt = [[0] * M for _ in range(H)]
dp = [[0] * M for _ in range(H)]
nxt[0] = [r ** 2 % M for r in range(M)]
dp[0] = list(range(M))

for i in range(1, H):
    for r in range(M):
        nxt[i][r] = nxt[i - 1][nxt[i - 1][r]]
        dp[i][r] = dp[i - 1][r] + dp[i - 1][nxt[i - 1][r]]

ans = 0
r = X % M
for i in range(H):
    if N & (1 << i):
        ans += dp[i][r]
        r = nxt[i][r]
print(ans)

