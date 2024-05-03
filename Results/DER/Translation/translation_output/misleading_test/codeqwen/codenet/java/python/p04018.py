Here is the Python translation of the Java code:

```python
import sys

class KMPAutomaton:
    def __init__(self, cap):
        self.data = [0] * (cap + 2)
        self.fail = [0] * (cap + 2)
        self.fail[0] = -1
        self.build_last = 0
        self.length = cap

    def build(self, c):
        self.build_last += 1
        self.fail[self.build_last] = self.visit(c, self.fail[self.build_last - 1]) + 1
        self.data[self.build_last] = c

    def visit(self, c, trace):
        while trace >= 0 and self.data[trace + 1] != c:
            trace = self.fail[trace]
        return trace

    def match(self, c):
        self.match_last = self.visit(c, self.match_last) + 1

    def is_match(self):
        return self.match_last == self.length

    def length(self):
        return self.length

    def begin_match(self):
        self.match_last = 0

class FastIO:
    def __init__(self, input_stream=sys.stdin, output_stream=sys.stdout):
        self.cache = []
        self.input_stream = input_stream
        self.output_stream = output_stream
        self.charset = 'ascii'

    def read(self):
        while not self.cache:
            self.cache = list(self.input_stream.read(1))
            if not self.cache:
                return -1
        return ord(self.cache.pop(0))

    def skip_blank(self):
        while self.next >= 0 and self.next <= 32:
            self.next = self.read()

    def read_int(self):
        sign = 1

        self.skip_blank()
        if self.next == '+' or self.next == '-':
            sign = 1 if self.next
