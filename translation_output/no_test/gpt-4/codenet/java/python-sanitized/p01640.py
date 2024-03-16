from sortedcontainers import SortedSet

class p01640:
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
        self.w = int(input())
        self.h = int(input())
        self.gx = int(input()) - 1
        self.gy = int(input()) - 1
        self.n = int(input())
        self.xs = [0] * self.n
        self.ys = [0] * self.n
        for i in range(self.n):
            self.xs[i] = int(input()) - 1
            self.ys[i] = int(input()) - 1
        self.run = input() + "$"
        self.solve()
    
    def solve(self):
        sum_ = 0
        for d in range(4):
            sum_ += self.solve1()
            ngx, ngy = self.h - 1 - self.gy, self.gx
            self.gx, self.gy = ngx, ngy
            for i in range(self.n):
                nx, ny = self.h - 1 - self.ys[i], self.xs[i]
                self.xs[i], self.ys[i] = nx, ny
            t = self.w
            self.w, self.h = self.h, t
        print(f"{sum_}")
    
    def solve1(self):
        self.sets1 = [SortedSet([-1, self.h]) for _ in range(self.w)]
        self.sets2 = [SortedSet([-1, self.w]) for _ in range(self.h)]
        
        for i in range(self.n):
            self.sets1[self.xs[i]].add(self.ys[i])
            self.sets2[self.ys[i]].add(self.xs[i])
        self.sets1[self.gx].add(self.gy)
        self.sets2[self.gy].add(self.gx)
        
        sum_ = 1
        for x in range(self.w):
            py = -2
            for y in self.sets1[x]:
                sy = y - 1
                if sy != py:
                    if self.ok(x, sy, 0):
                        sum_ += y - py - 1
                py = y
        return sum_
    
    def ok(self, x, y, d):
        for k in range(len(self.run)):
            if d == 0:
                wx = nx = x
                wy = self.sets1[x].bisect_right(y)
                ny = wy - 1
            elif d == 1:
                wy = ny = y
                wx = self.sets2[y].bisect_left(x) - 1
                nx = wx + 1
            elif d == 2:
                wx = nx = x
                wy = self.sets1[x].bisect_left(y) - 1
                ny = wy + 1
            else:
                assert d == 3
                wy = ny = y
                wx = self.sets2[y].bisect_right(x)
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
    p01640().run()