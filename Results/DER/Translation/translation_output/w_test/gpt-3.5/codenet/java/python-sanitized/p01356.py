import sys
from itertools import product

def main():
    n, m, a, b, p, q = map(int, sys.stdin.readline().split())
    INF = 1000000000000

    if a == 1 and b == 1:
        ans = INF
        div = m // (p + q)
        div = min(div, n)
        ans = min(ans, abs(div * (p + q) - m))
        div = min(div + 1, n)
        ans = min(ans, abs(div * (p + q) - m))
        print(ans)
        return

    lim = 0
    while p * (a ** lim) + q * (b ** lim) <= m:
        lim += 1
    lim += 1
    lim = min(lim, n)
    lim = min(lim, 40)

    powA = [a**i for i in range(42)]
    powB = [b**i for i in range(42)]
    pending1 = []
    pending2 = []

    for t in range(2):
        max_lim = lim // 2 if t == 0 else (lim + 1) // 2
        for i in range(1 << max_lim):
            s = sum(p * powA[j + (lim // 2) * (t == 1) ] + q * powB[j + (lim // 2) * (t == 1)] for j in range(max_lim) if (i & (1 << j)) > 0)
            if s <= INF:
                if t == 0:
                    pending