```python
class MyScan:
    def __init__(self, _input):
        self.in_stream = _input
        self.inbuf = bytearray()
        self.lenbuf = 0
        self.ptrbuf = 0

    def read_byte(self):
        if self.lenbuf == -1:
            raise Exception("InputMismatchException")
        if self.ptrbuf >= self.lenbuf:
            self.ptrbuf = 0
            self.inbuf = self.in_stream.read(1024)
            if not self.inbuf:
                return -1
            self.lenbuf = len(self.inbuf)
        return self.inbuf[self.ptrbuf]

    def next_int(self):
        num = 0
        minus = False
        b = self.read_byte()
        while b != -1 and not (b >= 48 and b <= 57) and b != 45:
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
    M07 = 1000000007
    _m = M07
    fact = [0] * 1000001
    inv = [0] * 1000001
    ifact = [0] * 1000001

    @classmethod
    def l(cls):
        cls.fact[0] = 1
        cls.ifact[0] = 1
        cls.inv[0] = 1
        for i in range(2, len(cls.inv)):
            cls.inv[i] = (cls._m - (cls._m // i) * cls.inv[cls._m % i] % cls._m) % cls._m
        for i in range(2, len(cls.fact)):
            cls.fact[i] = i * cls.fact[i - 1] % cls._m
            cls.ifact[i] = cls.inv[i] * cls.ifact[i - 1] % cls._m

    @classmethod
    def c(cls, a, b):
        cls.l()
        return cls.ifact[a] * cls.ifact[b - a] % cls._m * cls.fact[b] % cls._m

    @classmethod
    def fact(cls, a):
        cls.l()
        return cls.fact[a]


class TaskC:
    def solve(self, test_number, _in, _out):
        i = _in.next_int()
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
        _out.write(str(res % Util._m) + "\n")


import sys
_in = MyScan(sys.stdin)
_out = sys.stdout
solver = TaskC()
solver.solve(1, _in, _out)
_out.close()
```
```python
