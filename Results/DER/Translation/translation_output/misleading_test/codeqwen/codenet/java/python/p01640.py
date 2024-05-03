Here is the Python version of the provided Java code:

```python
import sys

def solve(w, h, gx, gy, n, xs, ys, run):
    sum = 0
    for d in range(4):
        sum += solve1(w, h, gx, gy, n, xs, ys, run)
        gx, gy = h - 1 - gy, gx
        xs, ys = [h - 1 - y for y in ys], [x for x in xs]
        w, h = h, w
    return sum

def solve1(w, h, gx, gy, n, xs, ys, run):
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
                if ok(w, h, x, sy, 0, sets1, sets2, run):
                    sum += y - py - 1
            py = y
    return sum

def ok(w, h, x, y, d, sets1, sets2, run):
    for k in range(len(run)):
        nx, ny = x, y
        if d == 0:
            wx, wy = nx, sets1[nx].higher(ny)
            nx, ny = wx, wy - 1
        elif d == 1:
            wy, ny = ny, sets2[ny].lower(nx)
            nx, ny = nx - 1, wy
        elif d == 2:
            wx, wy
