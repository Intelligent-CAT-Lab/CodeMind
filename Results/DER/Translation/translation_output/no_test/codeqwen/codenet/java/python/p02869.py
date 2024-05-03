```python
import sys

class FastScanner:
    def __init__(self, inp):
        self.reader = inp.readline
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer.has_more_tokens():
            try:
                self.tokenizer = self.reader().split()
            except Exception as e:
                raise RuntimeError(e)
        return self.tokenizer.pop(0)

    def next_line(self):
        if self.tokenizer is None or not self.tokenizer.has_more_tokens():
            try:
                return self.reader().strip()
            except Exception as e:
                raise RuntimeError(e)
        return self.tokenizer.pop(0)

    def next_long(self):
        return int(self.next())

    def next_int(self):
        return int(self.next())

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_int_array_with_delta(self, n, delta):
        return [self.next_int() + delta for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

def write_lines(as_):
    sys.stdout.write('\n'.join(map(str, as_)))
    sys.stdout.flush()

def write_lines(as_):
    sys.stdout.write('\n'.join(map(str, as_)))
    sys.stdout.flush()

def write_single_line(as_):
    sys.stdout.write(' '.join(map(str, as_)))
    sys.stdout.write('\n')
    sys.stdout.flush()

def max_(*args):
    return max(args)

def min_(*args):
    return min(args)

def debug(*args):
    print(' '.join(map(str, args)), file=sys.stderr)


