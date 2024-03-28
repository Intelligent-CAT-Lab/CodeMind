```python
import sys
from collections import defaultdict
from math import isqrt

class p02722:
    mod = 1000000007
    inf = 0xfffffffffffffff

    def solve(self):
        n = int(input())
        ans = 0
        prime_factors2 = self.get_prime_factors(n - 1)
        for p in range(2, isqrt(n) + 1):
            if p * p == n:
                ans += 1
                continue
            if n % p == 0:
                if self.check(p, n):
                    ans += 1
                if self.check(n // p, n):
                    ans += 1
        a1 = 1
        for factor, count in prime_factors2.items():
            a1 *= count + 1
        print(a1 + ans)

    @staticmethod
    def check(p, n):
        while n % p == 0:
            n //= p
            if n % p == 1:
                return True
        return False

    @staticmethod
    def get_prime_factors(n):
        prime_factors = defaultdict(int)
        c = n
        for i in range(2, isqrt(n) + 1):
            count = 0
            while c % i == 0:
                count += 1
                c //= i
            if count > 0:
                prime_factors[i] = count
        if c > 1:
            prime_factors[c] = 1
        return prime_factors

if __name__ == "__main__":
    task = p02722()
    task.solve()
```

