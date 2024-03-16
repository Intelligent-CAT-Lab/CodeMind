```python
import math

class FastScanner:
    def __init__(self):
        self.buffer = []
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buffer = list(map(int, input().strip().split()))
                self.buflen = len(self.buffer)
            except EOFError:
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
            raise StopIteration()
        sb = ''
        b = self.readByte()
        while self.isPrintableChar(b):
            sb += chr(b)
            b = self.readByte()
        return sb

    def nextLong(self):
        return int(self.next())

    def nextInt(self):
        return int(self.next())

class AtCoder:
    def __init__(self, N):
        self.N = N

    def solve(self):
        sqrt = int(math.sqrt(self.N))
        for i in range(sqrt, 0, -1):
            if self.N % i == 0:
                A = len(str(i))
                B = len(str(self.N // i))
                print(max(A, B))
                return

if __name__ == '__main__':
    sc = FastScanner()
    N = sc.nextLong()
    problem = AtCoder(N)
    problem.solve()
```

