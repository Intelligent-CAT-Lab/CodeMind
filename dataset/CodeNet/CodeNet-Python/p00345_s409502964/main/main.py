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
    e = LI()
    d = defaultdict(int)
    for i in e:
        d[i] += 1
    for i in list(d.values()):
        if i != 2:
            print("no")
            break
    else:
        print("yes")
    return

#B
def B():
    n = I()
    a = LI()
    a.sort()
    ans = -float("inf")
    for c in range(n):
        for d in range(c):
            m = a[c]-a[d]
            for i in range(n)[::-1]:
                if i != c and i != d:
                    e = i
                    break
            for i in range(e)[::-1]:
                if i != c and i != d:
                    b = i
                    break
            ans = max(ans, (a[e]+a[b])/m)
    print(ans)
    return

#C
def C():
    def gcd(a,b):
        if a == 0:
            return b
        return gcd(b%a, a)

    s = eval(input())
    n = len(s)
    if s.count("(") == 0:
        s = float(s)
        b = 10**(n-2)
        a = round(s*b)
        g = gcd(a,b)
        a //= g
        b //= g
    else:
        n = s.find("(")
        t = float(s[:n])
        b = 10**(n-2)
        a = round(t*b)
        g = gcd(a,b)
        a //= g
        b //= g
        l = (s.find("(")-s.find(".")-1)
        s = s[n+1:-1]
        m = len(s)
        c = round(float(s))
        d = (10**m-1)*10**l
        g = gcd(c,d)
        c //= g
        d //= g
        a = a*d+b*c
        b = b*d
        g = gcd(a,b)
        a //= g
        b //= g
    print((str(a)+"/"+str(b)))
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
    C()

