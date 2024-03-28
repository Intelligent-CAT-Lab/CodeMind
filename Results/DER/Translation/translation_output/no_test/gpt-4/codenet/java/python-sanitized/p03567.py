import math
import sys
from functools import cmp_to_key

class UnionFind:
    def __init__(self, n):
        self.parent = [-1] * n

    def root(self, A):
        if self.parent[A] < 0:
            return A
        self.parent[A] = self.root(self.parent[A])
        return self.parent[A]

    def size(self, A):
        return -self.parent[self.root(A)]

    def connect(self, A, B):
        A = self.root(A)
        B = self.root(B)
        if A == B:
            return False
        if self.size(A) < self.size(B):
            A, B = B, A
        self.parent[A] += self.parent[B]
        self.parent[B] = A
        return True

def mod_lcm(a, b):
    return a * b * mod_inverse(math.gcd(a, b), mod)

def lcm(a, b):
    return a * b // math.gcd(a, b)

def is_prime(n):
    if n == 2:
        return True
    if n < 2 or n % 2 == 0:
        return False
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        if n % i == 0:
            return False
    return True

def upper_division(a, b):
    return (a + b - 1) // b

def set_array(a):
    return [int(input()) for _ in range(a)]

def lset_array(a):
    return [int(input()) for _ in range(a)]

def reverce(str):
    return str[::-1]

def print_array(que):
    print(" ".join(map(str, que)))

def double_sort(a):
    return sorted(a, key=cmp_to_key(lambda x, y: x[0] - y[0]))

def ldouble_sort(a):
    return sorted(a, key=cmp_to_key(lambda x, y: x[0] - y[0]))

def mod_pow(x, n, mo):
    result = 1
    while n > 0:
        if n & 1:
            result = result * x % mo
        x = x * x % mo
        n >>= 1
    return result

def revch(ch):
    return ch[::-1]

def revint(ch):
    return ch[::-1]

def warshall_floyd(v, n):
    for k in range(n):
        for i in range(n):
            for j in range(n):
                v[i][j] = min(v[i][j], v[i][k] + v[k][j])

def mod_inverse(a, m):
    b, u, v = m, 1, 0
    while b:
        t = a // b
        a -= t * b
        a, b = b, a
        u -= t * v
        u, v = v, u
    u %= m
    if u < 0:
        u += m
    return u

def main():
    str = input()
    if 'AC' in str:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    mod = 1000000007
    big = sys.maxsize
    main()