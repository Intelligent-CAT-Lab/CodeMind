import sys
import io

class FastScanner:
    def __init__(self):
        self.stdin = sys.stdin.buffer
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        self.ptr = 0
        try:
            self.buflen = self.stdin.readinto(self.buffer)
        except IOError as e:
            raise e
        if self.buflen <= 0:
            return False
        return True

    def readByte(self):
        if self.hasNextByte():
            result = self.buffer[self.ptr]
            self.ptr += 1
            return result
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
            raise EOFError()
        b = self.readByte()
        sb = io.BytesIO()
        while self.isPrintableChar(b):
            sb.write(bytes((b,)))
            b = self.readByte()
        return sb.getvalue().decode('utf-8')

    def nextLong(self):
        if not self.hasNext():
            raise EOFError()
        n = 0
        minus = False
        b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        if b < ord('0') or b > ord('9'):
            raise ValueError()
        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError()
            b = self.readByte()

    def nextInt(self):
        return int(self.nextLong())


class Solver:
    def __init__(self):
        self.sc = FastScanner()

    def solve(self):
        x = self.sc.nextInt()
        y = self.sc.nextInt()
        z = self.sc.nextInt()
        print((x - z) // (y + z))
        sys.stdout.flush()


def main():
    solver = Solver()
    solver.solve()


if __name__ == "__main__":
    main()