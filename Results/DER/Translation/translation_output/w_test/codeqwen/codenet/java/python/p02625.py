Here is the Python equivalent of the Java code:

```python
import sys

num = 1000000007
fact = [1] * 500001
ans1 = 1
for i in range(1, 500001):
    ans1 = (ans1 * i) % num
    fact[i] = ans1

inv = [1] * 500001
inv[0] = 1
for i in range(1, 500001):
    inv[i] = pow(fact[i], num-2, num) % num

n, m = map(int, sys.stdin.readline().split())

ans = fact[m] * inv[m-n] % num

anss = 0
pos = 1
for i in range(1, n+1):
    prod = 1
    prod *= fact[n]
    prod %= num
    prod *= inv[i]
    prod %= num
    prod *= inv[n-i]
    prod %= num
    prod *= fact[m-i]
    prod %= num
    prod *= inv[m-n]
    prod %= num
    prod *= pos
    anss += prod
    anss %= num
    pos = -pos

actualans = 0
actualans += ans * ans
actualans %= num
actualans -= anss * ans
actualans %= num
actualans = (actualans + num) % num

print(actualans)
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the factorials and their inverses, and then calculates the final answer. The `pow` function is used to calculate the power of a number with modulus. The `map` function is used to convert the input string into integers. The `sys.stdin.readline()` function is used to read a line of input from the standard input. The `print` function is used to write the output to the standard output.
