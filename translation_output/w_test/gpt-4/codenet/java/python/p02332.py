The following is the Python translation of the given Java code. The code calculates the permutations P(n, k) using precomputed factorial and modular inverse factorial tables. The translation includes using iterative factorial calculation, modular inverse, and combination/permutation functions, with sample input reading and output.

```python
MOD = 1000000007

class Combinatorics:
    def __init__(self, n):
        self.fact = [1] * (n + 1)
        self.inv = [1] * (n + 1)
        self.finv = [1] * (n + 1)
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % MOD
            self.inv[i] = MOD - self.inv[MOD % i] * (MOD // i) % MOD
            self.finv[i] = self.finv[i - 1] * self.inv[i] % MOD

    def factorial(self, n):
        return self.fact[n]

    def fact_inv(self, n):
        return self.finv[n]

    def permutation(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[n - r] % MOD

def main():
    n, k = map(int, input().split())
    c = Combinatorics(k)
    print(c.permutation(k, n))

if __name__ == "__main__":
    main()
```

To test the code with input `2 3`, simply run the program and input the numbers when prompted:

```shell
2 3
```

And the expected output should be:

```
6
```
