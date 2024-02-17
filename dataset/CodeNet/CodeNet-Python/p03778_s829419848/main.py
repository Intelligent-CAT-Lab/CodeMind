import sys
import heapq, math
from itertools import zip_longest, permutations, combinations, combinations_with_replacement
from itertools import accumulate, dropwhile, takewhile, groupby
from functools import lru_cache
from copy import deepcopy

W, A, B = map(int, input().split())

x = 0 if A <= B <= A + W or A <= B + W <= A + W or B <= A <= B + W or B <= A + W <= B + W else 1 << 28
y = abs(A - (B + W))
z = abs(B - (A + W))
print(min(x, y, z))