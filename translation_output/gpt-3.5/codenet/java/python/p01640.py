```python
import numpy as np

class P01640:
    def __init__(self):
        self.sc = None
        self.w = None
        self.h = None
        self.gx = None
        self.gy = None
        self.n = None
        self.xs = None
        self.ys = None
        self.run = None
        self.sets1 = None
        self.sets2 = None

    def run(self):
        self.w, self.h, self.gx, self.gy, self.n = map(int, input().split())
        self.gx -= 1
        self.gy -= 1
        self.xs = np.zeros(self.n, dtype=int)
        self.ys = np.zeros(self.n, dtype=int)
        for i in range(self.n):
            self.xs[i], self.ys[i] = map(int, input().split())
            self.xs[i] -= 1
            self.ys[i] -= 1
        self.run = input().strip() + "$"
        self.solve()

    def solve(self):
        sum_val = 0
        for _ in range(4):
            sum_val += self.solve1()
            ngx, ngy = self.h - 1 - self.gy, self.gx
            self.gx, self.gy = ngx, ngy
            self.xs, self.ys = self.h - 1 - self.ys, self.xs
            self.w, self.h = self.h, self.w
        print(str(sum_val))

    def solve1(self):
        self.sets1 = [set([-1, self.h]) for _ in range(self.w)]
        self.sets2 = [set([-1, self.w]) for _ in range(self.h)]

        for i in range(self.n):
            self.sets1[self.xs[i]].add(self.ys[i])
            self.sets2[self.ys[i]].add(self.xs[i])
        self.sets1[self.gx].add(self.gy)
        self.sets2[self.gy].add(self.gx)

        sum_val = 1
        for x in range(self.w):
            py = -2
            for y in sorted(self.sets1[x]):
                sy = y - 1
                if sy != py:
                    if self.ok(x, sy, 0):
                        sum_val += y - py - 1
                py = y
        return sum_val

    def ok(self, x, y, d):
        for k in range(len(self.run)):
            if d == 0:
                wx = nx = x
                wy = list(filter(lambda val: val > y, self.sets1[x]))[0]
                ny = wy - 1
            elif d == 1:
                wy = ny = y
                wx = list(filter(lambda val: val < x, self.sets2[y]))[-1]
                nx = wx + 1
            elif d == 2:
                wx = nx = x
                wy = list(filter(lambda val: val < y, self.sets1[x]))[-1]
                ny = wy + 1
            else:
                wy = ny = y
                wx = list(filter(lambda val: val > x, self.sets2[y]))[0]
                nx = wx - 1
            if wx == self.gx and wy == self.gy:
                return True
            x, y = nx, ny
            if self.run[k] == 'L':
                d = (d + 3) % 4
            elif self.run[k] == 'R':
                d = (d + 1) % 4
        return False

    def print_line(self, s):
        print(s)

if __name__ == "__main__":
    p = P01640()
    p.run()
```
