import math

def gcd(p, q):
    while q != 0:
        p, q = q, p % q
    return p

def solve(p, q):
    qs = q // gcd(p, q)
    ans = 1
    for i in range(2, int(math.sqrt(qs)) + 1):
        if qs % i == 0:
            while qs % i == 0:
                qs //= i
            ans *= i
    ans *= qs
    return ans

p, q = map(int, input().split())
print(solve(p, q))