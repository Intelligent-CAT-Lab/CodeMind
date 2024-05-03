Here is the Python version of the provided Java code:

```python
import sys

class In:
    def __init__(self):
        self.reader = sys.stdin.readline
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            self.tokenizer = self.reader().split()
        return self.tokenizer.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextCharArray(self, n, m):
        return [list(self.next()) for _ in range(n)]

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextIntArray(self, n, op):
        return [op(self.nextInt()) for _ in range(n)]

    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

    def nextLongArray(self, n, op):
        return [op(self.nextLong()) for _ in range(n)]

class Out:
    def __init__(self):
        self.out = sys.stdout
        self.autoFlush = False

    def println(self, *a):
        joiner = ' '.join(map(str, a))
        self.out.write(joiner + '\n')
        if self.autoFlush:
            self.out.flush()

    def println(self, a):
        self.out.write(str(a) + '\n')
        if self.autoFlush:
            self.out.flush()

    def println(self, a):
        self.out.write(str(a) + '\n')
        if self.autoFlush:
            self.out.flush()

    def println(self, a):
        self.out.write(str(a) + '\n')
        if self.autoFlush:
            self.out.flush()

    def println(self, a):
        self.out.
