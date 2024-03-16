```python
import math

class p01593:
    INF = 1 << 28
    EPS = 1e-12

    def __init__(self):
        self.n = 0
        self.m = 0

    def run(self):
        self.n = int(input())
        self.m = int(input())
        self.solve()

    def solve(self):
        dp = [0.0] * (self.n + 1)
        dp[0] = 1.0
        for j in range(1, self.n + 1):
            for i in range(1, min(self.m, j) + 1):
                dp[j] += dp[j - i] / j
        print(f'{dp[self.n]:.12f}')

if __name__ == "__main__":
    p01593().run()
```
