from collections import defaultdict, deque, Counter
from heapq import heappush, heappop, heapify
import math
from bisect import bisect_left, bisect_right
import random
from itertools import permutations, accumulate, combinations
import sys
import string



INF = float('inf')
def LI(): return list(map(int, sys.stdin.readline().split()))
def I(): return int(sys.stdin.readline())
def LS(): return sys.stdin.readline().split()
def S(): return sys.stdin.readline().strip()
def IR(n): return [I() for i in range(n)]
def LIR(n): return [LI() for i in range(n)]
def SR(n): return [S() for i in range(n)]
def LSR(n): return [LS() for i in range(n)]
def SRL(n): return [list(S()) for i in range(n)]
def MSRL(n): return [[int(j) for j in list(S())] for i in range(n)]
mod = 10 ** 9 + 7


n, k = LI()
dp = [[[0]*(k+2*(n+1)) for _ in range(n+1)] for _ in range(n+1)]
dp[0][0][0] = 1
for i in range(n):
    for j in range(i+1):
        for l in range(k+1):
            dp[i+1][j+1][l+2*(j+1)] += dp[i][j][l]
            dp[i+1][j+1][l+2*(j+1)]%=mod
            dp[i+1][j][l+2*j] += dp[i][j][l]*(j*2+1)
            dp[i+1][j][l+2 * j] %= mod
            if j!= 0:
                dp[i+1][j-1][l+(j-1)*2] += dp[i][j][l]*j*j
                dp[i+1][j-1][l+(j-1)*2]%=mod



print(dp[n][0][k]%mod)

