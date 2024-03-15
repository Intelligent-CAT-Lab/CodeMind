```python
from collections import deque

mod = 10**9 + 9
INF = 1 << 28
LIM = 70

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

class P:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __repr__(self):
        return "(" + str(self.x) + "," + str(self.y) + ")"

    def __eq__(self, other):
        return self.x == other.x and self.y == other.y

    def __hash__(self):
        return hash(self.x) | (hash(self.y) << 16)

    def __lt__(self, other):
        if self.y != other.y:
            return self.y < other.y
        else:
            return self.x < other.x

def solve():
    n, m = map(int, input().split())
    xs, ys = [], []

    for _ in range(m):
        x, y = map(int, input().split())
        xs.append(x - 1)
        ys.append(y - 1)

    if n <= 200:
        solve_naive(n, xs, ys)
        return

    max_val = 2000000
    fact_mod = [0] * max_val
    fact_inv_mod = [0] * max_val
    fact_mod[0] = fact_inv_mod[0] = 1

    for i in range(1, max_val):
        fact_mod[i] = fact_mod[i - 1] * i % mod
        fact_inv_mod[i] = fact_inv_mod[i - 1] * pow_mod(i, mod - 2, mod) % mod

    paths_s, ds_s = bfs_lim(n, xs, ys, P(0, 0))
    paths_g, ds_g = bfs_lim(n, xs, ys, P(n - 1, n - 1))

    d_min = INF
    for ps, ds in ds_s.items():
        for pq, dg in ds_g.items():
            ds_val = ds
            dg_val = dg
            if ds == LIM and dg == LIM:
                d_min = min(d_min, ds_val + abs(ps.x - pq.x) + abs(ps.y - pq.y) + dg_val)

    if d_min == INF:
        print("0")
        return

    set_s, set_g = set(), set()

    for ps, ds in ds_s.items():
        for pq, dg in ds_g.items():
            ds_val = ds
            dg_val = dg
            if ds == LIM and dg == LIM and ds_val + abs(ps.x - pq.x) + abs(ps.y - pq.y) + dg_val == d_min:
                set_s.add(ps)
                set_g.add(pq)

    points = [P(xs[i], ys[i]) for i in range(m)]
    points.sort()

    dp = [0] * m
    for p in set_s:
        for i, q in enumerate(points):
            dp[i] = (dp[i] + paths_s[p] * n_path(p, q, mod) % mod) % mod

    for j in range(m):
        for i in range(j + 1, m):
            dp[i] = (dp[i] - dp[j] * n_path(points[j], points[i], mod) % mod + mod) % mod

    ans = 0
    for q in set_g:
        s_sum = 0
        for p in set_s:
            s_sum = (s_sum + paths_s[p] * n_path(p, q, mod) * paths_g[q] % mod) % mod

        for i, pq in enumerate(points):
            s_sum = (s_sum - dp[i] * n_path(pq, q, mod) * paths_g[q] % mod + mod) % mod

        ans = (ans + s_sum) % mod

    print(ans)

def solve_naive(n, xs, ys):
    LIM = 1000
    paths = {}
    ds = {}
    bfs_lim(n, xs, ys, paths, ds, P(0, 0))
    if P(n - 1, n - 1) in paths:
        print(str(paths[P(n - 1, n - 1)]))
    else:
        print("0")

def bfs_lim(n, xs, ys, paths, ds, p0):
    wall = set()

    for i in range(len(xs)):
        wall.add(P(xs[i], ys[i]))

    paths[p0] = 1
    ds[p0] = 0

    que = deque()
    que.append(p0)

    while que:
        p = que.popleft()
        if ds[p] == LIM:
            break
        for i in range(4):
            q = P(p.x + dx[i], p.y + dy[i])
            if 0 <= q.x < n and 0 <= q.y < n and q not in wall:
                if q not in ds:
                    ds[q] = ds[p] + 1
                    que.append(q)
                if ds[p] + 1 == ds[q]:
                    if q not in paths:
                        paths[q] = 0
                    paths[q] = (paths[q] + paths[p]) % mod

def n_path(p, q, mod):
    dx_val = q.x - p.x
    dy_val = q.y - p.y
    return mod_comb(dx_val + dy_val, dx_val, mod)

def mod_comb(n, k, mod):
    if n < 0 or k < 0 or n < k:
        return 0
    return fact_mod[n] * fact_inv_mod[k] % mod * fact_inv_mod[n - k] % mod

def pow_mod(x, k, mod):
    if k == 0:
        return 1
    elif k & 1 == 0:
        return pow_mod(x * x % mod, k >> 1, mod)
    else:
        return x * pow_mod(x, k - 1, mod) % mod

if __name__ == "__main__":
    solve()
```

