Here is the translated Python code:

```python
import math
import sys

MOD = int(1e9+7)

def ceil(a, b):
    return (a + b - 1) // b

def gcd(a, b):
    return a if b == 0 else gcd(b, a % b)

def lcm(a, b):
    return a // gcd(a, b) * b

def solve(N, K):
    base = 1
    cnt = 0
    while base <= N:
        cnt += 1
        base *= K
    print(cnt)

def main():
    N, K = map(int, input().split())
    solve(N, K)

if __name__ == "__main__":
    main()
```

Some important points to notice while converting from Java to Python:

- In Python, we don't need import statements for built-in functions or classes such as `math`, `sys`.
- The `scanf` equivalent in Python is typically achieved with `input()` or `sys.stdin.readline()`.
- Python does not support overloading operators (such as `input()`) based on the returned type, so we use `split()` and `map()` to handle different input types.
- We do not need to explicitly flush and close `stdout` in a typical Python script.
- Integer division with the floor effect is performed with `//` in Python, not with `/` as in Java.
- Since Python is interpreted, we don't define classes for small scripts usually, but functions and possibly if conditions to prevent code being run on import as a module.
- Functions are defined using the `def` keyword.
- Python does not have static typing as in Java, hence no data type declarations are needed before variables.

This script expects input to be given in a way compatible with the original Java code, which assumed input from console or file redirection.
