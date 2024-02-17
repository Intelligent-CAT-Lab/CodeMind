#!/usr/bin/env python
from collections import deque
import itertools as it
import sys
import math
sys.setrecursionlimit(1000000)
N = "2"
primes = [False, False] + [True] * 100000
prime_ls = []
for i in range(100000):
    if primes[i]:
        prime_ls.append(i)
        for j in range(i * 2, 100000, i):
            primes[j] = False
primes = prime_ls[:1006]
ans = [[1] * 502 for i in range(502)]
for i in range(502):
    for j in range(502):
        if (i + j) % 2 == 0:
            pos1 = (i + j) / 2
            pos2 = 753 + (i - j) / 2
            ans[i][j] *= primes[pos1]
            ans[i][j] *= primes[pos2]
for i in range(1, 501):
    for j in range(1, 501):
        if (i + j) % 2 == 1:
            ans[i][j] *= ans[i - 1][j]
            ans[i][j] *= ans[i + 1][j]
            ans[i][j] *= ans[i][j - 1]
            ans[i][j] *= ans[i][j + 1]
            ans[i][j] = int(math.sqrt(ans[i][j])) + 1
for i in range(1, N + 1):
    print " ".join(map(str, ans[i][1:N+1]))
