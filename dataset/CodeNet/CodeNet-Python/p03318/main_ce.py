#!/usr/bin/env python3
from collections import defaultdict
from collections import deque
from heapq import heappush, heappop
import sys
import math
import bisect
import random
import itertools
sys.setrecursionlimit(10**5)
stdin = sys.stdin
bisect_left = bisect.bisect_left
bisect_right = bisect.bisect_right
def LI(): return list(map(int, stdin.readline().split()))
def LF(): return list(map(float, stdin.readline().split()))
def LI_(): return list(map(lambda x: int(x)-1, stdin.readline().split()))
def II(): return int(stdin.readline())
def IF(): return float(stdin.readline())
def LS(): return list(map(list, stdin.readline().split()))
def S(): return list(stdin.readline().rstrip())
def IR(n): return [II() for _ in range(n)]
def LIR(n): return [LI() for _ in range(n)]
def FR(n): return [IF() for _ in range(n)]
def LFR(n): return [LI() for _ in range(n)]
def LIR_(n): return [LI_() for _ in range(n)]
def SR(n): return [S() for _ in range(n)]
def LSR(n): return [LS() for _ in range(n)]
mod = 1000000007
inf = float('INF')
#A
def A():
    s = S()
    a = s.count("-")
    b = s.count("+")
    print(b-a)
    return
#B
def B():
    n = S()
    num = sum(map(int, n))
    n = int("".join(n))
    print(["Yes", "No"][n % num > 0])
    return
#C
def C():
    n, k = LI()
    LI()
    print((n - k) // (k - 1) + 1 + bool((n - k) % (k - 1)))
    return
# D
# 解説AC
# 解説むずくね？これでわかる人いる？
# 順に理解していく
# 1) 桁数が上がるとx/S(x)が上昇するのは解説を見ればわかる
#
# 2) 下一桁が9であることを理解する
# xの下一桁が9でないとして
# x/S(x) - (x+1)/S(x+1) について S(x) =y として
# x/y - (x+1)/(y+1) = x/y - x/(y+1) - 1/(y+1)
#                   = x * (1/y - 1/(y+1)) - 1/(y+1)
#                   = x/y/(y+1) - 1/(y+1)
#                   = (x/y - 1)/(y+1) → (1)
# 今明らかにx/y >= 1なので (1) > 0 だから
# x/y > (x+1)/(y+1)
# よって下一桁は大きいほうがいいので9である
#
# 3)繰上りがない場合変化させる桁は
# できるだけ小さいほうがいいということを示す
# 元の数をxとしてi桁目とi+1桁目について変化させるとすると
# どう考えてもx/S(x)はS(x)は同等の上昇がみられる
# 対しi+1桁目のほうがxが上昇するためi桁目の
# ほうがよいことがわかる 
# 
# 4) 確定させた桁の数が変わらないことを示す
# つまり変化させられる桁(そこの桁をi桁目として10**(i-1)をxに足す
# と最小値がとりうると考えられる)がi桁目としてi-1桁目より小さな桁
# について変化させる意味がないことを示す 
# x/S(x) - (x+10^(i-1))/S(x+1) について上と同様にすれば
# = (x/y - 10**(i-1)) / y が言えるので 
# x/y が 10**(i-1) を上回っている場合
# その桁より小さい値を変化させてもx/S(x)が減少しないことがわかる
# x/S(x)がx以上の整数でx/S(x)を一番小さくできるのであるから、
# 一度上回った 10**(i-1) をx/S(x)が下回ることはあり得ない
# よって、変化させられる桁がi桁目としてi-1桁目より小さな桁
# について変化させる意味がないことがわかった
# 
# 4)このまま毎回x/yの値を計算してそれの桁数から足す10**(i-1)
# を計算してもよいが、変化させる桁目をi桁目としてi+1桁目を変化させた
# ほうがx/S(x)が小さくなるという状態は
# つまりx/yが10**(i-1)を上回ったという
# 意味になるためもっと計算量を落とした方法が本解法になる 
def D():
    K = II()
    ans = 1
    i = 0
    def Sunuke(a):
        return a / sum(map(int, str(a)))
    def Check(a, i):
        return Sunuke(a + 10 ** i) > Sunuke(ans + 10 ** (i + 1))
    while K:
        print(ans)
        K -= 1
        i += Check(ans, i)
        ans += 10 ** i
    return
#Solve
if __name__ == '__main__':
    D()