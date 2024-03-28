class main:
    import sys
    
    class p01640:
        def __init__(self):
            self.sc = sys.stdin
            self.w = 0
            self.h = 0
            self.gx = 0
            self.gy = 0
            self.n = 0
            self.xs = []
            self.ys = []
            self.run = ""
    
        def run(self):
            self.w = int(self.sc.readline())
            self.h = int(self.sc.readline())
            self.gx = int(self.sc.readline()) - 1
            self.gy = int(self.sc.readline()) - 1
            self.n = int(self.sc.readline())
            for i in range(self.n):
                self.xs.append(int(self.sc.readline()) - 1)
                self.ys.append(int(self.sc.readline()) - 1)
            self.run = self.sc.readline().strip() + "$"
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
            sets1 = []
            for i in range(self.w):
                sets