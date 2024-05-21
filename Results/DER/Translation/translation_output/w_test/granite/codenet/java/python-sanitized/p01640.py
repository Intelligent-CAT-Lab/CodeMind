import sys

def solve1():
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
            if sy!= py:
                if ok(x, sy, 0):
                    sum += y - py - 1
            py = y
    return sum

def ok(x, y, d):
    for k in range(len(run)):
        wx, wy  # wall or goal
        nx, ny  # next point

        if d == 0:
            wx, nx = x, x
            wy = next(iter(set(range(y + 1, h)).difference(sets1[x])), h)
            ny = wy - 1
        elif d == 1:
            wy, ny = y, y
            wx = next(iter(set(range(x + 1, w)).difference(sets2[y])), w)
            nx = wx + 1
        elif d == 2:
            wx, nx = x, x
            wy = next(iter(set(range(y - 1, -1, -1)).difference(sets1[x])), -1)
            ny = wy + 1
        else:
            assert d == 3
            wy, ny = y, y
            wx = next(iter(set(range(x - 1, -1, -1)).difference(sets2[y])), -1)
            nx = wx - 1

        if wx == gx and wy == gy:
            return True

        x, y = nx, ny
        if run[k] == 'L':
            d = (d + 3) % 4
        else:
            assert run[k] == 'R'
            d = (d + 1) % 4

    return False

w, h, gx, gy, n = map(int, input().split())
gx -= 1
gy -= 1
xs = []
ys = []
for _ in range(n):
    x, y = map(int, input().split())
    xs.append(x - 1)
    ys.append(y - 1)
run = input() + '$'

sum = 0
for d in range(4):
    sum += solve1()
    gx, gy = h - 1 - gy, gx
    xs, ys = [h - 1 - y for y in ys], xs
    w, h = h, w

print(sum)