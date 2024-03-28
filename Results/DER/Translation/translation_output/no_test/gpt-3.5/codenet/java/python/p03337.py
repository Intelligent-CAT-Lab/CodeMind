```python
import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray()
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == -1:
            raise ValueError("InputMismatchException")
        if self.curChar >= self.numChars:
            self.curChar = 0
            self.buf = self.stream.read(1024)
            if not self.buf:
                return -1
            self.numChars = len(self.buf)
        return self.buf[self.curChar]

    def isSpaceChar(self, c):
        return c in b' \n\r\t\x0b\x0c'

    def nextInt(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        sgn = 1
        if c == ord('-'):
            sgn = -1
            c = self.read()
        res = 0
        while c >= ord('0') and c <= ord('9'):
            res = res * 10 + c - ord('0')
            c = self.read()
        return res * sgn

class OutputWriter:
    def __init__(self, writer):
        self.writer = writer

    def println(self, i):
        self.writer.write(str(i) + '\n')

    def close(self):
        self.writer.close()

class TaskA:
    def solve(self, testNumber, inReader, outWriter):
        a = inReader.nextInt()
        b = inReader.nextInt()
        outWriter.println(max(a + b, max(a - b, a * b)))

if __name__ == "__main__":
    inputStream = sys.stdin.buffer
    outputStream = sys.stdout.buffer
    inReader = InputReader(inputStream)
    outWriter = OutputWriter(sys.stdout)
    solver = TaskA()
    solver.solve(1, inReader, outWriter)
    outWriter.close()
```
```
