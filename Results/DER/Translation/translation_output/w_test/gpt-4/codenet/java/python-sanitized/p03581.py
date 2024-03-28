MOD = int(1e9) + 7
M = 2222

def solve(a, b):
    c = [[0] * M for _ in range(M)]
    c[0][0] = 1
    for i in range(1, M):
        c[i][0] = 1
        for j in range(1, M):
            c[i][j] = (c[i - 1][j - 1] + c[i - 1][j]) % MOD

    pow2 = [1] * M
    for i in range(1, M):
        pow2[i] = (pow2[i - 1] << 1) % MOD

    dp2 = [[0] * M for _ in range(M)]
    for x in range(M):
        for y in range(M):
            if x == 0 or y == 0:
                dp2[x][y] = 1
            else:
                dp2[x][y] = (dp2[x - 1][y - 1] + dp2[x][y - 1]) % MOD

    dp2_pref = [[0] * M for _ in range(M)]
    for x in range(M):
        for y in range(M):
            dp2_pref[x][y] = dp2[x][y]
            if x > 0:
                dp2_pref[x][y] = (dp2_pref[x][y] + dp2_pref[x - 1][y]) % MOD

    dp = [[0 if not (red == 0 or blue == 0) else 1 for blue in range(M)] for red in range(M)]
    for red in range(1, M):
        for blue in range(1, M):
            dp[red][blue] = dp2_pref[red][blue - 1]

    res = 0
    for start_red in range(a + 1):
        for cnt_blue in range(1, b + 1):
            cur_c = c[b - 1][cnt_blue - 1]
            red_stay = a - start_red - (b - cnt_blue)
            if red_stay < 0:
                continue
            add = cur_c * dp[red_stay][b - cnt_blue] % MOD
            res = (res + add) % MOD

    return res

def main():
    a, b = map(int, input().split())
    result = solve(a, b)
    print(result)

if __name__ == "__main__":
    main()