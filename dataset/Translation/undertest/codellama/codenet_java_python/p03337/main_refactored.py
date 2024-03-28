class main:
    import sys
    
    class InputReader:
        def __init__(self, stream):
            self.stream = stream
            self.buf = bytearray(1024)
            self.cur_char = 0
            self.num_chars = -1
            self.filter = None
    
        def read(self):
            if self.num_chars == -1:
                raise InputMismatchException()
            if self.cur_char >= self.num_chars:
                self.cur_char = 0
                try:
                    self.num_chars = self.stream.read(self.buf)
                except IOError:
                    raise InputMismatchException()
                if self.num_chars <= 0:
                    return -1
            return self.buf[self.cur_char++]
    
        def next_int(self):
            c = self.read()
            while self.is_space_char(c):
                c = self.read()
            sgn = 1
            if c == '-':
                sgn = -1
                c = self.read()
            res = 0
            while not self.is_space_char(c):
                if c < '0' or c > '9':
                    raise InputMismatchException()
                res *= 10
                res += c - '0'
                c = self.read()
            return res * sgn
    
        def is_space_char(self, c):
            if self.filter is not None:
                return self.filter.is_space_char(c)
            return self.is_whitespace(c)
    
        def is_whitespace(c):
            return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1
    
    class OutputWriter:
        def __init__(self, output_stream):
            self.writer = PrintWriter(BufferedWriter(OutputStreamWriter(output_stream)))
    
        def close(self):
            self.writer.close()
    
        def println(self, i):
            self.writer.println(i)
    
    class TaskA:
        def solve(self, test_number, in, out):
            a = in.next_int()
            b = in.next_int()
            out.println(max(max(a + b, a - b), a * b))
    
    if __name__ == '__main__':
        input_stream = sys.stdin
        output_stream = sys.stdout
        in = InputReader(input_stream)
        out = OutputWriter(output_stream)
        solver = TaskA()
        solver.solve(1, in, out)
        out.close()