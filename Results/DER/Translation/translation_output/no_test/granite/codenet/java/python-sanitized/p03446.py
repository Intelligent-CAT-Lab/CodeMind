import sys
from math import floor

def pow(a, b, p):
    ret = 1
    while b > 0:
        if b % 2 == 1:
            ret = (ret * a) % p
        a = (a * a) % p
        b //= 2
    return ret

def main():
    a, b, c, d, e, f = map(int, sys.stdin.readline().split())
    if d % a!= 0 or e % b!= 0 or f % c!= 0:
        print(0)
        return
    p = d // a
    q = e // b
    r = f // c
    ways = [[0] * (i + 1) for i in range(110)]
    for i in range(110):
        ways[i][0] = ways[i][i] = 1
        for j in range(1, i):
            ways[i][j] = (ways[i - 1][j] + ways[i - 1][j - 1]) % 100000007
    dp = [[0] * (q + 1) for _ in range(p + 1)]
    dp[p][q] = 1
    ans = 0
    for x in range(p - 1, 0, -1):
        for y in range(q - 1, 0, -1):
            dp[x][y] = (ways[p][x] * ways[q][y] * pow(c, (p - x) * (q - y), 100000007)) % 100000007
            for xb in range(x, p + 1):
                for yb in range(y, q + 1):
                    if xb + yb == x + y:
                        continue
                    dp[x][y] -= (ways[xb][x] * ways[yb][y] * dp[xb][yb]) % 100000007
                    dp[x][y] %= 100000007
            foo = pow(b, x, 100000007)
            bar = pow(a, y, 100000007)
            delta = 0
            delta += pow(floor(foo + bar - 1) % 100000007, r, 100000007)
            delta -= pow(foo, r, 100000007)
            delta -= pow(bar, r, 100000007)
            delta += 1
            delta %= 100000007
            delta = (delta * dp[x][y]) % 100000007
            ans += delta
            ans %= 100000007
    ans += (pow(pow(a, q, 100000007), r, 100000007) * pow(a * b, r - 1, 100000007)) % 100000007
    ans %= 100000007
    ans += (pow(pow(b, r, 100000007), p, 100000007) * pow(b * c, p - 1, 100000007)) % 100000007
    ans %= 100000007
    ans += (pow(pow(c, p, 100000007), q, 100000007) * pow(c * a, q - 1, 100000007)) % 100000007
    ans %= 100000007
    ans -= pow(a, q * r - 1, 100000007)
    ans %= 100000007
    ans -= pow(b, r * p - 1, 100000007)
    ans %= 100000007
    ans -= pow(c, p * q - 1, 100000007)
    ans %= 100000007
    ans += 1
    ans %= 100000007
    ans = (ans * a * b * c) % 100000007
    print(ans)

if __name__ == '__main__':
    main()