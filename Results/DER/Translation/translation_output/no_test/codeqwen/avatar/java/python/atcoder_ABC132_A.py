Here is the Python equivalent of the Java code:

```python
import sys

class FastScanner:
    def __init__(self, inp):
        self.reader = inp.readline
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer:
            self.tokenizer = self.reader().split()
        return self.tokenizer.pop(0)

    def next_line(self):
        if self.tokenizer is None or not self.tokenizer:
            return self.reader()
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
    chars = set(s.split())
    if len(chars) == 2:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

Please note that in Python, we don't have a built-in `HashSet` class like in Java. Instead, we use the built-in `set` class. Also, Python doesn't have a built-in `StringTokenizer` class like in Java. Instead, we use the `split` method to split a string into a list of substrings.
