from collections import OrderedDict, deque
import sys
import heapq
from functools import reduce
import operator

# Constants
LIM = 70
MOD = 10**9 + 9

# Direction vectors
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

def pow_mod(x, k, mod):
    if k == 0:
        return 1
    elif k % 2 == 0:
        return pow_mod(x * x % mod, k // 2, mod)
    else:
        return x * pow_mod(x, k - 1, mod) % mod

def mod_comb(n, k, fact_mod, fact_inv_mod):
    if n < 0 or k < 0 or n < k:
        return 0
    return (fact_mod[n] * fact_inv_mod[k] % MOD) * fact_inv_mod[n - k] % MOD

def n_path(p, q, fact_mod, fact_inv_mod):
    dx = q[0] - p[0]
    dy = q[1] - p[1]
    return mod_comb(dx + dy, dx, fact_mod, fact_inv_mod)

def solve_naive(n, m, xs, ys):
    LIM = 1000
    path = OrderedDict()
    d = OrderedDict()

    bfs_lim(n, path, d, (0, 0), xs, ys, LIM, set(zip(xs, ys)))

    if (n - 1, n - 1) in path:
        return path[(n - 1, n - 1)]
    else:
        return 0

def bfs_lim(n, path, d, p0, xs, ys, LIM, wall):
    path[p0] = 1
    d[p0] = 0

    que = deque([p0])

    while que:
        p = que.popleft()
        if d[p] == LIM:
            break
        for i in range(4):
            q = (p[0] + dx[i], p[1] + dy[i])
            if 0 <= q[0] < n and 0 <= q[1] < n and q not in wall:
                if q not in d:
                    d[q] = d[p] + 1
                    que.append(q)
                if d[p] + 1 == d[q]:
                    if q not in path:
                        path[q] = 0
                    path[q] = (path[q] + path[p]) % MOD

def main():
    n, m = map(int, input().split())
    xs = []
    ys = []
    for _ in range(m):
        x, y = map(int, input().split())
        xs.append(x - 1)
        ys.append(y - 1)

    if n <= 200:
        print(solve_naive(n, m, xs, ys))
        return

    # Precompute factorials and inverse factorials
    max_val = 2000000
    fact_mod = [0] * max_val
    fact_inv_mod = [0] * max_val
    fact_mod[0] = fact_inv_mod[0] = 1
    for i in range(1, max_val):
        fact_mod[i] = fact_mod[i - 1] * i % MOD
        fact_inv_mod[i] = fact_inv_mod[i - 1] * pow_mod(i, MOD - 2, MOD) % MOD

    # BFS
    paths_s = OrderedDict()
    ds_s = OrderedDict()
    paths_g = OrderedDict()
    ds_g = OrderedDict()

    bfs_lim(n, paths_s, ds_s, (0, 0), xs, ys, LIM, set(zip(xs, ys)))
    bfs_lim(n, paths_g, ds_g, (n - 1, n - 1), xs, ys, LIM, set(zip(xs, ys)))

    d_min = INF
    for p, ds in ds_s.items():
        for q, dg in ds_g.items():
            if ds == LIM and dg == LIM:
                d_min = min(d_min, ds + abs(p[0] - q[0]) + abs(p[1] - q[1]) + dg)

    if d_min == INF:
        print(0)
        return

    set_s = {p for p, v in ds_s.items() if v == LIM}
    set_g = {p for p, v in ds_g.items() if v == LIM}

    ps = sorted(set(zip(xs, ys)))

    dp = [0] * m
    for p in set_s:
        for i in range(m):
            dp[i] = (dp[i] + paths_s[p] * n_path(p, ps[i], fact_mod, fact_inv_mod) % MOD) % MOD
    for j in range(m):
        for i in range(j + 1, m):
            dp[i] = (dp[i] - dp[j] * n_path(ps[j], ps[i], fact_mod, fact_inv_mod) % MOD + MOD) % MOD

    ans = 0
    for p in set_g:
        sum_ = 0
        for q in set_s:
            sum_ = (sum_ + paths_s[q] * n_path(q, p, fact_mod, fact_inv_mod) % MOD * paths_g[p] % MOD) % MOD
        for i in range(m):
            sum_ = (sum_ - dp[i] * n_path(ps[i], p, fact_mod, fact_inv_mod) % MOD * paths_g[p] % MOD + MOD) % MOD
        ans = (ans + sum_) % MOD

    print(ans)

if __name__ == '__main__':
    main()