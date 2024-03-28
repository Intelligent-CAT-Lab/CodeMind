```python
import sys

class FastScanner:
    def __init__(self, stream):
        self.in_stream = stream
        self.buffer = bytearray()
        self.pos = 0
        self.length = 0

    def hasNextByte(self):
        if self.pos < self.length:
            return True
        else:
            self.pos = 0
            self.buffer = self.in_stream.read(1024)
            self.length = len(self.buffer)
            if self.length <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            b = self.buffer[self.pos]
            self.pos += 1
            return b
        return -1

    def isPrintable(self, n):
        return 33 <= n <= 126

    def skip(self):
        while self.hasNextByte() and not self.isPrintable(self.buffer[self.pos]):
            self.pos += 1

    def hasNext(self):
        self.skip()
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise StopIteration
        sb = bytearray()
        b = self.readByte()
        while self.isPrintable(b):
            sb.append(b)
            b = self.readByte()
        return sb.decode().strip()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

def solve(in_stream, out_stream):
    e, y = map(int, in_stream.next().split())

    if e == 0:  # seireki
        if 1868 <= y <= 1911:  # meiji
            out_stream.write("M" + str(y - 1867) + "\n")
        elif 1912 <= y <= 1925:  # taishou
            out_stream.write("T" + str(y - 1911) + "\n")
        elif 1926 <= y <= 1988:  # shouwa
            out_stream.write("S" + str(y - 1925) + "\n")
        else:  # heisei
            out_stream.write("H" + str(y - 1988) + "\n")
    elif e == 1:  # meiji
        out_stream.write(str(1867 + y) + "\n")
    elif e == 2:  # taishou
        out_stream.write(str(1911 + y) + "\n")
    elif e == 3:  # shouwa
        out_stream.write(str(1925 + y) + "\n")
    elif e == 4:  # heisei
        out_stream.write(str(1988 + y) + "\n")

if __name__ == "__main__":
    in_stream = FastScanner(sys.stdin.buffer)
    solve(in_stream, sys.stdout.buffer)
```

