def f(n, mb):
    memo = mb.get(n)
    if memo is not None:
        return memo
    if n <= 2:
        return n
    res = f(n//2, mb) + f((n-1)//2, mb) + f((n+1)//2, mb)
    res %= MOD
    mb[n] = res
    return res

MOD = 1000000007
mb = {}  # Use a dictionary for memoization

n = int(input())
print(f(n+1, mb))