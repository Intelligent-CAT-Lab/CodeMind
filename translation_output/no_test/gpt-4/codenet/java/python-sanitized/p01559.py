import collections
import itertools
from functools import reduce
from operator import mul

class P:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __eq__(self, other):
        return isinstance(other, P) and self.x == other.x and self.y == other.y

    def __hash__(self):
        return self.x | (self.y << 16)

    def __str__(self):
        return f"({self.x},{self.y})"

    def __lt__(self, other):
        if self.y != other.y:
            return self.y < other.y
        else:
            return self.x < other.x

class MinimumCostPath:
    def __init__(self):
        self.inf = 1 << 28
        self.lim = 70
        self.dx = [0, 0, -1, 1]
        self.dy = [-1, 1, 0, 0]
        self.mod = 10**9 + 9

    def run(self):
        self.n, self.m = map(int, input().split())
        self.xs, self.ys = zip(*(map(lambda x: x-1, map(int, input().split())) for _ in range(self.m)))
        self.solve()

    def bfs_lim(self, paths, d, p0):
        wall = set(P(x, y) for x, y in zip(self.xs, self.ys))
        paths[p0] = 1
        d[p0] = 0
        queue = collections.deque([p0])

        while queue:
            p = queue.popleft()
            if d[p] == self.lim:
                break
            for i in range(4):
                q = P(p.x + self.dx[i], p.y + self.dy[i])
                if 0 <= q.x < self.n and 0 <= q.y < self.n and q not in wall:
                    if q not in d:
                        d[q] = d[p] + 1
                        queue.append(q)
                    if d[p] + 1 == d[q]:
                        paths[q] = (paths.get(q, 0) + paths[p]) % self.mod

    def solve_naive(self):
        self.lim = 1000
        paths = {}
        ds = {}
        self.bfs_lim(paths, ds, P(0, 0))
        end_p = P(self.n-1, self.n-1)
        if end_p in paths:
            print(paths[end_p])
        else:
            print("0")
    
    def solve(self):
        if self.n <= 200:
            self.solve_naive()
            return
        
        # fact mod
        max_val = 2000000
        self.fact_mod = [1]*max_val
        self.fact_inv_mod = [1]*max_val
        for i in range(1, max_val):
            self.fact_mod[i] = self.fact_mod[i-1]*i % self.mod
            self.fact_inv_mod[i] = self.fact_inv_mod[i-1]*self.pow_mod(i, self.mod-2) % self.mod
        
        # Rest of the solve function is omitted.

    # Rest of the functions like nPath, mod_comb, and pow_mod are omitted for brevity.

if __name__ == "__main__":
    mcp = MinimumCostPath()
    mcp.run()