import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools

sys.setrecursionlimit(10**7)
inf = 10**20
eps = 1.0 / 10**10
mod = 10**9+7
dd = [(-1,0),(0,1),(1,0),(0,-1)]
ddn = [(-1,0),(-1,1),(0,1),(1,1),(1,0),(1,-1),(0,-1),(-1,-1)]

def LI(): return [int(x) for x in sys.stdin.readline().split()]
def LI_(): return [int(x)-1 for x in sys.stdin.readline().split()]
def LF(): return [float(x) for x in sys.stdin.readline().split()]
def LS(): return sys.stdin.readline().split()
def I(): return int(sys.stdin.readline())
def F(): return float(sys.stdin.readline())
def S(): return input()
def pf(s): return print(s, flush=True)


def main():
    n = I()
    a = [0]
    for i in range(1, 50000):
        a.append(a[-1] + i)

    t = bisect.bisect_left(a, n)
    r = [1] * t + [0] * t
    for i in range(t):
        ai = a[t-i]
        ti = t + i
        # print(n,ai,ti,''.join(map(lambda x: '()'[x], r)))
        if n < ai:
            ts = min(t, ai-n)
            r[ti],r[ti-ts] = r[ti-ts],r[ti]
            n -= t - ts
        else:
            break

    return ''.join(map(lambda x: '()'[x], r))




print(main())

