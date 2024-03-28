class main:
    MOD = 10**9 + 7
    
    def solve():
        n, x, y, z = map(int, input().split())
        sum_val = x + y + z + 1
        mask = (1 << sum_val) - 1
        dp = [[0] * (mask + 1) for _ in range(n + 1)]
        ng = 0
        ng |= 1 << z
        ng |= 1 << (y + z)
        ng |= 1 << (x + y + z)
        dp[0][1] = 1
        for i in range(n):
            for state in range(mask + 1):
                for j in range(1, 11):
                    res = ((state << j) & mask) + 1
                    if res & ng == ng:
                        continue
                    dp[i + 1][res] += dp[i][state]
                    dp[i + 1][res] %= MOD
        ans = 1
        for i in range(n):
            ans *= 10
            ans %= MOD
        for i in range(mask + 1):
            ans -= dp[n][i]
            ans %= MOD
        print((ans + MOD) % MOD)
    
    # Input function for testing the solution
    def input():
        return input().split()
    
    # Test the function with the sample input
    solve()