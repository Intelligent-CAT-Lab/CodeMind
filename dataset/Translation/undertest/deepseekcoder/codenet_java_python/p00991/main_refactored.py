class main:
    import sys
    from math import *
    from functools import reduce
    
    def solve(r, c, a1, a2, b1, b2):
        x = abs(a1 - b1)
        y = abs(a2 - b2)
        x = min(x, r - x)
        y = min(y, c - y)
        z = 1
        C = min(x, y)
        if x == r - x:
            z *= 2
        if y == c - y:
            z *= 2
        b = reduce(lambda a, b: a * b, range(x + y - C + 1, x + y + 1)) // reduce(lambda a, b: a * b, range(1, C + 1))
        return b * z % 100000007
    
    r, c, a1, a2, b1, b2 = map(int, sys.stdin.readline().split())
    print(solve(r, c, a1, a2, b1, b2))