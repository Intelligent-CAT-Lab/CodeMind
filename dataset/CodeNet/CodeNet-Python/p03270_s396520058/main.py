from collections import defaultdict, deque, Counter
from heapq import heappush, heappop, heapify
import math
import bisect
import random
from itertools import permutations, accumulate, combinations, product
import sys
import string
from bisect import bisect_left, bisect_right
from math import factorial, ceil, floor, cos, radians, pi, sin
from operator import mul
from functools import reduce
from operator import mul


sys.setrecursionlimit(2147483647)
INF = 10 ** 13
def LI(): return list(map(int, sys.stdin.buffer.readline().split()))
def I(): return int(sys.stdin.buffer.readline())
def LS(): return sys.stdin.buffer.readline().rstrip().decode('utf-8').split()
def S(): return sys.stdin.buffer.readline().rstrip().decode('utf-8')
def IR(n): return [I() for i in range(n)]
def LIR(n): return [LI() for i in range(n)]
def SR(n): return [S() for i in range(n)]
def LSR(n): return [LS() for i in range(n)]
def SRL(n): return [list(S()) for i in range(n)]
def MSRL(n): return [[int(j) for j in list(S())] for i in range(n)]
mod = 998244353

n = 6000

fac = [1] * (n + 1)
inv = [1] * (n + 1)
for j in range(1, n + 1):
    fac[j] = fac[j-1] * j % mod


inv[n] = pow(fac[n], mod-2, mod)
for j in range(n-1, -1, -1):
    inv[j] = inv[j+1] * (j+1) % mod


def comb(n, r):
    if r > n or n < 0 or r < 0:
        return 0
    return fac[n] * inv[n - r] * inv[r] % mod

def h(n, r):
    return comb(n + r - 1, r - 1)

k, n = LI()
for i in range(2, 2 * k + 1):
    ret = 0
    m = min(i // 2, (k - (i + 1) // 2 + 1))
    if i % 2:
        for j in range(m + 1):
            ret += comb(m, j) * pow(2, j, mod) * h(n - j, k - m * 2 + j)
    else:
        for j in range(m + 1):
            if j:
                ret += comb(m - 1, j - 1) * pow(2, j - 1, mod) * h(n - j, k - m * 2 + j)
                ret += comb(m - 1, j) * pow(2, j, mod) * h(n - j, k - m * 2 + 1 + j)
            else:
                ret += comb(m, j) * pow(2, j, mod) * h(n - j, k - m * 2 + 1 + j)
    print(ret % mod)

