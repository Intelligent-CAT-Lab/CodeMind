```python
class p00900:
    INF = 1 << 28
    EPS = 1e-10
    
    def __init__(self):
        self.h = 0
        self.w = 0
        self.size = 0
        self.map = []
        self.bomb = []
        self.ps = []
    
    def run(self):
        while True:
            self.h, self.w = map(int, input().split())
            if self.h == 0 and self.w == 0:
                break

            self.map = [[0 for _ in range(self.w)] for _ in range(self.h)]
            self.bomb = [[False for _ in range(self.w)] for _ in range(self.h)]
            ps = []
            for i in range(self.h):
                l = input().strip()
                for j in range(self.w):
                    if l[j] == '.':
                        self.map[i][j] = -1
                    elif l[j] == '*':
                        self.map[i][j] = 0
                    else:
                        self.map[i][j] = int(l[j])
                        ps.append((j, i))

            self.ps = ps
            self.size = len(ps)
            self.memo = {}
            self.pow10 = [0] * self.size
            self.pow10[0] = 100
            S = self.pow10[0] * self.map[self.ps[0][1]][self.ps[0][0]]
            for i in range(1, self.size):
                self.pow10[i] = self.pow10[i-1] * 10
                S += self.pow10[i] * self.map[self.ps[i][1]][self.ps[i][0]]

            print(self.solve(S, 0))

    def solve(self, S, cnt):
        p = S % 100
        if S in self.memo:
            return self.memo[S]
        if S % 100 == self.size:
            if S // 100 == 0:
                return 0
            return self.INF

        if cnt == 9:
            if S // self.pow10[p] % 10 == 0:
                ret = self.solve(S+1, 0)
                self.memo[S] = ret
                return ret
            else:
                return self.INF

        min_val = self.solve(S, cnt+1)
        x, y = self.ps[p]
        x += [-1, -1, -1, 0, 0, 0, 1, 1, 1][cnt]
        y += [-1, 0, 1, -1, 0, 1, -1, 0, 1][cnt]

        if self.out(x, y) or self.bomb[y][x] or self.map[y][x] < 0:
            return min_val

        next_S = S
        self.bomb[y][x] = True
        
        ng = False
        for i in range(self.size):
            for j in range(9):
                tx = x + [-1, -1, -1, 0, 0, 0, 1, 1, 1][j]
                ty = y + [-1, 0, 1, -1, 0, 1, -1, 0, 1][j]
                if self.out(tx, ty):
                    continue
                tar = (tx, ty)
                if self.ps[i] != tar:
                    continue
                if next_S // self.pow10[i] % 10 > 0:
                    next_S -= self.pow10[i]
                else:
                    ng = True

        if not ng:
            min_val = min(min_val, self.solve(next_S, cnt+1) + 1)

        self.bomb[y][x] = False
        return min_val
    
    def out(self, x, y):
        return x < 0 or y < 0 or x >= self.w or y >= self.h

if __name__ == "__main__":
    solver = p00900()
    solver.run()
```

