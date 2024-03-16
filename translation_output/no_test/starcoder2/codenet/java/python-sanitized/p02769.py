import math

n, k = map(int, input().split())
if k >= n:
    print(math.comb(n + n - 1, n - 1, mod=1000000007))
else:
    fact = [1]
    factinv = [1]
    for i in range(1, int(n) + 1):
        fact.append(i * fact[-1] % 1000000007)
        factinv.append(pow(fact[-1], 1000000007 - 2, 1000000007))
    ans = 0
    for i in range(int(k) + 1):
        up = fact[int(n)] * fact[int(n - 1)]
        up %= 1000000007
        den1 = factinv[i] * factinv[i]
        den1 %= 1000000007
        den2 = factinv[int(n - i)] * factinv[int(n - i - 1)]
        den2 %= 1000000007
        den = den1 * den2
        den %= 1000000007
        ans += up * den
        ans %= 1000000007
    print(ans)