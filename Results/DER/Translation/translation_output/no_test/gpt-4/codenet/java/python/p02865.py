Here's the Java code converted to Python:

```python
import sys

class Reader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = None
        self.bufidx = -1
    
    def close(self):
        pass
    
    def read_buf(self):
        if self.bufidx == -1 or self.bufidx == len(self.buf):
            self.buf = self.stream.readline().split()
            self.bufidx = 0

    def s(self):
        self.read_buf()
        result = self.buf[self.bufidx]
        self.bufidx += 1
        return result

    def i(self):
        return int(self.s())

    def l(self):
        return int(self.s())

    def d(self):
        return float(self.s())

    def sa(self):
        self.read_buf()
        if self.bufidx != 0:
            raise RuntimeError("illegal read")
        self.bufidx = -1
        return self.buf

    def ia(self):
        return [int(x) for x in self.sa()]

    def la(self):
        return [int(x) for x in self.sa()]

    def da(self):
        return [float(x) for x in self.sa()]

    def im(self, N):
        return [self.ia() for _ in range(N)]

    def lm(self, N):
        return [self.la() for _ in range(N)]

    def dm(self, N):
        return [self.da() for _ in range(N)]

if __name__ == '__main__':
    with Reader(sys.stdin) as r:
        N = r.i()
        print((N - 1) // 2)
```

Here's a brief explanation of the changes made:

1. Class declaration: Python class syntax is used, and there's no need to explicitly inherit from `object` since it's the default in Python 3.
2. The `Reader` class: The constructor (__init__) receives a stream (stdin). The methods use Python's built-in functions to parse integers (`int`) and floating points (`float`).
3. The main block: A `Reader` is instantiated with `sys.stdin` and is used within a context manager block.
4. The function calls: They were replaced with Python print statements.
5. Division: `/` in Java performs integer division if both operands are integers. In Python, `//` is used for integer division.
6. Implementing `AutoCloseable`: Python does not have an interface comparable to Java's AutoCloseable. Instead, Python uses context managers via `__enter__` and `__exit__` methods. For this example, the `close` method is added but does nothing since `sys.stdin` should not be closed by the script.
7. Exception handling: All `IOExceptions` in the Java code are removed since Python file reading typically does not require explicit exception handling for I/O errors unless specific error processing is needed. Python raises IOError or OSError when an input/output operation fails.
8. Input reading: Python reads lines from stdin and splits them into lists without specifying a delimiter, as whitespace is the default delimiter.

Changes specific to the translation to Python3 conventions (such as default object inheritance and exception handling) have been made. It's also important to note that unlike Java's strict typing system, Python is dynamically typed, so there is no need to declare variable types.
