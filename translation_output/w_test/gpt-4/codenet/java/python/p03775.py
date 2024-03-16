Here is the Java code translated to Python:

```python
import sys
import math

def main():
    n = int(input())
    atcoder = AtCoder(n)
    result = atcoder.solve()
    print(result)

class AtCoder:
    def __init__(self, n):
        self.N = n

    def solve(self):
        sqrt = int(math.sqrt(self.N))
        for i in range(sqrt, 0, -1):
            if self.N % i == 0:
                a_length = len(str(i))
                b_length = len(str(self.N // i))
                return max(a_length, b_length)


if __name__ == "__main__":
    main()
```

This solution translates the I/O handling, the calculation logic, and removes the utility classes and methods which are not required in the Python translation. Note that I've removed the `FastScanner` class and its methods, as Python has built-in functions `input()` and `int()` for reading input from stdin, making it unnecessary in the translated code.

To use this Python program with the test input provided, simply execute the script and type `10000` when prompted, and it should output the expected `3`.
