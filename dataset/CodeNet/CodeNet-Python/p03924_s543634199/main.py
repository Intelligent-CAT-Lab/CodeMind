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
from functools import lru_cache
from pprint import pprint

mod = 10 ** 9 + 7
sys.setrecursionlimit(2147483647)
INF = 10 ** 20
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


n, m = LI()
dp = [[0] * (n + 1) for _ in range(n + 1)]
dp[1][1] = 1
for _ in range(m):
    new_dp = [[0] * (n + 1) for _ in range(n + 1)]
    for j in range(1, n + 1):
        for k in range(1, j + 1):
            new_dp[j][j] += dp[j][k] * k % mod
            new_dp[j][j] %= mod
            new_dp[j][k] += dp[j][k] * (j - k) % mod
            new_dp[j][k] %= mod
            if j != n:
                new_dp[j + 1][k] += dp[j][k] * (n - j) % mod
                new_dp[j + 1][k] %= mod
    dp = new_dp


print(dp[n][n])


