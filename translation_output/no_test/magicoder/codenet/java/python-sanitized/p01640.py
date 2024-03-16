import sys
from bisect import bisect_left, bisect_right

def solve1():
    sets1 = [set([-1, h]) for _ in range(w)]
    sets2 = [set([-1, w]) for _ in range(h)]

    for i in range(n):
        sets1[xs[i]].add(ys[i])
        sets2[ys[i]].add(xs[i])
    sets1[gx].add(gy)
    sets2[gy].add(gx)

    sum = 1
    for x in range(w):
        py = -2
        for y in sorted(sets1[x]):
            sy = y - 1
            if sy != py:
                if ok(x, sy, 0):
                    sum += y - py - 1
            py = y
    return sum

def ok(x, y, d):
    for k in range(len(run)):
        wx, wy = None, None  # wall or goal
        nx, ny = None, None  # next point
        if d == 0:
            wx, nx = x, x
            wy = sets1[x][bisect_right(sorted(sets1[x]), y)]
            ny = wy - 1
        elif d == 1:
            wy, ny = y, y
            wx = sets2[y][bisect_left(sorted(sets2[y]), x)]
            nx = wx + 1
        elif d == 2:
            wx, nx = x, x
            wy = sets1[x][bisect_left(sorted(sets1[x]), y)]
            ny = wy + 1
        else:
            assert d == 3
            wy, ny = y, y
            wx = sets2[y][bisect_right(sorted(sets2[y]), x)]
            nx = wx - 1
        if wx == gx and wy == gy:
            return True
        x, y = nx, ny
        if run[k] == 'L':
            d = (d + 3) % 4
        elif run[k] == 'R':
            d = (d + 1) % 4
    return False

def main():
    global w, h, gx, gy, n, xs, ys, run
    w, h, gx, gy, n = map(int, sys.stdin.readline().split())
    gx -= 1
    gy -= 1
    xs = [int(x) - 1 for x in sys.stdin.readline().split()]
    ys = [int(y) - 1 for y in sys.stdin.readline().split()]
    run = sys.stdin.readline().strip() + "$"
    solve()

def solve():
    sum = 0
    for d in range(4):
        sum += solve1()
        gx, gy = h - 1 - gy, gx
        xs = [h - 1 - ys[i] for i in range(n)]
        ys = [xs[i] for i in range(n)]
        w, h =