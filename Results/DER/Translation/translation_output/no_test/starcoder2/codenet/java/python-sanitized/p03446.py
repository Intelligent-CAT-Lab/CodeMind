import math

P = 1000000007
C = 110

ways = [[0 for i in range(C)] for j in range(C)]

for i in range(C):
    ways[i][0] = ways[i][i] = 1
    for j in range(1, i):
        ways[i][j] = (ways[i - 1][j] + ways[i - 1][j - 1]) % P

def one2D(a, p, b, q):
    return (pow(b, p - 1, P) + pow(a, q - 1, P) - 1) % P

def pow(a, b):
    ret = 1
    while b > 0:
        if b & 1:
            ret = (ret * a) % P
        a = (a * a) % P
        b >>= 1
    return ret

def submit():
    a, b, c, d, e, f = map(int, input().split())
    if d % a != 0 or e % b != 0 or f % c != 0:
        print(0)
        return
    p = d // a
    q = e // b
    r = f // c
    dp = [[0 for i in range(q + 1)] for j in range(p + 1)]
    dp[p][q] = 1
    ans = 0
    for x in range(p - 1, 0, -1):
        for y in range(q - 1, 0, -1):
            dp[x][y] = (ways[p][x] * ways[q][y] * pow(c