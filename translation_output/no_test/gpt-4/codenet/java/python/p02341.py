Here is the Python version of the provided Java code:

```python
import sys
import io

class FastScanner:
    def __init__(self):
        self.reader = io.BytesIO(sys.stdin.buffer.read())
        self.buffer = self.reader.readline()

    def next(self):
        while self.buffer.isspace():
            self.buffer = self.reader.readline()
        start = 0
        while not self.buffer[start].isspace():
            start += 1
        s = self.buffer[:start].decode('utf-8')
        self.buffer = self.buffer[start+1:]
        return s

    def next_int(self):
        return int(self.next())

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

if __name__ == '__main__':
    sc = FastScanner()

    n = sc.next_int()
    k = sc.next_int()

    if n <= k:
        print(1)
    else:
        print(0)
```

Please note that this Python code uses `io.BytesIO` in combination with `sys.stdin.buffer.read()` to simulate the buffering behavior of Java's `InputStream` that's used in the `FastScanner` class. However, in a real-world Python scenario, simply reading from `sys.stdin` with a buffered reader or even just using `input()` would likely be sufficient for most cases, but this implementation tries to stick as closely as possible to the semantics of the original Java code.
