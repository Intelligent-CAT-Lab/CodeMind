```python
class FastScanner:
    def __init__(self):
        self.inp = []
        for line in sys.stdin:
            self.inp.extend(line.split())
        self.ptr = 0

    def hasNextByte(self):
        return self.ptr < len(self.inp)

    def readByte(self):
        if self.hasNextByte():
            val = self.inp[self.ptr]
            self.ptr += 1
            return val
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(int(self.inp[self.ptr])):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise StopIteration("No more input")
        val = self.inp[self.ptr]
        self.ptr += 1
        return val

    def nextLong(self):
        return int(self.next())

    def nextInt(self):
        return int(self.next())

class AtCoder:
    def __init__(self):
        self.N = int(FastScanner().next())

    def solve(self):
        sqrt = int(self.N ** 0.5)
        for i in range(sqrt, 0, -1):
            if self.N % i == 0:
                A = len(str(i))
                B = len(str(self.N // i))
                return max(A, B)

if __name__ == "__main__":
    problem = AtCoder()
    result = problem.solve()
    print(result)
```
```
