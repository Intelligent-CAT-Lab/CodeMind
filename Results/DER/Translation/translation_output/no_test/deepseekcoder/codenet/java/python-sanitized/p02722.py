import sys
from collections import Counter

def getPrimeFactors(n):
    primeFactors = Counter()
    c = n
    i = 2
    while i * i <= n and 1 < c:
        count = 0
        while c % i == 0:
            count += 1
            c //= i
        if count > 0:
            primeFactors[i] = count
        i += 1
    if c > 1:
        primeFactors[c] = 1
    return primeFactors

def check(p, n):
    while n % p == 0:
        n //= p
        if n % p == 1:
            return True
    return False

def solve():
    n = int(sys.stdin.readline())
    ans = 0
    primeFactors2 = getPrimeFactors(n - 1)
    p = 2
    while p * p <= n:
        if p * p == n:
            ans += 1
        elif n % p == 0:
            if check(p, n):
                ans += 1
            if check(n // p, n):
                ans += 1
        p += 1
    a1 = 1
    for count in primeFactors2.values():
        a1 *= count + 1
    print(a1 + ans)

if __name__ == "__main__":
    solve()