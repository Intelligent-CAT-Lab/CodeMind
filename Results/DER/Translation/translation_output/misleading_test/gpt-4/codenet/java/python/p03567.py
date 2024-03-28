Below is the translated Python code from the provided Java source:

```python
import math
import sys

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
            A, B = B, A  # SWAP
        self.parent[A] += self.parent[B]
        self.parent[B] = A
        return True

def modlcm(a, b, mod):
    return a * b * modinv(gcd(a, b), mod)

def gcd(a, b):
    return gcd(b, a % b) if b > 0 else a

def lcm(a, b):
    return a * b // gcd(a, b)

def max(a, b):
    return a if a > b else b

def min(a, b):
    return a if a < b else b

def factorial(i):
    return 1 if i == 1 else i * factorial(i - 1)

def lower_bound(a, key):
    left, right = 0, len(a)
    while right - left > 1:
        mid = (right + left) // 2
        if a[mid] < key:
            left = mid
        else:
            right = mid
    return left

def upper_bound(a, key):
    left, right = 0, len(a)
    while right - left > 1:
        mid = (right + left) // 2
        if a[mid] <= key:
            left = mid
        else:
            right = mid
    return left

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
    return a // b if a % b == 0 else a // b + 1

def lupper_division(a, b):
    return a // b if a % b == 0 else a // b + 1

def set_array(a):
    return [int(input()) for _ in range(a)]

def lset_array(a):
    return [int(input()) for _ in range(a)]

def reverce(str):
    return str[::-1]

def print_array(que):
    print(" ".join(map(str, que)))

def doublesort(a):
    return sorted(a, key=lambda x: x[0])

def ldoublesort(a):
    return sorted(a, key=lambda x: x[0])

def modpow(x, n, mo):
    sum = 1
    while n > 0:
        if n & 1:
            sum = sum * x % mo
        x = x * x % mo
        n >>= 1
    return sum

def modinv(a, m):
    b, u, v = m, 1, 0
    while b:
        t = a // b
        a -= t * b
        x = a
        a, b = b, x
        u -= t * v
        x = u
        u, v = v, x
    u %= m
    if u < 0:
        u += m
    return u

def warshall_floyd(v, n):
    for k in range(n):
        for i in range(n):
            for j in range(n):
                v[i][j] = min(v[i][j], v[i][k] + v[k][j])

# Main method converted to a function
def main(str):
    for i in range(1, len(str)):
        if str[i - 1] == 'A' and str[i] == 'C':
            print("Yes")
            return
    print("No")

# Sample Test Case
if __name__ == "__main__":
    input_str = "BACD"
    main(input_str)
```

I have removed the `FastScanner` class and its methods as Python has its own built-in functions like `input()` to read from the console. For the main functionality, I've directly translated the `main` method into a Python function.

Please note that some of Java's class method functionalities, such as Arrays.fill and Integer comparisons, don't have a directly equivalent Python function but have been adapted appropriately.

Lastly, to be more Pythonic, we would typically not define all of these functions outside of their use cases. I have kept the structure as close as possible to the original Java code.
