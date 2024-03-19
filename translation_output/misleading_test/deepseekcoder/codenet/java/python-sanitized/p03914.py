MOD = 1000000007

def solve(n, m):
    dp = {(1, 0): 1}
    for _ in range(m):
        next_dp = {(a % n, b): 0 for a in range(n+1) for b in range(n+1)}
        for (a, b), v in dp.items():
            next_dp[(a+b)%n, 0] = (next_dp[(a+b)%n, 0] + v * a) % MOD
            next_dp[a, b+1] = (next_dp[a, b+1] + v * (n-a-b)) % MOD
            next_dp[a, b] = (next_dp[a, b] + v * b) % MOD
        dp = next_dp
    return dp[n, 0]

n, m = map(int, input().split())
print(solve(n, m))