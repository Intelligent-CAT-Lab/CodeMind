import math
import sys
from itertools import permutations
from collections import deque

MOD = 1_000_000_007


def solve():
    X = input()[0]
    Y = input()[0]
    ans = "="
    if ord(X) - ord(Y) < 0:
        ans = "<"
    elif ord(X) - ord(Y) > 0:
        ans = ">"
    print(ans)


def get_d(x1, x2, y1, y2):
    return math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)


d4 = [[1, 0], [0, 1], [-1, 0], [0, -1]]
d8 = [[1, 0], [1, 1], [0, 1], [-1, 1], [-1, 0], [-1, -1], [0, -1], [1, -1]]


class Data:
    def __init__(self, a=None, b=None, c=None):
        self.a = a
        self.b = b
        self.c = c


class Permutation:
    def __init__(self, N):
        self.array = list(range(1, N + 1))

    def next_permutation(self):
        return self._next_permutation(self.array)

    @staticmethod
    def _next_permutation(array):
        i = len(array) - 1
        while i > 0 and array[i - 1] >= array[i]:
            i -= 1
        if i <= 0:
            return False
        j = len(array) - 1
        while array[j] <= array[i - 1]:
            j -= 1

        array[i - 1], array[j] = array[j], array[i - 1]

        array[i:] = reversed(array[i:])
        return True


class UnionFind:
    def __init__(self, size):
        self.parents = list(range(size))
        self.counts = [1] * size

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
        self.max = n + 1
        self.fact = [1] * self.max
        self.inv = [1] * self.max
        self.invfact = [1] * self.max

        for i in range(2, self.max):
            self.inv[i] = self.mod - self.inv[self.mod % i] * (self.mod // i) % self.mod

        for i in range(1, self.max):
            self.fact[i] = i * self.fact[i - 1] % self.mod
            self.invfact[i] = self.inv[i] * self.invfact[i - 1] % self.mod

    def get(self, n, r):
        if r > n:
            return 0
        return self.fact[n] * self.invfact[r] * self.invfact[n - r] % self.mod

    @staticmethod
    def gcd(a, b):
        while b:
            a, b = b, a % b
        return a


def gcd(a, b):
    while b:
        a, b = b, a % b
    return a


def reverse_list(lst):
    lst.reverse()


def main():
    solve()


if __name__ == "__main__":
    main()