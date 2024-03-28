class main:
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
    
    def solve(S, cnt, memo, pow10, ps, size, map, bomb, w, h):
        p = int(S % 100)
        if memo.get(S):
            return memo.get(S)
        if S % 100 == size and S // 100 == 0:
            return 0
        if cnt == 9:
            if S // pow10[p] % 10 == 0:
                ret = solve(S+1, 0, memo, pow10, ps, size, map, bomb, w, h)
                memo[S] = ret
                return ret
            else:
                return INF
        min = solve(S, cnt+1, memo, pow10, ps, size, map, bomb, w, h)
        x, y = ps[p].x + dx[cnt], ps[p].y + dy[cnt]
        if out(x, y, w, h) or bomb[y][x] or map[y][x] < 0:
            return min
        next = S
        bomb[y][x] = True
        ng = False
        for i in range(size):
            for j in range(9):
                tx, ty = x + dx[j], y + dy[j]
                if out(tx, ty, w, h):
                    continue
                tar = P(tx, ty)
                if not ps[i].is_equals(tar):
                    continue
                if next // pow10[i] % 10 > 0:
                    next -= pow10[i]
                else:
                    ng = True
        if not ng:
            min = min(min, solve(next, cnt+1, memo, pow10, ps, size, map, bomb, w, h) + 1)
        bomb[y][x] = False
        return min
    
    def main():
        for line in sys.stdin:
            h, w = map(int, line.split())
            if