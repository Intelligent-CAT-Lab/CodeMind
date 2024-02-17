import sys

sys.setrecursionlimit(10 ** 8)
ini = lambda: int(sys.stdin.readline())
inm = lambda: map(int, sys.stdin.readline().split())
inl = lambda: list(inm())
ins = lambda: sys.stdin.readline().rstrip()
debug = lambda *a, **kw: print("\033[33m", *a, "\033[0m", **dict(file=sys.stderr, **kw))


n, x = inm()


def solve():
    if x == 1 or x == 2 * n - 1:
        print("No")
        return
    a = [None] * (2 * n - 1)

    m = (2 * n - 1) // 2
    a[m] = x
    a[m - 1] = x - 1
    a[m + 1] = x + 1
    y = 1
    for i in range(2 * n - 1):
        if i in [m - 1, m, m + 1]:
            continue
        if y in [x - 1, x, x + 1]:
            y = x + 2
        a[i] = y
        y += 1

    print("Yes")
    print(*a, sep="\n")


solve()
