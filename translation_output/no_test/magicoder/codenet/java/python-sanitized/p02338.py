import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.buf = inp.read(1024)
        self.cur = 0
        self.sep = b' '

    def read(self):
        while self.cur == len(self.buf):
            self.buf = self.inp.read(1024)
            self.cur = 0
        if not self.buf:
            return None
        while self.cur < len(self.buf) and not self.buf[self.cur].isprint():
            self.cur += 1
        if self.cur == len(self.buf):
            return None
        start = self.cur
        while self.cur < len(self.buf) and self.buf[self.cur].isprint():
            self.cur += 1
        return self.buf[start:self.cur]

    def next_int(self):
        return int(self.next())

    def next(self):
        while self.cur < len(self.buf) and self.buf[self.cur] == ord(' '):
            self.cur += 1
        if self.cur == len(self.buf):
            return None
        start = self.cur
        while self.cur < len(self.buf) and self.buf[self.cur] != ord(' '):
            self.cur += 1
        return self.buf[start:self.cur].decode()


def main():
    sc = FastScanner()
    n = sc.next_int()
    k = sc.next_int()

    if n <= k:
        print(1)
    else:
        print(0)


if __name__ == "__main__":
    main()