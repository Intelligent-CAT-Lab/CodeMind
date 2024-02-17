#!/usr/bin/env python3
#ABC83 D

import sys
import math
from bisect import bisect_right as br
from bisect import bisect_left as bl
sys.setrecursionlimit(1000000000)
from heapq import heappush, heappop,heappushpop
from collections import defaultdict
from itertools import accumulate
from collections import Counter
from collections import deque
from operator import itemgetter
from itertools import permutations
mod = 10**9 + 7
inf = float('inf')
def I(): return int(sys.stdin.readline())
def LI(): return list(map(int,sys.stdin.readline().split()))

s = eval(input())
n = len(s)
res = inf
for i in range(n-1):
    if s[i] != s[i+1]:
        res = min(res,max(n-i-1,i+1))
if res == inf:
    print(n)
else:
    print(res)