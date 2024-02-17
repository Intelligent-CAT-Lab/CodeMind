from heapq import heappush, heappop
from collections import deque,defaultdict,Counter
import itertools
from itertools import permutations,combinations
import sys
import bisect
import string
#import math
#import time
#import random
def I():
    return int(input())
def MI():
    return map(int,input().split())
def LI():
    return [int(i) for i in input().split()]
def LI_():
    return [int(i)-1 for i in input().split()]
def StoI():
    return [ord(i)-97 for i in input()]
def show(*inp,end='\n'):
    if show_flg:
        print(*inp,end=end)
YN=['Yes','No']
mo=10**9+7
#ts=time.time()
#sys.setrecursionlimit(10**6)
input=sys.stdin.readline
show_flg=False
#show_flg=True

n,X,Y,Z=MI()
t=1<<(X+Y+Z)
haiku=( (1<<(X+Y+Z)) + (1<<(Y+Z)) + (1<<Z) )>>1
dp=[0]*t
dp[0]=1


for i in range(n):
    tm=[i for i in dp]
    dp=[0]*t
    for k in range(t):
        for d in range(10):
            m=((k<<(d+1))+(1<<d))
            if m&haiku == haiku:
                continue
            else:
                dp[int(m)%t]+=tm[k]
                dp[int(m)%t]%=mo
sub=0
for i in range(t):
    sub+=dp[i]
ans=pow(10,n,mo)-sub
print(ans%mo)

show(ans,sub)
show(dp)
show(n,t,n*t*10)
