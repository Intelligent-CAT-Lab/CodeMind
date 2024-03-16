def f(n):
    if n in memo:
        return memo[n]
    if n <= 2:
        return n
    res = f(n // 2) + f((n - 1) // 2) + f((n + 1) // 2)
    res %= MOD
    memo[n] = res
    return res

MOD = 10**9 + 7
memo = {}
n = int(input())
print(f(n + 1))