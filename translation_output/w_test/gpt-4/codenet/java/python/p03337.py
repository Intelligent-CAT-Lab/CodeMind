Below is the translated version of the Java code into Python:

```python
import sys

class TaskA:
    def solve(self, testNumber, in_stream, out_stream):
        a = in_stream.read_int()
        b = in_stream.read_int()
        out_stream.write(str(max(a + b, a - b, a * b)) + "\n")


class InputReader:
    def __init__(self, input_stream):
        self.stream = input_stream

    def read(self):
        return self.stream.read(1)

    def read_int(self):
        c = self.read()
        while c.isspace():
            c = self.read()
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.read()
        res = 0
        while not c.isspace():
            if c < '0' or c > '9':
                raise ValueError("InputMismatchException")
            res = res * 10 + int(c) - int('0')
            c = self.read()
        return res * sgn


class OutputWriter:
    def __init__(self, output_stream):
        self.writer = output_stream

    def write(self, string):
        self.writer.write(string)

    def close(self):
        self.writer.close()


if __name__ == "__main__":
    in_stream = InputReader(sys.stdin)
    out_stream = OutputWriter(sys.stdout)
    solver = TaskA()
    solver.solve(1, in_stream, out_stream)
    out_stream.close()
```

To use this with a test case like `3 1`, ensure the input is provided via standard input (for example, you can pipe it in or type it when running the script), and the output will be written to standard output.

Please note that in Python, we do not necessarily need classes like `InputReader` and `OutputWriter`, since Python has built-in functions for I/O operations. However, the code provided above does a literal translation sticking to the original structure for educational purposes.
