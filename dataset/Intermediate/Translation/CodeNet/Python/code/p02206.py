from itertools import *
from bisect import *
from math import *
from collections import *
from heapq import *
from random import *
import sys

sys.setrecursionlimit(10 ** 6)
int1 = lambda x: int(x) - 1
p2D = lambda x: print(*x, sep="\n")
def II(): return int(sys.stdin.readline())
def MI(): return map(int, sys.stdin.readline().split())
def MI1(): return map(int1, sys.stdin.readline().split())
def MF(): return map(float, sys.stdin.readline().split())
def LI(): return list(map(int, sys.stdin.readline().split()))
def LI1(): return list(map(int1, sys.stdin.readline().split()))
def LF(): return list(map(float, sys.stdin.readline().split()))
def LLI(rows_number): return [LI() for _ in range(rows_number)]
dij = [(1, 0), (0, 1), (-1, 0), (0, -1)]

def main():
    def ok(m):
        s=0
        cnt=0
        while m:
            s+=m
            cnt+=1
            if s>k:return False
            if cnt==n:break
            m>>=1
        return True

    n,k=MI()
    l=0
    r=k+1
    while l+1<r:
        m=(l+r)//2
        if ok(m):l=m
        else:r=m
    print(l)

main()

