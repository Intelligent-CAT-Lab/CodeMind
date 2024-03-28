import math

class FastScanner:

    def __init__(self, stream):
        self.in_stream = stream
        self.buffer = bytearray()
        self.length = 0
        self.p = 0

    def has_next_byte(self):
        if self.p < self.length:
            return True
        else:
            self.p = 0
            try:
                self.length = self.in_stream.readinto(self.buffer)
            except Exception as e:
                e.args = (e.args,)
                raise
            if self.length <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte():
            self.p += 1
            return self.buffer[self.p - 1]
        return -1

    def is_printable(self, n):
        return 33 <= n <= 126

    def skip(self):
        while self.has_next_byte() and not self.is_printable(self.buffer[self.p]):
            self.p += 1

    def has_next(self):
        self.skip()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration()
        sb = bytearray()
        t = self.read_byte()
        while self.is_printable(t):
            sb.append(t)
            t = self.read_byte()
        return sb.decode()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())


def solve(in_stream, out_stream):

    a, b = map(float, in_stream.next().split())
    out_stream.write(str(4.0/3.0 * math.pi * b**3))


def main():
    in_stream = FastScanner(open(0))
    solve(in_stream, open(1, 'w'))


if __name__ == '__main__':
    main()