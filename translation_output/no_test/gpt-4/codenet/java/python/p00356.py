Here is the translated code from Java to Python:

```python
def p00356():
    x = int(input())
    y = int(input())
    a = x
    b = y
    while x % y != 0:
        z = x
        x = y
        y = z % y
    m = a + b - y

    if a % 2 == 0 or b % 2 == 0 or a == b or (a % 2 > 0 and b % 2 > 0):
        print(m + 1)
    else:
        print(m)

if __name__ == "__main__":
    p00356()
```

When translating from Java to Python, keep in mind the following differences that were considered in this translation:

- In Python, there is no need to import `Scanner` or any other class to read input from the console. You can use the built-in function `input()` to read from stdin. The `input()` function reads a line as a string, so it should be cast to `int` for numeric processing.
- The class and method declarations were removed; Python does not require an explicit `main` method or class encapsulation for simple scripts.
- Instead of `System.out.println()`, the `print()` function is used in Python to output to the console.
- The `if __name__ == "__main__":` block is used to ensure that the code runs only if the script is executed as the main program and not imported as a module.
- Python uses indentation for blocks instead of braces `{}`.
- Variable declaration and initialization are more straightforward in Python, as types are dynamically inferred.

