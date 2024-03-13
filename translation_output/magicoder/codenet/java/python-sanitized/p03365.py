import sys
import io
import math

class MyScan:
    def __init__(self, inp):
        self.inp = inp

    def nextInt(self):
        num = 0
        minus = False
        b = self.inp.read(1)
        while b != '-' and not b.isdigit():
            b = self.inp.read(1)
        if b == '-':
            minus = True
            b = self.inp.read(1)
        while b.isdigit():
            num = num * 10 + int(b)
            b = self.inp.read(1)
        return -num if minus else num

class Util:
    _m = 1000000007
    fact = [1] * 1000001
    inv = [1] * 1000001
    ifact = [1] * 1000001

    @staticmethod
    def l():
        for i in range(2, len(Util.fact)):
            Util.fact[i] = i * Util.fact[i - 1] % Util._m
            Util.inv[i] = (Util._m - (Util._m // i) * Util.inv[Util._m % i] % Util._m) % Util._m
        Util.ifact = [1] + [Util.inv[i] * Util.ifact[i - 1] % Util._m for i in range(2, len(Util.fact))]

    @staticmethod
    def c(a, b):
        if Util.fact[a] == 1:
            Util.l()
        return Util.ifact[b] * Util.ifact[b - a] % Util._m * Util.fact[a] % Util._m

    @staticmethod
    def fact(a):
        if Util.fact[a] == 1:
            Util.l()
        return Util.fact[a]

class TaskC:
    def solve(self, testNumber, inp, out):
        i = inp.nextInt()
        md = [0] * i
        rm = i - 2
        lx = i - 2
        while rm >= 0:
            md[lx + 1] = Util.c(rm, lx)
            rm -= 2
            lx -= 1
        res = 0
        prev = 0
        for m in range(1, i):
            cur = Util.fact(m) * Util.fact(i - m - 1) % Util._m
            cur = cur * (md[m]) % Util._m
            res = (res + (cur - prev + Util._m) * m % Util._m) % Util._m
            prev = cur
        out.write(str(res) + '\n')

if __name__ == '__main__':
    inp = io.BytesIO(sys.stdin.read().encode())
    out = sys.stdout
    solver = TaskC()
    solver.solve(1, MyScan(inp), out)
    out.close()