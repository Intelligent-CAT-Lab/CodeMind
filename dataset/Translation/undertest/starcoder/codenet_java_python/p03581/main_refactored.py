class main:
    import sys
    
    def solve():
        mod = 1000000007
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
                    dp2Pref[x][y] = (dp2Pref[x][y] + dp2Pref[x - 1][y]) % mod
        dp = [[0 for _ in range(M)] for _ in range(M)]
        for red in range(M):
            for blue in range(M):
                if red == 0 or blue == 0:
                    dp[red][blue] = 1
                else:
                    dp[red][blue] = (dp[red][blue] + dp2Pref[red][blue - 1]) % mod
        res = 0
        a = int(sys.stdin.readline())
        b = int(sys.stdin.readline())
        for startRed in range(a + 1):
            for cntBlue in range(1, b + 1):
                curC = c[b - 1][cntBlue - 1]
                redStay = a - startRed - (b - cntBlue)
                if redStay < 0:
                    continue
                add = curC * dp[redStay][b - cntBlue] % mod
                res = (res + add) % mod
        print(res)
    
    if __name__ == '__main__':
        solve()