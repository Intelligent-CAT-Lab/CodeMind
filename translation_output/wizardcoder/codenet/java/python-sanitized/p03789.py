import math

class BigInt:
    def __init__(self, w):
        self.w = w

    def clone(self):
        return BigInt(self.w.copy())

    def digitSum(self):
        return sum(map(self.digitSum, self.w))

    def digitSum(self, wi):
        w = 0
        while wi > 0:
            w += wi % 10
            wi //= 10
        return w

    def multiply(self, n):
        c = 0
        for i in range(len(self.w)):
            self.w[i] *= n
            self.w[i] += c
            c = self.w[i] // 100000000
            self.w[i] %= 100000000

    def add(self, n):
        self.w[0] += n
        for i in range(len(self.w)-1):
            if self.w[i] < 100000000:
                break
            self.w[i+1] += self.w[i] // 100000000
            self.w[i] %= 100000000

def canMake(n, bigint):
    big = bigint.clone()
    big.add(n)
    return big.digitSum() <= n

def solve(N):
    n = len(N)
    bigint = BigInt(N)
    bigint.multiply(9)

    ok = n * 10
    ng = 0
    while abs(ok - ng) > 1:
        med = (ok + ng) // 2
        if canMake(med, bigint.clone()):
            ok = med
        else:
            ng = med

    return (ok + 8) // 9

def main():
    in_ = InputReader(sys.stdin)
    out = sys.stdout

    s = in_.nextToken().strip()
    out.write(str(solve(s)) + '\n')
    out.flush()

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = ""

    def readline(self):
        while True:
            if "\n" in self.buffer:
                line, self.buffer = self.buffer.split("\n", 1)
                return line
            else:
                data = self.stream.read(1024)
                if not data:
                    return None
                self.buffer += data.decode()

    def read(self):
        while True:
            if "\n" in self.buffer:
                line, self.buffer = self.buffer.split("\n", 1)
                return line
            else:
                data = self.stream.read(1024)
                if not data:
                    return None
                self.buffer += data.decode()

    def nextToken(self):
        while True:
            if "\n" in self.buffer:
                line, self.buffer = self.buffer.split("\n", 1)
                return line.strip()
            else:
                data = self.stream.read(1024