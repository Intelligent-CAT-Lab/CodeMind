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

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_char_array(self, n, m):
        return [list(self.next()) for _ in range(n)]

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

class Out:
    def __init__(self):
        self.out = sys.stdout
        self.auto_flush = False

    def println(self, *a):
        joiner = ' '.join(map(str, a))
        self.out.write(joiner + '\n')
        if self.auto_flush:
            self.out.flush()

    def println_int_array(self, a):
        joiner = ' '.join(map(str, a))
        self.out.write(joiner + '\n')
        if self.auto_flush:
            self.out.flush()

    def println_long_array(self, a):
        joiner = ' '.join(map(str, a))
        self.out.write(joiner + '\n')
        if self.auto_flush:
            self.out.flush()

    def flush(self):
        self.out.flush()

class p02722:
    def solve(self):
        n = in.next_long()
        ans = 0
        prime_factors = get_prime_factors(n - 1)
        for p in range(2, int(n**0
