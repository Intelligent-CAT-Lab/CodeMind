import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools

sys.setrecursionlimit(10**7)
inf = 10**20
eps = 1.0 / 10**15
mod = 10**9+7

def LI(): return [int(x) for x in sys.stdin.readline().split()]
def LI_(): return [int(x)-1 for x in sys.stdin.readline().split()]
def LF(): return [float(x) for x in sys.stdin.readline().split()]
def LS(): return sys.stdin.readline().split()
def I(): return int(sys.stdin.readline())
def F(): return float(sys.stdin.readline())
def S(): return eval(input())

def main():
    x,y,z = LI()
    a = ['a' for _ in range(x)] + ['b' for _ in range(y)] + ['c' for _ in range(z)]
    while len(a) > 1:
        a.sort()
        a[0] += a[-1]
        a = a[:-1]

    return a[0]


print((main()))


