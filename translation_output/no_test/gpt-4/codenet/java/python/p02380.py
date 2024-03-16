Here's the equivalent code in Python:

```python
import math

class P02380:
    def run(self):
        a = float(input())
        b = float(input())
        cc = float(input())
        cc = math.radians(cc)

        s = a * b * math.sin(cc) / 2.0
        l = a + b + math.sqrt(a**2 + b**2 - 2.0 * a * b * math.cos(cc))
        h = b * math.sin(cc)

        print(s)
        print(l)
        print(h)

if __name__ == "__main__":
    p = P02380()
    p.run()
```

In the translation, I have made the following changes:
- Omitted `InputStream` and `PrintStream` objects, instead directly using `input()` and `print()` functions in Python for console input and output.
- Changed the class and method definitions to use Python's syntax and naming conventions.
- Replaced `System.out` with `print()`, which is Python's built-in function for output.
- Replaced `System.in` with `input()`, which is Python's built-in function for input. Note that `input()` reads a string from standard input, so we need to convert it to a float with `float()` since we're working with floating-point numbers.
- Used `math.radians` to convert degrees to radians and `math.sin` and `math.cos` for trigonometric functions, equivalent to `Math.toRadians`, `Math.sin`, and `Math.cos` in Java.
- Removed type declarations (`double`), as Python is dynamically typed.
- Numbers with decimals are automatically treated as floats in Python.
- Removed the `Scanner` object and the `sc.close()` call, as they are not necessary in Python.
- Changed the class name to conform to Python naming conventions (`P02380` instead of `p02380`).
- Removed the `main` method, as Python's entry point is determined by `if __name__ == "__main__":`, which is the idiomatic way to invoke the main function in a Python module.
