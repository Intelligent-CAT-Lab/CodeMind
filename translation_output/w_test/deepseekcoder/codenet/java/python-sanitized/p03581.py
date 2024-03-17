import sys

def solve():
    mod = int(1e9 + 7)
    M = 2222
    c = [[0 for _ in range(M)] for _ in range(M)]
    c[0][0] = 1
    for i in range(1, M):
        c[i][0] = 1
        for j in range(1, M):
            c[i][j] = (c[i - 1][j - 1] + c[i - 1][j]) % mod

    pow2 = [0 for _ in range(M)]
    pow2[0] = 1
    for i in range(1, M):
        pow2[i] = (pow2[i - 1] + pow2[i - 1]) % mod

    dp2 = [[0 for _ in range(M)] for _ in range(M)]
    for x in range(M):
        for y in range(M):
            if x == 0 or y == 0:
                dp2[x][y] = 1
            else:
                dp2[x][y] = (dp2[x - 1][y - 1] + dp2[x][y - 1]) % mod

    dp2Pref = [[0 for _ in range(M)] for _ in range(M)]
    for x in range(M):
        for y in range(M):
            dp2Pref[x][y] = dp2[x][y]
            if x > 0:
                dp2Pref[x][y] += dp2Pref[x - 1][y]
                if dp2Pref[x][y] >= mod:
                    dp2Pref[x][y] -= mod

    dp = [[0 for _ in range(M)] for _ in range(M)]
    for red in range(M):
        for blue in range(M):
            if red == 0 or blue == 0:
                dp[red][blue] = 1
            else: