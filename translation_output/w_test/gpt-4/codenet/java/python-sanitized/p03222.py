def make_memo():
    memo[0] = 1
    memo[1] = 1
    for i in range(2, 9):
        for bit in range(1 << (i - 1)):
            before = 0
            for j in range(i):
                now = (bit >> j) & 1
                if before == 1 and now == 1:
                    break
                before = now
                if j == i - 1:
                    memo[i] += 1

if __name__ == "__main__":
    mod = int(1e9+7)
    memo = [0 for _ in range(9)]
    
    H, W, K = map(int, input().split())
    
    make_memo()
    
    dp = [[0] * W for _ in range(H+1)]
    dp[0][0] = 1
    for h in range(H):
        for w in range(W):
            if w + 1 < W:
                dp[h + 1][w + 1] += dp[h][w] * memo[w] % mod * memo[W - 2 - w] % mod
                dp[h + 1][w + 1] %= mod
            
            if w - 1 >= 0:
                dp[h + 1][w - 1] += dp[h][w] * memo[w - 1] % mod * memo[W - w] % mod
                dp[h + 1][w - 1] %= mod
                
            dp[h + 1][w] += dp[h][w] * memo[w] % mod * memo[W - 1 - w] % mod
            dp[h + 1][w] %= mod
            
    ans = dp[H][K - 1]
    print(ans)