import sys
from collections import deque

class FastScanner:
    def __init__(self):
        self.input_buffer = sys.stdin
        self.buffer = ""
        self.ptr = 0

    def hasNextByte(self):
        if self.ptr < len(self.buffer):
            return True
        else:
            self.ptr = 0
            self.buffer = self.input_buffer.read(1024)
            if not self.buffer:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            byte_read = self.buffer[self.ptr]
            self.ptr += 1
            return byte_read
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
            raise StopIteration
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return "".join(sb)

    def nextLong(self):
        if not self.hasNext():
            raise StopIteration
        n = 0
        minus = False
        b = self.readByte()
        if b == 45:  # ASCII value for '-'
            minus = True
            b = self.readByte()
        if b < 48 or b > 57:  # ASCII values for '0' to '9'
            raise ValueError
        while True:
            if 48 <= b <= 57:
                n *= 10
                n += b - 48
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError
            b = self.readByte()

class Solver:
    def __init__(self):
        self.sc = FastScanner()
    
    def solve(self):
        l = self.sc.nextLong()
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
            print(edge[0], edge[1], edge[2])

    def exit(self):
        pass

solver = Solver()
solver.solve()
solver.exit()