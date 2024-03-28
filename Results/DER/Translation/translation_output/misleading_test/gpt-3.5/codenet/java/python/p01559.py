```python
from collections import defaultdict, deque
from heapq import heappush, heappop
from math import comb

class MinimumCostPath:
    INF = 1 << 28
    LIM = 70

    dx = [0, 0, -1, 1]
    dy = [-1, 1, 0, 0]

    def __init__(self):
        self.n, self.m = map(int, input().split())
        self.xs = []
        self.ys = []

    def solve_naive(self):
        self.LIM = 1000
        paths = defaultdict(int)
        ds = defaultdict(int)
        self.bfs_lim(paths, ds, (0, 0))
        if (self.n-1, self.n-1) in paths:
            print(paths[(self.n-1, self.n-1)] % int(1e9 + 9))
        else:
            print("0")

    def bfs_lim(self, paths, ds, p0):
        wall = set((x, y) for x, y in zip(self.xs, self.ys))

        paths[p0] = 1
        ds[p0] = 0

        que = deque([p0])

        for _ in range(self.LIM):
            if not que:
                break
            p = que.popleft()
            if ds[p] == self.LIM:
                break
            for i in range(4):
                q = p[0] + self.dx[i], p[1] + self.dy[i]
                if 0 <= q[0] < self.n and 0 <= q[1] < self.n and q not in wall:
                    if q not in ds:
                        ds[q] = ds[p] + 1
                        que.append(q)
                    if ds[p] + 1 == ds[q]:
                        paths[q] = (paths.get(q, 0) + paths.get(p, 0)) % self.mod

    def solve(self):
        if self.n <= 200:
            self.solve_naive()
            return
        
        max_val = 2000000
        fact_mod = [1] * max_val
        fact_inv_mod = [1] * max_val
        for i in range(1, max_val):
            fact_mod[i] = fact_mod[i-1] * i % self.mod
            fact_inv_mod[i] = fact_inv_mod[i-1] * pow(i, self.mod-2, self.mod) % self.mod

        paths_s = defaultdict(int)
        ds_s = defaultdict(int)
        paths_g = defaultdict(int)
        ds_g = defaultdict(int)

        self.bfs_lim(paths_s, ds_s, (0, 0))
        self.bfs_lim(paths_g, ds_g, (self.n-1, self.n-1))

        d_min = self.INF
        for p, ds in ds_s.items():
            for q, dg in ds_g.items():
                if ds == self.LIM and dg == self.LIM:
                    d_min = min(d_min, ds + abs(p[0] - q[0]) + abs(p[1] - q[1]) + dg)

        if d_min == self.INF:
            print("0")
            return

        set_s = set()
        set_g = set()

        for p, ds in ds_s.items():
            for q, dg in ds_g.items():
                if ds == self.LIM and dg == self.LIM and ds + abs(p[0] - q[0]) + abs(p[1] - q[1]) + dg == d_min:
                    set_s.add(p)
                    set_g.add(q)

        points = sorted((x, y) for x, y in zip(self.xs, self.ys))

        dp = [0] * self.m
        for p in set_s:
            for i, ps in enumerate(points):
                dp[i] = (dp[i] + paths_s[p] * self.n_path(p, ps) % self.mod) % self.mod

        for j in range(self.m):
            for i in range(j+1, self.m):
                dp[i] = (dp[i] - dp[j] * self.n_path(points[j], points[i]) % self.mod + self.mod) % self.mod

        ans = 0
        for p in set_g:
            total_sum = 0
            for q in set_s:
                total_sum = (total_sum + paths_s[q] * self.n_path(q, p) % self.mod * paths_g[p] % self.mod) % self.mod
            for i, ps in enumerate(points):
                total_sum = (total_sum - dp[i] * self.n_path(ps, p) % self.mod * paths_g[p] % self.mod + self.mod) % self.mod
            ans = (ans + total_sum) % self.mod

        print(ans)

    def n_path(self, p, q):
        dx = q[0] - p[0]
        dy = q[1] - p[1]
        return self.mod_comb(dx + dy, dx)

    def mod_comb(self, n, k):
        if n < 0 or k < 0 or n < k:
            return 0
        return (fact_mod[n] * fact_inv_mod[k] % self.mod * fact_inv_mod[n-k] % self.mod)

    def pow_mod(self, x, k, mod):
        if k == 0:
            return 1
        elif k & 1 == 0:
            return self.pow_mod(x * x % mod, k >> 1, mod)
        else:
            return x * self.pow_mod(x, k - 1, mod) % mod

    def run(self):
        self.mod = int(1e9 + 9)
        self.solve()

if __name__ == "__main__":
    MinimumCostPath().run()

```

