import math
import itertools

MOD = 1_000_000_007
SIZE = 1_000_000

fac = [0] * SIZE
inv = [0] * SIZE
finv = [0] * SIZE

# Read integers from input
s, w = map(int, input().split())

def solve():
    if w >= s:
        print("unsafe")
    else:
        print("safe")

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

def _inv(a):
    return pow(a, MOD - 2, MOD)

def pow(a, r):
    sum = 1
    while r > 0:
        if r & 1:
            sum = sum * a % MOD
        a = a * a % MOD
        r >>= 1
    return sum

def modFact(n):
    if n == 0:
        return 1
    return n * modFact(n - 1) % MOD

def fact(n):
    if n == 0:
        return 1
    return n * fact(n - 1)

def initCOMB():
    fac[0] = fac[1] = 1
    inv[1] = 1
    finv[0] = finv[1] = 1
    for i in range(2, SIZE):
        fac[i] = fac[i - 1] * i % MOD
        inv[i] = MOD - inv[MOD % i] * (MOD // i) % MOD
        finv[i] = finv[i - 1] * inv[i] % MOD

def modComb(n, r):
    if n < r or n < 0 or r < 0:
        return 0
    return fac[n] * finv[r] % MOD * finv[n - r] % MOD

def comb(n, r):
    num = 1
    for i in range(1, r + 1):
        num = num * (n - i + 1) // i
    return num

def isPrime(a):
    if a <= 1:
        return False
    for i in range(2, int(math.sqrt(a)) + 1):
        if a % i == 0:
            return False
    return True

def nextPermutation(s):
    arr = list(s)
    i = len(arr) - 2
    while i >= 0 and arr[i] >= arr[i + 1]:
        i -= 1
    if i < 0:
        return None
    j = len(arr) - 1
    while arr[j] <= arr[i]:
        j -= 1
    arr[i], arr[j] = arr[j], arr[i]
    arr[i + 1:] = reversed(arr[i + 1:])
    return ''.join(arr)

def _nextPermutation(a):
    i = len(a) - 1
    while i > 0 and a[i - 1] >= a[i]:
        i -= 1
    if i <= 0:
        return False
    j = len(a) - 1
    while a[j] <= a[i - 1]:
        j -= 1
    a[i - 1], a[j] = a[j], a[i - 1]
    a[i:] = reversed(a[i:])
    return True

def elimination(a, b):
    n = len(a)
    for k in range(n - 1):
        for i in range(k + 1, n):
            f = -a[i][k] / a[k][k]
            for j in range(k + 1, n):
                a[i][j] += f * a[k][j]
            b[i] += f * b[k]
    for i in range(n - 1, -1, -1):
        for j in range(i + 1, n):
            b[i] -= a[i][j] * b[j]
        b[i] = b[i] / a[i][i]

class Pair:
    def __init__(self, a, b):
        self.a = a
        self.b = b

    def __lt__(self, other):
        return self.b < other.b

    def __eq__(self, other):
        return self.b == other.b

# Main function being called
solve()