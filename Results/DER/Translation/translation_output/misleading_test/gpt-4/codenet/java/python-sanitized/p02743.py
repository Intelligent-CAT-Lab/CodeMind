import sys

class FastScanner:
    def __init__(self):
        self.iterator = iter(map(int, sys.stdin.readline().split()))

    def next(self):
        return next(self.iterator)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

class Solver:
    def __init__(self, sc):
        self.sc = sc

    def run(self):
        a = self.sc.next_long()
        b = self.sc.next_long()
        c = self.sc.next_long()
        d = c - a - b
        if d > 0 and 4 * a * b < d * d:
            print("Yes")
        else:
            print("No")

def main():
    sc = FastScanner()
    solver = Solver(sc)
    solver.run()

if __name__ == '__main__':
    main()