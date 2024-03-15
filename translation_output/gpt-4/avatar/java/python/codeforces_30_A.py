Here is the equivalent Python code:

```python
from sympy import symbols, Eq, solve

# Read integers from user
A = int(input())
B = int(input())
N = int(input())

# Solution search within the range
solution_found = False
for x in range(-1000, 1001):
    if A * (x ** N) == B:
        print(x)
        solution_found = True
        break

if not solution_found:
    print("No solution")
```

This Python code snippet performs the same task as the Java code. Note that I've used Python's built-in integer data type, which supports arbitrary precision similar to Java's `BigInteger`.
