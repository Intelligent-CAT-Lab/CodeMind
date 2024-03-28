import sys

def solve(w, h, gx, gy, n, xs, ys, run):
    sum = 0
    for d in range(4):
        sum += solve1(w, h, gx, gy, n, xs, ys, run)
        w, h = h, w
    return sum

def solve1(w, h, gx, gy, n, xs, ys, run):
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
        for y in sets1[x]:
            sy = y - 1
            if sy != py:
                if ok(x, sy, 0):
                    # [py+1, y-1]
                    sum += y - py - 1
        py = y

    return sum

def ok(x, y, d):
    for k in range(len(run)):
        wx, wy = 0, 0
        nx, ny = 0, 0
        if d == 0:
            wx, nx = x, x
            wy, ny = sets1[x].higher(y), sets1[x].higher(y) - 1
        elif d == 1:
            wy, ny = y, y
            wx, nx = sets2[y].lower(x), sets2[y].lower(x) + 1
        elif d == 2:
            wx, nx = x, x
            wy, ny = sets1[x].lower(y), sets1[x].lower(y) + 1
        else:
            assert d == 3
            wy, ny = y, y
            wx, nx = sets2[y].higher(x), sets2[y].higher(x) - 1

        if wx == gx and wy == gy:
            return True

        x = nx
        y = ny
        if run[k] == 'L':
            d = (d + 3) % 4
        elif run[k] == 'R':
            d = (d + 1) % 4

    return False

if __name__ == "__main__":
    w, h, gx, gy, n = map(int, input().split())
    xs, ys = [int(