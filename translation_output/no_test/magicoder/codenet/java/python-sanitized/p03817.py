import sys

class Scanner:
    def __init__(self, inp):
        self.inp = inp
        self.buf = bytearray(inp.read(8192))
        self.l = len(self.buf)
        self.i = 0

    def read(self):
        if self.i == self.l:
            self.i = 0
            self.l = self.inp.readinto(self.buf)
        if self.l == 0:
            return -1
        return self.buf[self.i]

    def has_next(self):
        while self.i < self.l and not self.buf[self.i].isprintable():
            self.i += 1
        return self.i < self.l

    def next_long(self):
        if not self.has_next():
            raise EOFError
        b = self.read()
        if b == -1:
            raise EOFError
        minus = False
        if b == ord('-'):
            minus = True
            b = self.read()
        if not (ord('0') <= b <= ord('9')):
            raise ValueError
        n = b - ord('0')
        while True:
            b = self.read()
            if b == -1 or not self.buf[b].isprintable():
                return -n if minus else n
            if not (ord('0') <= b <= ord('9')):
                raise ValueError
            n *= 10
            n += b - ord('0')

def main():
    sc = Scanner(sys.stdin.buffer)
    x = sc.next_long()
    ans = x // 11 * 2 + x % 11 // 7 + min(x % 11, 1)
    print(ans)

if __name__ == '__main__':
    main()