import sys

def complex(N):
    res = [[0 for _ in range(N+1)] for _ in range(N+1)]
    for i in range(N+1):
        res[i][0] = res[i][i] = 1
        for j in range(1, i):
            res[i][j] = (res[i-1][j] + res[i-1][j-1]) % M
    return res

def stirling(N):
    res = [[0 for _ in range(N+1)] for _ in range(N+1)]
    # iåãç©ºã§ãªãjã«åå²(å«ã¾ããªããã®ãåã£ã¦ãè¯ã)
    for i in range(N+1):
        res[i][0] = res[i][i] = 1
        for j in range(1, i):
            res[i][j] = (res[i-1][j-1] + (j+1)*res[i-1][j]) % M
    return res

def beki(a, x, mod):
    res = 1
    for _ in range(32):
        if x & 1:
            res = (res * a) % mod
        a = (a * a) % mod
        x >>= 1
    return res

def ways(i):
    res = 0
    b1 = beki(2, N-i, M)
    beki1 = 1
    beki2 = beki(2, beki(2, N-i, M-1) % (M-1), M)
    for j in range(i+1):
        res = (res + ways2(i, j, beki1, beki2)) % M
        beki1 = (beki1 * b1) % M
    return res

def ways2(i, j, beki1, beki2):
    return ((S[i][j] * beki1) % M * beki2 % M) % M

N, M = map(int, input().split())
C = complex(N)
S = stirling(N)
ans = 0
for i in range(N+1):
    ans = (ans + (-1)**i * C[N][i] * ways(i)) % M
print(ans)