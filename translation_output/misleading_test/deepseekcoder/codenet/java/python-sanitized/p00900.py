import sys
from collections import defaultdict

EPS = 1e-10
dx = [-1, -1, -1, 0, 0, 0, 1, 1, 1]
dy = [-1, 0, 1, -1, 0, 1, -1, 0, 1]

class P:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def is_equals(self, p):
        return self.x == p.x and self.y == p.y

def out(x, y, w, h):
    return x < 0 or y < 0 or x >= w or y >= h

def solve(S, cnt, memo, pow10, ps, w, h):
    p = int(S % 100)
    if memo.get(S):
        return memo.get(S)
    if S % 100 == len(ps):
        if S // 100 == 0:
            return 0
        return INF

    if cnt == 9:
        if S // pow10[p] % 10 == 0:
            ret = solve(S+1, 0, memo, pow10, ps, w, h)
            memo[S] = ret
            return ret
        else:
            return INF

    min_val = solve(S, cnt+1, memo, pow10, ps, w, h)
    x, y = ps[p].x + dx[cnt], ps[p].y + dy[cnt]

    if out(x, y, w, h) or bomb[y][x] or map[y][x] < 0:
        return min_val
    next_val = S
    bomb[y][x] = True

    ng = False
    for i in range(len(ps)):
        for j in range(9):
            tx, ty = x + dx[j], y + dy[j]
            if out(tx, ty, w, h):
                continue
            tar = P(tx, ty)
            if not ps[i].is_equals(tar):
                continue
            if next_val // pow10[i] % 10 > 0:
                next_val -= pow10[i]
            else:
                ng = True

    if not ng:
        min_val = min(min_val, solve(next_val, cnt+1, memo, pow10, ps, w, h) + 1)

    bomb[y][x] = False
    return min_val

def main():
    global map, bomb, ps
    for line in