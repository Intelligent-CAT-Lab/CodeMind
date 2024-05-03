Here is the Python equivalent of the Java code:

```python
import sys

class Task:
    def solve(self, inp, out):
        N = inp.nextLong()
        d = inp.nextLong()

        if d == 1:
            out.write(str(N * (N - 1) // 2))
        elif d == 2:
            out.write(str(N * (N - 1) // 2 - 1))
        else:
            m = N - d
            ans = m * (m - 1) // 2 + 2 * m + (d - 2)
            out.write(str(ans))

class FastScanner:
    def __init__(self):
        self.inp = sys.stdin
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.bufferLength = 0

    def hasNextByte(self):
        if self.ptr < self.bufferLength:
            return True
        else:
            self.ptr = 0
            try:
                self.bufferLength = self.inp.readinto(self.buffer)
            except IOError as e:
                print(e)
                sys.exit(1)
            if self.bufferLength <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            return self.buffer[self.ptr]
        else:
            return -1

    def skipUnprintable(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1

    def hasNext(self):
        self.skipUnprintable()
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise ValueError("No more input")
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return ''.join(sb)

    def next
