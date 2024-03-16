import sys
import math

def get_prime_factors(n):
    prime_factors = {}
    c = n
    for i in range(2, int(math.sqrt(n)) + 1):
        count = 0
        while c % i == 0:
            count += 1
            c //= i
        if count > 0:
            prime_factors[i] = count
    if c > 1:
        prime_factors[c] = 1
    return prime_factors

def check(p, n):
    while n % p == 0:
        n //= p
        if n % p == 1:
            return True
    return False

def solve():
    n = int(sys.stdin.readline())
    ans = 0
    prime_factors2 = get_prime_factors(n - 1)
    for p in range(2, int(math.sqrt(n)) + 1):
        if p * p == n:
            ans += 1
            continue
        if n % p == 0:
            if check(p, n):
                ans += 1
            if check(n // p, n):
                ans += 1
    a1 = 1
    for p, count in prime_factors2.items():
        a1 *= count + 1
    print(a1 + ans)

if __name__ == '__main__':
    solve()