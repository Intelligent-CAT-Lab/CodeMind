Here is the Python translation of the provided Java code:

```python
import sys
from functools import cmp_to_key

class P:
    def __init__(self, x, d):
        self.x = x
        self.d = d

    # This will act as the comparator for sorting the numbers
    def __lt__(self, other):
        return self.d < other.d


def main():
    # Reading input as in the Java code, using stdin
    n = int(input())
    d = [0] * 1000
    lis = []

    a, b = 9, 10
    for i in range(1, 10):
        lis.append(P(i, -11 + i))
    lis.append(P(19, -1))

    for i in range(1, 15):
        for w in range(1, 1000):
            x = w * b + a
            y = x
            e = 0
            while x > 0:
                e += x % 10
                x //= 10
            lis.append(P(y, y / e))
        b *= 10
        a *= 10
        a += 9

    # Sorting the list with the custom comparator, using the __lt__ method defined in P
    lis.sort(key=cmp_to_key(lambda p1, p2: (1 if p1.d < p2.d else -1)))

    max_val = 0
    for item in lis:
        if max_val < item.x:
            max_val = item.x
            print(max_val)
            n -= 1
            if n == 0:
                break


if __name__ == '__main__':
    main()
```

Please note that there are differences between Java and Python's data types and standard libraries, so while translating the program, I made the following changes:

1. `Reader` class functionality has been replaced with Python's built-in `input()`.
2. Java's `ArrayList` has been replaced with Python's `list` data structure.
3. `Comparable` interface and `compareTo` method have been replaced by defining a `__lt__` method inside the `P` class which is used with `sort()` method to mimic the behavior of custom sorting in Java.
4. I used `cmp_to_key` from the `functools` module for comparing the elements using the custom `__lt__` method, to replicate Java’s sorting mechanism.
5. Removed the `mod = 1000000007` as it is not used anywhere in the provided code.
6. Removed the unused `db`, `validpos`, and `bit` functions.

Make sure to run your Python code with Python 3, as it uses the `/` operator for true division (which would be `//` for integer division in Python 2) and `print()` function rather than Python 2 `print` statement.
