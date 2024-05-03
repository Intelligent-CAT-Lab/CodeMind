Here is the Python version of the provided Java code:

```python
import sys

class p03446:
    def submit(self):
        a = int(sys.stdin.readline())
        b = int(sys.stdin.readline())
        c = int(sys.stdin.readline())
        d = int(sys.stdin.readline())
        e = int(sys.stdin.readline())
        f = int(sys.stdin.readline())

        if d % a != 0 or e % b != 0 or f % c != 0:
            print(0)
            return

        p = d // a
        q = e // b
        r = f // c

        dp = [[0 for _ in range(q + 1)] for _ in range(p + 1)]
        dp[p][q] = 1

        ans = 0

        for x in range(p - 1, 0, -1):
            for y in range(q - 1, 0, -1):
                dp[x][y] = (ways[p][x] * ways[q][y] % P
                            * pow(c, (p - x) * (q - y)) % P)

                for xb in range(x, p + 1):
                    for yb in range(y, q + 1):
                        if xb + yb == x + y:
                            continue
                        dp[x][y] -= (dp[xb][yb] * ways[xb][x] % P
                                    * ways[yb][y] % P)
                        if dp[x][y] < 0:
                            dp[x][y] += P

                foo = pow(b, x)
                bar = pow(a, y)

                delta = 0

                delta += pow(math.floor((foo + bar - 1) % P), r)
                if delta >= P:
                    delta -= P

                delta -= pow(foo, r)
                if delta < 0:
                    delta += P

                
