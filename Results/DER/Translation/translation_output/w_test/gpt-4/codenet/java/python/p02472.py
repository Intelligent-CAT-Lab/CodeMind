Here's the Python equivalent code for the given Java program:

```python
import sys

def main():
    a, b = map(int, input().split())
    ans = a + b
    print(ans)

if __name__ == "__main__":
    main()
```

To test this code using the given test input `5 8` and to retrieve the expected output `13`, you can simply run the Python script and provide the test input.

Please note that the Python code does not need classes like `LightScanner` or `LightWriter` used in the Java code, as Python has built-in functions for reading input and writing output. Similarly, the concept of `BigInteger` is intrinsic to Python's `int` type, as it can handle arbitrarily large integers without the need for a special class.
