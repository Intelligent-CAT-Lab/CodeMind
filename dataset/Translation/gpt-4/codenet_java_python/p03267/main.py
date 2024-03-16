import sys
import io
import os
from collections import defaultdict


DEBUG = False


class FastScanner:
    def __init__(self):
        self.stdin = sys.stdin
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buflen = self.stdin.buffer.readinto(self.buffer)
            if self.buflen <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            res = self.buffer[self.ptr]
            self.ptr += 1
            return res
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def skipUnprintable(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1

    def hasNext(self):
        self.skipUnprintable()
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise ValueError("No more input")
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return ''.join(sb)

    def nextLong(self):
        if not self.hasNext():
            raise ValueError("No more input")
        n = 0
        minus = False
        b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        if not (ord('0') <= b <= ord('9')):
            raise ValueError("Invalid input")
        while True:
            if ord('0') <= b <= ord('9'):
                n = n * 10 + b - ord('0')
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError("Invalid input")
            b = self.readByte()


class Solver:
    def __init__(self):
        self.sc = FastScanner()

    def solve(self):
        l = self.ni()
        l -= 1
        crt = 1
        edges = []
        num_node = 20
        while l >= 0 and crt < num_node:
            if l % 2 == 0:
                edges.append((crt, num_node, l))
                l -= 1
            else:
                l //= 2
                edges.append((crt, crt + 1, 0))
                edges.append((crt, crt + 1, l + 1))
                crt += 1
        print(num_node, len(edges))
        assert len(edges) <= 60
        assert crt <= num_node
        for edge in edges:
            print(*edge)

    def ni(self):
        return int(self.sc.nextLong())


def main(args):
    global DEBUG
    DEBUG = len(args) > 0 and args[0] == "-DEBUG"
    solver = Solver()
    solver.solve()
    sys.exit(0)


if __name__ == "__main__":
    main(sys.argv[1:])