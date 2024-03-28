import sys

class Reader:
    def __init__(self, source=sys.stdin):
        self.instream = source
        self.buf = ''
        self.ptr = 0

    def read_next(self):
        while not self.buf or self.ptr == len(self.buf):
            self.buf = self.instream.readline()
            self.ptr = 0
        self.ptr += 1
        return self.buf[self.ptr - 1]

    def has_next(self):
        return self.ptr < len(self.buf)

    def read_int(self):
        return int(self.read_next())

sc = Reader()
out = sys.stdout

def main():
    a = sc.read_int()
    b = sc.read_int()
    c = sc.read_int()
    d = a + b
    e = -1
    for i in range(1000):
        if 0 <= (60*i+c) % d <= a:
            e = i
            break
    if e == -1:
        out.write(str(-1) + '\n')
    else:
        out.write(str(60*e+c) + '\n')
    out.flush()

if __name__ == '__main__':
    main()