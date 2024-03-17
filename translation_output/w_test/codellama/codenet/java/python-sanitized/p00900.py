import sys
import math

EPS = 1e-10

def run():
    h, w = map(int, input().split())
    if h == 0 and w == 0:
        return

    map = [[0] * w for _ in range(h)]
    bomb = [[False] * w for _ in range(h)]
    ps = []
    for i in range(h):
        line = input()
        for j in range(w):
            if line[j] == '.':
                map[i][j] = -1
            elif line[j] == '*':
                map[i][j] = 0
            else:
                map[i][j] = ord(line[j]) - ord('0')
                ps.append((j, i))

    size = len(ps)
    pow10 = [100] * size
    S = pow10[0] * map[ps[0][1]][ps[0][0]]
    for i in range(1, size):
        pow10[i] = pow10[i - 1] * 10
        S += pow10[i] * map[ps[i][1]][ps[i][0]]

    memo = {}
    solve(S, 0)

def solve(S, cnt):
    p = int(S % 100)
    if memo.get(S):
        return memo[S]
    if S % 100 == size:
        if S // 100 == 0:
            return 0
        return INF

    if cnt == 9:
        if S // pow10[p] % 10 == 0:
            return solve(S + 1, 0)
        else:
            return INF

    min = solve(S, cnt + 1)
    x, y = ps[p]
    x += dx[cnt]
    y += dy[cnt]

    if out(x, y) or bomb[y][x] or map[y][x]