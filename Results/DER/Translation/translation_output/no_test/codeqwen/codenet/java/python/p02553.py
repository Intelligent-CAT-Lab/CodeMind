```python
import sys
import math
import collections
import heapq
import itertools
import bisect
import fractions
import copy
import decimal
import random
import string
import queue
import sys.stdin
sys.setrecursionlimit(10**6)

MOD = 10**9 + 7

def solve_abc178_b():
    a = int(input())
    b = int(input())
    c = int(input())
    d = int(input())

    ans = a * c
    ans = max(ans, a * d)
    ans = max(ans, b * c)
    ans = max(ans, b * d)

    print(ans)

solve_abc178_b()
```
