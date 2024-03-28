import sys
import io
import atexit


class FastScanner:
    def __init__(self):
        self.reader = io.BytesIO(sys.stdin.buffer.read())
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buflen = len(self.reader.readinto(self.buffer))
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
            raise ValueError("No more input!")
        b = self.readByte()
        sb = []
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return ''.join(sb)

    def nextLong(self):
        return int(self.next())


class Solver:
    def __init__(self):
        self.sc = FastScanner()
        self.out = sys.stdout
        self.err = sys.stderr

    def ns(self):
        return self.sc.next()

    def ns_list(self, n):
        return [self.ns() for _ in range(n)]

    def ns_2d(self, n, m):
        return [self.ns_list(m) for _ in range(n)]

    def ni(self):
        return int(self.sc.nextLong())

    def ni_list(self, n):
        return [self.ni() for _ in range(n)]

    def ni_2d(self, n, m):
        return [self.ni_list(m) for _ in range(n)]

    def nl(self):
        return self.sc.nextLong()

    def nl_list(self, n):
        return [self.nl() for _ in range(n)]

    def nl_2d(self, n, m):
        return [self.nl_list(m) for _ in range(n)]

    def prt(self, *a, end=' '):
        print(*a, end=end, file=self.out)

    def prtln(self, *a):
        if a:
            self.prt(*a, end='')
        print(file=self.out)

    def errprt(self, *a, end=' '):
        print(*a, end=end, file=self.err)

    def errprtln(self, *a):
        self.errprt(*a)
        print(file=self.err)

    def reply(self, b):
        self.prtln('Yes' if b else 'No')

    def REPLY(self, b):
        self.prtln('YES' if b else 'NO')

    def min(self, *a):
        return min(a)

    def max(self, *a):
        return max(a)

    def sum(self, *a):
        return sum(a)

    def abs(self, x):
        return abs(x)

    def round(self, x):
        return round(x)

    def floor(self, x):
        return int(x // 1)

    def ceil(self, x):
        return int(-(-x // 1))

    def sqrt(self, x):
        return x**0.5

    def pow(self, x, y):
        return x**y

    def gcd(self, a, b):
        while b:
            a, b = b, a % b
        return a

    def solve(self):
        a = self.ni()
        b = self.ni()
        self.prtln(self.max(a + b, a - b, a * b))


def main():
    solver = Solver()
    solver.solve()
    sys.stdout.flush()
    sys.stderr.flush()


if __name__ == "__main__":
    atexit.register(lambda: sys.stdout.flush())
    atexit.register(lambda: sys.stderr.flush())
    main()