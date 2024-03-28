class main:
    import sys
    
    mod = int(1e9+7)
    memo = [0]*9
    
    def make_memo():
        memo[0] = 1
        memo[1] = 1
        for i in range(2, 9):
            for bit in range(2**(i-2)):
                before = 0
                for j in range(9):
                    now = (bit >> j) & 1
                    if before == 1 and now == 1:
                        break
                    before = now
                    if j == 8:
                        memo[i] += 1
    
    def main():
        H, W, K = map(int, sys.stdin.readline().split())
        make_memo()
        dp = [[0]*W for _ in range(H+1)]
        dp[0][0] = 1
        for h in range(H):
            for w in range(W):
                if w+1 < W:
                    dp[h+1][w+1] += dp[h][w]*memo[w]*memo[W-1-w]
                    dp[h+1][w+1] %= mod
                if w-1 >= 0:
                    dp[h+1][w-1] += dp[h][w]*memo[w-1]*memo[W-1-w]
                    dp[h+1][w-1] %= mod
                dp[h+1][w] += dp[h][w]*memo[w]*memo[W-1-w]
                dp[h+1][w] %= mod
        print(dp[H][K-1])
    
    if __name__ == "__main__":
        main()