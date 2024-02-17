#!usr/bin/env python3
from collections import defaultdict
from collections import deque
from heapq import heappush, heappop
import sys
import math
import bisect
import random
def LI(): return list(map(int, sys.stdin.readline().split()))
def I(): return int(sys.stdin.readline())
def LS():return list(map(list, sys.stdin.readline().split()))
def S(): return list(sys.stdin.readline())[:-1]
def IR(n):
    l = [None for i in range(n)]
    for i in range(n):l[i] = I()
    return l
def LIR(n):
    l = [None for i in range(n)]
    for i in range(n):l[i] = LI()
    return l
def SR(n):
    l = [None for i in range(n)]
    for i in range(n):l[i] = S()
    return l
def LSR(n):
    l = [None for i in range(n)]
    for i in range(n):l[i] = LS()
    return l
sys.setrecursionlimit(1000000)
mod = 1000000007

#A
def A():
    while 1:
        n,m = LI()
        if n == 0 and m == 0:
            break
        v = [[] for i in range(n)]
        for i in range(m):
            a,b = LI()
            a -= 1
            b -= 1
            v[a].append(b)
            v[b].append(a)
        bfs_map = [1 for i in range(n)]
        bfs_map[0] = 0
        f = [0 for i in range(n)]
        q = deque()
        q.append(0)
        fl = 1
        while q:
            if not fl:break
            x = q.popleft()
            for y in v[x]:
                if bfs_map[y]:
                    bfs_map[y] = 0
                    f[y] = (1-f[x])
                    q.append(y)
                else:
                    if f[y] == f[x]:
                        print(0)
                        fl = 0
                        break
        if fl:
            ans = []
            k = sum(f)
            if k%2 == 0:
                ans.append(k//2)
            k = len(f)-sum(f)
            if k%2 == 0:
                ans.append(k//2)
            ans = list(set(ans))
            ans.sort()
            print(len(ans))
            for i in ans:
                print(i)
    return

#B
def B():
    def gcd(a,b):
        if a == 0:
            return b
        return gcd(b%a, a)

    def factorize(n):
        if n < 4:
            return {n:1}
        i = 2
        d = defaultdict(int)
        m = n
        while i**2 <= n:
            if m%i == 0:
                while m%i == 0:
                    m//=i
                    d[i] += 1
            i += 1
        d[m] += 1
        return d
    p,q = LI()
    g = gcd(p,q)
    ans = q//g
    if ans == 1:
        print(1)
    else:
        d = factorize(ans)
        ans = 1
        for i in d.keys():
            ans *= i
        print(ans)
    return

#C
def C():
    return

#D
def D():
    return

#E
def E():
    return

#F
def F():
    return

#G
def G():
    return

#H
def H():
    return

#I
def I_():
    return

#J
def J():
    return

#Solve
if __name__ == "__main__":
    B()

