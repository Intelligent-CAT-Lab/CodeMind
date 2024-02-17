import sys
from math import log2, floor
L = int("4".rstrip())
def main():
    n = floor(log2(L)) + 1
    m = 2 * (n - 1)
    edges = []
    for i in range(1, n):
        edges.append((i, i+1, 0))
        edges.append((i, i+1, 2**(i-1)))
    cur = 2 ** (n - 1)
    q = L - cur
    for i in range(1, n):
        q, r = divmod(q, 2)
        if not r:
            continue
        else:
            edges.append((i, n, cur))
            cur += 2 ** (i - 1)
            m += 1
    yield (n, m)
    for e in edges:
        yield e
if __name__ == '__main__':
    ans = main()
    for i in ans:
        print(*i, sep=' ')