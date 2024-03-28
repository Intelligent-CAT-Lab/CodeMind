class main:
    import math
    import sys
    
    # Get Lost
    class p01640:
        def __init__(self):
            self.sc = sys.stdin
    
        def run(self):
            self.w = self.sc.nextInt()
            self.h = self.sc.nextInt()
            self.gx = self.sc.nextInt() - 1
            self.gy = self.sc.nextInt() - 1
            self.n = self.sc.nextInt()
            self.xs = [self.sc.nextInt() - 1 for _ in range(self.n)]
            self.ys = [self.sc.nextInt() - 1 for _ in range(self.n)]
            self.run = self.sc.next() + "$"
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
            self.sets1 = [set() for _ in range(self.w)]
            for i in range(self.w):
                self.sets1[i].add(-1)
                self.sets1[i].add(self.h)
            self.sets2 = [set() for _ in range(self.h)]
            for i in range(self.h):
                self.sets2[i].add(-1)
                self.sets2[i].add(self.w)
    
            for i in range(self.n):
                self.sets1[self.xs[i]].add(self.ys[i])
                self.sets2[self.ys[i]].add(self.xs[i])
            self.sets1[self.gx].add(self.gy)
            self.sets2[self.gy].add(self.gx)
    
            sum = 1
            for x in range(self.w):
                py = -2
                for y in self.sets1[x]:
                    sy = y - 1
                    if sy != py: