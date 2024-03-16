from collections import deque

DEBUG = False

class FastScanner:
    def __init__(self):
        self.buffer = bytearray()
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
            ret = self.buffer[self.ptr]
            self.ptr += 1
            return ret
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
        if b == 45:  # ASCII value for '-'
            minus = True
            b = self.readByte()
        if b < 48 or b > 57:  # ASCII values for '0' to '9'
            raise ValueError("Invalid input")
        while True:
            if 48 <= b <= 57:
                n *= 10
                n += b - 48
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError("Invalid input")
            b = self.readByte()

class Solver:
    def __init__(self):
        self.sc = FastScanner()
    
    def ns(self):
        return self.sc.next()

    def ni(self):
        return int(self.sc.next())
        
    def prt(self, *args, end=''):
        print(*args, end=end)
    
    def prtln(self, *args):
        print(*args)
    
    def solve(self):
        a = self.ni()
        b = self.ni()
        a -= 1
        b -= 1
        num = 100
        ans = [[j < num // 2 for j in range(num)] for _ in range(num)]
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
        self.prtln(num, num)
        for row in ans:
            for val in row:
                self.prt(val, '#' if val else '.')
            self.prtln()

solver = Solver()
solver.solve()