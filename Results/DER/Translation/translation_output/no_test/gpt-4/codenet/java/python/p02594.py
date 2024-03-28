Below is the translated code from Java to Python:

```python
import sys

class FastScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = []

    def next(self):
        while not self.st:
            line = self.br.readline()
            self.st = line.split()
        return self.st.pop(0)

    def next_int(self):
        return int(self.next())

    def read_array(self, n):
        arr = [self.next_int() for _ in range(n)]
        return arr

    def next_long(self):
        return int(self.next())

if __name__ == '__main__':
    fs = FastScanner()
    x = fs.next_int()
    if x >= 30:
        print("Yes")
    else:
        print("No")
```

Note that Python's standard input mechanism (`sys.stdin`) doesn't require the same kind of tokenization that is performed in the Java code, but the translated `FastScanner` class mimics the interface of the original Java version for educational purposes. Python's `input()` function can also be used for simpler input parsing needs.
