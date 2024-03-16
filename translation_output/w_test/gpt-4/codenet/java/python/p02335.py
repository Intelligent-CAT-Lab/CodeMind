```python
class Combinatrics:
    mod = 1000000007  # Assume prime for modulo inverse

    def __init__(self, n):
        self.fact = [1] * (n + 1)
        self.inv = [1] * (n + 1)
        self.finv = [1] * (n + 1)

        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % self.mod
            self.inv[i] = self.mod - self.inv[self.mod % i] * (self.mod // i) % self.mod
            self.finv[i] = self.finv[i - 1] * self.inv[i] % self.mod

    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[r] % self.mod * self.finv[n - r] % self.mod


def main():
    n, k = map(int, input().split())
    c = Combinatrics(k)
    print(c.combination(k, n))


if __name__ == "__main__":
    main()
```

To use the provided test input, you can run the program and manually input '3 5', or you can modify the `main()` function to read from a file or to use hardcoded values.
