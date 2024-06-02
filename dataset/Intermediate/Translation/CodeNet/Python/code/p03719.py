import sys
import math
import collections
import itertools
import array
import inspect

# Set max recursion limit
sys.setrecursionlimit(1000000)


# Debug output
def chkprint(*args):
    names = {
        id(v): k
        for k, v in inspect.currentframe().f_back.f_locals.items()
    }
    print(', '.join(
        names.get(id(arg), '???') + ' = ' + repr(arg) for arg in args))


# Binary converter
def to_bin(x):
    return bin(x)[2:]


def li_input():
    return [int(_) for _ in input().split()]


def gcd(n, m):
    if n % m == 0:
        return m
    else:
        return gcd(m, n % m)


def gcd_list(L):
    v = L[0]

    for i in range(1, len(L)):
        v = gcd(v, L[i])

    return v


def lcm(n, m):
    return (n * m) // gcd(n, m)


def lcm_list(L):
    v = L[0]

    for i in range(1, len(L)):
        v = lcm(v, L[i])

    return v


# Width First Search (+ Distance)
def wfs_d(D, N, K):
    """
    D: 隣接行列(距離付き)
    N: ノード数
    K: 始点ノード
    """

    dfk = [-1] * (N + 1)
    dfk[K] = 0

    cps = [(K, 0)]
    r = [False] * (N + 1)
    r[K] = True
    while len(cps) != 0:
        n_cps = []
        for cp, cd in cps:
            for i, dfcp in enumerate(D[cp]):
                if dfcp != -1 and not r[i]:
                    dfk[i] = cd + dfcp
                    n_cps.append((i, cd + dfcp))
                    r[i] = True

        cps = n_cps[:]

    return dfk


# Depth First Search (+Distance)
def dfs_d(v, pre, dist):
    """
    v:  現在のノード
    pre: １つ前のノード
    dist: 現在の距離

    以下は別途用意する
    D: 隣接リスト(行列ではない)
    D_dfs_d: dfs_d関数で用いる，始点ノードから見た距離リスト
    """

    global D
    global D_dfs_d

    D_dfs_d[v] = dist

    for next_v, d in D[v]:
        if next_v != pre:
            dfs_d(next_v, v, dist + d)

    return


def sigma(N):
    ans = 0
    for i in range(1, N + 1):
        ans += i
    return ans


def comb(n, r):
    if n - r < r: r = n - r
    if r == 0: return 1
    if r == 1: return n

    numerator = [n - r + k + 1 for k in range(r)]
    denominator = [k + 1 for k in range(r)]

    for p in range(2, r + 1):
        pivot = denominator[p - 1]
        if pivot > 1:
            offset = (n - r) % p
            for k in range(p - 1, r, p):
                numerator[k - offset] /= pivot
                denominator[k] /= pivot

    result = 1
    for k in range(r):
        if numerator[k] > 1:
            result *= int(numerator[k])

    return result

def bisearch(L, target):
    low = 0
    high = len(L) - 1
    
    while low <= high:
        mid = (low + high) // 2
        guess = L[mid]
        if guess == target:
            return True
        elif guess < target:
            low = mid + 1
        elif guess > target:
            high = mid - 1
    if guess != target:
        return False

# --------------------------------------------

dp = None


def main():
    A, B, C = li_input()
    print("Yes") if B >= C >= A else print("No")


main()
