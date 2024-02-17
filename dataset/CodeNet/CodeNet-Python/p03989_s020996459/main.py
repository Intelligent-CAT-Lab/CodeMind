from collections import defaultdict, deque, Counter
from heapq import heappush, heappop, heapify
import math
import bisect
import random
from itertools import permutations, accumulate, combinations, product
import sys
import string
from bisect import bisect_left, bisect_right
from math import factorial, ceil, floor
from operator import mul
from functools import reduce


sys.setrecursionlimit(2147483647)
INF = 10 ** 13
def LI(): return list(map(int, sys.stdin.readline().split()))
def I(): return int(sys.stdin.readline())
def LS(): return sys.stdin.readline().rstrip().split()
def S(): return sys.stdin.readline().rstrip()
def IR(n): return [I() for i in range(n)]
def LIR(n): return [LI() for i in range(n)]
def SR(n): return [S() for i in range(n)]
def LSR(n): return [LS() for i in range(n)]
def SRL(n): return [list(S()) for i in range(n)]
def MSRL(n): return [[int(j) for j in list(S())] for i in range(n)]

mod=924844033

n,k=LI()
fac = [1] * (n + 1)
for j in range(1, n + 1):
    fac[j] = fac[j-1] * j % mod

dp=[[0]*2 for _ in range(n+1)]
dp[0][0]=1
last=0
for i in range(min(n,2*k)):
    idx=i
    while idx<n:
        ndp = [[0] * 2 for _ in range(n+1)]
        if idx==i:
            for ll in range(n+1):
                dp[ll][0]+=dp[ll][1]
                dp[ll][1]=0
        for l in range(1,n+1):
            ndp[l][0]=sum(dp[l])
            if idx-k>=0:
                ndp[l][0]+=dp[l-1][0]
            if idx+k<n:
                ndp[l][1]=sum(dp[l-1])
            ndp[l][0]%=mod
        ndp[0][0]=1
        dp=ndp
        idx+=2*k

ans=fac[n]
for m in range(1,n+1):
    if m%2:
        ans-=sum(dp[m])*fac[n-m]%mod
    else:
        ans+=sum(dp[m])*fac[n-m]%mod
    ans%=mod

print(ans)










