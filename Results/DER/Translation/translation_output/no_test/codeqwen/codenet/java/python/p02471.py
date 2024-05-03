Here is the Python equivalent of your Java code:

```python
import sys

def extended_euclidean(a, b):
    if a < b:
        return extended_euclidean(b, a)
    if b == 0:
        return a, 1, 0
    else:
        gcd, x, y = extended_euclidean(b, a % b)
        return gcd, y, x - (a // b) * y

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())
gcd, x, y = extended_euclidean(a, b)
print(x, y)
```

This Python code uses the Extended Euclidean algorithm to find the greatest common divisor (gcd) of two numbers and the coefficients of Bézout's identity (x, y) for the equation ax + by = gcd(a, b). The `sys.stdin.readline()` function is used to read the input from the standard input (usually the keyboard). The `print(x, y)` statement outputs the result.
