Below is the Java code translated to Python:

```python
import math
import sys
from itertools import permutations
from collections import deque
from functools import lru_cache

MOD = 1_000_000_007

def get_d(x1, x2, y1, y2):
    return math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)

d4 = [(1, 0), (0, 1), (-1, 0), (0, -1)]
d8 = [(1, 0), (1, 1), (0, 1), (-1, 1), (-1, 0), (-1, -1), (0, -1), (1, -1)]

def solve(x, y):
    ans = "="
    if x < y:
        ans = "<"
    elif x > y:
        ans = ">"
    print(ans)

class UnionFind:
    def __init__(self, size):
        self.parents = [i for i in range(size)]
        self.counts = [1 for _ in range(size)]
        
    def find(self, a):
        if self.parents[a] == a:
            return a
        self.parents[a] = self.find(self.parents[a])
        return self.parents[a]
    
    def unite(self, a, b):
        a = self.find(a)
        b = self.find(b)
        if a == b:
            return
        if self.counts[a] < self.counts[b]:
            self.parents[a] = b
            self.counts[b] += self.counts[a]
        else:
            self.parents[b] = a
            self.counts[a] += self.counts[b]
            
    def differ(self, a, b):
        return self.find(a) != self.find(b)
    
    def count(self, a):
        return self.counts[self.find(a)]

class Combination:
    def __init__(self, n, mod=MOD):
        self.mod = mod
        self.fact = [0] * (n + 1)
        self.invfact = [0] * (n + 1)
        self.inv = [0] * (n + 1)
        
        self.inv[1] = 1
        for i in range(2, len(self.inv)):
            self.inv[i] = self.inv[mod % i] * (mod - mod // i) % mod
        
        self.fact[0] = 1
        self.invfact[0] = 1
        for i in range(1, len(self.inv)):
            self.fact[i] = i * self.fact[i - 1] % mod
            self.invfact[i] = self.inv[i] * self.invfact[i - 1] % mod
            
    def get(self, n, r):
        return self.fact[n] * self.invfact[n - r] % self.mod * self.invfact[r] % self.mod

def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def reverse(a):
    n = len(a)
    for i in range(n // 2):
        a[i], a[n - i - 1] = a[n - i - 1], a[i]

# Read input from the user
input_data = input().split()
x = input_data[0]
y = input_data[1]

# Call solve function with the input values
solve(x, y)
```

This Python script mimics the functionality of the Java code provided, including the `solve` method and various utility classes and functions such as `UnionFind`, `Combination`, `gcd`, and `reverse`. It also includes reading two characters from input and comparing them, as requested. Note that I've omitted the `FastScanner` class and the `Permutation` class, instead using native Python functionality to achieve similar outcomes.
