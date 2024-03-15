Below is the translated Python code from the given Java code.

```python
import sys

class FastReader:
    def __init__(self):
        self.input_stream = sys.stdin

    def next(self):
        while True:
            self.st = input().split()
            for token in self.st:
                return token

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        try:
            return self.input_stream.readline().strip()
        except Exception as e:
            raise e

if __name__ == "__main__":
    sc = FastReader()
    k = sc.next_int() - 1
    b = sc.next_int() - 1

    print(k * b)
    sys.stdout.flush()
```

Please note the differences between the Python and Java versions:

1. In Python, `print` automatically flushes the stream, given that the `flush` parameter is set to `True`. By default it's `False`, but it's set to `True` if the program is run from a terminal, so explicit use of `sys.stdout.flush()` is often not necessary after `print`.

2. The method `next` in the Python version mimics `StringTokenizer` behavior in Java but is not strictly necessary in Python. Instead, you can use `input().split()` method directly to read and split input where needed.

3. Since Python does not have static typing, the casting methods such as `nextInt()`, `nextLong()`, and `nextDouble()` are merely calling the appropriate constructor for the desired type.

4. `FastReader` class methods are named with Python conventions (`next_int`, `next_long`, `next_double`, `next_line`) and are idiomatic to Python.

5. There's no need for an explicit `PrintWriter` class in Python as input and output are easily handled by `print` for console output and `input` or handling `sys.stdin` directly for console input.
