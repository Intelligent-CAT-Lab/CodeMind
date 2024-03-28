import sys
import math

class P:
    def __init__(self, x, y):
        self.x = x
        self.y = y

class p00900:
    def __init__(self):
        self.INF = 1 << 28
        self.EPS = 1e-10
        self.h = 0
        self.w = 0
        self.size = 0
        self.map = []
        self.bomb = []
        self.ps = []
        self.dx = [-1, -1, -1, 0, 0, 0, 1, 1, 1]
        self.dy = [-1, 0, 1, -1, 0, 1, -1, 0, 1]
        self.memo = {}
        self.pow10 = []

    def run(self):
        sc = sys.stdin
        while True:
            self.h, self.w = map(int, sc.readline().split())
            if self.h == 0 and self.w == 0:
                break
            self.map = [[-1 for _ in range(self.w)] for _ in range(self.h)]
            self.bomb = [[False for _ in range(self.w)] for _ in range(self.h)]
            self.ps = []
            for i in range(self.h):
                l = sc.readline().strip()
                for j in range(self.w):
                    if l[j] == '.':
                        self.map[i][j] = -1
                    elif l[j] == '*':
                        self.map[i][j] = 0
                    else:
                        self.map[i][j] = int(l[j])
                        self.ps.append(P(j, i))
            self.size = len(self.ps)
            self.pow10 = [100]
            for i in range(1, self.size):
                self.pow10.append(self.pow10[i-1] * 10)
            S = self.pow10[0] * self.map[self.ps[0].y][self.ps[0].x]
            for i in range(1, self.size):
                S += self.pow10[i] * self.map[self.ps[i].y][self.ps[i].x]
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
        min = self.solve(S, cnt+1)
        x = self.ps[p].x + self.dx[cnt]
        y = self.ps[p].y + self.dy[cnt