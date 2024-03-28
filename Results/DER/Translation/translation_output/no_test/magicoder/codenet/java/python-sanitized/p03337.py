import sys

class InputReader:
    def __init__(self, input_stream):
        self.stream = input_stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == -1:
            raise ValueError()
        if self.curChar >= self.numChars:
            self.curChar = 0
            num_chars = self.stream.readinto(self.buf)
            if num_chars <= 0:
                return -1
            self.numChars = num_chars
        return self.buf[self.curChar]

    def next_int(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        sgn = 1
        if c == ord('-'):
            sgn = -1
            c = self.read()
        res = 0
        while True:
            if c < ord('0') or c > ord('9'):
                raise ValueError()
            res *= 10
            res += c - ord('0')
            c = self.read()
            if not self.is_space_char(c):
                break
        return res * sgn

    def is_space_char(self, c):
        return c == ord(' ') or c == ord('\n') or c == ord('\r') or c == ord('\t') or c == -1

class OutputWriter:
    def __init__(self, output_stream):
        self.writer = output_stream

    def close(self):
        self.writer.close()

    def println(self, i):
        self.writer.write(str(i) + '\n')

class TaskA:
    def solve(self, test_number, in_reader, out_writer):
        a = in_reader.next_int()
        b = in_reader.next_int()
        out_writer.println(max(a + b, a - b, a * b))

def main():
    in_reader = InputReader(sys.stdin)
    out_writer = OutputWriter(sys.stdout)
    solver = TaskA()
    solver.solve(1, in_reader, out_writer)
    out_writer.close()

if __name__ == "__main__":
    main()