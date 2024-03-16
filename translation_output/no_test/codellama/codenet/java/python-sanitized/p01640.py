import math
import sys

def solve():
    w, h, gx, gy, n = map(int, input().split())
    xs = list(map(int, input().split()))
    ys = list(map(int, input().split()))
    run = input()

    sets1 = [set() for _ in range(w)]
    sets2 = [set() for _ in range(h)]

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
        wx, wy = x, y
        if d == 0:
            wx = x
            wy = sets1[x].higher(y)
        elif d == 1:
            wy = y
            wx = sets2[y].lower(x)
        elif d == 2:
            wx = x
            wy = sets1[x].lower(y)
        else:
            assert d == 3
            wy = y
            wx = sets2[y].higher(x)

        if wx == gx and wy == gy:
            return True

        x = wx
        y = wy
        if run[k] == 'L':
            d = (d + 3) % 4
        elif run[k] == 'R':
            d = (d + 1) % 4

    return False

if __name__ == '__main__':
    print(solve())