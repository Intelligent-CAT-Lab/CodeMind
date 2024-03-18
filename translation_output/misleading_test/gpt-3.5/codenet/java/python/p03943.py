```python
import sys

class FastScanner:
    def __init__(self):
        self.buffer = []
        self.ptr = 0

    def hasNextByte(self):
        self.buffer = sys.stdin.read().split()
        return self.ptr < len(self.buffer)

    def readByte(self):
        if self.hasNextByte():
            self.ptr += 1
            return int(self.buffer[self.ptr - 1])
        else:
            return -1

    @staticmethod
    def isPrintableChar(c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(int(self.buffer[self.ptr])):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise StopIteration
        result = ""
        while self.isPrintableChar(self.buffer[self.ptr]):
            result += chr(int(self.buffer[self.ptr]))
            self.ptr += 1
        return result

    def nextLong(self):
        n = 0
        minus = False
        b = int(self.readByte())
        if b == ord('-'):
            minus = True
            b = int(self.readByte())
        if b < ord('0') or b > ord('9'):
            raise ValueError
        while True:
            if ord('0') <= b <= ord('9'):
                n = 10 * n + (b - ord('0'))
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError
            b = int(self.readByte())

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError
        return nl

    def nextDouble(self):
        return float(self.next())

if __name__ == "__main__":
    scanner = FastScanner()
    a = scanner.nextInt()
    b = scanner.nextInt()
    c = scanner.nextInt()

    i = (a + b == c)
    j = (a + c == b)
    k = (b + c == a)

    if i or j or k:
        print("Yes")
    else:
        print("No")
```
```
