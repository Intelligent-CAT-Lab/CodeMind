import sys

def solve(test_number, in, out):
    i = in.read()
    md = [0] * (i - 2)
    rm = i - 2
    lx = i - 2
    while rm >= 0:
        md[lx + 1] = c(rm, lx)
        rm -= 2
        lx -= 1
    res = 0
    prev = 0
    for m in range(1, i):
        cur = fact(m) * fact(i - m - 1) % M07
        cur = cur * md[m] % M07
        res += (cur - prev + M07) * m % M07
        prev = cur
    out.write(res % M07)

def main():
    in = sys.stdin
    out = sys.stdout
    solver = TaskC()
    solver.solve(1, in, out)

class TaskC:
    def solve(self, test_number, in, out):
        i = in.read()
        md = [0] * (i - 2)
        rm = i - 2
        lx = i - 2
        while rm >= 0:
            md[lx + 1] = c(rm, lx)
            rm -= 2
            lx -= 1
        res = 0
        prev = 0
        for m in range(1, i):
            cur = fact(m) * fact(i - m - 1) % M07
            cur = cur * md[m] % M07
            res += (cur - prev + M07) * m % M07
            prev = cur
        out.write(res % M07)

class MyScan:
    def __init__(self, in):
        self.in = in
        self.inbuf = bytearray(1024)
        self.lenbuf = 0
        self.ptrbuf = 0

    def readByte(self):
        if self.lenbuf == -1:
            raise InputMismatchException()
        if self.ptrbuf >= self.lenbuf:
            self.ptrbuf = 0
            try:
                self.lenbuf = self.in.read(self.inbuf)
            except IOError:
                raise InputMismatchException()
            if self.lenbuf <= 0:
                return -1
        return self.inbuf[self.ptrbuf]

    def nextInt(self):
        num = 0
        b = self.readByte()
        while b >= '0' and b <= '9':
            num = num * 10 + (b - '0')
            b = self.readByte()
        return num if b == '-' else -num

def fact(n):
    if fact == None:
        l()
    return fact[n]

def c(a, b):
    if fact == None:
        l()
    return ifact[a] * ifact[b - a] % M07 * fact[b] % M07

def l():
    fact = [0] * 1000001
    inv = [0] * 1000001
    ifact =