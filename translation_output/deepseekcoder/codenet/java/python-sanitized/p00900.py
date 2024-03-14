import sys
from collections import defaultdict

class P:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def is_equals(self, p):
        return self.x == p.x and self.y == p.y

def out(x, y, h, w):
    return x < 0 or y < 0 or x >= w or y >= h

def solve(S, cnt, ps, bomb, map, h, w, size, memo, pow10):
    p = int(S % 100)
    if memo[S]:
        return memo[S]
    if S % 100 == size:
        if S // 100 == 0:
            return 0
        return 1 << 28

    if cnt == 9:
        if S // pow10[p] % 10 == 0:
            ret = solve(S+1, 0, ps, bomb, map, h, w, size, memo, pow10)
            memo[S] = ret
            return ret
        else:
            return 1 << 28

    min = solve(S, cnt+1, ps, bomb, map, h, w, size, memo, pow10)
    x, y = ps[p].x + [-1, -1, -1, 0, 0, 0, 1, 1, 1][cnt], ps[p].y + [-1, 0, 1, -1, 0, 1, -1, 0, 1][cnt]

    if out(x, y, h, w) or bomb[y][x] or map[y][x] < 0:
        return min
    S_next = S
    bomb[y][x] = True

    ng = False
    for i in range(size):
        for j in range(9):
            tx, ty = x + [-1, -1, -1, 0, 0, 0, 1, 1, 1][j], y + [-1, 0, 1, -1, 0, 1, -1, 0, 1][j]
            if out(tx, ty, h, w):
                continue
            tar = P(tx, ty)
            if not ps[i].is_equals(tar):
                continue
            if S_next // pow10[i] % 10 > 0:
                S_next -= pow10[i]
            else:
                ng = True

    if not ng:
        min = min(min, solve(S_next, cnt+1, ps, bomb, map, h, w, size, memo, pow10) + 1)

    bomb[y][x] = False
    return min

def main():
    h, w = map(