import sys

class P:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def isEquals(self, p):
        return self.x == p.x and self.y == p.y

def solve(S, cnt):
    p = S % 100
    if memo.get(S) is not None:
        return memo.get(S)
    if S % 100 == size:
        if S // 100 == 0:
            return 0
        return sys.maxsize

    if cnt == 9:
        if S // pow10[p] % 10 == 0:
            ret = solve(S+1, 0)
            memo[S] = ret
            return ret
        else:
            return sys.maxsize

    min = solve(S, cnt+1)
    x = ps[p].x + dx[cnt], y = ps[p].y + dy[cnt]

    if out(x, y) or bomb[y][x] or map[y][x] < 0:
        return min

    next = S
    bomb[y][x] = True

    ng = False
    for i in range(size):
        for j in range(9):
            tx = x + dx[j], ty = y + dy[j]
            if out(tx, ty):
                continue
            tar = P(tx, ty)
            if not tar.isEquals(ps[i]):
                continue
            if next // pow10[i] % 10 > 0:
                next -= pow10[i]
            else:
                ng = True

    if not ng:
        min = min(min, solve(next, cnt+1) + 1)

    bomb[y][x] = False
    return min

def out(x, y):
    return x < 0 or y < 0 or x >= w or y >= h

def run():
    global memo, pow10
    memo = {}
    pow10 = [100]
    h, w, size = map, bomb, ps
    for i in range(h):
        l = input()
        for j in range(w):
            switch l[j]:
                case '.':
                    map[i][j] = -1