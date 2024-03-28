def solve(S):
    dp = [1] + [0] * 12
    base = 1
    MOD = 1000000007

    for digit in reversed(S):
        next_dp = [0] * 13
        if digit == '?':
            for k in range(10):
                for j in range(13):
                    next_dp[(k * base + j) % 13] += dp[j]
                    next_dp[(k * base + j) % 13] %= MOD
        else:
            k = int(digit)
            for j in range(13):
                next_dp[(k * base + j) % 13] += dp[j]
                next_dp[(k * base + j) % 13] %= MOD
        dp = next_dp
        base *= 10
        base %= 13

    return dp[5]

# Test case
print(solve("??2??5"))