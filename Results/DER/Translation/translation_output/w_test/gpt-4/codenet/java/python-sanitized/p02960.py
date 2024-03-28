def solve(s):
    dp = [1] + [0] * 12
    base = 1
    mod = 1000000007

    for c in reversed(s):
        next_dp = [0] * 13
        if c == '?':
            for k in range(10):
                for j in range(13):
                    next_dp[(k * base + j) % 13] += dp[j]
                    next_dp[(k * base + j) % 13] %= mod
        else:
            k = int(c)
            for j in range(13):
                next_dp[(k * base + j) % 13] += dp[j]
                next_dp[(k * base + j) % 13] %= mod
        dp = next_dp
        base = (base * 10) % 13

    return dp[5]

# Test Case
print(solve("??2??5"))