import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.buf = inp.read(1024)
        self.cur = 0
        self.has_next = True

    def next(self):
        while self.cur < len(self.buf) and not self.buf[self.cur].isprintable():
            self.cur += 1
        if self.cur == len(self.buf):
            self.cur = 0
            self.buf = self.inp.read(1024)
            if len(self.buf) == 0:
                self.has_next = False
                return ""
        res = ""
        while self.cur < len(self.buf) and self.buf[self.cur].isprintable():
            res += self.buf[self.cur]
            self.cur += 1
        return res

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_long(self):
        return long(self.next())

    def close(self):
        self.inp.close()


def main():
    fsc = FastScanner()
    w = fsc.next_int()
    a = fsc.next_int()
    b = fsc.next_int()
    fsc.close()
    if a <= b and b <= a + w:
        print(0)
    elif a <= b + w and b + w <= a + w:
        print(0)
    elif a + w <= b:
        print(b - a - w)
    else:
        print(a - b - w)


if __name__ == "__main__":
    main()