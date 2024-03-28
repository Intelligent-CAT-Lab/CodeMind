import sys
import math
from collections import defaultdict, Counter
from itertools import permutations
from functools import reduce, lru_cache

# Custom input/output for Python
class Scanner:
    def __init__(self, stream=sys.stdin):
        self.stream = stream
        self.buffer = []

    def next_int(self):
        while not self.buffer:
            self.buffer = self.stream.readline().strip().split()
        return int(self.buffer.pop(0))

    def next_long(self):
        while not self.buffer:
            self.buffer = self.stream.readline().strip().split()
        return int(self.buffer.pop(0))  # Using int since Python does not have a separate long type


sc = Scanner()
out = sys.stdout


def solve():
    n = sc.next_int()
    m = sc.next_int()
    if n % 2 == 1:
        f = 1
        t = n
        for i in range(m):
            print(f, t)
            f += 1
            t -= 1
    else:
        f = 1
        t = n
        for i in range((m + 1) // 2):
            print(f, t)
            f += 1
            t -= 1
        t -= 1
        for i in range((m+1) // 2, m):
            print(f, t)
            f += 1
            t -= 1


# Run the solution function
solve()