from sys import stdin, stdout
from io import BytesIO, TextIOWrapper
from array import array
import os

class FastScanner:
    def __init__(self):
        self.input_buffer = BytesIO(os.read(0, os.fstat(0).st_size)).read
        self.token = ''
    
    def read_byte(self):
        while not self.token: 
            b = self.input_buffer(1)
            if not b: return -1
            self.token += b
        ret = self.token[0]
        self.token = self.token[1:]
        return ret
    
    def is_printable_char(self, c):
        return 33 <= c <= 126

    def has_next(self):
        while self.read_byte() != -1 and not self.is_printable_char(self.token[0]):
            self.token = self.token[1:]
        return bool(self.token)

    def next(self):
        if not self.has_next():
            raise ValueError('No more tokens available')
        res = []
        b = self.read_byte()
        while self.is_printable_char(b):
            res.append(chr(b))
            b = self.read_byte()
        return ''.join(res)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

class Solver:
    def __init__(self, sc, writer):
        self.sc = sc
        self.writer = writer

    def run(self):
        a = self.sc.next_long()
        b = self.sc.next_long()
        c = self.sc.next_long()
        d = c - a - b
        if d > 0 and 4 * a * b < d * d:
            self.writer.write("Yes\n")
        else:
            self.writer.write("No\n")

def main():
    sc = FastScanner()
    w = TextIOWrapper(BytesIO(), sys.stdout)
    solver = Solver(sc, w)
    solver.run()
    sys.stdout.flush()

if __name__ == '__main__':
    main()