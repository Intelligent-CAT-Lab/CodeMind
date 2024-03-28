def solve(S):
    d = list(S)
    dp = [0] * 13
    dp[0] = 1
    base = 1
    
    for i in range(len(d) - 1, -1, -1):
        next_dp = [0] * 13
        
        if d[i] == '?':
            for k in range(10):
                for j in range(13):
                    next_dp[(k * base + j) % 13] += dp[j]
                    next_dp[(k * base + j) % 13] %= 1000000007
        else:
            k = int(d[i])
            for j in range(13):
                next_dp[(k * base + j) % 13] += dp[j]
                next_dp[(k * base + j) % 13] %= 1000000007

        dp = next_dp
        base *= 10
        base %= 13
        
    return dp[5]

# Test the function with the provided input
print(solve("??2??5"))