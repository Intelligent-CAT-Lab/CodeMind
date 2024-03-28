Here's the translated Python code:

```python
def fast_pow_mod(b, x, mod):
    if x == 0:
        return 1
    if x == 1:
        return b
    if x % 2 == 0:
        return fast_pow_mod(b * b % mod, x // 2, mod) % mod
    return b * fast_pow_mod(b * b % mod, x // 2, mod) % mod

def main():
    MOD = 1000000007
    N, K = map(int, input().split())
    res = 0
    x = [0] * (K+1)
    for i in range(K, 0, -1):
        x[i] = fast_pow_mod(K // i, N, MOD)
        for j in range(i * 2, K+1, i):
            x[i] -= x[j]
            if x[i] < 0:
                x[i] += MOD
        res = (res + i * x[i] % MOD) % MOD
    print(res)

if __name__ == "__main__":
    main()
```

A sample test case based on the input and output you've provided would look like this:

```python
# Input from stdin:
# 3 2
# Run the `main()` function and the expected output will be:
# -5
main()
```

Please note that in Python, we use `//` for integer division while Java uses `/`. Python's modulo operations are also slightly different in how they handle negative numbers, but the code should work correctly for positive values as given in the example.
