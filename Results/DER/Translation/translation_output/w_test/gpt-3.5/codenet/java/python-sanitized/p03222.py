def make_memo():
    memo = [0] * 9
    memo[0] = 1
    memo[1] = 1
    for i in range(2,9):
        for bit in range(2**(i-2)):
            before = 0
            for j in range(9):
                now = (bit >> j) & 1
                if before == 1 and now == 1:
                    break
                before = now
                if j == 8:
                    memo[i] += 1
    return memo

def main():
    mod = 10**9 + 7
    memo = make_memo()

    H, W, K = map(int, input().split())

    dp = [[0] * W for _ in range(H+1)]
    dp[0][0] = 1

    for h in range(H):
        for w in range(W):
            if w+1 < W:
                dp[h+1][w+1] += dp[h][w] * memo[w] % mod * memo[(W-1)-(w+1)] % mod
                dp[h+1][w+1] %= mod
            if w-1 >= 0:
                dp[h+1][w-1] += dp[h][w] * memo[w-1] % mod * memo[(W-1)-w] % mod
                dp[h+1][w-1] %= mod
            dp[h+1][w] += dp[h][w] * memo[w] % mod * memo[(W-1)-w] % mod
            dp[h+1][w] %= mod

    ans = dp[H][K-1]
    print(ans)

if __name__ == "__main__":
    main()