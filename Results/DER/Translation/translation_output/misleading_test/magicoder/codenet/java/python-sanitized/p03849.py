MOD = 1000000007
mb = {}

def f(n):
    if n <= 2:
        return n
    memo = mb.get(n)
    if memo is not None:
        return memo
    res = (f(n//2) + f((n-1)//2) + f((n+1)//2)) % MOD
    mb[n] = res
    return res

n = int(input())
print(f(n+1))