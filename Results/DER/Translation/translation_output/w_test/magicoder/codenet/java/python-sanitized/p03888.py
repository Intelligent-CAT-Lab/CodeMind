import sys

class LightScanner:
    def __init__(self, inp):
        self.inp = inp

    def string(self):
        return self.inp.readline().strip()

    def doubles(self):
        return float(self.string())

class LightWriter:
    def __init__(self, out):
        self.out = out

    def print(self, s):
        self.out.write(s)

    def ans(self, x, n):
        if x < 0:
            self.out.write('-')
            x = -x
        x += pow(10, -n) / 2
        self.out.write(str(int(x)))
        self.out.write('.')
        x -= int(x)
        for _ in range(n):
            x *= 10
            self.out.write(str(int(x)))
            x -= int(x)

    def ln(self):
        self.out.write('\n')

def solve(testNumber, inp, out):
    r1 = inp.doubles()
    r2 = inp.doubles()
    out.ans(1 / (1 / r1 + 1 / r2), 10)
    out.ln()

def main():
    inp = LightScanner(sys.stdin)
    out = LightWriter(sys.stdout)
    solve(1, inp, out)
    out.out.close()

if __name__ == "__main__":
    main()