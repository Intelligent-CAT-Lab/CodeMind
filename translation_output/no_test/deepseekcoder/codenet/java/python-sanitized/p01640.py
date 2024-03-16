import sys
from sortedcontainers import SortedSet

def solve1():
    sets1 = [SortedSet([-1, h]) for _ in range(w)]
    sets2 = [SortedSet([-1, w]) for _ in range(h)]

    for i in range(n):
        sets1[xs[i]].add(ys[i])
        sets2[ys[i]].add(xs[i])
    sets1[gx].add(gy)
    sets2[gy].add(gx)

    sum = 1
    for x in range(w):
        py = -2
        for y in sets1[x]:
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
            wy = sets1[x].bisect_left(y)
            ny = wy - 1
        elif d == 1:
            wy, ny = y, y
            wx = sets2[y].bisect_right(x) - 1
            nx = wx + 1
        elif d == 2:
            wx, nx = x, x
            wy = sets1[x].bisect_right(y)
            ny = wy + 1
        else:
            assert d == 3
            wy, ny = y, y
            wx = sets2[y].bisect_left(x)
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
    xs = [0]*n
    ys = [0]*n
    for i in range(n):
        xs[i], ys[i] = map(int, sys.stdin.readline().split())
        xs[i] -= 1
        ys[i] -= 1
    run = sys.stdin.readline().strip() + "$"
    solve()

def solve():
    sum = 0
    for _ in range(4):
        sum += solve1()
        gx, gy = h - 1 - gx, gy
        xs, ys = [h - 1 - y for y in ys], xs
        w, h = h, w
    print(sum)

if __name__ == "__main__":
    main()