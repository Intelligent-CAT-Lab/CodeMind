import sys

MAX_N = 110000
memo = [-1] * MAX_N

def calc(n):
    if n == 0:
        return 0
    if memo[n] != -1:
        return memo[n]

    res = n
    for pow6 in range(1, n+1):
        pow6 *= 6
        res = min(res, calc(n - pow6) + 1)
    for pow9 in range(1, n+1):
        pow9 *= 9
        res = min(res, calc(n - pow9) + 1)
    memo[n] = res
    return memo[n]

n = int(input())
ans = calc(n)
print(ans)