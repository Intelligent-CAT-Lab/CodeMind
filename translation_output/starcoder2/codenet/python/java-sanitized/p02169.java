/atcoder/abc/abc150/abc150_d.py
import sys
sys.setrecursionlimit(10000000)
from collections import defaultdict, deque
from heapq import heappush, heappop
from bisect import bisect_left
import math
import random
from itertools import combinations, permutations
mod = 10**9+7

def LI(): return list(map(int, sys.stdin.readline().split()))
def I(): return int(sys.stdin.readline())
def LS(): return list(map(list, sys.stdin.readline().split()))
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

def solve():
    n,m = LI()
    a = LI()
    a = [i//2 for i in a]
    if a[0]%2 == 0:
        print(0)
        return
    for i in range(1,n):
        if a[i]%a[0] != 0:
            print(0)
            return
    ans = m//(2*a[0])
    for i in range(1,n):
        ans //= a[i]
        ans *= a[0]
        ans %= mod
    print(ans)
    return

if __name__ == "__main__":
    solve()

# 解説を見た
# 2で割れる数の個数が偶数個ならば、2で割れる数の個数が奇数個ならば、
# 2で割れる数の個数が奇数個ならば、2で割れる数の個数が偶数個ならば、
# 2で割れる数の個数が偶数個ならば、2で割れる数の個数が奇数個ならば、
# 2で割れる数の個数が奇数個ならば、2で割れる数の個数が偶数個ならば、
# 2で割れる数の個数が偶数個ならば、2で割れる数の個数が奇数個ならば、
# 2で割れる数の個数が奇数個ならば、2で割れる数の個数が偶数個ならば、
# 2で割れる数の個数が偶数個ならば、2で割れる数の個数が奇数個ならば、
# 2で割れる数の個数が奇数個ならば、2で割れる数の個数が偶数個ならば、
# 2で割れる数の個数が偶数個ならば、2で割れる数の個数が奇数個ならば、
# 2で割れる数の個数が奇数個ならば、2で割れる数の個数が偶数個ならば、
# 2で割れる数の個数が偶数個ならば、2で割れる数の個数が奇数個ならば、
# 2で割れる数の個数が奇数個ならば、2で割れる数の個数が偶数個ならば、
# 2で割れる数の個数が偶数個ならば、2で割れる数の個数が奇数個ならば、
# 2で割れる数の個数が奇数個ならば、2で割れる数の個数が偶数個ならば、
# 2で割れる数の個数が偶数個ならば、2で割れる数の個数が奇数個ならば、
# 2で割れる数の個数が奇数個ならば、2で割れる数の個数が偶数個ならば、
# 2で割れる数の個数が偶数個ならば、2で割れる数の個数が奇数個ならば、
# 2で割れる数の個数が奇数個ならば、2で割れる数の個数が偶数個ならば、
# 2で割れる数の個数が偶数個ならば、2で割れる数の個数が奇数個ならば、
# 2で割れる数の個数が奇数個ならば、2で割れる数の個数が偶数個ならば、
# 2で割れる数の個数が偶数個ならば、2で割れる数の個数が奇数個ならば、
# 2で割れる数の個数が奇数個ならば、2で割れる数の個数が偶数個ならば、
# 2で割れる数の個数が偶数個ならば、2で割れる数の個数が奇数個ならば、
# 2で割れる数の個数が奇数個ならば、2で割れる数の個数が偶数個ならば、
# 2で割れる数の個数が偶数個ならば、2で割れる数の個数が奇数個ならば、
# 2で割れる数の個数が奇数個ならば、2で割れる数の個数が偶数個ならば、
# 2で割れる数の個数が偶数個ならば、2で割れる数の個数が奇数個ならば、
# 2で割れる数の個数が奇数個ならば、2で割れる数の個数が偶数個ならば、
# 2で割れる数の個数が偶数個ならば、2で割れる数の個数が奇数個ならば、
# 2で割れる数の個数が奇数個ならば、2で割れる数の個数が偶数個ならば