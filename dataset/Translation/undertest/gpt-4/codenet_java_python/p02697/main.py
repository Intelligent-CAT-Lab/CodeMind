from math import gcd
from typing import List, Tuple, Dict, Set
from itertools import permutations

def repow(b: int, p: int, modder: int = None) -> int:
    a = b
    res = 1
    while p > 0:
        if p % 2 == 1:
            res *= a
            if modder:
                res %= modder
        a *= a
        if modder:
            a %= modder
        p //= 2
    return res

def lcm(c: int, d: int) -> int:
    return c // gcd(c, d) * d

def div_list(n: int) -> List[int]:
    div = []
    i = 1
    while i * i <= n:
        if n % i == 0:
            div.append(i)
            if i * i != n:
                div.append(n // i)
        i += 1
    return div

def div_set(n: int) -> Set[int]:
    div = set()
    for i in range(1, int(n**0.5) + 1):
        if n % i == 0:
            div.add(i)
            div.add(n // i)
    return div

def p_fac_map(x: int) -> Dict[int, int]:
    mp = {}
    t = x
    for i in range(2, int(x**0.5) + 1):
        if t % i == 0:
            num = 0
            while t % i == 0:
                t //= i
                num += 1
            mp[i] = num
    if t != 1:
        mp[t] = 1
    return mp

def is_prime(n: int) -> bool:
    if n == 2:
        return True
    if n % 2 == 0 or n == 1:
        return False
    if n > 2**31 - 1:
        return _tameshiwari(n)
    d = n - 1
    s = 0
    while d % 2 == 0:
        d //= 2
        s += 1
    for a in [2, 3, 5, 7, 11, 13, 17]:
        t = d
        y = repow(a, t, n)
        while t != n - 1 and y != 1 and y != n - 1:
            y = (y * y) % n
            t <<= 1
        if y != n - 1 and t % 2 == 0:
            return False
    return True

def _tameshiwari(n: int) -> bool:
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def st_sort(s: str) -> str:
    return ''.join(sorted(s))

def next_permutation(per: List[int]) -> bool:
    return next(permutations(per), False)

def solve():
    n, m = map(int, input().split())
    if n % 2 == 1:
        for i in range(m):
            print(i + 1, n - i)
    else:
        half = m // 2
        for i in range(half):
            print(i + 1, n - i)
        for i in range(half, m):
            print(i + 2, n - i - 1)

# If you want the script to run the function as a standalone program,
# remove the following commented line to allow execution of the solve function:
# if __name__ == '__main__':
#     solve()