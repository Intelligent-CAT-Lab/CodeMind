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
        self.index = 0

    def next(self):
        if self.index >= len(self.buffer):
            raise Exception("No more tokens")
        token = self.buffer[self.index]
        self.index += 1
        return token

    def nextLong(self):
        return int(self.next())

def main():
    sc = FastScanner()
    writer = sys.stdout
    solver = Solver(sc, writer)
    solver.run()
    writer.flush()

if __name__ == "__main__":
    main()