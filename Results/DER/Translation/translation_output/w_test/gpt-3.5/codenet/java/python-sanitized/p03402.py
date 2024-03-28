DEBUG = False

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
            try:
                self.buffer = input().strip().encode()
                self.buflen = len(self.buffer)
            except EOFError:
                pass
            if self.buflen <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            result = self.buffer[self.ptr]
            self.ptr += 1
            return result
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
            raise StopIteration()
        sb = bytearray()
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(b)
            b = self.readByte()
        return sb.decode()

    def nextLong(self):
        if not self.hasNext():
            raise StopIteration()
        n = 0
        minus = False
        b = self.readByte()
        if b == 45:  # '-'
            minus = True
            b = self.readByte()
        if b < 48 or b > 57:  # '0' & '9'
            raise ValueError()
        while True:
            if 48 <= b <= 57:  # '0' & '9'
                n *= 10
                n += b - 48
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError()
            b = self.readByte()

class Solver:
    def __init__(self):
        self.sc = FastScanner()

    def ns(self):
        return self.sc.next()

    def ns(self, n):
        return [self.ns() for _ in range(n)]

    def ns(self, n, m):
        return [self.ns(m) for _ in range(n)]

    def nc(self, n):
        a = self.ns()
        return [a[i] for i in range(len(a))]

    def nc(self, n, m):
        return [self.nc(m) for _ in range(n)]

    def nb(self, n, t):
        c = self.nc(n)
        return [c[i] == t for i in range(len(c))]

    def nb(self, n, m, t):
        return [self.nb(m, t) for _ in range(n)]

    def ni(self):
        return int(self.sc.nextLong())

    def ni(self, n):
        return [self.ni() for _ in range(n)]

    def ni(self, n, m):
        return [self.ni(m) for _ in range(n)]

    def nl(self):
        return self.sc.nextLong()

    def nl(self, n):
        return [self.nl() for _ in range(n)]

    def nl(self, n, m):
        return [self.nl(m) for _ in range(n)]

    def nd(self):
        return float(self.sc.next())

    def nd(self, n):
        return [self.nd() for _ in range(n)]

    def nd(self, n, m):
        return [self.nd(m) for _ in range(n)]

    def solve(self):
        a, b = self.ni(), self.ni()
        a -= 1
        b -= 1
        num = 100
        ans = [[j < num // 2 for j in range(num)] for i in range(num)]
        for i in range(0, num, 2):
            for j in range(0, num // 2, 2):
                if a <= 0:
                    break
                ans[i][j] = not ans[i][j]
                a -= 1
            for j in range(num // 2 + 1, num, 2):
                if b <= 0:
                    break
                ans[i][j] = not ans[i][j]
                b -= 1
        print(num, num)
        for row in ans:
            for cell in row:
                print('#' if cell else '.', end='')
            print()

solver = Solver()
solver.solve()