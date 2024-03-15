import math
from collections import defaultdict
from itertools import permutations
from functools import reduce
from typing import List, Tuple, Union

def repow(b: Union[int, int], p: Union[int, int], modder: int=None):
    a = b % modder if modder else b
    res = 1
    while p > 0:
        if p % 2 == 1:
            res = (res * a) % modder if modder else res * a
        a = (a * a) % modder if modder else a * a
        p //= 2
    return res

def gcd(c: int, d: int):
    while True:
        f = c % d
        if f == 0:
            return d
        c, d = d, f

def lcm(c: int, d: int):
    return c // gcd(c, d) * d

def divList(n: int):
    div = []
    for i in range(1, int(math.sqrt(n)) + 1):
        if n % i == 0:
            div.append(i)
            if i * i != n:
                div.append(n // i)
    return div

def divSet(n: int):
    div = set()
    for i in range(1, int(math.sqrt(n)) + 1):
        if n % i == 0:
            div.add(i)
            div.add(n // i)
    return div

def pFacMap(x: int):
    mp = defaultdict(int)
    t = x
    for i in range(2, int(math.sqrt(x)) + 1):
        if t % i == 0:
            num = 0
            while t % i == 0:
                t //= i
                num += 1
            mp[i] = num
    if t != 1:
        mp[t] = 1
    return mp

def is_prime(n: int):
    if n in (2, 3):
        return True
    if n % 2 == 0 or n == 1:
        return False
    if n > 2**31 - 1:
        return try_prime(n)
    d = n - 1
    s = 0
    while d % 2 == 0:
        d //= 2
        s += 1
    a = [2, 3, 5, 7, 11, 13, 17]
    for x in a:
        if x >= n:
            break
        t = d
        y = repow(x, t, n)
        while t != n - 1 and y != 1 and y != n - 1:
            y = y * y % n
            t <<= 1
        if y != n - 1 and t % 2 == 0:
            return False
    return True

def try_prime(n: int):
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def kmp(t: str, p: str):
    f = [0] * (len(p) + 1)
    i, j = 0, 1
    f[j] = 0
    while j < len(p):
        if i == 0 or p[i - 1] == p[j - 1]:
            i += 1
            j += 1
            f[j] = i
        else:
            i = f[i]
    i, j = 1, 1
    while i <= len(p) and j <= len(t):
        if i == 0 or p[i - 1] == t[j - 1]:
            i += 1
            j += 1
        else:
            i = f[i]
    return j - i if i == len(p) + 1 else -1

def StSort(s: str):
    sorted_s = sorted(s)
    return "".join(sorted_s)

# Note: I omitted classes like `NCK`, `Xy`, `Zip1`, `UnFd`, `SegTree`,
# `Scnr`, and main function-related code for clarity and brevity,
# since they would need to be fully implemented or adapted to fit Python patterns.
# Also, `next_permutation` and `next_bits` methods are not translated since
# their functionality is already provided by the itertools library in Python.