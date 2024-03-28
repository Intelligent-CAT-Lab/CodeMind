```python
class Solution:

    def submit(self, a, b, c, d, e, f):
        if d % a != 0 or e % b != 0 or f % c != 0:
            return 0

        p = d // a
        q = e // b
        r = f // c

        dp = [[0] * (q + 1) for _ in range(p + 1)]
        dp[p][q] = 1

        ans = 0
        for x in range(p - 1, 0, -1):
            for y in range(q - 1, 0, -1):
                dp[x][y] = (ways[p][x] * ways[q][y] % P * pow(c, (p - x) * (q - y)) % P)

                for xb in range(x, p + 1):
                    for yb in range(y, q + 1):
                        if xb + yb == x + y:
                            continue
                        dp[x][y] -= (dp[xb][yb] * ways[xb][x] % P * ways[yb][y] % P)
                        if dp[x][y] < 0:
                            dp[x][y] += P

                foo = pow(b, x)
                bar = pow(a, y)

                delta = 0
                delta += pow((foo + bar - 1) % P, r)
                if delta >= P:
                    delta -= P

                delta -= pow(foo, r) % P
                if delta < 0:
                    delta += P

                delta -= pow(bar, r) % P
                if delta < 0:
                    delta += P

                delta += 1
                if delta >= P:
                    delta -= P

                delta = delta * dp[x][y] % P
                ans += delta
                if ans >= P:
                    ans -= P

        ans += pow(self.one2D(a, p, b, q), r) * pow(a * b, r - 1) % P
        if ans >= P:
            ans -= P

        ans += pow(self.one2D(b, q, c, r), p) * pow(b * c, p - 1) % P
        if ans >= P:
            ans -= P

        ans += pow(self.one2D(c, r, a, p), q) * pow(c * a, q - 1) % P
        if ans >= P:
            ans -= P

        ans -= pow(a, q * r - 1) % P
        if ans < 0:
            ans += P

        ans -= pow(b, r * p - 1) % P
        if ans < 0:
            ans += P

        ans -= pow(c, p * q - 1) % P
        if ans < 0:
            ans += P

        ans += 1
        if ans >= P:
            ans -= P
        ans = ans * a % P * b % P * c % P

        return ans

    def one2D(self, a, p, b, q):
        return self.pow(b, p - 1) + self.pow(a, q - 1) - 1

    def pow(self, a, b):
        ret = 1
        while b > 0:
            if b & 1 == 1:
                ret = ret * a % P
            a = a * a % P
            b >>= 1
        return ret

    def __init__(self):
        self.P = 10 ** 9 + 7
        self.C = 110
        self.ways = [[0] * i for i in range(self.C)]
        for i in range(self.C):
            self.ways[i][0] = self.ways[i][i] = 1
            for j in range(1, i):
                self.ways[i][j] = (self.ways[i - 1][j] + self.ways[i - 1][j - 1]) % self.P

a, b, c, d, e, f = map(int, input().split())
solution = Solution()
result = solution.submit(a, b, c, d, e, f)
print(result)
```
```
