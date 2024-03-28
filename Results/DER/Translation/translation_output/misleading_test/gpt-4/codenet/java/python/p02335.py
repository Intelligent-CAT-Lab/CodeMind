Here's the equivalent Python code to the provided Java code:

```python
MOD = 1000000007


class Combinatrics:
    def __init__(self, n):
        self.fact = [1] * (n + 1)
        self.inv = [1] * (n + 1)
        self.finv = [1] * (n + 1)
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % MOD
            self.inv[i] = MOD - self.inv[MOD % i] * (MOD // i) % MOD
            self.finv[i] = self.finv[i - 1] * self.inv[i] % MOD

    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[r] % MOD * self.finv[n - r] % MOD


def main():
    n, k = map(int, input().split())
    c = Combinatrics(k)
    print(c.combination(k, n))


if __name__ == "__main__":
    main()
```

You can test it with the provided input:

Test input:
`3 5`

Expected output:
`105`

You would run the Python code and input `3 5` on the command line, and if the code is correct, it should output `105`.
