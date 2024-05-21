import sys

INF = 1 << 28

dx = [-1, -1, -1, 0, 0, 0, 1, 1, 1]
dy = [-1, 0, 1, -1, 0, 1, -1, 0, 1]

def solve(S, cnt):
    p = S % 100
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
    x = ps[p].x + dx[cnt]
    y = ps[p].y + dy[cnt]
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
            tar = P(tx, ty)
            if not ps[i].isEquals(tar):
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

def main():
    while True:
        h, w = map(int, input().split())
        if h == 0 and w == 0:
            break
        map = [[-1] * w for _ in range(h)]
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
                    map[i][j] = int(line[j])
                    ps.append(P(j, i))
        size = len(ps)
        pow10 = [100]
        for i in range(size):
            pow10.append(pow10[-1] * 10)
        S = pow10[0] * map[ps[0].y][ps[0].x]
        for i in range(1, size):
            S += pow10[i] * map[ps[i].y][ps[i].x]
        print(solve(S, 0))

if __name__ == '__main__':
    main()