import math
import sys


class Point2D:
    def __init__(self, x, y):
        self.x = x
        self.y = y


class Point3D:
    def __init__(self, x, y, z):
        self.x = x
        self.y = y
        self.z = z


class Pair:
    def __init__(self, x, y):
        self.x = x
        self.y = y


def gcd(a, b):
    while b:
        a, b = b, a % b
    return a


def power(x, n, mod):
    if n == 0:
        return 1
    if n % 2 == 0:
        e = power(x, n // 2, mod)
        return (e * e) % mod
    else:
        return (x * power(x, n - 1, mod)) % mod


class COM:
    fact = []
    inv = []

    @staticmethod
    def init(n, mod):
        COM.fact = [1] * (n + 1)
        COM.inv = [1] * (n + 1)
        for i in range(2, n + 1):
            COM.fact[i] = (COM.fact[i - 1] * i) % mod
            COM.inv[i] = power(COM.fact[i], mod - 2, mod)

    @staticmethod
    def c(n, k, mod):
        if k > n: return 0
        return COM.fact[n] * COM.inv[k] * COM.inv[n - k] % mod


class UF:
    def __init__(self, size):
        self.d = [-1] * size

    def unite(self, x, y):
        x = self.find(x)
        y = self.find(y)
        if x == y: return False
        if self.d[y] < self.d[x]:
            x, y = y, x
        self.d[x] += self.d[y]
        self.d[y] = x
        return True

    def find(self, k):
        if self.d[k] < 0: return k
        self.d[k] = self.find(self.d[k])
        return self.d[k]

    def size(self, k):
        return -self.d[self.find(k)]


def next_permutation(arr):
    t = len(arr) - 1
    tt = t + 1
    for i in range(t, 0, -1):
        if arr[i - 1] < arr[i]:
            swap_index = find(arr[i - 1], arr, i, t)
            arr[i - 1], arr[swap_index] = arr[swap_index], arr[i - 1]
            arr[i:] = sorted(arr[i:])
            return True
    return False


def find(dest, a, s, e):
    if s == e:
        return s
    m = (s + e + 1) // 2
    return find(dest, a, m, e) if a[m] > dest else find(dest, a, s, m - 1)


def main():
    mod = 10**9 + 7
    R, G, B, N = map(int, sys.stdin.readline().split())
    f = 0
    for r in range(N // R + 1):
        for g in range((N - r * R) // G + 1):
            if (N - r * R - g * G) % B == 0:
                f += 1

    print(f)


if __name__ == "__main__":
    main()