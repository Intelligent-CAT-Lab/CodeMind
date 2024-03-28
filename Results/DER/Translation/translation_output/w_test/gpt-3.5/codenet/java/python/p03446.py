```python
MOD = 10**9 + 7

def submit():
    a, b, c, d, e, f = map(int, input().split())

    if d % a != 0 or e % b != 0 or f % c != 0:
        print(0)
        return

    p = d // a
    q = e // b
    r = f // c

    dp = [[0] * (q + 1) for _ in range(p + 1)]
    dp[p][q] = 1
    ans = 0

    for x in range(p - 1, 0, -1):
        for y in range(q - 1, 0, -1):
            dp[x][y] = (ways[p][x] * ways[q][y] % MOD * pow(c, (p - x) * (q - y)) % MOD)

            for xb in range(x, p + 1):
                for yb in range(y, q + 1):
                    if xb + yb == x + y:
                        continue
                    dp[x][y] -= (dp[xb][yb] * ways[xb][x] % MOD * ways[yb][y] % MOD)
                    dp[x][y] %= MOD

            foo = pow(b, x)
            bar = pow(a, y)

            delta = 0
            delta += pow((foo + bar - 1) % MOD, r)
            delta %= MOD

            delta -= pow(foo, r)
            if delta < 0:
                delta += MOD

            delta -= pow(bar, r)
            if delta < 0:
                delta += MOD

            delta += 1
            delta %= MOD

            delta = (delta * dp[x][y]) % MOD
            ans += delta
            ans %= MOD

    ans += (one2D(a, p, b, q) ** r * pow(a * b, r - 1) % MOD)
    ans %= MOD

    ans += (one2D(b, q, c, r) ** p * pow(b * c, p - 1) % MOD)
    ans %= MOD

    ans += (one2D(c, r, a, p) ** q * pow(c * a, q - 1) % MOD)
    ans %= MOD

    ans -= pow(a, q * r - 1)
    ans %= MOD

    ans -= pow(b, r * p - 1)
    ans %= MOD

    ans -= pow(c, p * q - 1)
    ans %= MOD

    ans += 1
    ans = (ans * a * b * c) % MOD

    print(ans)

def one2D(a, p, b, q):
    return (pow(b, p - 1) + pow(a, q - 1) - 1) % MOD

def pow(a, b):
    ret = 1
    while b > 0:
        if b & 1:
            ret = (ret * a) % MOD
        a = (a * a) % MOD
        b >>= 1
    return ret

def preCalc():
    ways = [[0] * C for _ in range(C)]
    for i in range(C):
        ways[i][0] = ways[i][i] = 1
        for j in range(1, i):
            ways[i][j] = (ways[i - 1][j] + ways[i - 1][j - 1]) % MOD

# Initialize
C = 110
ways = preCalc()

# Test the submit function
submit()
```

Please make sure to properly handle the input reading part as per your requirement before calling the `submit` function.
