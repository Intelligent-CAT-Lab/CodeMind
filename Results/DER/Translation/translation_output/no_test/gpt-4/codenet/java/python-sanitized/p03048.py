from math import gcd
from itertools import permutations

# Define Infinity

# Power function with modular arithmatic
def power(x, n, mod):
    if n == 0:
        return 1
    elif n % 2 == 0:
        e = power(x, n // 2, mod)
        return (e * e) % mod
    else:
        return (x * power(x, n - 1, mod)) % mod

# GCD function provided by `math.gcd` is sufficient

# Combination calculation with modular arithmatic
class COM:
    mod = 1000000007
    
    def __init__(self, n):
        self.fact = [1] * (n + 1)
        self.inv = [1] * (n + 1)
        for i in range(1, n + 1):
            self.fact[i] = (self.fact[i - 1] * i) % self.mod
            self.inv[i] = power(self.fact[i], self.mod - 2, self.mod)
    
    def C(self, n, k):
        if k > n:
            return 0
        return ((self.fact[n] * self.inv[n - k]) % self.mod * self.inv[k]) % self.mod

# Union-Find data structure
class UF:
    def __init__(self, size):
        self.d = [-1] * size
    
    def unite(self, x, y):
        x = self.find(x)
        y = self.find(y)
        if x == y:
            return False
        if self.d[x] > self.d[y]:
            x, y = y, x
        self.d[x] += self.d[y]
        self.d[y] = x
        return True
    
    def same(self, x, y):
        return self.find(x) == self.find(y)
    
    def find(self, k):
        if self.d[k] < 0:
            return k
        self.d[k] = self.find(self.d[k])
        return self.d[k]
    
    def size(self, k):
        return -self.d[self.find(k)]

# Segment Tree data structure
class SegmentTree:
    def __init__(self, n):
        self.size = 1
        while self.size < n:
            self.size *= 2
        self.size *= 2
        self.tree = [0] * self.size
        self.INF = float('inf')
    
    def gcd(self, a, b):
        while b:
            a, b = b, a % b
        return a
    
    def update(self, k, x):
        k += self.size // 2 - 1
        self.tree[k] = x
        while k > 0:
            k = (k - 1) // 2
            self.tree[k] = self.gcd(self.tree[k * 2 + 1], self.tree[k * 2 + 2])
    
    def query(self, a, b):
        return self._query(a, b, 0, 0, self.size // 2)
    
    def _query(self, a, b, k, l, r):
        if r <= a or b <= l:
            return self.INF
        if a <= l and r <= b:
            return self.tree[k]
        vl = self._query(a, b, k * 2 + 1, l, (l + r) // 2)
        vr = self._query(a, b, k * 2 + 2, (l + r) // 2, r)
        return self.gcd(vl, vr)

# Main part of the program
if __name__ == '__main__':
    R, G, B, N = map(int, input().split())
    f = 0
    for r in range(N // R + 1):
        for g in range((N - r*R) // G + 1):
            if (N - r*R - g*G) % B == 0:
                f += 1

    print(f)

# nextPermutation function similar to C++'s next_permutation
def next_permutation(arr):
    l = len(arr)
    i = l - 2
    while not (i < 0 or arr[i] < arr[i+1]):
        i -= 1
    if i < 0:
        return False
    j = l - 1
    while not (arr[i] < arr[j]):
        j -= 1
    arr[i], arr[j] = arr[j], arr[i]
    left, right = i+1, l-1
    while left < right:
        arr[left], arr[right] = arr[right], arr[left]
        left += 1
        right -= 1
    return True

# Now you can use the functions and classes we have implemented above as needed.
# For example, using `next_permutation(arr)` to get the next lexicographical permutation of a list `arr`.
# Note that we are assuming that the input is already sorted in non-decreasing order for it to work properly.