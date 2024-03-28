Below is the translated Python code that mirrors the functionality of the provided Java code:

```python
from itertools import product

class P:
    def __init__(self, x, y):
        self.x = x
        self.y = y
    
    def is_equals(self, p):
        return self.x == p.x and self.y == p.y

INF = 1 << 28
EPS = 1e-10
dx = [-1, -1, -1, 0, 0, 0, 1, 1, 1]
dy = [-1, 0, 1, -1, 0, 1, -1, 0, 1]
memo = {}
pow10 = []
ps = []
h = 0
w = 0

def solve(S, cnt, size, map, bomb):
    global ps
    global memo
    p = int(S % 100)
    if S in memo:
        return memo[S]
    if S % 100 == size:
        if S // 100 == 0:
            return 0
        return INF
    
    if cnt == 9:
        if S // pow10[p] % 10 == 0:
            ret = solve(S+1, 0, size, map, bomb)
            memo[S] = ret
            return ret
        else:
            return INF

    min_val = solve(S, cnt+1, size, map, bomb)
    x = ps[p].x + dx[cnt]
    y = ps[p].y + dy[cnt]

    if out(x, y, h, w) or bomb[y][x] or map[y][x] < 0:
        return min_val
    next_state = S
    bomb[y][x] = True

    ng = False
    for i in range(size):
        for j in range(9):
            tx = x + dx[j]
            ty = y + dy[j]
            if out(tx, ty, h, w):
                continue
            tar = P(tx, ty)
            if not ps[i].is_equals(tar):
                continue
            if next_state // pow10[i] % 10 > 0:
                next_state -= pow10[i]
            else:
                ng = True

    if not ng:
        min_val = min(min_val, solve(next_state, cnt+1, size, map, bomb) + 1)

    bomb[y][x] = False
    return min_val

def out(x, y, h, w):
    return x < 0 or y < 0 or x >= w or y >= h

while True:
    inputs = input().split()
    h = int(inputs[0])
    w = int(inputs[1])
    if (h | w) == 0:
        break

    map = []
    bomb = []
    ps_list = []
    memo.clear()
    pow10 = [100]

    for i in range(h):
        l = input()
        map.append([-1 if c == '.' else 0 if c == '*' else int(c) for c in l])
        bomb.append([False] * w)
        for j, c in enumerate(l):
            if c.isdigit():
                ps_list.append(P(j, i))

    ps = ps_list
    size = len(ps)
    S = pow10[0] * map[ps[0].y][ps[0].x]
    for i in range(1, size):
        pow10.append(pow10[i-1] * 10)
        S += pow10[i] * map[ps[i].y][ps[i].x]

    print(solve(S, 0, size, map, bomb))
```

This script will continue to read from the standard input, just like the Java program. The sample test case can be provided directly to the program's input.

Remember that Python and Java have some differences in handling standard input/output and code behavior, so when running this translated code, ensure that the inputs are provided exactly as expected by the Java version, and the output should match as well.
