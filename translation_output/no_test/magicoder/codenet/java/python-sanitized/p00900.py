import sys
import math
from collections import defaultdict

EPS = 1e-10

dx = [-1, -1, -1, 0, 0, 0, 1, 1, 1]
dy = [-1, 0, 1, -1, 0, 1, -1, 0, 1]

def out(x, y):
    return x < 0 or y < 0 or x >= w or y >= h

def isEquals(p1, p2):
    return p1[0] == p2[0] and p1[1] == p2[1]

def solve(S, cnt):
    p = S % 100
    if S in memo:
        return memo[S]
    if S % 100 == size:
        if S // 100 == 0:
            return 0
        return INF
    if cnt == 9:
        if S // pow10[p] % 10 == 0:
            ret = solve(S+1, 0)
            memo[S] = ret
            return ret
        else:
            return INF
    min = solve(S, cnt+1)
    x, y = ps[p][0] + dx[cnt], ps[p][1] + dy[cnt]
    if out(x, y) or bomb[y][x] or map[y][x] < 0:
        return min
    next = S
    bomb[y][x] = True
    ng = False
    for i in range(size):
        for j in range(9):
            tx, ty = x + dx[j], y + dy[j]
            if out(tx, ty):
                continue
            tar = (tx, ty)
            if not isEquals(ps[i], tar):
                continue
            if next // pow10[i] % 10 > 0:
                next -= pow10[i]
            else:
                ng = True
    if not ng:
        min = min(min, solve(next, cnt+1) + 1)
    bomb[y][x] = False
    return min

def main():
    global h, w, size, map, bomb, ps, pow10, memo
    for line in sys.stdin:
        h, w = map(int, line.split())
        if h | w == 0:
            break
        map = [[0]*w for _ in range(h)]
        bomb = [[False]*w for _ in range(h)]
        ps = []
        for i in range(h):
            line = sys.stdin.readline().strip()
            for j in range(w):
                if line[j] == '.':
                    map[i][j] = -1
                elif line[j] == '*':
                    map[i][j