import sys

class FastScanner:
    def __init__(self):
        self.buffer = sys.stdin.buffer
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.buffer.readinto(self.buffer)
            except:
                return False
            if self.buflen <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            return self.buffer[self.ptr]
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise NoSuchElementException()
        sb = []
        while self.hasNextByte() and self.isPrintableChar(self.buffer[self.ptr]):
            sb.append(chr(self.buffer[self.ptr]))
            self.ptr += 1
        return ''.join(sb)

    def nextLong(self):
        if not self.hasNext():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        if b < ord('0') or ord('9') < b:
            raise NumberFormatException()
        while True:
            if ord('0') <= b and b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.isPrintableChar(b):
                return minus and -n or n
            else:
                raise NumberFormatException()
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2**31 or nl > 2**31 - 1:
            raise NumberFormatException()
        return int(nl)

    def nextDouble(self):
        return float(self.next())

class Mas:
    def __init__(self, x, y, step):
        self.x = x
        self.y = y
        self.step = step

MOD = 1000000007

def pow(l, i):
    if i == 0:
        return 1
    elif i % 2 == 0:
        val = pow(l, i // 2)
        return val * val % MOD
    else:
        return pow(l, i - 1) * l % MOD

def main():
    fs = FastScanner()
    n = fs.nextInt()
    k = fs.nextInt()
    ans = 0
    for i in range(k, n + 2):
        f = i * (i - 1) // 2
        l = (n * 2 - i + 1) * i // 2
        add = l - f + 1
        ans = (ans + add) % MOD
    print(ans)

if __name__ == '__main__':
    main()