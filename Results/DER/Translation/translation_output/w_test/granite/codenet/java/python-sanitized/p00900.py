import sys

INF = 1 << 28

def solve(S, cnt):
    p = S % 100
    if (S, cnt) in memo:
        return memo[(S, cnt)]
    if S % 100 == size:
        if S / 100 == 0:
            return 0
        return INF
    if cnt == 9:
        if S / pow10[p] % 10 == 0:
            return solve(S + 1, 0)
        else:
            return INF
    min = solve(S, cnt + 1)
    x = ps[p][0] + dx[cnt]
    y = ps[p][1] + dy[cnt]
    if out(x, y) or bomb[y][x] or map[y][x] < 0:
        return min
    next = S
    bomb[y][x] = True
    ng = False
    for i in range(size):
        for j in range(9):
            tx = x + dx[j]
            ty = y + dy[j]
            if out(tx, ty):
                continue
            if (tx, ty)!= ps[i]:
                continue
            if next / pow10[i] % 10 > 0:
                next -= pow10[i]
            else:
                ng = True
    if not ng:
        min = min(min, solve(next, cnt + 1) + 1)
    bomb[y][x] = False
    return min

def out(x, y):
    return x < 0 or y < 0 or x >= w or y >= h

h, w = map(int, input().split())
while h!= 0 and w!= 0:
    map = []
    bomb = []
    ps = []
    for i in range(h):
        line = list(input())
        for j in range(w):
            if line[j] == '.':
                map.append(-1)
            elif line[j] == '*':
                map.append(0)
            else:
                map.append(int(line[j]))
                ps.append((j, i))
    size = len(ps)
    pow10 = [100]
    for i in range(size):
        pow10.append(pow10[-1] * 10)
    S = pow10[0] * map[ps[0][1] * w + ps[0][0]]
    for i in range(1, size):
        S += pow10[i] * map[ps[i][1] * w + ps[i][0]]
    dx = [-1, -1, -1, 0, 0, 0, 1, 1, 1]
    dy = [-1, 0, 1, -1, 0, 1, -1, 0, 1]
    memo = {}
    print(solve(S, 0))
    h, w = map(int, input().split())