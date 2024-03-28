import sys

def beki(a, x, mod):
    res = 1
    for i in range(32):
        if ((x >> i) & 1) == 1:
            res = (res * a) % mod
        a = (a * a) % mod
    return res

def ways(i):
    res = 0
    b1 = beki(2, N - i, M)
    beki1 = 1
    beki2 = beki(2, beki(2, N - i, M - 1) % (M - 1), M)
    for j in range(i + 1):
        res = (res + ways2(i, j, beki1, beki2)) % M
        beki1 = (beki1 * b1) % M
    return res

def ways2(i, j, beki1, beki2):
    return ((S[i][j] * beki1) % M * beki2 % M) % M

def complex(n):
    res = [[0 for _ in range(n + 1)] for _ in range(n + 1)]
    for i in range(n + 1):
        res[i][0] = res[i][i] = 1
        for j in range(1, i):
            res[i][j] = (res[i - 1][j] + res[i - 1][j - 1]) % M
    return res

def stirling(n):
    res = [[0 for _ in range(n + 1)] for _ in range(n + 1)]
    for i in range(n + 1):
        res[i][0] = res[i][i] = 1
        for j in range(1, i):
            res[i][j] = (res[i - 1][j - 1] + (j + 1) * (res[i - 1][j] % M)) % M
    return res

if __name__ == "__main__":
    N, M = map(int, sys.stdin.readline().split())
    C = complex(N)
    S = stirling(N)
    ans = 0
    for i in range(N + 1):
        ans = (ans + (C[N][i] * ways(i)) % M) % M
    print(ans)