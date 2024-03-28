```python
from collections import defaultdict

class Lost:
    def __init__(self):
        self.w = 0
        self.h = 0
        self.gx = 0
        self.gy = 0
        self.n = 0
        self.xs = []
        self.ys = []
        self.run = ""

    def run(self):
        self.w, self.h, self.gx, self.gy, self.n = map(int, input().split())
        for _ in range(self.n):
            x, y = map(int, input().split())
            self.xs.append(x-1)
            self.ys.append(y-1)
        self.run = input().strip() + "$"
        self.solve()

    def solve(self):
        sum_count = 0
        for _ in range(4):
            sum_count += self.solve1()
            ngx = self.h - 1 - self.gy
            ngy = self.gx
            self.gx = ngx
            self.gy = ngy
            for i in range(self.n):
                nx = self.h - 1 - self.ys[i]
                ny = self.xs[i]
                self.xs[i] = nx
                self.ys[i] = ny
            self.w, self.h = self.h, self.w
        print(str(sum_count))

    def solve1(self):
        sets1 = defaultdict(lambda: {-1, self.h})
        sets2 = defaultdict(lambda: {-1, self.w})

        for i in range(self.n):
            sets1[self.xs[i]].add(self.ys[i])
            sets2[self.ys[i]].add(self.xs[i])
        sets1[self.gx].add(self.gy)
        sets2[self.gy].add(self.gx)

        sum_count = 1
        for x in range(self.w):
            py = -2
            for y in sorted(sets1[x]):
                sy = y - 1
                if sy != py:
                    if self.ok(x, sy, 0, sets1, sets2):
                        sum_count += y - py - 1
                py = y
        return sum_count

    def ok(self, x, y, d, sets1, sets2):
        for k in range(len(self.run)):
            wx, wy, nx, ny = x, 0, 0, 0
            if d == 0:
                wx = x
                wy = sets1[x].higher(y)
                ny = wy - 1
            elif d == 1:
                wy = y
                wx = sets2[y].lower(x)
                nx = wx + 1
            elif d == 2:
                wx = x
                wy = sets1[x].lower(y)
                ny = wy + 1
            else:
                assert d == 3
                wy = y
                wx = sets2[y].higher(x)
                nx = wx - 1
            if wx == self.gx and wy == self.gy:
                return True
            x, y = nx, ny
            if self.run[k] == 'L':
                d = (d + 3) % 4
            elif self.run[k] == 'R':
                d = (d + 1) % 4
        return False

if __name__ == "__main__":
    lost = Lost()
    lost.run()
```

