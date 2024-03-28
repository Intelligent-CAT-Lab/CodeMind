Certainly! Here is the equivalent code in Python:

```python
import sys

class FastScanner:
    def __init__(self):
        self._iterator = iter(sys.stdin.read().split())

    def next(self):
        return next(self._iterator)

    def next_int(self):
        return int(self.next())

    def read_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long(self):
        return int(self.next())

if __name__ == '__main__':
    fs = FastScanner()
    x = fs.next_int()
    print("Yes" if x >= 30 else "No")
```

In the Python version, I have assumed that each input will be separated by whitespace and that all the input will be given at once, as `sys.stdin.read()` reads the entire input until EOF.

A sample test case in Python code to test the above input would be:

```python
import io

# Mock input for testing
mock_input = "25\n"
sys.stdin = io.StringIO(mock_input)

if __name__ == '__main__':
    fs = FastScanner()
    x = fs.next_int()
    print("Yes" if x >= 30 else "No")
    sys.stdin = sys.__stdin__
```

Running the above Python code with '25' as the input will produce the output "No", as expected. Please note that the `FastScanner` class is a re-implementation adjusted for Python's standard input handling. This approach uses iterators to simulate tokenizer functionality.
