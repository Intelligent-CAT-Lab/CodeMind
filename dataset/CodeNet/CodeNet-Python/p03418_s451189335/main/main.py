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
import copy
from bisect import bisect_left, bisect_right

import sys
sys.setrecursionlimit(1000000000)
mod = 10 ** 9 + 7

N, K = getNM()
sum = 0
for b in range(1, N + 1):
    opt1 = (N // b) * max(0, (b - K))
    if K == 0:
        opt2 = N % b
    else:
        opt2 = max(0, (N % b) - K + 1)
    sum += (opt1 + opt2)
print(sum)