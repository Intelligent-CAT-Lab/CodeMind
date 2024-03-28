import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.buf = None
        self.pos = 0
        self.buflen = 0

    def next(self):
        if self.pos == self.buflen:
            self.pos = 0
            self.buflen = self.inp.readline().strip()
        if self.buflen == 0:
            raise EOFError
        return self.buf[self.pos]

    def next_int(self):
        return int(self.next())

    def next_line(self):
        return self.inp.readline().strip()


def main():
    scanner = FastScanner()
    n = scanner.next_int()
    k = scanner.next_int()
    print(1 if n <= k else 0)


if __name__ == "__main__":
    main()