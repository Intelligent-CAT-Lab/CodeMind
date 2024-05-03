Here is the Python translation of the Java code:

```python
import sys

class FastIO:
    def __init__(self, input_stream=sys.stdin, output_stream=sys.stdout):
        self.input_stream = input_stream
        self.output_stream = output_stream
        self.cache = []

    def read_int(self):
        sign = 1
        while True:
            ch = self.input_stream.read(1)
            if ch.isdigit():
                break
            elif ch == '-':
                sign = -1
        num = 0
        while ch.isdigit():
            num = num * 10 + int(ch)
            ch = self.input_stream.read(1)
        return sign * num

    def read_line(self):
        return self.input_stream.readline().strip()

    def write(self, text):
        self.cache.append(text)

    def flush(self):
        self.output_stream.write(''.join(self.cache))
        self.output_stream.flush()
        self.cache = []

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
        self.data[self.build_last] = ord(c)

    def visit(self, c, trace):
        while trace >= 0 and self.data[trace + 1] != ord(c):
            trace = self.fail[trace]
        return trace

class Task:
    def __init__(self, io, debug):
        self.io = io
        self.debug = debug
        self.inf = 10**8
        self.l
