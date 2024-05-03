Here is the Python equivalent of the Java code:

```python
import sys
import math
from functools import reduce
from operator import mul

def main():
    r, c, a1, a2, b1, b2 = map(int, sys.stdin.readline().split())
    x = min(abs(a1 - b1), r - abs(a1 - b1))
    y = min(abs(a2 - b2), c - abs(a2 - b2))
    z = 1
    if x == r - x:
        z *= 2
    if y == c - y:
        z *= 2
    C = min(x, y)
    b = reduce(mul, [x + y - i for i in range(C)], 1)
    print((b * z) % 100000007)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads the input from the standard input, calculates the values of x and y, and then calculates the result. The `reduce` function is used to multiply all the numbers in the list `[x + y - i for i in range(C)]` together. The `%` operator is used to take the result modulo 100000007.
