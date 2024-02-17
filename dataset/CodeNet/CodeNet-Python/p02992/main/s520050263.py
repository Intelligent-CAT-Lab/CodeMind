#!/usr/bin/env python3
import sys
from math import *
from itertools import *
from collections import *
from functools import *
from operator import *
try:
    from math import gcd
except Exception:
    from fractions import gcd

MOD = 1000000007  # type: int

def solve(N: int, K: int):
    ns = []
    for i in range(1, N + 1):
        if N < i * i:
            break
        ns.append(i)
        ns.append(N // i)
    ns = sorted(list(set(ns)))

    m = {n: i for i, n in enumerate(ns)}
    l = [1] * len(ns)
    for i, (s, b) in enumerate(zip(ns, ns[1:])):
        l[i] = (N // s) - (N // b)

    dp = [[0] * len(ns) for _ in range(K+1)]
    dp[0][m[N]] = 1

    for i in range(K):
        for j in range(len(ns) - 2, -1, -1):
            dp[i][j] += dp[i][j + 1]
        for j, nn in enumerate(ns):
            nj = m[N // nn]
            dp[i+1][j] = (dp[i+1][j] + dp[i][nj] * l[j]) % MOD

    return sum(dp[-1]) % MOD


def main():
    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    tokens = iterate_tokens()
    N = int(next(tokens))  # type: int
    K = int(next(tokens))  # type: int
    result = solve(N, K)
    print(result)

if __name__ == '__main__':
    main()