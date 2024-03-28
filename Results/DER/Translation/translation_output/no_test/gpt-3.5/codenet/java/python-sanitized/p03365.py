class TaskC:
    def solve(self, test_number, in_stream, out_stream):
        i = in_stream.next_int()
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
            cur = cur * md[m] % Util._m
            res += (cur - prev + Util._m) * m % Util._m
            prev = cur

        out_stream.write(str(res % Util._m) + "\n")


class MyScan:
    def __init__(self, in_stream):
        self.in_stream = in_stream
        self.inbuf = bytearray()
        self.lenbuf = 0
        self.ptrbuf = 0

    def read_byte(self):
        if self.lenbuf == -1:
            raise Exception("InputMismatchException")
        if self.ptrbuf >= self.lenbuf:
            self.ptrbuf = 0
            try:
                self.lenbuf = self.in_stream.readinto(self.inbuf)
            except IOError:
                raise Exception("InputMismatchException")
            if self.lenbuf <= 0:
                return -1
        return self.inbuf[self.ptrbuf]

    def next_int(self):
        num = 0
        minus = False
        b = self.read_byte()
        while b != -1 and not (48 <= b <= 57 or b == 45):
            b = self.read_byte()

        if b == 45:
            minus = True
            b = self.read_byte()

        while True:
            if 48 <= b <= 57:
                num = num * 10 + (b - 48)
            else:
                return -num if minus else num
            b = self.read_byte()


class Util:
    M07 = 100000007
    _m = M07
    fact = None
    inv = None
    ifact = None

    @staticmethod
    def l():
        Util.fact = [0] * 1000001
        Util.inv = [0] * 1000001
        Util.ifact = [0] * 1000001

        for s in range(2):
            Util.fact[s] = 1
            Util.ifact[s] = 1
            Util.inv[s] = 1

        Util.inv[0] = 0
        for i in range(2, len(Util.inv)):
            Util.inv[i] = (Util._m - (Util._m // i) * Util.inv[Util._m % i] % Util._m) % Util._m

        for i in range(2, len(Util.fact)):
            Util.fact[i] = i * Util.fact[i - 1] % Util._m
            Util.ifact[i] = Util.inv[i] * Util.ifact[i - 1] % Util._m

    @staticmethod
    def c(a, b):
        if Util.fact is None:
            Util.l()
        return Util.ifact[a] * Util.ifact[b - a] % Util._m * Util.fact[b] % Util._m

    @staticmethod
    def fact(a):
        if Util.fact is None:
            Util.l()
        return Util.fact[a]

import sys

def main():
    in_stream = sys.stdin.buffer
    out_stream = sys.stdout.buffer
    in_data = MyScan(in_stream)
    out_data = sys.stdout
    solver = TaskC()
    solver.solve(1, in_data, out_data)


if __name__ == '__main__':
    main()