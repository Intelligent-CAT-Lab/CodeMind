import sys

class FastScanner:
    def __init__(self):
        self.inp = sys.stdin.buffer
        self.buffer = bytearray()
        self.ptr = 0
        self.buflen = 0
    
    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buffer = self.inp.read(1024)
            if not self.buffer:
                return False
            self.buflen = len(self.buffer)
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

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise StopIteration
        sb = bytearray()
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.extend(chr(b).encode())
            b = self.readByte()
        return sb.decode()

    def nextLong(self):
        n = 0
        minus = False
        b = self.readByte()
        if b == 45:
            minus = True
            b = self.readByte()
        if b < 48 or b > 57:
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

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError
        return int(nl)

    def nextDouble(self):
        return float(self.next())


def p(element):
    print(element)

def pp(element):
    print(element, end='')

def min(a, b, c):
    return min(a, min(b, c))

def max(a, b, c):
    return max(a, max(b, c))


def main():
    sc = FastScanner()
    str = sc.next()
    str = str.replace("BC", "X")
    a = 0
    ans = 0
    for i in range(len(str)-1, -1, -1):
        c = str[i]
        if c == 'X':
            a += 1
        elif c == 'A':
            ans += a
        else:
            a = 0
    p(ans)

if __name__ == "__main__":
    main()