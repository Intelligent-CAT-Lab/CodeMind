Here is the translated code from Java to Python:

```python
import math
from functools import lru_cache

MOD = 1000000007

class Combinatrics:
    def __init__(self, n):
        self.fact = [1] * (max(2, n+1))
        self.inv = [1] * (max(2, n+1))
        self.finv = [1] * (max(2, n+1))
        for i in range(2, n+1):
            self.fact[i] = self.fact[i-1] * i % MOD
            self.inv[i] = MOD - self.inv[MOD % i] * (MOD // i) % MOD
            self.finv[i] = self.finv[i-1] * self.inv[i] % MOD

    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[r] % MOD * self.finv[n-r] % MOD

    def iteration_pow(self, x, n):
        result = 1
        while n:
            if n & 1:
                result = result * x % MOD
            x = x * x % MOD
            n >>= 1
        return result

    def surjection(self, n, k):
        ans = 0
        sign = -1 if k % 2 == 0 else 1
        for i in range(1, k+1):
            ans += sign * self.combination(k, i) * self.iteration_pow(i, n)
            ans %= MOD
            sign *= -1
        return self.mod(ans)

    @staticmethod
    def mod(a):
        return (a % MOD + MOD) % MOD

# Sample test case code
def main():
    n, k = map(int, input().split())
    c = Combinatrics(k)
    print(c.surjection(n, k))

if __name__ == "__main__":
    main()
```

Here, `main` function is provided as a sample test case driver code, where it reads two integers `n` and `k` from the input, creates a `Combinatrics` object, and prints the result of the `surjection` method.

Test this code using the provided test input "4 3" to get the expected output "36".
