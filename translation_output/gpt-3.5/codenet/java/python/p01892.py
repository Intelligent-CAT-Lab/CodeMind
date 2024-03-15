```python
import sys
import numpy as np

class p01892:
    def __init__(self):
        self.A = 0
        self.B = 0
        self.N = 0

    def solve(self):
        self.A = self.nextLong()
        self.B = self.nextLong()
        self.N = self.nextInt()

        ans = abs(self.A - self.B)
        for i in range(1, self.N + 1):
            for j in range(1, self.N + 1):
                if i * self.B % j != 0:
                    continue
                ans = min(ans, abs(self.A - i * self.B / j))

        sys.stdout.write(str(ans) + "\n")

    def next(self):
        return sys.stdin.readline().strip()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

if __name__ == "__main__":
    p = p01892()
    p.solve()
```

