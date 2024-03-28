import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.buf = self.inp.read(1024)
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

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_double_array(self, n):
        return [self.next_double() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

    def next_string_array(self, n):
        return [self.next() for _ in range(n)]

    def has_next(self):
        return self.has_next


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