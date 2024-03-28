from collections import defaultdict
from sys import stdin, stdout

mod = 1000000007
inf = 0xfffffffffffffff

def get_prime_factors(n):
    prime_factors = defaultdict(int)
    c = n
    i = 2
    while i * i <= n and c > 1:
        count = 0
        while c % i == 0:
            count += 1
            c //= i
        if count > 0:
            prime_factors[i] = count
        i += 1
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
    n = int(stdin.readline())
    ans = 0
    prime_factors2 = get_prime_factors(n - 1)
    for p in range(2, int(n**0.5) + 1):
        if p * p == n:
            ans += 1
            continue
        if n % p == 0:
            if check(p, n):
                ans += 1
            if check(n // p, n):
                ans += 1
    a1 = 1
    for value in prime_factors2.values():
        a1 *= value + 1
    stdout.write(f"{a1 + ans}\n")

if __name__ == '__main__':
    solve()