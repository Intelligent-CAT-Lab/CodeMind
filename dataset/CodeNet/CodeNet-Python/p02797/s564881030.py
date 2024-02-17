from functools import reduce
from fractions import gcd
import math
import bisect
import itertools
import sys
sys.setrecursionlimit(10**7)
input = sys.stdin.readline
INF = float("inf")


def main():
    N, K, S = map(int, input().split())
    
    A = [S]*N
    if S == 10**9:
        for i in range(N-K):
            A[i] = S - 1
    else:
        for i in range(N-K):
            A[i] = 10**9

    print(' '.join(map(str, A)))


if __name__ == '__main__':
    main()