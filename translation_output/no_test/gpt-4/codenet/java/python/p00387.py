Here's the translated Python code with the structure and methods converted to Python. Note that Python's standard input and output handling is different, so I've used `input()` and `print()` instead of creating reader and writer classes. I also used built-in functions and standard library modules to replicate the methods from the original Java classes where appropriate.

```python
import math
from functools import reduce
from itertools import permutations

def solve(a, b):
    print(max(1, (b + a - 1) // a))

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a // gcd(a, b) * b

def factorial(i):
    if i == 1:
        return 1
    else:
        return i * factorial(i - 1)

def manhat(x1, y1, x2, y2):
    return abs(x1 - x2) + abs(y1 - y2)

def euclid(x1, y1, x2, y2):
    return math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)

def is_prime(n):
    if n == 2:
        return True
    if n < 2 or n % 2 == 0:
        return False
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        if n % i == 0:
            return False
    return True

if __name__ == "__main__":
    a, b = map(int, input().split())
    solve(a, b)
```

This Python code provides similar functionality to your Java code. The `solve` method takes two integers as input (like in the Java example, they are read from the standard input). The methods for `gcd`, `lcm`, `factorial`, `manhat`, `euclid`, and `is_prime` are translated to standalone functions in Python, replacing the `Methods` inner class from Java. When you run this code, it expects two number inputs separated by space like your original Java program.
