```python
import math

class p01606:
    def __init__(self):
        self.n = 0
        self.w = 0
        self.INF = 1 << 28
        self.EPS = 1e-12
        self.flag = []
        self.count = []
        self.sum = 0
        self.left = 1
        self.right = 0

    def run(self):
        self.n, self.w = map(int, input().split())
        self.solve()

    def solve(self):
        self.flag = [False] * (self.n + 1)
        self.count = [0] * (self.n + 1)
        self.sum = 0
        self.left = 1
        self.right = self.w + 1

        for i in range(1, self.w):
            for k in range(1, int(math.sqrt(i)) + 1):
                if i % k == 0:
                    self.count[k] += 1
                    self.update(k)
                    if i // k != k:
                        self.count[i // k] += 1
                        self.update(i // k)

        for i in range(self.n - self.w + 1):
            self.left = i + 1
            self.right = i + self.w + 1

            for k in range(1, int(math.sqrt(i)) + 1):
                if i % k == 0:
                    self.count[k] -= 1
                    self.update(k)
                    if i // k != k:
                        self.count[i // k] -= 1
                        self.update(i // k)

            for k in range(1, int(math.sqrt(i + self.w)) + 1):
                if (i + self.w) % k == 0:
                    self.count[k] += 1
                    self.update(k)
                    if (i + self.w) // k != k:
                        self.count[(i + self.w) // k] += 1
                        self.update((i + self.w) // k)

            self.update(self.left - 1)
            self.update(self.right - 1)
            print(self.sum, end=' ' if i < self.n - self.w else '\n')

    def update(self, i):
        det = self.left <= i < self.right
        if self.flag[i] and not det and self.count[i] < 2:
            self.flag[i] = False
            self.sum -= 1
        if not self.flag[i] and (det or self.count[i] >= 2):
            self.flag[i] = True
            self.sum += 1

if __name__ == "__main__":
    solution = p01606()
    solution.run()
```
```
