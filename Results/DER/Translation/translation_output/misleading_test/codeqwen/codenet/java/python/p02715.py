Here is the Python version of the provided Java code:

```python
import sys

MOD = 10**9 + 7

N, K = map(int, sys.stdin.readline().split())
res = 0

x = [0] * (K+1)
for i in range(K, 0, -1):
    x[i] = pow(K//i, N, MOD)
    for j in range(i*2, K+1, i):
        x[i] -= x[j]
        if x[i] < 0:
            x[i] += MOD
    res = (res + i*x[i]%MOD) % MOD

print(res)
```

This Python code does the same thing as the Java code. It reads the input from the standard input, calculates the result, and prints it to the standard output. The main differences are that Python uses `map` to convert the input strings to integers, and Python uses `pow` to calculate the power of a number with a modulus. The `pow` function in Python is equivalent to the `fast_pow_mod` function in the Java code.
