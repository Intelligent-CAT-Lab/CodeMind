Here is the Python equivalent of the Java code:

```python
import sys

def solver():
    n = int(input())
    x = int(input())
    sum = 0
    if x == n - x:
        sum = 3 * x
        print(sum)
        return
    else:
        if x > n - x:
            sum += x + n - x
            sum += calc(x, n - x, False)
        elif x < n - x:
            sum += x + n - x
            sum += calc(x, n - x, False)
        print(sum)
        return

def calc(x, y, first):
    sum = 0
    if x % y == 0:
        if first:
            sum += y
        sum += (x // y * 2 - 1) * y
        return sum
    else:
        if first:
            sum += y
        sum += (x // y * 2) * y
        sum += calc(y, x % y, False)
        return sum

if __name__ == "__main__":
    solver()
```

Please note that the code is designed to be run in a Python environment. The `input()` function is used to read input from the user. The `print()` function is used to output the result. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java. The `**` operator is used for exponentiation in Python, which is equivalent to `Math.pow()` in Java. The `%` operator is used for modulo operation in Python, which is equivalent to `%` in Java. The `if __name__ == "__main__":` block is used to ensure that the `solver()` function is called when the script is run directly.
