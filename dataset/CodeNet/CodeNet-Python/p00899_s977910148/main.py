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

def _kosa(a1, a2, b1, b2):
    x1,y1,_ = a1
    x2,y2,_ = a2
    x3,y3,_ = b1
    x4,y4,_ = b2

    tc = (x1-x2)*(y3-y1)+(y1-y2)*(x1-x3)
    td = (x1-x2)*(y4-y1)+(y1-y2)*(x1-x4)
    return tc*td < 0

def kosa(a1, a2, b1, b2):
    return _kosa(a1,a2,b1,b2) and _kosa(b1,b2,a1,a2)


def distance(x1, y1, x2, y2):
    return math.sqrt((x1-x2)**2 + (y1-y2)**2)

def distance3(p1, p2, p3):
    x1,y1,_ = p1
    x2,y2,_ = p2
    x3,y3,_ = p3

    ax = x2 - x1
    ay = y2 - y1
    bx = x3 - x1
    by = y3 - y1

    r = (ax*bx + ay*by) / (ax*ax+ay*ay)
    if r <= 0:
        return distance(x1,y1, x3,y3)
    if r >= 1:
        return distance(x2,y2, x3,y3)
    return distance(x1 + r*ax, y1 + r*ay, x3,y3)

def main():
    rr = []

    def f(n):
        a = [S() for _ in range(n)]
        b = []
        for i in range(n):
            f = True
            for j in range(n):
                if i == j:
                    continue
                if a[i] in a[j]:
                    f = False
                    break
            if f:
                b.append(a[i])
        a = b
        n = len(b)
        d = [[0]*n for _ in range(n)]
        for i in range(n):
            ai = a[i]
            for j in range(n):
                if i == j:
                    continue
                aj = a[j]
                for k in range(1, min(len(ai), len(aj))):
                    if ai[-k:] == aj[:k]:
                        d[i][j] = k

        ii = [2**i for i in range(n)]
        q = collections.defaultdict(int)
        for i in range(n):
            q[(ii[i], i)] = 0
        for _ in range(n-1):
            nq = collections.defaultdict(int)
            for i in range(n):
                t = ii[i]
                for k,v in q.items():
                    if k[0] & t:
                        continue
                    key = (k[0] | t, i)
                    nv = v + d[k[1]][i]
                    if nq[key] < nv:
                        nq[key] = nv
            q = nq
        fr = max(q.values())
        return sum(map(len, a)) - fr


    while True:
        n = I()
        if n == 0:
            break
        rr.append(f(n))
        # print(n, rr[-1])

    return '\n'.join(map(str, rr))



print(main())

