import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.buf = self.inp.read(1024)
        self.cur = 0
        self.size = 0

    def has_next(self):
        while self.cur < self.size and not self.buf[self.cur].isprintable():
            self.cur += 1
        return self.cur < self.size

    def read(self):
        if self.cur == self.size:
            self.cur = 0
            self.size = self.inp.readinto(self.buf)
        return self.buf[self.cur]

    def next(self):
        if not self.has_next():
            raise StopIteration
        s = []
        while self.has_next():
            s.append(self.read())
            if not s[-1].isprintable():
                break
        return "".join(s)

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_long(self):
        return int(self.next())


def main():
    scanner = FastScanner()
    a = scanner.next_int()
    b = scanner.next_int()
    c = scanner.next_int()

    i = a + b == c
    j = a + c == b
    k = b + c == a

    if i or j or k:
        print("Yes")
    else:
        print("No")


if __name__ == "__main__":
    main()