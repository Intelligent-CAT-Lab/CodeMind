import math
import sys

# Function to calculate combination (nCr) taking modulus into account
def C(n, r, mod, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return (fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod)

# Function to calculate inverse using extended Euclidean algorithm
def invl(a, mod):
    b = mod
    p, q = 1, 0
    
    while b > 0:
        c = a // b
        d = a
        a = b
        b = d % b
        d = p
        p = q
        q = d - c * q
    
    return p + mod if p < 0 else p

# Function to pre-calculate factorials and inverse factorials modulo mod
def enumFIF(n, mod):
    f = [0] * (n + 1)
    invf = [0] * (n + 1)
    f[0] = 1
    
    for i in range(1, n + 1):
        f[i] = (f[i - 1] * i) % mod
    
    a, b = f[n], mod
    p, q = 1, 0
    
    while b > 0:
        c = a // b
        d = a
        a = b
        b = d % b
        d = p
        p = q
        q = d - c * q
    
    invf[n] = p + mod if p < 0 else p
    
    for i in range(n - 1, -1, -1):
        invf[i] = (invf[i + 1] * (i + 1)) % mod
    
    return f, invf

def solve():
    mod = 1000000007
    fif = enumFIF(4000005, mod)
    n, K = map(int, input().split())
    
    if K == 1:
        print(1)
        return
    
    dp = [0] * (n + 1)
    dp[0] = 1
    
    for j in range(n + 1):
        for i in range(j, n + 1):
            if i + 1 <= n:
                dp[i + 1] += dp[i]
                if dp[i + 1] >= mod:
                    dp[i + 1] -= mod
            
            if i >= j + 1:
                dp[i] = (dp[i] * C(n * K - i - j * (K - 1) - 1, K - 2, mod, fif)) % mod
    
    print((dp[n] * fif[0][n]) % mod)

def main():
    solve()

if __name__ == "__main__":
    INPUT = ""
    main()