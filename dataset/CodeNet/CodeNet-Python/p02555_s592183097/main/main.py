import sys

sys.setrecursionlimit(1000000)

import bisect
import math
import collections
import heapq

cache = {}
M = 10**9 + 7
def solve(S):
    if S < 3:
        return 0
    if S < 6:
        return 1
    if S in cache:
        return cache[S]
    ans = 1
    for remaining in range(S - 3, 2, -1):
        ans += solve(remaining)
        ans %= M
    cache[S] = ans
    return ans


if __name__ == "__main__":
    S = int(eval(input()))
    print((solve(S)))
