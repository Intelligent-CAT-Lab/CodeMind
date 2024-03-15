```python
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
            self.buffer = sys.stdin.buffer.read(1024)
            if len(self.buffer) <= 0:
                return False
            self.buflen = len(self.buffer)
        return True

    def readByte(self):
        if self.hasNextByte():
            return self.buffer[self.ptr]
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
        sb = bytearray()
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(b)
            b = self.readByte()
        return sb.decode()

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
                n = 10 * n + (b - 48)
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError
            b = self.readByte()

    def nextInt(self):
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
                n = 10 * n + (b - 48)
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError
            b = self.readByte()

def main():
    sc = FastScanner()
    n = sc.nextInt()
    m = sc.nextInt()
    if n % 2 == 0:
        print(0, end=" ")
        for i in range(1, n // 2 + 1):
            print(0, end=" ")
        for i in range(n // 2 + 1, n):
            print(m, end=" ")
    else:
        print(0, end=" ")
        for i in range(1, n // 2 + 1):
            print(0, end=" ")
        for i in range(n // 2 + 1, n):
            print(m, end=" ")
    print()

if __name__ == "__main__":
    main()
```
```
