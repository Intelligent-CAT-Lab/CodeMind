import sys
import io
import math

class LightWriter:
    def __init__(self, out):
        self.out = out
        self.breaked = True

    def print(self, c):
        self.out.write(c)
        self.breaked = False

    def print(self, s):
        self.out.write(s)
        self.breaked = False

    def ans(self, x, n):
        if not self.breaked:
            self.print(' ')
        if x < 0:
            self.print('-')
            x = -x
        x += math.pow(10, -n) / 2
        self.print(str(int(x)))
        self.print('.')
        x -= int(x)
        for i in range(n):
            x *= 10
            self.print(str(int(x)))
            x -= int(x)

    def ln(self):
        self.print('\n')
        self.breaked = True

class LightScanner:
    def __init__(self, inp):
        self.inp = inp

    def string(self):
        return self.inp.readline().strip()

    def doubles(self):
        return float(self.string())

class AEquivalentResistance:
    def solve(self, testNumber, inp, out):
        r1 = inp.doubles()
        r2 = inp.doubles()
        out.ans(1 / (1 / r1 + 1 / r2), 10)
        out.ln()

def main():
    inp = sys.stdin
    out = LightWriter(sys.stdout)
    solver = AEquivalentResistance()
    solver.solve(1, LightScanner(inp), out)
    out.ln()

if __name__ == "__main__":
    main()