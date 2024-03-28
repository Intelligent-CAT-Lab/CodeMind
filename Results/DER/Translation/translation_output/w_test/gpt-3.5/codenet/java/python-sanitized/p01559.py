import collections

class P:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __lt__(self, other):
        if self.y != other.y:
            return self.y < other.y
        else:
            return self.x < other.x

def solve(n, m, positions):
    INF = 1 << 28
    LIM = 70
    dx = [0, 0, -1, 1]
    dy = [-1, 1, 0, 0]
    mod = 10**9 + 9

    def bfs_lim(paths, d, p0):
        wall = set(positions)
        path = {p0: 1}
        d[p0] = 0
        que = collections.deque([p0])

        for _ in range(LIM):
            if not que:
                break
            p = que.popleft()
            if d[p] == LIM:
                break
            for i in range(4):
                q = P(p.x + dx[i], p.y + dy[i])
                if 0 <= q.x < n and 0 <= q.y < n and q not in wall:
                    if q not in d:
                        d[q] = d[p] + 1
                        que.append(q)
                    if d[p] + 1 == d[q]:
                        path[q] = (path.get(q, 0) + path[p]) % mod

    if n <= 200:
        paths = {}
        ds = {}
        bfs_lim(paths, ds, P(0, 0))
        return paths.get(P(n - 1, n - 1), 0)

    max_val = 2000000
    fact_mod = [1] * max_val
    fact_inv_mod = [1] * max_val
    for i in range(1, max_val):
        fact_mod[i] = fact_mod[i - 1] * i % mod
        fact_inv_mod[i] = fact_inv_mod[i - 1] * pow(i, mod - 2, mod) % mod

    paths_s = {}
    ds_s = {}
    paths_g = {}
    ds_g = {}

    bfs_lim(paths_s, ds_s, P(0, 0))
    bfs_lim(paths_g, ds_g, P(n - 1, n - 1))

    d_min = INF
    for p, ds in ds_s.items():
        for q, dg in ds_g.items():
            if ds == LIM and dg == LIM:
                d_min = min(d_min, ds + abs(p.x - q.x) + abs(p.y - q.y) + dg)

    if d_min == INF:
        return 0

    set_s = set()
    set_g = set()
    for p, ds in ds_s.items():
        for q, dg in ds_g.items():
            if ds == LIM and dg == LIM and ds + abs(p.x - q.x) + abs(p.y - q.y) + dg == d_min:
                set_s.add(p)
                set_g.add(q)

    ps = sorted(positions)
    dp = [0] * m
    for p in set_s:
        for i, ps_i in enumerate(ps):
            dp[i] = (dp[i] + paths_s[p] * n_path(p, ps_i)) % mod

    for j in range(m):
        for i in range(j + 1, m):
            dp[i] = (dp[i] - dp[j] * n_path(ps[j], ps[i]) + mod) % mod

    ans = 0
    for p in set_g:
        total_sum = 0
        for q in set_s:
            total_sum = (total_sum + paths_s[q] * n_path(q, p) * paths_g[p]) % mod
        for i, ps_i in enumerate(ps):
            total_sum = (total_sum - dp[i] * n_path(ps_i, p) * paths_g[p]) % mod
        ans = (ans + total_sum) % mod

    return ans

def n_path(p, q):
    dx = q.x - p.x
    dy = q.y - p.y
    return mod_comb(dx + dy, dx)

def mod_comb(n, k):
    mod = 10**9 + 9
    if n < 0 or k < 0 or n < k:
        return 0
    return fact_mod[n] * fact_inv_mod[k] % mod * fact_inv_mod[n - k] % mod

def pow_mod(x, k, mod):
    if k == 0:
        return 1
    elif k % 2 == 0:
        return pow_mod(x * x % mod, k // 2, mod)
    else:
        return x * pow_mod(x, k - 1, mod) % mod

# Test input
n, m = 3, 0
positions = []

# Call the solve function and print the result
print(solve(n, m, positions))