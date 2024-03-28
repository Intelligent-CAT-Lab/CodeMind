```python
import math

class p03446:
    def __init__(self):
        self.P = pow(10, 9) + 7
        self.ways = [[0] * 110 for _ in range(110)]
        self.preCalc()
        self.submit()

    def submit(self):
        a, b, c, d, e, f = map(int, input().split())

        if d % a != 0 or e % b != 0 or f % c != 0:
            print(0)
            return

        p, q, r = d // a, e // b, f // c

        dp = [[0] * (q + 1) for _ in range(p + 1)]
        dp[p][q] = 1
        ans = 0

        for x in range(p - 1, 0, -1):
            for y in range(q - 1, 0, -1):
                dp[x][y] = (self.ways[p][x] * self.ways[q][y] % self.P * self.pow(c, (p - x) * (q - y)) % self.P)

                for xb in range(x, p + 1):
                    for yb in range(y, q + 1):
                        if xb + yb == x + y:
                            continue
                        dp[x][y] -= (dp[xb][yb] * self.ways[xb][x] % self.P * self.ways[yb][y] % self.P)
                        if dp[x][y] < 0:
                            dp[x][y] += self.P

                foo = self.pow(b, x)
                bar = self.pow(a, y)

                delta = 0
                delta += self.pow(math.floor((foo + bar - 1) % self.P), r)
                if delta >= self.P:
                    delta -= self.P

                delta -= self.pow(foo, r)
                if delta < 0:
                    delta += self.P

                delta -= self.pow(bar, r)
                if delta < 0:
                    delta += self.P

                delta += 1
                if delta >= self.P:
                    delta -= self.P

                delta = delta * dp[x][y] % self.P
                ans += delta
                if ans >= self.P:
                    ans -= self.P

        ans += self.pow(self.one2D(a, p, b, q), r) * self.pow(a * b, r - 1) % self.P
        if ans >= self.P:
            ans -= self.P

        ans += self.pow(self.one2D(b, q, c, r), p) * self.pow(b * c, p - 1) % self.P
        if ans >= self.P:
            ans -= self.P

        ans += self.pow(self.one2D(c, r, a, p), q) * self.pow(c * a, q - 1) % self.P
        if ans >= self.P:
            ans -= self.P

        ans -= self.pow(a, q * r - 1)
        if ans < 0:
            ans += self.P

        ans -= self.pow(b, r * p - 1)
        if ans < 0:
            ans += self.P

        ans -= self.pow(c, p * q - 1)
        if ans < 0:
            ans += self.P

        ans += 1
        if ans >= self.P:
            ans -= self.P

        ans = ans * a % self.P * b % self.P * c % self.P

        print(ans)

    def one2D(self, a, p, b, q):
        return (self.pow(b, p - 1) + self.pow(a, q - 1) - 1) % self.P

    def pow(self, a, b):
        ret = 1
        while b > 0:
            if b & 1 == 1:
                ret = ret * a % self.P
            a = a * a % self.P
            b >>= 1
        return ret

    def preCalc(self):
        for i in range(110):
            self.ways[i][0] = self.ways[i][i] = 1
            for j in range(1, i):
                self.ways[i][j] = (self.ways[i - 1][j] + self.ways[i - 1][j - 1]) % self.P

p03446()
```
