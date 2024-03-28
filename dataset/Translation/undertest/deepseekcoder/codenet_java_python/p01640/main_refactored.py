class main:
    import sys
    from sortedcontainers import SortedSet
    
    def solve1(w, h, gx, gy, n, xs, ys):
        sets1 = [SortedSet([-1, h]) for _ in range(w)]
        sets2 = [SortedSet([-1, w]) for _ in range(h)]
    
        for i in range(n):
            sets1[xs[i]].add(ys[i])
            sets2[ys[i]].add(xs[i])
        sets1[gx].add(gy)
        sets2[gy].add(gx)
    
        sum = 1
        for x in range(w):
            py = -2
            for y in sets1[x]:
                sy = y - 1
                if sy != py:
                    if ok(x, sy, 0, w, h, gx, gy, xs, ys):
                        sum += y - py - 1
                py = y
        return sum
    
    def ok(x, y, d, w, h, gx, gy, xs, ys):
        run = sys.stdin.readline().strip()
        for k in range(len(run)):
            wx, wy = 0, 0
            nx, ny = 0, 0
            if d == 0:
                wx, wy = x, sets1[x].bisect_left(y)
                nx, ny = wx, wy - 1
            elif d == 1:
                wy, ny = y, y - 1
                wx = sets2[y].bisect_right(x)
                nx = wx - 1
            elif d == 2:
                wx, wy = x, sets1[x].bisect_right(y)
                nx, ny = wx, wy + 1
            else:
                wy, ny = y, y + 1
                wx = sets2[y].bisect_left(x)
                nx = wx + 1
            if wx == gx and wy == gy:
                return True
            x, y = nx, ny
            if run[k] == 'L':
                d = (d + 3) % 4
            elif run[k] == 'R':
                d = (d + 1) % 4
        return False
    
    def main():
        w, h, gx, gy, n = map(int, sys.stdin.readline().split())
        gx -= 1
        gy -= 1
        xs = [0]*n
        ys = [0]*n
        for i in range(n):
            xs[i], ys[i] = map(int, sys.stdin.readline().split())
            xs[i] -= 1
            ys[i] -= 1
        print(solve1(w, h, gx, gy, n, xs, ys))
    
    if __name__ == "__main__":
        main()