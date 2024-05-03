Here is the Python version of the Java code:

```python
import sys

INF = 1 << 28
EPS = 1e-10

def run():
    for line in sys.stdin:
        h, w = map(int, line.split())
        if h == 0 and w == 0:
            break
        
        map_ = [[-1 if c == '.' else 0 if c == '*' else int(c) for c in input()] for _ in range(h)]
        ps = [(i, j) for j in range(w) for i in range(h) if map_[i][j] != -1]
        size = len(ps)
        pow10 = [100]
        for _ in range(size):
            pow10.append(pow10[-1] * 10)
        
        print(solve(sum(pow10[i] * map_[ps[i][1]][ps[i][0]] for i in range(size)), 0))

def solve(S, cnt):
    p = S % 100
    if memo.get(S, None) is not None:
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
    
    min_ = solve(S, cnt + 1)
    x, y = ps[p]
    if out(x, y) or map_[y][x] < 0:
        return min_
    next_ = S
    map_[y][x] = 0
    for i in range(size):
        if i == p:
            continue
        tx, ty = ps[i]
        if next_ // pow10[i] % 10 > 0:
            next_ -= pow10[i]
        else:
            min_ = min(min_, solve(next_, cnt + 1) +
