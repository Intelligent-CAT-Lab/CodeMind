

```python
import sys

def out(x, y):
    return x < 0 or y < 0 or x >= w or y >= h

def solve(S, cnt):
    p = S % 100
    if memo.has_key(S):
        return memo[S]
    if S % 100 == size:
        if S / pow10[p] % 10 == 0:
            ret = solve(S+1, 0)
            memo[S] = ret
            return ret
        else:
            return INF
    if cnt == 9:
        if S / pow10[p] % 10 == 0:
            ret = solve(S+1, 0)
            memo[S] = ret
            return ret
        else:
            return INF
    min = solve(S, cnt+1)
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
            tar = (tx, ty)
            if ps[i] != tar:
                continue
            if next / pow10[i] % 10 > 0:
                next -= pow10[i]
            else:
                ng = True
    if not ng:
        min = min(min, solve(next, cnt+1) + 1)
    bomb[y][x] = False
    return min

INF = 1 << 28
dx = [-1, -1, -1, 0, 0, 0, 1, 1, 1]
dy = [-1, 0, 1, -1, 0, 1, -1, 0, 1]

while True:
    h, w = map(int, sys.stdin.readline().split())
    if h == 0 and w == 0:
        break
    map = []
    bomb = []
    ps = []
    for i in range(h):
        l = sys.stdin.readline().strip()
        map.append([])
        bomb.append([])
        for j in range(w):
            if l[j] == '.':
                map[i].append(-1)
            elif l[j] == '*':
                map[i].append(0)
            else:
                map[i].append(int(l[j]))
                ps.append((j, i))
            bomb[i].append(False)
    size = len(ps)
    memo = {}
    pow10 = [100]
    S = pow10[0] * map[ps[0][1]][ps[0][0]]
    for i in range(1, size):
        pow10.append(pow10[i-1] * 10)
        S += pow10[i] * map[ps[i][1]][ps[i][0]]
    print solve(S, 0)
```

## 00901 - 00999

## 00901 - 
