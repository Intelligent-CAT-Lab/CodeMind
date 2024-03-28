import sys
import re
import math

class LightScanner:
    def __init__(self, inp):
        self.inp = inp

    def string(self):
        return self.inp.readline().strip()

    def longs(self):
        return int(self.string())

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

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        self.print(s)

    def ans(self, l):
        self.ans(str(l))

    def ans(self, i):
        self.ans(str(i))

    def ln(self):
        self.print('\n')
        self.breaked = True

class CDivisorGame:
    def solve(self, testNumber, inp, out):
        n = inp.longs()
        pf = {}
        for i in range(2, int(math.sqrt(n)) + 1):
            c = 0
            while n % i == 0:
                n /= i
                c += 1
            if c > 0:
                pf[i] = c
        if n > 1:
            pf[n] = 1

        ans = 1
        for ent in pf.items():
            ans *= (ent[1] + 1)

        out.ans(len(pf))
        out.ans(ans - 1)
        out.ln()

class Debug:
    def __init__(self):
        self.enabled = False
        self.src = None

    def enable(self, s):
        self.enabled = True
        self.src = s

def main():
    inp = LightScanner(sys.stdin)
    out = LightWriter(sys.stdout)
    solver = CDivisorGame()
    solver.solve(1, inp, out)
    out.out.close()

if __name__ == "__main__":
    main()