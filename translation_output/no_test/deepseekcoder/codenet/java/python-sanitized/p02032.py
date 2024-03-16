import sys
import re
import math
from collections import defaultdict

class LightScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.tokens = None

    def string(self):
        while True:
            if self.tokens is None or len(self.tokens) == 0:
                self.tokens = self.inp.readline().split()
            if len(self.tokens) > 0:
                return self.tokens.pop(0)

    def longs(self):
        return int(self.string())

class LightWriter:
    def __init__(self, out=sys.stdout):
        self.out = out
        self.breaked = True

    def print(self, *args, **kwargs):
        sep = kwargs.get('sep', ' ')
        end = kwargs.get('end', '\n')
        output = sep.join(map(str, args)) + end
        self.out.write(output)
        self.out.flush()
        self.breaked = False

    def ans(self, *args, **kwargs):
        if not self.breaked:
            self.print(' ', end='')
        self.print(*args, **kwargs)

    def ln(self):
        self.print('\n')
        self.breaked = True

class CDivisorGame:
    def solve(self, testNumber, inp, out):
        n = inp.longs()
        pf = defaultdict(int)
        for i in range(2, int(math.sqrt(n)) + 1):
            while n % i == 0:
                n //= i
                pf[i] += 1
        if n > 1:
            pf[n] += 1

        ans = 1
        for ent in pf.values():
            ans *= (ent + 1)
        out.ans(len(pf)).ans(ans - 1).ln()

def main():
    inp = LightScanner()
    out = LightWriter()
    solver = CDivisorGame()
    solver.solve(1, inp, out)
    out.ln()

if __name__ == "__main__":
    main()