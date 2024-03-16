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
            self.writer.write("Yes\n")
        else:
            self.writer.write("No\n")

class FastScanner:
    def __init__(self):
        self.buffer = sys.stdin.read().split()
        self.ptr = 0

    def next(self):
        if self.ptr >= len(self.buffer):
            self.ptr = 0
            self.buffer = sys.stdin.read().split()
        self.ptr += 1
        return self.buffer[self.ptr - 1]

    def nextLong(self):
        return int(self.next())

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

if __name__ == "__main__":
    sc = FastScanner()
    writer = sys.stdout
    solver = Solver(sc, writer)
    solver.run()
    writer.flush()