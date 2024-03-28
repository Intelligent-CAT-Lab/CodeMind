from collections import defaultdict
import sys

class P:
    def __init__(self, x, y):
        self.x = x
        self.y = y
        
    def is_equals(self, p):
        return self.x == p.x and self.y == p.y

class p00900:

    def __init__(self):
        self.INF = 1 << 28
        self.EPS = 1e-10
        self.dx = [-1, -1, -1, 0, 0, 0, 1, 1, 1]
        self.dy = [-1, 0, 1, -1, 0, 1, -1, 0, 1]
        self.map = None
        self.bomb = None
        self.ps = None
        self.size = 0
        self.memo = defaultdict(int)
        self.pow10 = None

    def run(self):
        for line in sys.stdin:
            h, w = map(int, line.split())
            if h == 0 and w == 0:
                break

            self.map = [[0 for _ in range(w)] for _ in range(h)]
            self.bomb = [[False for _ in range(w)] for _ in range(h)]
            ps = []
            for i in range(h):
                l = input().strip()
                for j in range(w):
                    if l[j] == '.':
                        self.map[i][j] = -1
                    elif l[j] == '*':
                        self.map[i][j] = 0
                    else:
                        self.map[i][j] = int(l[j])
                        ps.append(P(j, i))

            self.ps = ps
            self.size = len(ps)
            self.pow10 = [100 * 10 ** i for i in range(self.size)]
            S = sum([self.pow10[i] * self.map[self.ps[i].y][self.ps[i].x] for i in range(self.size)])
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
        x, y = self.ps[p].x, self.ps[p].y
        
        if x < 0 or y < 0 or x >= len(self.map[0]) or y >= len(self.map) or self.bomb[y][x] or self.map[y][x] < 0:
            return min_val
        next_val = S
        self.bomb[y][x] = True

        ng = False
        for i in range(self.size):
            for j in range(9):
                tx = x + self.dx[j]
                ty = y + self.dy[j]
                if tx < 0 or ty < 0 or tx >= len(self.map[0]) or ty >= len(self.map):
                    continue
                tar = P(tx, ty)
                if not self.ps[i].is_equals(tar):
                    continue
                if next_val // self.pow10[i] % 10 > 0:
                    next_val -= self.pow10[i]
                else:
                    ng = True

        if not ng:
            min_val = min(min_val, self.solve(next_val, cnt+1) + 1)

        self.bomb[y][x] = False
        return min_val

if __name__ == '__main__':
    p = p00900()
    p.run()