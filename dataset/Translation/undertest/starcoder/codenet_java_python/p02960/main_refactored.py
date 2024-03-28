class main:
    import sys
    
    def solve():
        S = sys.stdin.readline().strip()
        dp = [1] * 13
        base = 1
        for i in range(len(S) - 1, -1, -1):
            next_dp = [0] * 13
            if S[i] == '?':
                for k in range(10):
                    for j in range(13):
                        next_dp[(k * base + j) % 13] += dp[j]
                        next_dp[(k * base + j) % 13] %= 1000000007
            else:
                k = int(S[i])
                for j in range(13):
                    next_dp[(k * base + j) % 13] += dp[j]
                    next_dp[(k * base + j) % 13] %= 1000000007
            dp = next_dp
            base *= 10
            base %= 13
        print(dp[5])
    
    if __name__ == '__main__':
        solve()