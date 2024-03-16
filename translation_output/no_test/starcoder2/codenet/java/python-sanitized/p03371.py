import sys

a, b, c, x, y = map(int, sys.stdin.readline().split())

if a + b < 2 * c:
    print(x * a + y * b)
else:
    min_ = min(x, y)
    max_ = max(x, y)
    res = 0
    res += 2 * c * min_
    if max_ == x:
        res += min(a, 2 * c) * (max_ - min_)
    else:
        res += min(b, 2 * c) * (max_ - min_)
    print(res)