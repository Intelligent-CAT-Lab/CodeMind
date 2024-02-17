#!/usr/bin/env python

import sys
import math
import itertools as it
from collections import deque

sys.setrecursionlimit(10000000)

MOD = 10 ** 9 + 7

n, k = list(map(int, input().split()))

print(k ** n % MOD)
