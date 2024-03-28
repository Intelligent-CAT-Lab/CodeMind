import sys

class FastScanner:
    def __init__(self):
        self.ptr = 0
        self.buffer = []
        self.buflen = 0
        self.inp = sys.stdin.buffer.read()

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buffer = list(self.inp)
                self.buflen = len(self.buffer)
            except EOFError:
                return False
            if self.buflen <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            b = self.buffer[self.ptr]
            self.ptr += 1
            return b
        else:
            return -1

    @staticmethod
    def isPrintableChar(c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return ''.join(sb)

    def nextLong(self):
        n = 0
        minus = False
        b = self.readByte()
        if b == 45:  # ASCII value for '-'
            minus = True
            b = self.readByte()
        if b < 48 or b > 57:  # ASCII values for '0' to '9'
            raise ValueError("NumberFormatException")
        while True:
            if 48 <= b <= 57:
                n = 10 * n + (b - 48)
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError("NumberFormatException")
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError("NumberFormatException")
        return int(nl)

    def nextDouble(self):
        return float(self.next())

    def close(self):
        sys.stdin.close()

if __name__ == "__main__":
    fsc = FastScanner()
    w = fsc.nextInt()
    a = fsc.nextInt()
    b = fsc.nextInt()
    fsc.close()
    
    if a <= b and b <= a + w:
        print(0)
    elif a <= b + w and b + w <= a + w:
        print(0)
    elif a + w <= b:
        print(b - a - w)
    else:
        print(a - b - w)