import sys

def mod(n, m):
    return (n % m + m) % m

def make_memo(n):
    memo = [0] * (n + 1)
    memo[0] = memo[1] = 1
    for i in range(2, n + 1):
        for j in range(1 << (i - 2), 1 << i):
            before = 0
            for k in range(n + 1):
                now = (j >> k & 1)
                if before == 1 and now == 1:
                    break
                before = now
            memo[i] += memo[i - 1]
    return memo

def solve(H, W, K):
    memo = make_memo(9)
    dp = [[0] * (W + 1) for _ in range(H + 1)]
    dp[0][0] = 1
    for h in range(1, H + 1):
        for w in range(1, W + 1):
            # up
            if w + 1 < W:
                dp[h + 1][w + 1] += dp[h][w] * memo[w] * memo[(W - 1) - (w + 1)]
                dp[h + 1][w + 1] %= mod(1000000007, 1000000007)
            # down
            if w - 1 >= 0:
                dp[h + 1][w - 1] += dp[h][w] * memo[w - 1] * memo[(W - 1) - w]
                dp[h + 1][w - 1] %= mod(1000000007, 1000000007)
            # left
            dp[h + 1][w] += dp[h][w] * memo[w] * memo[(W - 1) - w]
            dp[h + 1][w] %= mod(1000000007, 1000000007)
    ans = dp[H][K - 1]
    return ans

if __name__ == "__main__":
    H = int(input())
    W = int(input())
    K = int(input())
    ans = solve(H, W, K)
    print(ans)