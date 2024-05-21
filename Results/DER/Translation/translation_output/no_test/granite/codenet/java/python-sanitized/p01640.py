import sys

# Get Lost
def solve(w, h, gx, gy, n, xs, ys, run):
    sum = 0
    for d in range(4):
        sum += solve1(w, h, gx, gy, n, xs, ys, run)
        gx, gy = h - 1 - gy, gx
        xs, ys = [h - 1 - y for y in ys], xs
        w, h = h, w
    return sum

def solve1(w, h, gx, gy, n, xs, ys, run):
    sets1 = [set() for _ in range(w)]
    sets2 = [set() for _ in range(h)]
    for x, y in zip(xs, ys):
        sets1[x].add(y)
        sets2[y].add(x)
    sets1[gx].add(gy)
    sets2[gy].add(gx)

    sum = 1
    for x in range(w):
        py = -2
        for y in sorted(sets1[x]):
            sy = y - 1
            if sy!= py:
                if ok(x, sy, 0, w, h, gx, gy, sets1, sets2, run):
                    sum += y - py - 1
            py = y
    return sum

def ok(x, y, d, w, h, gx, gy, sets1, sets2, run):
    for k in range(len(run)):
        wx, wy = x, y
        nx, ny = x, y
        if d == 0:
            wx, wy = x, sets1[x].higher(y)
            ny = wy - 1
        elif d == 1:
            wy, wx = y, sets2[y].lower(x)
            nx = wx + 1
        elif d == 2:
            wx, wy = x, sets1[x].lower(y)
            ny = wy + 1
        else:
            assert d == 3
            wy, wx = y, sets2[y].higher(x)
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

def main():
    w, h, gx, gy, n = map(int, input().split())
    xs, ys = [], []
    for _ in range(n):
        x, y = map(int, input().split())
        xs.append(x)
        ys.append(y)
    run = input()
    print(solve(w, h, gx, gy, n, xs, ys, run))

if __name__ == '__main__':
    main()