import sys

MOD = 1000000007

def f(n):
    memo = {n: 0}
    if n <= 2:
        return n
    res = f(n//2) + f((n-1)//2) + f((n+1)//2)
    res %= MOD
    memo[n] = res
    return res

n = int(sys.stdin.readline())
print(f(n+1))