import sys, re, os
from collections import deque, defaultdict, Counter
from math import ceil, sqrt, hypot, factorial, pi, sin, cos, radians
# from fractions import gcd
from itertools import permutations, combinations, product, accumulate
from operator import itemgetter, mul
from copy import deepcopy
from string import ascii_lowercase, ascii_uppercase, digits
from functools import reduce
from bisect import bisect_left, insort_left
from heapq import heapify, heappush, heappop
INPUT = lambda: "4 5".rstrip()
INT = lambda: int(INPUT())
MAP = lambda: map(int, INPUT().split())
S_MAP = lambda: map(str, INPUT().split())
LIST = lambda: list(map(int, INPUT().split()))
S_LIST = lambda: list(map(str, INPUT().split()))
sys.setrecursionlimit(10 ** 9)
INF = float('inf')
mod = 10 ** 9 + 7
def main():
    H, W = MAP()
    print(ceil(H*W/2) if H != 1 and W != 1 else 1)
if __name__ == '__main__':
    main()
