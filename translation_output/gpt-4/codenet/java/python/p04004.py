Here is the translated Python code from the provided Java code:

```python
MOD = 1000000007


def pow_mod(a, x, mod=MOD):
    res = 1
    while x > 0:
        if x % 2 != 0:
            res = (res * a) % mod
        a = (a * a) % mod
        x //= 2
    return res


def inv(a, mod=MOD):
    return pow_mod(a, mod - 2, mod)


def comb(ln, lr, mod=MOD):
    n, r = int(ln), int(lr)
    if n < 0 or r < 0 or r > n:
        return 0
    if r > n // 2:
        r = n - r
    return ((_fact[n] * _invfact[n - r]) % mod * _invfact[r]) % mod


def prec(n, mod=MOD):
    global _fact, _invfact
    _fact = [1] * (n + 1)
    _invfact = [1] * (n + 1)
    for i in range(1, n + 1):
        _fact[i] = _fact[i - 1] * i % mod
        _invfact[i] = inv(_fact[i], mod)


def main():
    x = int(input())
    y = int(input())
    z = int(input())
    B = min(y, z)
    C = max(y, z)
    prec(1000000)

    pow3 = [1] * 1000000
    for i in range(1, len(pow3)):
        pow3[i] = pow3[i - 1] * 3 % MOD

    ans = [0] * (x + y + z + 2)
    last = 0
    for l in range(x + 1, x + y + z + 2):
        space = l - 2
        base = comb(space, x - 1)
        row = space - (x - 1)
        if row == 0:
            last = 1
        elif row <= B:
            last = (last * 2) % MOD
        elif row <= C:
            last = (last * 2 - comb(row - 1, B) + MOD) % MOD
        else:
            d = (row - 1) - C
            last = (last * 2 - comb(row - 1, B) - comb(row - 1, d) + MOD + MOD) % MOD
        ans[l] = base * last % MOD * pow3[x + y + z + 1 - l] % MOD

    total_sum = sum(ans)
    print(total_sum % MOD)


if __name__ == "__main__":
    main()
```

Please note that the original Java code had a custom `InputReader` class for reading inputs, which I've replaced with Python's built-in `input()` function for simplicity. In competitive programming, reading input from the standard input stream and fast I/O might be important, but that's an implementation detail that can vary depending on the environment you're using to run the code.

The Java code also contained debug methods and other `InputReader` methods like `nextDoubles()` and `nextLongs()`, which I've omitted since they were not directly used in the main computation. If you need them for input parsing, you can implement similar functions using Python's input parsing methods.

I've kept the computation parts as similar as possible, with Python's modulo operator and integer division aligning with Java's `%` and `//` operations, respectively. The core logic, especially for modular arithmetic and combinatorics, has been translated line-by-line.

For Python, it's common to use the `%` operator for modulo operations and `//` for integer division. In contrast, Java uses `%` for modulo and `/` for division but requires casting the result to an integer if integer division is desired.

Please adjust the input and output handling as needed based on the specific input/output requirements of your problem or competition platform.
