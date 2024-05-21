import math

def solve(n, m):
    dp = [0] * (n + 1)
    dp[0] = 1
    for j in range(1, n + 1):
        for i in range(1, min(m, j) + 1):
            dp[j] += dp[j - i] / j
    return dp[n]

n = int(input("Enter the value of n: "))
m = int(input("Enter the value of m: "))
result = solve(n, m)
print(f"The result is: {result}")