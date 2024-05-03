Here is the Python equivalent of the Java code you provided:

```python
import sys

class p03337:
    def main(self):
        input_stream = sys.stdin
        output_stream = sys.stdout
        inp = InputReader(input_stream)
        out = OutputWriter(output_stream)
        solver = TaskA()
        solver.solve(1, inp, out)
        out.close()

class TaskA:
    def solve(self, test_number, inp, out):
        a = inp.next_int()
        b = inp.next_int()
        out.println(max(max(a + b, a - b), a * b))

class OutputWriter:
    def __init__(self, output_stream):
        self.writer = output_stream

    def close(self):
        self.writer.close()

    def println(self, i):
        self.writer.write(str(i) + '\n')

class InputReader:
    def __init__(self, input_stream):
        self.stream = input_stream
        self.buf = bytearray(1024)
        self.cur_char = 0
        self.num_chars = 0
        self.filter = None

    def read(self):
        if self.num_chars == -1:
            raise ValueError("Input stream has ended")
        if self.cur_char >= self.num_chars:
            self.cur_char = 0
            try:
                self.num_chars = self.stream.readinto(self.buf)
            except IOError:
                raise ValueError("Input stream has ended")
            if self.num_chars <= 0:
                return -1
        return self.buf[self.cur_char]

    def next_int(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        sgn = 1
        if c == ord('-'):
            sgn = -1
            c = self.read()
        res = 0
        
