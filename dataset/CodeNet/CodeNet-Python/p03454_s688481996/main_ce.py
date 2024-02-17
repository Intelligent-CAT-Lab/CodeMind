#!/usr/bin/env python3
import math
import random
class Prime:
    seed_primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
    def is_prime(self, n):
        is_prime_common = self.is_prime_common(n)
        if is_prime_common is not None:
            return is_prime_common
        if n < 2000000:
            return self.is_prime_bf(n)
        else:
            return self.is_prime_mr(n)
    def is_prime_common(self, n):
        if n == 1: return False
        if n in Prime.seed_primes: return True
        if any(map(lambda x: n % x == 0, self.seed_primes)): return False
    def is_prime_bf(self, n):
        for k in range(2, int(math.sqrt(n)) + 1):
            if n % k == 0:
                return False
        return True
    def is_prime_mr(self, n):
        d = n - 1
        while d % 2 == 0:
            d //= 2
        witnesses = self.get_witnesses(n)
        #witnesses = [random.randint(1, n - 1) for _ in range(100)]
        for w in witnesses:
            t = d
            y = pow(w, t, n)
            while t != n - 1 and y != 1 and y != n - 1:
                y = (y ** 2) % n
                t *= 2
            if y != n - 1 and t % 2 == 0:
                return False
        return True
    def get_witnesses(self, num):
        def _get_range(num):
            if num < 2047:
                return 1
            if num < 1373653:
                return 2
            if num < 25326001:
                return 3
            if num < 3215031751:
                return 4
            if num < 2152302898747:
                return 5
            if num < 3474749660383:
                return 6
            if num < 341550071728321:
                return 7
            if num < 38255123056546413051:
                return 9
            return 12
        return self.seed_primes[:_get_range(num)]
    def gcd(self, a, b):
        if a < b:
            a, b = b, a
        if b == 0:
            return a
        while b:
            a, b = b, a % b
        return a
    @staticmethod
    def f(x, n, seed):
        p = Prime.seed_primes[seed % len(Prime.seed_primes)]
        return (p * x + seed) % n
    def find_factor(self, n, seed=1):
        if self.is_prime(n):
            return n
        x, y, d = 2, 2, 1
        count = 0
        while d == 1:
            count += 1
            x = self.f(x, n, seed)
            y = self.f(self.f(y, n, seed), n, seed)
            d = self.gcd(abs(x - y), n)
        if d == n:
            return self.find_factor(n, seed+1)
        return self.find_factor(d)
    def find_factors(self, n):
        primes = {}
        if self.is_prime(n):
            primes[n] = 1
            return primes
        while n > 1:
            factor = self.find_factor(n)
            primes.setdefault(factor, 0)
            primes[factor] += 1
            n //= factor
        return primes
def gcd(a, b):
    if a < b:
        a, b = b, a
    while 0 < b:
        a, b = b, a % b
    return a
def powmod(a, x, m):
    y = 1
    while 0 < x:
        if x % 2 == 1:
            y *= a
            y %= m
        x //= 2
        a = a ** 2
        a %= M
    return y
M = 10 ** 9 + 7
prime = Prime()
def solve(s):
    if s == 1:
        return 9
    ans = 0
    n = 1
    c = 9
    while n * c < s:
        n += 1
        c *= 10
    ans += s // n
    for log_r in range(n - 1, n + 1):
        c_r = 9 * 10 ** (log_r - 1)
        sum_r = log_r * c_r
        for log_l in range(1, log_r):
            mid_f = 0
            for i in range(log_l + 1, log_r):
                mid_f += i * 9 * 10 ** (i - 1)
            if s <= mid_f:
                continue
            res = s - mid_f
            c_l = 9 * 10 ** (log_l - 1)
            if log_l * c_l + sum_r < res:
                continue
            g = gcd(log_r, log_l)
            if res % g != 0:
                continue
            c_l_max = min(c_l, (res - 1) // log_l)
            while 0 < c_l_max:
                if (res - log_l * c_l_max) % log_r == 0: break
                c_l_max -= 1
            if c_l_max == 0:
                continue
            c_l_min = 1
            if sum_r < res:
                c_l_min = (res - sum_r + log_l - 1) // log_l
            div = log_r // g
            ans += (c_l_max - c_l_min + div) // div
    factors = prime.find_factors(s)
    num_prime_factors = len(factors)
    prime_factors = []
    count_limit = []
    count = [0] * num_prime_factors
    for k in factors.keys():
        prime_factors.append(k)
        count_limit.append(factors[k])
    loop = True
    while loop:
        p = 1
        for i, f in enumerate(prime_factors):
            p *= f ** count[i]
        if n <= p:
            ans += 9 * powmod(10, p - 1, M)
            ans += M - s // p
            ans %= M
        count[0] += 1
        for i, limit in enumerate(count_limit):
            if limit < count[i]:
                if i == num_prime_factors - 1:
                    loop = False
                    break
                count[i + 1] += 1
                count[i] = 0
    return ans
def main():
    s = int("1")
    print(solve(s))
if __name__ == '__main__':
    main()
