import sys

class FastScanner:
    def __init__(self):
        self.buffer = []
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buffer = sys.stdin.buffer.read(1024)
            self.buflen = len(self.buffer)
            if self.buflen <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            return self.buffer[self.ptr]
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c and c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise Exception("No more tokens")
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return "".join(sb)

    def nextLong(self):
        if not self.hasNext():
            raise Exception("No more tokens")
        n = 0
        minus = False
        b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        if not (ord('0') <= b and b <= ord('9')):
            raise Exception("illegal number")
        while True:
            if ord('0') <= b and b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise Exception("illegal number")
            b = self.readByte()

    def nextInt(self):
        return int(self.nextLong())

    def nextDouble(self):
        return float(self.next())

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

class Solver:
    def __init__(self, sc, writer):
        self.sc = sc
        self.writer = writer

    def run(self):
        a = self.sc.nextLong()
        b = self.sc.nextLong()
        c = self.sc.nextLong()
        d = c - a - b
        if d > 0 and 4 * a * b < d * d:
            self.writer.write("Yes\n")
        else:
            self.writer.write("No\n")

if __name__ == "__main__":
    sc = FastScanner()
    writer = sys.stdout
    solver = Solver(sc, writer)
    solver.run()
    writer.flush()