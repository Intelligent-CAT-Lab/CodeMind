Here's the Java code translated to Python:

```python
import math

def main():
    n = int(input())
    x = int(input())

    print(calc(n, x))

def calc(n, x):
    if n == 0:
        return 1
    sum = 0
    x -= 1
    length = length_func(n - 1)
    p = p_func(n - 1)
    if x > 0:
        if length <= x:
            sum += p
        else:
            sum += calc(n - 1, x)
        x -= length
    if x > 0:
        x -= 1
        sum += 1
    if x > 0:
        if length <= x:
            sum += p
        else:
            sum += calc(n - 1, x)

    return sum

def length_func(n):
    return 1 + 4 * (2 ** n - 1)

def p_func(n):
    return 1 + 2 * (2 ** n - 1)

if __name__ == "__main__":
    main()
```

Note:
1. In Python, we do not need to write a separate "Scanner" class, as input can be read directly using the `input()` function which reads a line from input, converting it to an integer with `int()` where needed.
2. In the Python version, the `calc`, `length_func`, and `p_func` functions are equivalent to the `calc`, `length` and `p` methods in Java, with some minor syntax changes to accommodate Python's conventions.
3. I used `2 ** n` instead of `Math.pow(2, n)` for exponentiation to calculate powers of 2.
4. Python handles big integers by default, so there's no need to use `long` for large integer values as in Java.
5. `main` is defined as a function in Python and is called within a conditional check to ensure it only runs when the script is the main program being executed. This is a common Python idiom for creating scripts that can also be imported as modules.
