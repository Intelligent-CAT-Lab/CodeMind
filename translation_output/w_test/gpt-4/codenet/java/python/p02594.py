Below is the translated code from Java to Python:

```python
import sys

class FastScanner:
    def __init__(self):
        self.input_stream = sys.stdin
        self._load_next_line()

    def _load_next_line(self):
        try:
            self.line = self.input_stream.readline()
            self.tokens = self.line.strip().split()
            self.token_idx = 0
        except IOError as e:
            print(e)
            sys.exit(1)

    def next(self):
        while self.token_idx >= len(self.tokens):
            self._load_next_line()
        token = self.tokens[self.token_idx]
        self.token_idx += 1
        return token

    def next_int(self):
        return int(self.next())

    def read_array(self, n):
        a = []
        for _ in range(n):
            a.append(self.next_int())
        return a

    def next_long(self):
        return long(self.next())

# Usage example
fs = FastScanner()
x = fs.next_int()
if x >= 30:
    print("Yes")
else:
    print("No")
```

This code snippet provides an equivalent `FastScanner` class in Python and can be used to read input as in the Java example. Note that in Python, we don't need to explicitly construct a `StringTokenizer` object as we can simply use the `split` method to tokenize our input. Also, Python scripts usually do not need a surrounding class for the main code, we use the entire script as the main block. Additionally, Python uses indentation instead of braces to define code blocks.
