import sys

EPS = 1e-10
h, w = 0, 0
map = []
bomb = []
ps = []

def run():
    global h, w, map, bomb, ps
    for line in sys.stdin:
        h, w = map(int, line.split())
        if h == 0 and w == 0:
            break
        map = [[0 if c == '*' else -1 if c == '.' else int(c) for c in sys.stdin.readline().strip()] for _ in range(h)]
        bomb = [[False]*w for _ in range(h)]
        ps = [(j, i) for i in range(h) for j in range(w) if map[i][j] >= 0]
        size = len(ps)
        pow10 = [100] + [100*pow10[i-1] for i in range(1, size)]
        S = sum(pow10[i]*map[ps[i][1]][ps[i][0]] for i in range(size))
        print(solve(S, 0))

def solve(S, cnt):
    p = S % 100
    if S % 100 == size:
        if S // 100 == 0:
            return 0
        return INF
    if cnt == 9:
        if S // pow10[p] % 10 == 0:
            return solve(S+1, 0)
        else:
            return INF
    min_val = solve(S, cnt+1)
    x, y = ps[p]
    if out(x, y) or bomb[y][x] or map[y][x] < 0:
        return min_val
    next_val = S
    bomb[y][x] = True
    ng = False
    for i in range(size):
        for j in range(9):
            tx, ty = x + dx[j], y + dy[j]
            if out(tx, ty):
                continue
            tar = (tx, ty)
            if not ps[i] == tar:
                continue
            if next_val // pow10[i] % 10 > 0:
                next_val -= pow10[i]
            else:
                ng = True
    if not ng:
        min_val = min(min_val, solve(next_val, cnt+1) + 1)
    bomb[y][x] = False
    return min_val

def out(x, y):
    return x < 0 or y < 0 or x >= w or y >= h

dx = [-1, -1, -1, 0, 0, 0,