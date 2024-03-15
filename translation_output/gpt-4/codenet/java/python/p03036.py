Here's the translated code from Java to Python:

```python
import sys

class BAlgae:
    def solve(self, testNumber, r, d, x):
        for i in range(10):
            x = r * x - d
            print(x)

if __name__ == "__main__":
    r, d, x = map(int, sys.stdin.readline().split())
    solver = BAlgae()
    solver.solve(1, r, d, x)
```

In this Python translation, I've made a few adjustments according to Python conventions:

1. There's no need for classes to handle input and output. Instead, I'm reading directly from `sys.stdin` and writing using the `print` function. To read multiple values on one line, `map` is used.
2. The `solve` method now directly takes the input values `r`, `d`, and `x` as arguments instead of an `InputReader` object.
3. All classes and methods not related to the problem logic itself have been removed, as they are not necessary in Python due to its built-in functions for input/output handling.

This Python code assumes that the input will be provided in a single line with `r`, `d`, and `x` being space-separated integers, similar to how an `InputReader` would parse the input in the Java program.
