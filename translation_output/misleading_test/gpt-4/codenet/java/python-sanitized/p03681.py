import math

# Constants
MOD = 10**9 + 7

# MOD operations
def plus(x, y):
    return (x + y) % MOD

def sub(x, y):
    return (x - y) % MOD

def mul(x, y):
    return (x * y) % MOD

def div(x, y):
    return x * pow(y, MOD - 2, MOD) % MOD

# Solver
def solve(n, m):
    if n > m:
        n, m = m, n
    
    if m - n > 1:
        return 0
    
    ans = 1
    for i in range(n):
        ans = mul(ans, i + 1)
    for i in range(m):
        ans = mul(ans, i + 1)
    
    if m == n:
        ans = mul(ans, 2)
    
    return ans

# Main Function
def main():
    n, m = map(int, input().split())
    result = solve(n, m)
    print(result)

# Test Code
if __name__ == '__main__':
    main()