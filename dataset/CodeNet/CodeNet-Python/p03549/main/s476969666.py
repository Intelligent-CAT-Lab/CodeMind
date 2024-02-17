def getN():
    return int(eval(input()))
def getNM():
    return list(map(int, input().split()))
def getList():
    return list(map(int, input().split()))
def getArray(intn):
    return [int(eval(input())) for i in range(intn)]
def input():
    return sys.stdin.readline().rstrip()

from collections import defaultdict, deque, Counter
from sys import exit
import heapq
import math
import fractions
import copy
from itertools import permutations
from operator import mul
from functools import reduce
from bisect import bisect_left, bisect_right

import sys
sys.setrecursionlimit(1000000000)
mod = 10 ** 9 + 7

from itertools import permutations
from math import factorial, hypot

N, M = getNM()
total = 1900 * M + 100 * (N - M)
print((total * (2 ** M)))