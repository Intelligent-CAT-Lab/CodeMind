```python
class FRedBlackSoulGem:
    def solve(self, n, m):
        def ncr(n, r, MOD):
            if r > n:
                return 0
            if r == 0:
                return 1
            num = den = 1
            for i in range(r):
                num = (num * (n - i)) % MOD
                den = (den * (i + 1)) % MOD
            return (num * pow(den, MOD - 2, MOD)) % MOD

        ans = 0
        for r in range(1, n):
            b = n - r
            t = ncr(n, r, m)
            t = (t * pow(2, r * (r - 1) // 2, m)) % m
            t = (t * pow(2, b * (b - 1) // 2, m)) % m

            p = 0
            fact = [1] * (b + 1)
            for i in range(1, b + 1):
                fact[i] = (fact[i - 1] * i) % m

            for i in range(b + 1):
                coeff = fact[b] * pow(pow(2, b - i, m) - 1, r, m) % m
                if i % 2 == 0:
                    p = (p + coeff) % m
                else:
                    p = (p - coeff) % m

            if p < 0:
                p += m

            t = (t * p) % m
            ans = (ans + t) % m

        return ans

# Sample Test
solver = FRedBlackSoulGem()
result = solver.solve(3, 310779401)
print(result)
```

