class main:
    import math
    MOD = 1000000007
    
    def solve(n):
        n = str(n)
        n = n[::-1]
        n = [int(i) for i in n]
        dp = [[0 for i in range(3)] for j in range(61)]
        if n[0] == 0:
            dp[0][0] = 1
        else:
            dp[0][0] = 1
            dp[0][1] = 1
        for i in range(1, 61):
            dp[i][2] = (3 * dp[i + 1][2]) % MOD
            for j in range(3):
                c = 2 + n[i] - j
                if c >= 2:
                    dp[i][2] = (dp[i][2] + dp[i + 1][1]) % MOD
                else:
                    dp[i][c] = (dp[i][c] + dp[i + 1][1]) % MOD
            for j in range(3):
                c = n[i] - j
                if c < 0:
                    pass
                else:
                    dp[i][c] = (dp[i][c] + dp[i + 1][0]) % MOD
        ans = dp[0][0]
        ans = (ans + dp[0][1]) % MOD
        ans = (ans + dp[0][2]) % MOD
        return ans
    
    if __name__ == '__main__':
        n = int(input())
        print(solve(n))