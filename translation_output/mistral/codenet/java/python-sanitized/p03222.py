import sys

mod = 1000000007
memo = [0] * 9

def make_memo():
    memo[0] = memo[1] = 1
    for i in range(2, 9):
        for bit in range(1 << (i - 2)):
            before = 0
            for j in range(9):
                now = (bit >> j & 1)
                if before == 1 and now == 1:
                    break
                before = now
            memo[i] += memo[j]

def solve(H, W, K):
    dp = [[0] * (W + 1) for _ in range(H + 1)]
    dp[0][0] = 1
    for h in range(1, H + 1):
        for w in range(1, W + 1):
            # down
            if w < W:
                dp[h][w + 1] += dp[h - 1][w] * memo[w] % mod * memo[(W - 1) - (w + 1)] % mod
                dp[h][w + 1] %= mod
            # left
            if w > 0:
                dp[h][w - 1] += dp[h - 1][w] * memo[w - 1] % mod * memo[(W - 1) - w] % mod
                dp[h][w - 1] %= mod
            # up
            dp[h][w] += dp[h - 1][w] * memo[w] % mod * memo[(W - 1) - w] % mod
            dp[h][w] %= mod
    ans = dp[H][K - 1]
    return ans

if __name__ == "__main__":
    H = int(input())
    W = int(input())
    K = int(input())
    make_memo()
    print(solve(H, W, K))