```python
import sys

class FastScanner:
    def __init__(self, in_stream):
        self.reader = in_stream
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            self.tokenizer = iter(next(self.reader).split())
        return next(self.tokenizer)

    def next_line(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            return next(self.reader)
        return next(self.tokenizer, '\n')

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_array_int(self, n):
        return [self.next_int() for _ in range(n)]

    def next_array_long(self, n):
        return [self.next_long() for _ in range(n)]

if __name__ == "__main__":
    sc = FastScanner(sys.stdin)
    s = sc.next()
    chars = set(s.split(" "))
    if len(chars) == 2:
        print("Yes")
    else:
        print("No")
```
