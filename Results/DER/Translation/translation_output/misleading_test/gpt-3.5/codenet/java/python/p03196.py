```python
import math

class Solver:
    def __init__(self):
        pass

    def solve(self):
        n, p = map(int, input().split())
        factor = self.factorize(p)
        ans = 1
        for i in range(len(factor)):
            if factor[i][1] >= n:
                ans *= math.pow(factor[i][0], factor[i][1] // n)
        print(int(ans))

    def factorize(self, p):
        factors = []
        for i in range(2, int(math.sqrt(p)) + 1):
            if p % i == 0:
                count = 0
                while p % i == 0:
                    p //= i
                    count += 1
                factors.append((i, count))
        if p > 1:
            factors.append((p, 1))
        return factors

solver = Solver()
solver.solve()
```

