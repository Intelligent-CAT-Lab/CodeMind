Here is the Java code translated into Python:

```python
import sys

class FastScanner:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            line = next(self.reader)
            self.tokenizer = line.strip().split()
        return self.tokenizer.pop(0)

    def next_line(self):
        if self.tokenizer is None or not self.tokenizer:
            return next(self.reader).strip()
        return self.tokenizer.pop(0)

    def next_long(self):
        return int(self.next())

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]


def main():
    sc = FastScanner(sys.stdin)
    s = sc.next()
    unique_chars = set(s)
    if len(unique_chars) == 2:
        print("Yes")
    else:
        print("No")


if __name__ == '__main__':
    main()
```

Note that Python already has built-in functions to read input, so we don't need to manually create a FastScanner as in Java. Additionally, Python has dynamic types, so there's no need to specify return types.

In the `next_line` method, I've made an assumption on the desired behavior based on typical line reading in Python. The `sys.stdin` object should be an iterable where each iteration yields a line from the input stream.

The main change in the `main` function is that `s.split(" ")` was not needed in Java since the characters don't arrive separated by spaces. We just convert `s` into a set directly to get the unique characters.
