import sys

def main():
    a, b, c, d, e, f = map(int, input().split())
    if d % a!= 0 or e % b!= 0 or f % c!= 0:
        print(0)
        return
    p, q, r = d // a, e // b, f // c
    dp = [[0] * (q + 1) for _ in range(p + 1)]
    dp[p][q] = 1
    ans = 0
    mod = 10 ** 9 + 7
    for x in range(p - 1, 0, -1):
        for y in range(q - 1, 0, -1):
            dp[x][y] = (ways[p][x] * ways[q][y] % mod) * pow(c, (p - x) * (q - y), mod) % mod
            for xb in range(x, p + 1):
                for yb in range(y, q + 1):
                    if xb + yb == x + y:
                        continue
                    dp[x][y] -= (dp[xb][yb] * ways[xb][x] % mod) * ways[yb][y] % mod
                    dp[x][y] %= mod
            foo = pow(b, x, mod)
            bar = pow(a, y, mod)
            delta = (pow(foo + bar - 1, r, mod) - pow(foo, r, mod) - pow(bar, r, mod) + 1) % mod
            delta = (delta * dp[x][y]) % mod
            ans += delta
            ans %= mod
    ans += (pow(one2D(a, p, b, q), r, mod) * pow(a * b, r - 1, mod)) % mod
    ans %= mod
    ans += (pow(one2D(b, q, c, r), p, mod) * pow(b * c, p - 1, mod)) % mod
    ans %= mod
    ans += (pow(one2D(c, r, a, p), q, mod) * pow(c * a, q - 1, mod)) % mod
    ans %= mod
    ans -= pow(a, q * r - 1, mod)
    ans %= mod
    ans -= pow(b, r * p - 1, mod)
    ans %= mod
    ans -= pow(c, p * q - 1, mod)
    ans %= mod
    ans += 1
    ans %= mod
    ans = (ans * a) % mod
    ans = (ans * b) % mod
    ans = (ans * c) % mod
    print(ans)

def pow(x, y, mod):
    ret = 1
    while y > 0:
        if y & 1:
            ret = (ret * x) % mod
        x = (x * x) % mod
        y >>= 1
    return ret

def one2D(a, p, b, q):
    return (pow(b, p - 1, mod) + pow(a, q - 1, mod) - 1) % mod

ways = [[0] * (i + 1) for i in range(110)]
for i in range(110):
    ways[i][0] = ways[i][i] = 1
    for j in range(1, i):
        ways[i][j] = (ways[i - 1][j] + ways[i - 1][j - 1]) % mod

if __name__ == '__main__':
    main()