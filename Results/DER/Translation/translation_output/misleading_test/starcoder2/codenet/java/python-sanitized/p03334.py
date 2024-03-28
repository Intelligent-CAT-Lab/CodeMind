import sys

def solve():
    n, d1, d2 = map(int, sys.stdin.readline().split())
    d1s = 0
    d2s = 0
    while (d1 & 3) == 0:
        d1s += 1
        d1 >>= 2
    while (d2 & 3) == 0:
        d2s += 1
        d2 >>= 2
    need = n * n
    for i in range(2 * n):
        for j in range(2 * n):
            if (d1 & 3) == 1 and (((i >> d1s) ^ (j >> d1s)) & 1) != 0:
                continue
            if (d1 & 3) == 2 and ((i >> d1s) & 1) != 0:
                continue
            if (d2 & 3) == 1 and (((i >> d2s) ^ (j >> d2s)) & 1) != 0:
                continue
            if (d2 & 3) == 2 and ((i >> d2s) & 1) != 0:
                continue
            print(i, j)
            need -= 1
            if need == 0:
                return
    raise AssertionError()

solve()