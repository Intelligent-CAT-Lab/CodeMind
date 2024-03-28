```python
class GetLost:
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
        self.gx -= 1
        self.gy -= 1
        self.xs = [0] * self.n
        self.ys = [0] * self.n
        for i in range(self.n):
            x, y = map(int, input().split())
            self.xs[i] = x - 1
            self.ys[i] = y - 1
        self.run = input() + "$"
        self.solve()

    def solve(self):
        sum = 0
        for d in range(4):
            sum += self.solve1()
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
        print(sum)

    def solve1(self):
        sets1 = [set([-1, self.h]) for _ in range(self.w)]
        sets2 = [set([-1, self.w]) for _ in range(self.h)]

        for i in range(self.n):
            sets1[self.xs[i]].add(self.ys[i])
            sets2[self.ys[i]].add(self.xs[i])
        sets1[self.gx].add(self.gy)
        sets2[self.gy].add(self.gx)

        sum = 1
        for x in range(self.w):
            py = -2
            for y in sets1[x]:
                sy = y - 1
                if sy != py:
                    if self.ok(x, sy, 0):
                        sum += y - py - 1
                py = y
        return sum

    def ok(self, x, y, d):
        for k in range(len(self.run)):
            if d == 0:
                wx = nx = x
                wy = sets1[x].higher(y)
                ny = wy - 1
            elif d == 1:
                wy = ny = y
                wx = sets2[y].lower(x)
                nx = wx + 1
            elif d == 2:
                wx = nx = x
                wy = sets1[x].lower(y)
                ny = wy + 1
            else:
                assert d == 3
                wy = ny = y
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
    solver = GetLost()
    solver.run()
```
```
