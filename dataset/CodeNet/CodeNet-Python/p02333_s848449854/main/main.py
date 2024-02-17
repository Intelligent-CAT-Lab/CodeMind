import bisect, collections, copy, heapq, itertools, math, string, sys
input = lambda: sys.stdin.readline().rstrip() 
sys.setrecursionlimit(10**7)
INF = float('inf')
MOD = 10**9 + 7
def I(): return int(eval(input()))
def F(): return float(eval(input()))
def SS(): return eval(input())
def LI(): return [int(x) for x in input().split()]
def LI_(): return [int(x)-1 for x in input().split()]
def LF(): return [float(x) for x in input().split()]
def LSS(): return input().split()

def combMod(n, r, p):
    numer = 1
    denom = 1
    for i in range(1, r+1):
        numer = numer * (n-r+i) % p
        denom = denom * i % p
    return numer * pow(denom, p-2, p) % p

def resolve():
    n, k = LI()

    if n >= k:
        ans = 0
        for i in range(k):
            ans += (-1) ** i * combMod(k, k - i, MOD) * pow(k - i, n, MOD)
            ans %= MOD
    else:
        ans = 0

    print(ans)

if __name__ == '__main__':
    resolve()

