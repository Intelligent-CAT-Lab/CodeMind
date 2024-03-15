Below is the Python translation of the provided Java code:

```python
import math

def main():
    # Variables
    count = 0
    sw = False
    max = float("-inf")
    min = float("inf")
    dMax = float("-inf")
    dMin = float("inf")
    answer = 0

    # Input
    A = int(input())
    B = int(input())
    C = int(input())
    D = int(input())

    n = B - A + 1

    if C == D:
        a = A // C
        b = B // C
        x = b - a
        if A % C == 0:
            x += 1
        answer = n - x
        print(answer)
        return

    a = A // C
    b = B // C
    p = b - a
    if A % C == 0:
        p += 1

    a = A // D
    b = B // D
    q = b - a
    if A % D == 0:
        q += 1

    e = lcm(C, D)
    a = A // e
    b = B // e
    r = b - a
    if A % e == 0:
        r += 1

    answer = n - (p + q - r)

    # Output
    print(answer)

def gcd(x, y):
    """Calculate the greatest common divisor of x and y"""
    while y:
        x, y = y, x % y
    return x

def lcm(a, b):
    """Calculate the lowest common multiple of a and b"""
    return (a*b) // gcd(a, b)

if __name__ == "__main__":
    main()
```

Note that in Python, we can use the built-in `math.gcd()` function instead of manually defining the Euclidean algorithm like in the original Java class `Euclid`. It's also important to point out that Python doesn't need the class structure here for the operations performed; instead, I've represented the gcd and lcm functions as simple top-level (global) functions. 

The `Compute` class in Java is not directly translated into a Python class. Instead, I have extracted the `leastCommonMultiple` method as a standalone function. The `cumulativeSum` method from the `Compute` class doesn't seem to be used in the provided code, so it has been omitted from the translated Python code. 

Keep in mind that in Python, the `//` operator is used for integer division, and `%` for the modulo operation, which are analogous to their Java counterparts. The `print` function is used for outputting the result.
