#!/usr/bin/env python3
from collections import defaultdict, Counter
from itertools import product, groupby, count, permutations, combinations
from math import pi, sqrt
from collections import deque
from bisect import bisect, bisect_left, bisect_right
from string import ascii_lowercase
from functools import lru_cache
import sys
sys.setrecursionlimit(10000)
INF = float("inf")
YES, Yes, yes, NO, No, no = "YES", "Yes", "yes", "NO", "No", "no"
dy4, dx4 = [0, 1, 0, -1], [1, 0, -1, 0]
dy8, dx8 = [0, -1, 0, 1, 1, -1, -1, 1], [1, 0, -1, 0, 1, 1, -1, -1]
def inside(y, x, H, W):
    return 0 <= y < H and 0 <= x < W
def ceil(a, b):
    return (a + b - 1) // b
def sum_of_arithmetic_progression(s, d, n):
    return n * (2 * s + (n - 1) * d) // 2
def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)
def lcm(a, b):
    g = gcd(a, b)
    return a / g * b
def solve(N):
    if N == 1:
        print(Yes)
        print(2)
        print(1, 1)
        print(1, 1)
        return
    K = -1
    for k in range(1, N + 1):
        if (k * (k - 1)) // 2 == N:
            K = k
    if K == -1:
        print(No)
        return
    ans = [[] for _ in range(K)]
    num = 1
    for i in range(0, K):
        for j in range(i + 1, K):
            ans[i].append(num)
            ans[j].append(num)
            num += 1
    print(Yes)
    print(K)
    for v in ans:
        print(len(v), *v, sep=" ")
def main():
    N = int("3")
    solve(N)
if __name__ == '__main__':
    main()
