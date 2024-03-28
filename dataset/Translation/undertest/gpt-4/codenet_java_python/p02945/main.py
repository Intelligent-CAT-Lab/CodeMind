import sys
import math

class FastScanner:
    def __init__(self):
        self.reader = (line.strip() for line in sys.stdin)
        self.tokenizer = []

    def next(self):
        while not self.tokenizer:
            self.tokenizer = next(self.reader).split()
        return self.tokenizer.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

class Solver:
    def __init__(self):
        self.scanner = FastScanner()

    def solve(self):
        a = self.scanner.next_int()
        b = self.scanner.next_int()
        print(max(a + b, a - b, a * b))

    @staticmethod
    def exit():
        sys.exit(0)

def main():
    solver = Solver()
    solver.solve()
    solver.exit()

if __name__ == "__main__":
    main()