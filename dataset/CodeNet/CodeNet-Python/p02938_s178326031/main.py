mod = 10 ** 9 + 7

memo = {}
def solve(L, R):
    if (L, R) in memo:
        return memo[(L, R)]

    if L > R:
        res = 0
    elif L == 1:
        res = 1 + solve(2, R)
    else:
        res = (
            solve(L // 2, (R - 1) // 2) +
            solve((L + 1) // 2, R // 2) +
            solve((L + 1) // 2, (R - 1) // 2)
        )

    res %= mod
    memo[(L, R)] = res
    return res

L, R = map(int, input().split())
print(solve(L, R) % mod)