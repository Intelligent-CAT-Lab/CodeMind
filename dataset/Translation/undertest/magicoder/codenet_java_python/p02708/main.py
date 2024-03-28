import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.buf = bytearray(sys.stdin.read(1024))
        self.l = 0
        self.r = 0

    def read(self):
        if self.l == self.r:
            self.l = 0
            self.r = self.inp.readinto(self.buf)
        return self.buf[self.l] if self.l < self.r else -1

    def has_next(self):
        while self.l < self.r and not self.buf[self.l].isprintable():
            self.l += 1
        return self.l < self.r

    def next(self):
        if not self.has_next():
            raise StopIteration
        s = []
        while self.l < self.r and self.buf[self.l].isprintable():
            s.append(self.buf[self.l])
            self.l += 1
        return "".join(s)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())


MOD = 1000000007


def pow(l, i):
    if i == 0:
        return 1
    else:
        if i % 2 == 0:
            val = pow(l, i // 2)
            return val * val % 2019
        else:
            return pow(l, i - 1) * l % 2019


def main():
    fs = FastScanner()
    n = fs.next_int()
    k = fs.next_int()
    ans = 0
    for i in range(k, n + 2):
        f = i * (i - 1) // 2
        l = (n * 2 - i + 1) * i // 2
        add = l - f + 1
        ans = (ans + add) % MOD
    print(ans)


if __name__ == "__main__":
    main()