Below is the Python translation of the given Java code:

```python
import sys
import time

startTime = time.time()

def main():
    A = int(input())
    B = int(input())
    i = B + 1
    while True:
        if (i & 0xFF) == 0 and (time.time() - startTime) > 3.5:
            break
        ca = i // A + i % A
        remb = i % B
        cb = i // B + remb // A + remb % A
        if ca < cb:
            print(i)
            return
        i += 1
    print(-1)

if __name__ == "__main__":
    main()
```

Some important notes about the differences between Java and Python that I accounted for here:

1. In Python, we don't typically declare the types of variables, as it is a dynamically typed language.
2. The `Scanner` class and its methods are replaced with Python's built-in `input()` function.
3. Python's integer division is done with `//` instead of `/`, which always results in floating-point division in Python.
4. Python does not have a built-in millisecond-level timer like `System.currentTimeMillis()`. Instead, we use `time.time()`, which returns the current time in seconds since the epoch as a floating-point number.
5. Instead of `System.out.println()`, Python uses the `print()` function for standard output.
6. In Python, indentation is used to denote code blocks, so there is no need for curly braces `{}`.
7. A `while True:` loop is used in place of the Java infinite loop with an empty condition `for (long i = B + 1; ; i++)`.
8. Python does not have specific formal class structures and `public` methods for simple scripts, especially when translating a standalone Java `main` method, so we define a `main` function and check the `__name__` attribute. If the script is being executed (as opposed to being imported), we call the `main` function.
