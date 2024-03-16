```python
import math
from sys import stdin, stdout

class Solver:
    def solve(self, sc, out):
        r = sc.nextDouble()
        pi = math.pi
        out.write(str(2*pi*r) + '\n')

class InputReader:
    def __init__(self, stream):
        self.stream = stream

    def read(self):
        return ord(stdin.read(1))

    def nextDouble(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()

        sgn = 1
        if c == ord('-'):
            sgn = -1
            c = self.read()
        
        res = 0
        while not self.isSpaceChar(c) and c != ord('.'):
            if c == ord('e') or c == ord('E'):
                return res * 10 ** self.nextInt()
            if c < ord('0') or c > ord('9'):
                raise ValueError("Invalid input")
            res *= 10
            res += c - ord('0')
            c = self.read()

        if c == ord('.'):
            c = self.read()
            m = 1
            while not self.isSpaceChar(c):
                if c == ord('e') or c == ord('E'):
                    return res * 10 ** self.nextInt()
                if c < ord('0') or c > ord('9'):
                    raise ValueError("Invalid input")
                m /= 10
                res += (c - ord('0')) * m
                c = self.read()

        return res * sgn

    def isSpaceChar(self, c):
        return c == ord(' ') or c == ord('\n') or c == ord('\r') or c == ord('\t') or c == -1

def main():
    sc = InputReader(stdin.buffer)
    out = stdout.buffer
    solver = Solver()
    t = 1
    while t != 0:
        solver.solve(sc, out)
        t -= 1

if __name__ == "__main__":
    main()
```

