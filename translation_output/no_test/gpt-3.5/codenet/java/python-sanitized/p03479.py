import sys
import math

class p03479:
    def __init__(self):
        self.INPUT = sys.stdin.read()
        self.is_space_char = lambda c: not (c >= 33 and c <= 126)
    
    def solve(self):
        x, y = self.nl(), self.nl()
        ans = 0
        for i in range(x, y+1, x):
            ans += 1
        print(ans)

    def run(self):
        if not self.INPUT:
            self.INPUT = sys.stdin.read()

        self.solve()

    def read_byte(self):
        if self.lenbuf == -1:
            raise Exception

        if self.ptrbuf >= self.lenbuf:
            self.ptrbuf = 0
            try:
                self.lenbuf = sys.stdin.buffer.readinto(self.inbuf)
            except IOError:
                raise Exception

            if self.lenbuf <= 0:
                return -1

        return self.inbuf[self.ptrbuf]

    def is_space_char(self, c):
        return not (c >= 33 and c <= 126)

    def skip(self):
        b = self.read_byte()
        while b != -1 and self.is_space_char(b):
            b = self.read_byte()
        return b

    def nd(self):
        return float(self.ns())

    def nc(self):
        return chr(self.skip())

    def ns(self):
        b = self.skip()
        sb = ""
        while not self.is_space_char(b):
            sb += chr(b)
            b = self.read_byte()
        return sb

    def ns_n(self, n):
        buf = []
        p = 0
        b = self.skip()
        while p < n and not self.is_space_char(b):
            buf.append(chr(b))
            p += 1
            b = self.read_byte()
        return buf if n == p else buf[:p]

    def nm(self, n, m):
        map = []
        for i in range(n):
            map.append(self.ns_n(m))
        return map

    def na(self, n):
        return [self.ni() for _ in range(n)]

    def ni(self):
        num = 0
        b = self.read_byte()
        minus = False
        while b != -1 and not ((b >= 48 and b <= 57) or b == 45):
            b = self.read_byte()

        if b == 45:
            minus = True
            b = self.read_byte()

        while True:
            if b >= 48 and b <= 57:
                num = num * 10 + (b - 48)
            else:
                return -num if minus else num

            b = self.read_byte()

    def nl(self):
        num = 0
        b = self.read_byte()
        minus = False
        while b != -1 and not ((b >= 48 and b <= 57) or b == 45):
            b = self.read_byte()

        if b == 45:
            minus = True
            b = self.read_byte()

        while True:
            if b >= 48 and b <= 57:
                num = num * 10 + (b - 48)
            else:
                return -num if minus else num

            b = self.read_byte()

if __name__ == "__main__":
    p = p03479()
    p.run()