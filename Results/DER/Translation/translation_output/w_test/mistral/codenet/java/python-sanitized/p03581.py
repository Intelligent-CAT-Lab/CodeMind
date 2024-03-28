import sys

def solve():
    mod = 1000000007
    M = 2222
    c = [[0 for _ in range(M)] for _ in range(M)]
    c[0][0] = 1
    for i in range(1, M):
        c[i][0] = 1
        for j in range(1, M):
            c[i][j] = c[i - 1][j - 1] + c[i - 1][j]
            if c[i][j] >= mod:
                c[i][j] -= mod
    pow2 = [1] * M
    for i in range(1, M):
        pow2[i] = pow2[i - 1] + pow2[i - 1]
        if pow2[i] >= mod:
            pow2[i] -= mod
    dp2 = [[0 for _ in range(M)] for _ in range(M)]
    for x in range(M):
        for y in range(M):
            if x == 0 or y == 0:
                dp2[x][y] = 1
            else:
                dp2[x][y] = dp2[x - 1][y - 1] + dp2[x][y - 1]
                if dp2[x][y] >= mod:
                    dp2[x][y] -= mod
    dp2Pref = [[0 for _ in range(M)] for _ in range(M)]
    for x in range(M):
        for y in range(M):
            dp2Pref[x][y] = dp2[x][y]
            if x > 0:
                dp2Pref[x][y] += dp2Pref[x - 1][y]
                if dp2Pref[x][y] >= mod:
                    dp2Pref[x][y] -= mod
    dp = [[0 for _ in range(M)] for _ in