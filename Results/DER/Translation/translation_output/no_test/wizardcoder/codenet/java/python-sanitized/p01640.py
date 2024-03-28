import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

# Get Lost
class p01640:
    def __init__(self):
        self.sc = Scanner(System.in)

    def run(self):
        self.w = self.sc.nextInt()
        self.h = self.sc.nextInt()
        self.gx = self.sc.nextInt() - 1
        self.gy = self.sc.nextInt() - 1
        self.n = self.sc.nextInt()
        self.xs = [self.sc.nextInt() - 1 for i in range(self.n)]
        self.ys = [self.sc.nextInt() - 1 for i in range(self.n)]
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
            self.xs = [self.h - 1 - self.ys[i] for i in range(self.n)]
            self.ys = [self.xs[i] for i in range(self.n)]
            t = self.w
            self.w = self.h
            self.h = t
        self.println(str(sum))

    def solve1(self):
        sets1 = [TreeSet() for i in range(self.w)]
        for i in range(self.w):
            sets1[i].add(-1)
            sets1[i].add(self.h)
        sets2 = [TreeSet() for i in range(self.h)]
        for i in range(self.h):
            sets2[i].add(-1)
            sets2[i].add(self.w)

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
                if sy!= py:
                    if self.ok(x, sy, 0):
                        # [py+1, y-1]
                        sum += y - py - 1
                py = y
        return sum

    def ok(self, x, y, d):
        for k in range(len(self.run)):
            wx, wy = 0, 0  # wall or goal
            nx, ny = 0, 0  # next point
            if d == 0:
                wx = nx = x
                wy = list(sets1[x])[list(sets1[x]).index(y) + 1]
                ny = wy - 1
            elif d == 1:
                wy = ny = y
                wx = list(sets2[y])[list(sets2[y]).index(x) - 1]
                nx = wx + 1
            elif d == 2:
                wx = nx = x
                wy = list(sets1[x])[list(sets1[x]).index(y) - 1]
                ny = wy + 1
            else:
                assert d == 3
                wy = ny = y
                wx = list(sets2[y])[list(sets2[y]).index(x) + 1]
                nx = wx - 1
            if wx == self.gx and wy == self.gy:
                return True
            x = nx
            y = ny
            if self.run[k] == 'L':
                d = (d + 3) % 4
            elif self.run[k]