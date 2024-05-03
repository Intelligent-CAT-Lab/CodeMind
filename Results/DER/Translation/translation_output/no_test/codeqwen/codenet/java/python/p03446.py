Here is the Python version of the provided Java code:

```python
import sys
import math

class p03446:

    def submit(self):
        a = self.nextInt()
        b = self.nextInt()
        c = self.nextInt()
        d = self.nextInt()
        e = self.nextInt()
        f = self.nextInt()

        if d % a != 0 or e % b != 0 or f % c != 0:
            self.out.write(str(0) + '\n')
            return

        p = d // a
        q = e // b
        r = f // c

        dp = [[0 for _ in range(q + 1)] for _ in range(p + 1)]
        dp[p][q] = 1

        ans = 0

        for x in range(p - 1, 0, -1):
            for y in range(q - 1, 0, -1):
                dp[x][y] = (ways[p][x] * ways[q][y] % self.P
                            * self.pow(c, (p - x) * (q - y)) % self.P)

                for xb in range(x, p + 1):
                    for yb in range(y, q + 1):
                        if xb + yb == x + y:
                            continue
                        dp[x][y] -= (ways[xb][x] * ways[yb][y] % self.P)
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

                delta -= self.pow
