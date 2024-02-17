import sys, re
from collections import deque, defaultdict, Counter
from math import ceil, sqrt, hypot, factorial, pi, sin, cos, radians
from itertools import accumulate, permutations, combinations, product
from operator import itemgetter, mul
from copy import deepcopy
from string import ascii_lowercase, ascii_uppercase, digits
from bisect import bisect

def input(): return sys.stdin.readline().strip()
def INT(): return int(input())
def MAP(): return map(int, input().split())
def LIST(): return list(map(int, input().split()))
sys.setrecursionlimit(10 ** 9)
INF = float('inf')
MOD = 10 ** 9 + 7

H, W = MAP()

ans = INF

for h in range(1, H+1):
	S1 = h*W
	S2 = (H-h)*(W//2)
	S3 = H*W-S1-S2
	ans = min(ans, max(S1, S2, S3)-min(S1, S2, S3))

	S2 = (H-h)//2*W
	S3 = H*W-S1-S2
	ans = min(ans, max(S1, S2, S3)-min(S1, S2, S3))

H, W = W, H

for h in range(1, H+1):
	S1 = h*W
	S2 = (H-h)*(W//2)
	S3 = H*W-S1-S2
	ans = min(ans, max(S1, S2, S3)-min(S1, S2, S3))

	S2 = (H-h)//2*W
	S3 = H*W-S1-S2
	ans = min(ans, max(S1, S2, S3)-min(S1, S2, S3))

print(ans)
