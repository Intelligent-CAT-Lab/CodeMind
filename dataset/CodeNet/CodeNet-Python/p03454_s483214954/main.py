import sys
input = sys.stdin.readline

from fractions import gcd
import numpy as np

MOD = 10 ** 9 + 7

S = int(input())

M = 10**4

def type_1(S):
    cnt = 0
    # S 2種の桁数k,k+1からなる。さらにk>=9を仮定する。
    # 項数nとすると、kn < S < (k+1)n となる(k,n)の個数を数える
    # まずk > Mとなるものを数える。このとき1<=n<=Mである。
    n = np.arange(1,M+1)
    k_max = (S-1)//n
    k_min = np.maximum(M+1,S//n)
    cnt += np.maximum(0,k_max - k_min + 1).sum()
    # 次に、9<=k<=Mとなるものを数える
    k = np.arange(9,M+1)
    n_max = (S-1)//k
    n_min = S//(k+1) + 1
    cnt += np.maximum(0,n_max-n_min+1).sum()
    return cnt

type_1(S)

def type_2(S):
    # S 1種の桁数からなる。
    cnt = 0
    div = np.arange(1,M+1,dtype=np.int64)
    div = set(div[S%div==0])
    div |= set(S//x for x in div)
    for d in div:
        n = S//d
        # d桁のものをn個使うようにしたい
        if d < 10:
            total = 9 * 10 ** (d-1)
            cnt += max(0,total-n+1)
        else:
            total = 9 * pow(10,int(d)-1,MOD)
            cnt += total-n+1
    return cnt % MOD

def type_3(S):
    cnt = 0
    # S 2種以上の桁数からなる。9桁の数以下しか使わない。
    # ここは適当にいけそう
    for R in range(1,10):
        for L in range(1,R):
            mid = sum(i*9*10**(i-1) for i in range(L+1,R)) # 途中の桁数の寄与
            rest = S - (L+mid+R)
            if rest < 0:
                continue
            # Lが1+x個、Rが1+y個として
            # Lx + Ry = rest, 0<=x<=x_max, 0<=y<=y_max
            x_max = 9*10**(L-1)-1
            y_max = 9*10**(R-1)-1
            g = gcd(L,R)
            if rest % g != 0:
                continue
            L0 = L//g
            R0 = R//g
            rest //= g
            # x mod R0が一意に決まる
            for x0 in range(R0):
                if (L0*x0-rest)%R0 == 0:
                    break
            y0 = (rest-L0*x0)//R0
            # (x0 + tR, y0-tL)として解がパラメータ表示できる
            # 0 <= x0 + tR <= x_max
            t_min = 0
            t_max = (x_max-x0)//R0
            # y0-tL >= 0
            t_max = min(t_max,y0//L0)
            # y0-tL <= y_max iff y0-y_max <= tL
            t_min = max(t_min,(y0-y_max+L-1)//L0)
            cnt += max(0, t_max - t_min + 1)
    return cnt

answer = (type_1(S) + type_2(S) + type_3(S)) % MOD
print(answer)