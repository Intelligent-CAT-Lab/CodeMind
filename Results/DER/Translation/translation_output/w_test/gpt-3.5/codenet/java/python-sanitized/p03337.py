import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray()
        self.curChar = 0
        self.numChars = 0

    def read(self):
        while self.curChar >= self.numChars:
            self.curChar = 0
            self.numChars = self.stream.readinto(self.buf)
            if self.numChars == 0:
                return -1
        self.curChar += 1
        return self.buf[self.curChar - 1]

    def nextInt(self):
        c = self.read()
        while c != -1 and c != 45 and (c < 48 or c > 57):
            c = self.read()
        if c == -1:
            raise ValueError("Unexpected EOF while reading integers.")
        sgn = -1 if c == 45 else 1
        if sgn == -1:
            c = self.read()
        res = 0
        while 48 <= c <= 57:
            res = res * 10 + c - 48
            c = self.read()
        return res * sgn

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream

    def println(self, value):
        self.stream.write(str(value) + '\n')

def solve():
    in_stream = sys.stdin.buffer
    out_stream = sys.stdout.buffer

    in_reader = InputReader(in_stream)
    out_writer = OutputWriter(out_stream)

    a = in_reader.nextInt()
    b = in_reader.nextInt()
    
    out_writer.println(max(a + b, a - b, a * b))

solve()