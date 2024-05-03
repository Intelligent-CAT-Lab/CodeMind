Here is the Python equivalent of the Java code you provided:

```python
import sys
from io import StringIO

class LightScanner:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.tokenizer = None

    def string(self):
        if self.tokenizer is None or not self.tokenizer.has_more_tokens():
            self.tokenizer = StringIO(self.input_stream.readline()).readline().split()
        return self.tokenizer.pop(0)

    def bigints(self):
        return int(self.string())

class LightWriter:
    def __init__(self, output_stream):
        self.output_stream = output_stream
        self.autoflush = False
        self.breaked = True

    def print(self, c):
        self.output_stream.write(c)
        self.breaked = False
        return self

    def print(self, s):
        self.output_stream.write(s)
        self.breaked = False
        return self

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        return self.print(s)

    def ansln(self, *n):
        for n1 in n:
            self.ans(n1).ln()
        return self

    def ln(self):
        self.print('\n')
        self.breaked = True
        if self.autoflush:
            self.output_stream.flush()
        return self

    def close(self):
        self.output_stream.close()

class NTL_2_A:
    def solve(self, test_number, in_, out):
        out.ansln(str(in_.bigints() + in_.bigints()))

def main():
    in_ = LightScanner(sys.stdin)
    out = LightWriter(sys.stdout)
    solver = NTL_2_A()
    solver.solve(1, in_, out)
    out.close()

if __name__ == '__main__':
    main
