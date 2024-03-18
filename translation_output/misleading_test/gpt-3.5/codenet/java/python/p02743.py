```python
import sys

class Solver:
    def __init__(self, sc, writer):
        self.sc = sc
        self.writer = writer

    def run(self):
        a = self.sc.nextLong()
        b = self.sc.nextLong()
        c = self.sc.nextLong()
        d = c - a - b
        if d > 0 and 4 * a * b < d * d:
            self.writer.println("Yes")
        else:
            self.writer.println("No")

class FastScanner:
    def __init__(self):
        self.input_stream = sys.stdin.buffer
        self.buffer = bytearray()
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buflen = self.input_stream.readinto(self.buffer)
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
        sb = bytearray()
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(b)
            b = self.readByte()
        return sb.decode()

    def nextLong(self):
        if not self.hasNext():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.readByte()
        if b == 45:  # ASCII value for '-'
            minus = True
            b = self.readByte()
        if b < 48 or b > 57:  # ASCII values for '0' and '9'
            raise ValueError("Invalid number format")
        while True:
            if 48 <= b <= 57:  # ASCII values for '0' to '9'
                n *= 10
                n += b - 48
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError("Invalid number format")
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < -(1 << 31) or nl > (1 << 31) - 1:
            raise ValueError("Invalid number format")
        return nl

    def nextDouble(self):
        return float(self.next())

    def nextIntArray(self, n):
        a = []
        for _ in range(n):
            a.append(self.nextInt())
        return a

    def nextLongArray(self, n):
        a = []
        for _ in range(n):
            a.append(self.nextLong())
        return a

if __name__ == "__main__":
    sc = FastScanner()
    with sys.stdout as w:
        solver = Solver(sc, w)
        solver.run()
```
```python
2 3 9
```
Output:
```python
No
```
