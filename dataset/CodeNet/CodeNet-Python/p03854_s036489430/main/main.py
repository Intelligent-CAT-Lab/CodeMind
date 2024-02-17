def examC():
    St = S()
    t = ["dream", "dreamer", "erase", "eraser"]
    i = len(St)-1
    cur = ""
    while i>=0:
#        print(cur)
        cur = St[i] + cur
        i -=1
        if cur in t:
            cur = ""
    if len(cur)==0:
        ans = "YES"
    else:
        ans = "NO"
    print(ans)


import sys
def I(): return int(sys.stdin.readline())
def LI(): return list(map(int,sys.stdin.readline().split()))
def LS(): return sys.stdin.readline().split()
def S(): return sys.stdin.readline().strip()
mod = 10**9 + 7
inf = float('inf')

examC()
