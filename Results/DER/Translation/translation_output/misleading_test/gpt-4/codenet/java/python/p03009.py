Below is the translated code from Java to Python:

```python
import sys
from math import factorial


class Modular:
    def __init__(self, m):
        self.m = m

    def valueOf(self, x):
        x %= self.m
        if x < 0:
            x += self.m
        return x

    def mul(self, x, y):
        return self.valueOf(x * y)

    def plus(self, x, y):
        return self.valueOf(x + y)

    def subtract(self, x, y):
        return self.valueOf(x - y)


class Factorial:
    def __init__(self, limit, mod):
        self.fact = [1] * (limit + 1)
        for i in range(1, limit + 1):
            self.fact[i] = mod.mul(self.fact[i - 1], i)

    def fact(self, n):
        return self.fact[n]


def solve(n, h, d):
    mod = Modular(10**9 + 7)
    fact = Factorial(n, mod)
    dp = [0] * (h + 1)
    dp[0] = fact.fact(n)
    factSum = 0
    for i in range(1, n + 1):
        factSum = mod.plus(factSum, fact.fact(i))
    
    preDpSum = [0] * (h + 1)
    preDpSum[0] = dp[0]
    for i in range(1, h + 1):
        dp[i] = preDpSum[i - 1]
        if i - d - 1 >= 0:
            dp[i] = mod.subtract(dp[i], preDpSum[i - d - 1])
        if i < h:
            dp[i] = mod.mul(dp[i], factSum)
        preDpSum[i] = mod.plus(preDpSum[i - 1], dp[i])

    return dp[h]


def main():
    n, h, d = map(int, sys.stdin.readline().strip().split())
    result = solve(n, h, d)
    print(result)


if __name__ == "__main__":
    main()
```

This Python code replicates the functionality of the provided Java code. It includes a class to handle modular arithmetic, a class to preprocess and store factorials up to `n`, and a solve function that computes the desired output. The `main` function reads the input parameters and prints the result.

Please note that the input reading portion (`sys.stdin.readline()`) assumes the input is provided in the same format as the Java code, which is from standard input. The `print(result)` outputs the result to standard output.

For the given test case, you can call the `solve` function directly with the input parameters:

```python
print(solve(2, 2, 1))  # Expected output: -20
```

Additionally, Python includes a built-in `factorial` function from the `math` module, but here a custom factorial function is implemented to maintain modularity.
