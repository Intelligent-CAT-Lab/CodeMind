Below is the Python equivalent of the given Java code:

```python
import math
import sys

def solver(n):
    sqrt = int(math.sqrt(n))
    x = y = 0
    for i in range(sqrt, 0, -1):
        if n % i == 0:
            x = i
            y = n // i
            break
    if x != 0 and y != 0:
        ans = (x - 1) + (y - 1)
    else:
        ans = n - 1
    return ans

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

class Pair:
    def __init__(self, x, s):
        self.x = x
        self.s = s

    def __lt__(self, other):
        return self.x < other.x

# Assuming that n is read from input as the first and only line
if __name__ == "__main__":
    n = int(input().strip())
    result = solver(n)
    print(result)
```

In the Python version:

- The `main` method now reads an input from the standard input for `n` and calls `solver(n)` directly.
- I skipped the `InputReader` class and `gcd` method unless you need to read an array of numbers or use the `gcd` function, Python already offers `math.gcd` for computing the greatest common divisor (GCD).
- The `Pair` class is translated but is not used anywhere in the code, as in the original Java code.
- Python doesn't require explicit `import` statements for operations such as I/O and math functions like `math.sqrt`.
- The `print` function in Python by default writes to standard output (`sys.stdout`), and `input()` reads from standard input (`sys.stdin`).
- Listeners and writers equivalent to Java's are not needed here, as Python file I/O is typically simpler with built-in functions.
- In the solver function, division (`/`) is replaced with floor division (`//`) to get integer results.
- The equivalent `gcd` implementation uses a loop instead of recursion, due to Python's recursion depth limits and iterative methods generally being more efficient in Python.
- The `Comparable` interface is not directly mapped in Python; instead, magic methods are used for overloading the comparison operators, like `__lt__` for the less than operator.
