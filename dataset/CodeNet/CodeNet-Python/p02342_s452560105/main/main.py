import sys
# import re
import math
import collections
# import decimal
import bisect
import itertools
import fractions
# import functools
import copy
# import heapq
import decimal
# import statistics
import queue

# import numpy as np

sys.setrecursionlimit(10000001)
INF = 10 ** 16
MOD = 10 ** 9 + 7
# MOD = 998244353

ni = lambda: int(sys.stdin.readline())
ns = lambda: list(map(int, sys.stdin.readline().split()))
na = lambda: list(map(int, sys.stdin.readline().split()))


# ===CODE===
def prepare(n, MOD):
    # 1! - n! の計算
    f = 1
    factorials = [1]  # 0!の分
    for m in range(1, n + 1):
        f *= m
        f %= MOD
        factorials.append(f)
    # n!^-1 の計算
    inv = pow(f, MOD - 2, MOD)
    # n!^-1 - 1!^-1 の計算
    invs = [1] * (n + 1)
    invs[n] = inv
    for m in range(n, 1, -1):
        inv *= m
        inv %= MOD
        invs[m - 1] = inv

    return factorials, invs


def main():
    n, m = ns()

    if n < m:
        print((0))
        exit()
    else:
        n -= m
    # 分割数：N個の数をK個に分ける方法
    # 分けたものは区別できないので、3を[1,2],[2,1]のように分けるのは合わせて1カウント
    # dp[i][j] = dp[i][j-i] + dp[i-1][j] jをi個に分割する数
    # 蟻本P66

    dp = [[0 for _ in range(n + 1)] for __ in range(m + 1)]
    dp[0][0] = 1

    for i in range(1, m + 1):
        for j in range(n + 1):
            if j - i >= 0:
                dp[i][j] = dp[i - 1][j] + dp[i][j - i]
            else:
                dp[i][j] = dp[i - 1][j]
            dp[i][j] %= MOD
    print((dp[m][n]))


if __name__ == '__main__':
    main()

