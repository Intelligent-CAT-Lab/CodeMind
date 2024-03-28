import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.buf = None
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.inp.read(16384)
            except EOFError:
                return False
            if self.buflen <= 0:
                return False
            return True

    def read_byte(self):
        if self.has_next_byte():
            return self.buf[self.ptr++]
        else:
            return -1

    def next(self):
        while True:
            b = self.read_byte()
            if b is None or not b.isprint():
                return self.next()
            return chr(b)

    def next_int(self):
        return int(self.next())


def solve(w: int, a: int, b: int):
    if a <= b and b <= a + w:
        return 0
    elif a <= b + w and b + w <= a + w:
        return 0
    elif a + w <= b:
        return b - a - w
    else:
        return a - b - w


def main():
    fsc = FastScanner()
    w = fsc.next_int()
    a = fsc.next_int()
    b = fsc.next_int()
    print(solve(w, a, b))


if __name__ == "__main__":
    main()