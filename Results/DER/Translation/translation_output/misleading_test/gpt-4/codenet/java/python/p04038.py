Below is the Python translation of the given Java code:
```python
# To mimic Java's ability to handle large integers without overflow,
# we make use of Python's built-in arbitrary precision integers
MOD = 10**9 + 7

# Function to compute the factorial and its modular inverse
def enum_fif(n, mod):
    f = [0] * (n+1)
    invf = [0] * (n+1)
    f[0] = 1
    for i in range(1, n+1):
        f[i] = f[i-1] * i % mod
    a = f[n]
    invf[n] = pow(a, mod-2, mod)  # Modular inverse based on Fermat's little theorem
    for i in range(n-1, -1, -1):
        invf[i] = invf[i+1] * (i+1) % mod
    return f, invf

# Function to compute a binomial coefficient mod MOD
def C(n, r, mod, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return fif[0][n] * fif[1][r] % mod * fif[1][n-r] % mod

# Function to solve the problem
def solve(n, K, mod=MOD):
    if K == 1:
        return 1
    fif = enum_fif(4000005, mod)
    dp = [0] * (n+1)
    dp[0] = 1
    for j in range(n+1):
        for i in range(j, n+1):
            if i+1 <= n:
                dp[i+1] += dp[i]
                if dp[i+1] >= mod:
                    dp[i+1] -= mod
            if i >= j+1:
                dp[i] = dp[i] * C(n*K-i-j*(K-1)-1, K-2, mod, fif) % mod
    return dp[n] * fif[0][n] % mod

# Reading the test input
import sys

def input():
    return next(sys.stdin).strip()

n, K = map(int, input().split())

# Printing the final result of solve
print(solve(n, K))
```

This Python code uses a slightly different approach to input handling and integer overflow than Java. Python naturally supports big integers, so we don't need to use `BigInteger`. Instead, we use the `pow` function for modular exponentiation with large integers. Also, the input handling is simplified, assuming that the input will be provided as space-separated integers in a line.
