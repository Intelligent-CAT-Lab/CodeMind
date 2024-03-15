from itertools import product

# INF = 1 << 62 // Assuming 64-bit integers are not needed.
EPS = 1e-10

dx = [-1, -1, -1, 0, 0, 0, 1, 1, 1]
dy = [-1, 0, 1, -1, 0, 1, -1, 0, 1]

def solve(S, cnt, ps, size, pow10, h, w, map_grid, bomb):
    p = S % 100
    if S in memo:
        return memo[S]
    if S % 100 == size:
        if S // 100 == 0:
            return 0
        return INF

    if cnt == 9:
        if S // pow10[p] % 10 == 0:
            ret = solve(S + 1, 0, ps, size, pow10, h, w, map_grid, bomb)
            memo[S] = ret
            return ret
        else:
            return INF

    min_val = solve(S, cnt + 1, ps, size, pow10, h, w, map_grid, bomb)
    x, y = ps[p][0] + dx[cnt], ps[p][1] + dy[cnt]

    if out(x, y, w, h) or bomb[y][x] or map_grid[y][x] < 0:
        return min_val
    next_S = S
    bomb[y][x] = True

    ng = False
    for i in range(size):
        for j in range(9):
            tx, ty = x + dx[j], y + dy[j]
            if out(tx, ty, w, h):
                continue
            tar = (tx, ty)
            if not ps[i] == tar:
                continue
            if next_S // pow10[i] % 10 > 0:
                next_S -= pow10[i]
            else:
                ng = True

    if not ng:
        min_val = min(min_val, solve(next_S, cnt + 1, ps, size, pow10, h, w, map_grid, bomb) + 1)

    bomb[y][x] = False
    return min_val

def out(x, y, w, h):
    return x < 0 or y < 0 or x >= w or y >= h

def run():
    global memo
    while True:
        h, w = map(int, input().split())
        if (h | w) == 0:
            break

        map_grid = [[-1 for _ in range(w)] for _ in range(h)]
        bomb = [[False for _ in range(w)] for _ in range(h)]
        ps = []
        for i in range(h):
            line = input()
            for j, char in enumerate(line):
                if char == '.':
                    map_grid[i][j] = -1
                elif char == '*':
                    map_grid[i][j] = 0
                else:
                    map_grid[i][j] = int(char)
                    ps.append((j, i))

        size = len(ps)
        memo = {}
        pow10 = [100 for _ in range(size)]
        S = pow10[0] * map_grid[ps[0][1]][ps[0][0]]
        for i in range(1, size):
            pow10[i] = pow10[i - 1] * 10
            S += pow10[i] * map_grid[ps[i][1]][ps[i][0]]

        print(solve(S, 0, ps, size, pow10, h, w, map_grid, bomb))

if __name__ == '__main__':
    run()