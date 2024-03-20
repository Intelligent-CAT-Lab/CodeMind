import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

class p00900:
    INF = 1 << 28
    EPS = 1e-10
    dx = [-1, -1, -1, 0, 0, 0, 1, 1, 1]
    dy = [-1, 0, 1, -1, 0, 1, -1, 0, 1]

    def run(self):
        sc = Scanner(System.in)
        while True:
            h, w = map(int, sc.nextLine().split())
            if h == 0 and w == 0:
                break
            self.h = h
            self.w = w
            self.map = [[-1 for _ in range(w)] for _ in range(h)]
            self.bomb = [[False for _ in range(w)] for _ in range(h)]
            self.ps = []
            for i in range(h):
                l = sc.nextLine()
                for j in range(w):
                    if l[j] == '.':
                        self.map[i][j] = -1
                    elif l[j] == '*':
                        self.map[i][j] = 0
                    else:
                        self.map[i][j] = int(l[j])
                        self.ps.append(P(j, i))
            self.size = len(self.ps)
            self.memo = {}
            self.pow10 = [100]
            for i in range(1, self.size):
                self.pow10.append(self.pow10[-1] * 10)
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
        x, y = self.ps[p].x + self.dx[cnt], self.ps[p].y + self.dy[cnt]
        if x < 0 or y < 0 or x >= self.w or y >= self.h or self.bomb[y][x] or self.map[y][x] < 0:
            return min
        next = S
        self.bomb[y][x