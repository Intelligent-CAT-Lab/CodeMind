Here is the Python version of the provided Java code:

```python
import sys
import math

class P:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __lt__(self, other):
        if self.y != other.y:
            return self.y < other.y
        else:
            return self.x < other.x

    def __eq__(self, other):
        return self.x == other.x and self.y == other.y

    def __hash__(self):
        return self.x | (self.y << 16)

    def __str__(self):
        return "({},{})".format(self.x, self.y)

def main():
    n, m = map(int, sys.stdin.readline().split())
    xs, ys = [], []
    for _ in range(m):
        x, y = map(int, sys.stdin.readline().split())
        xs.append(x - 1)
        ys.append(y - 1)

    solve(n, m, xs, ys)

def solve(n, m, xs, ys):
    INF = 1 << 28
    LIM = 70

    dx = [0, 0, -1, 1]
    dy = [-1, 1, 0, 0]

    mod = 10**9 + 9

    def bfs_lim(paths, ds, p0):
        wall = set()
        for i in range(m):
            wall.add(P(xs[i], ys[i]))

        paths[p0] = 1
        ds[p0] = 0

        que = []
        que.append(p0)

        while que:
            p = que.pop(0)
            if ds[p] == LIM:
                break

            for i in range(4):
                q = P(p.x + dx[i], p.y + dy[i])
                if 0 <= q.x < n and 0 <= q.y < n and q
