import math
import sys

class InputReader:
    def __init__(self, stream=sys.stdin):
        self.stream = stream

    def read(self):
        return self.stream.read(1)

    def read_int(self):
        num_str = ''
        while True:
            c = self.read()
            if c in '-0123456789':
                num_str += c
            elif c.isspace():
                break
        return int(num_str)

    def read_float(self):
        num_str = ''
        while True:
            c = self.read()
            if c in '-.0123456789':
                num_str += c
            elif c.isspace():
                break
        return float(num_str)


class Solver:
    def solve(self, sc):
        r = sc.read_float()
        pi = math.pi
        print(2 * pi * r)


def main():
    sc = InputReader()
    solver = Solver()
    t = 1
    while t > 0:
        solver.solve(sc)
        t -= 1

if __name__ == '__main__':
    main()