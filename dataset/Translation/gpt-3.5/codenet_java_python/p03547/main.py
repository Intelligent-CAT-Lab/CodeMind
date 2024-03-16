import sys

MOD = 1_000_000_007

class FastScanner:
    def __init__(self):
        self.inp = sys.stdin.buffer.read()
        self.ptr = 0
        self.buflen = len(self.inp)

    def hasNextByte(self):
        return self.ptr < self.buflen

    def readByte(self):
        if self.hasNextByte():
            result = self.inp[self.ptr]
            self.ptr += 1
            return result
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.inp[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise NoSuchElementException
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return "".join(sb)

    def nextLong(self):
        if not self.hasNext():
            raise NoSuchElementException
        n = 0
        minus = False
        b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        if b < ord('0') or b > ord('9'):
            raise NumberFormatException
        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise NumberFormatException
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2147483648 or nl > 2147483647:
            raise NumberFormatException
        return nl

    def nextDouble(self):
        return float(self.next())

class p03547:
    def __init__(self):
        self.pw = sys.stdout

    def solve(self):
        sc = FastScanner()
        X = sc.next()[0]
        Y = sc.next()[0]
        ans = "="
        if ord(X) - ord(Y) < 0:
            ans = "<"
        elif ord(X) - ord(Y) > 0:
            ans = ">"
        self.out(ans)

    def out(self, a):
        self.pw.write(a + "\n")

if __name__ == '__main__':
    p = p03547()
    p.solve()