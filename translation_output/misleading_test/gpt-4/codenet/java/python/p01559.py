Here is the Java code translated to Python:

```python
from collections import deque, defaultdict
import sys

# Constants
INF = 1 << 28
LIM = 70
MOD = int(1e9) + 9
MAX = 2000000

# Directions
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]


def main():
    # Input reading
    n, m = map(int, input().split())
    blockers = []
    for i in range(m):
        x, y = map(int, input().split())
        blockers.append((x - 1, y - 1))
    solve(n, m, blockers)


def solve_naive(n, m, blockers):
    global LIM
    LIM = 1000
    paths = defaultdict(int)
    distances = defaultdict(int)
    start = (0, 0)
    bfs_limit(paths, distances, start, blockers, n)
    target = (n - 1, n - 1)
    if target in paths:
        print(paths[target])
    else:
        print(0)


def bfs_limit(paths, distances, start, blockers, n):
    global LIM, MOD
    wall = set(blockers)
    path = {start: 1}
    distances[start] = 0
    queue = deque([start])

    while queue:
        p = queue.popleft()
        if distances[p] == LIM:
            break
        for i in range(4):
            q = (p[0] + dx[i], p[1] + dy[i])
            if 0 <= q[0] < n and 0 <= q[1] < n and q not in wall:
                if q not in distances:
                    distances[q] = distances[p] + 1
                    queue.append(q)
                if distances[p] + 1 == distances[q]:
                    paths[q] = (paths[q] + paths[p]) % MOD


def solve(n, m, blockers):
    if n <= 200:
        solve_naive(n, m, blockers)
        return

    # Pre-calculate factorials and inverse factorials mod MOD
    global fact_mod, fact_inv_mod
    fact_mod = [1] * MAX
    fact_inv_mod = [1] * MAX
    for i in range(1, MAX):
        fact_mod[i] = fact_mod[i - 1] * i % MOD
        fact_inv_mod[i] = fact_inv_mod[i - 1] * pow_mod(i, MOD - 2, MOD) % MOD

    # Run BFS
    paths_s = defaultdict(int)
    distances_s = defaultdict(int)
    paths_g = defaultdict(int)
    distances_g = defaultdict(int)

    bfs_limit(paths_s, distances_s, (0, 0), blockers, n)
    bfs_limit(paths_g, distances_g, (n - 1, n - 1), blockers, n)

    MIN_DIST = min((distances_s[p] + distances_g[q] + abs(p[0] - q[0]) + abs(p[1] - q[1]) for p in distances_s for q in distances_g if distances_s[p] == distances_g[q] == LIM), default=INF)

    if MIN_DIST == INF:
        print(0)
        return

    set_s = {p for p in distances_s if distances_s[p] == LIM}
    set_g = {q for q in distances_g if distances_g[q] == LIM}

    s = set_s.copy()
    g = set_g.copy()

    blockers.sort()
    dp = [0] * m
    for p in s:
        for i, blocker in enumerate(blockers):
            dp[i] = (dp[i] + paths_s[p] * n_path(p, blocker, MOD) % MOD) % MOD

    for j in range(m):
        for i in range(j + 1, m):
            dp[i] = (dp[i] - dp[j] * n_path(blockers[j], blockers[i], MOD) % MOD + MOD) % MOD

    # Calculate answer
    ans = 0
    for p in g:
        sum_paths = 0
        for q in s:
            sum_paths = (sum_paths + paths_s[q] * n_path(q, p, MOD) % MOD * paths_g[p] % MOD) % MOD
        for i, blocker in enumerate(blockers):
            sum_paths = (sum_paths - dp[i] * n_path(blocker, p, MOD) % MOD * paths_g[p] % MOD + MOD) % MOD
        ans = (ans + sum_paths) % MOD

    print(ans)


def n_path(p, q, mod):
    dx = q[0] - p[0]
    dy = q[1] - p[1]
    return mod_comb(dx + dy, dx, mod)


def mod_comb(n, k, mod):
    if n < 0 or k < 0 or n < k:
        return 0
    return fact_mod[n] * fact_inv_mod[k] % mod * fact_inv_mod[n - k] % mod


def pow_mod(x, k, mod):
    if k == 0:
        return 1
    elif k % 2 == 0:
        return pow_mod(x * x % mod, k // 2, mod) % mod
    else:
        return x * pow_mod(x, k - 1, mod) % mod


if __name__ == '__main__':
    main()
```

Please note that since the Java code uses custom classes and methods that depend on Java's API, certain design elements were adjusted to fit Pythonic conventions. The data structures used are Python’s defaultdict and deque (for BFS), and certain methods needed reimplementation because of language differences (like `Collections.sort()` which is replaced with the list `sort` method). Importantly, the inner class `P` needed to be adapted to regular Python tuples, since Python does not have built-in support for the same sort of comparator-based sorting or object comparison as Java. Input/Output was also adapted for console-based testing.
