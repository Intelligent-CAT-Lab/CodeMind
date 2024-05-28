import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools

sys.setrecursionlimit(10**7)
inf = 10**20
eps = 1.0 / 10**13
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
    s = S()
    l = len(s)
    fm = {}
    fm[''] = -1
    def f(s):
        if s in fm:
            return fm[s]
        l = len(s)
        r = -1
        if l > 5 and s[1] in '(?' and s[-1] in ')?':
            if s[0] in 'R?':
                for i in range(3,l-2):
                    if s[i] not in ',?':
                        continue
                    tl = f(s[2:i])
                    tr = f(s[i+1:-1])
                    if tl >= 0 and tr >= 0 and r < tr:
                        r = tr
            if s[0] in 'L?':
                for i in range(3,l-2):
                    if s[i] not in ',?':
                        continue
                    tl = f(s[2:i])
                    tr = f(s[i+1:-1])
                    if tl >= 0 and tr >= 0 and r < tl:
                        r = tl
        ff = True
        if s[0] == '0' and l > 1:
            ff = False
        for tc in 'RL,()':
            if tc in s:
                ff = False
                break
        if ff:
            r = int(s.replace('?', '9'))
        fm[s] = r
        return r

    r = f(s)
    if r < 0:
        return 'invalid'

    return r


print(main())

