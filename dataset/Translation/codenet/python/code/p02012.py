#!usr/bin/env python3
from collections import defaultdict,deque
from heapq import heappush, heappop
import sys
import math
import bisect
import random
def LI(): return [int(x) for x in sys.stdin.readline().split()]
def I(): return int(sys.stdin.readline())
def LS():return [list(x) for x in sys.stdin.readline().split()]
def S(): return list(sys.stdin.readline())[:-1]
def IR(n):
    return [I() for i in range(n)]
def LIR(n):
    return [LI() for i in range(n)]
def SR(n):
    return [S() for i in range(n)]
def LSR(n):
    return [LS() for i in range(n)]

sys.setrecursionlimit(1000000)
mod = 1000000007

def solve():
    def sum(a,b):
        return ((b+a)*(b-a+1)) >> 1
    def fact(n):
        if n < 4:
            return [1,n]
        res = [1]
        i = 2
        while i**2 <= n:
            if n%i == 0:
                res.append(i)
                m = n//i
                if i != m:
                    res.append(m)
            i += 1
        res.append(n)
        return res
    s = I()
    if s == 1:
        print(1)
        return
    lis = fact(s)
    f = defaultdict(lambda : 0)
    p = defaultdict(lambda : 1)
    lis.sort()
    for k in lis:
        for a in range(1,k+1):
            b = k-a
            if a <= b:
                if p[(a,b)]:
                    f[sum(a,b)] += 1
                    p[(a,b)] = 0
                    
        for a in range(1,s+1):
            b = k+a-1
            if p[(a,b)]:
                s_ = sum(a,b)
                if s_ > s:
                    break
                f[s_] += 1
                p[(a,b)] = 0
    ans = 0
    for k in lis:
        ans += f[k]*f[s//k]
    print(ans)
    return

#Solve
if __name__ == "__main__":
    solve()

