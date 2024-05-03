import sys

class p01640:
    def run(self):
        self.w, self.h, self.gx, self.gy, self.n = map(int, sys.stdin.readline().split())
        self.gx -= 1
        self.gy -= 1
        self.xs = [int(x) - 1 for x in sys.stdin.readline().split()]
        self.ys = [int(y) - 1 for y in sys.stdin.readline().split()]
        self.run = sys.stdin.readline().strip() + "$"
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
            t = self.w
            self.w = self.h
            self.h = t
        print(sum)

    def solve1(self):
        self.sets1 = [set([-1, self.h]) for _ in range(self.w)]
        self.sets2 = [set([-1, self.w]) for _ in range(self.h)]

        for i in range(self.n):
            self.sets1[self.xs[i]].add(self.ys[i])
            self.sets2[self.ys[i]].add(self.xs[i])
        self.sets1[self.gx].add(self.gy)
        self.sets2[self.gy].add(self.gx)

        sum = 1
        for x in range(self.w):
            py = -2
            for y in