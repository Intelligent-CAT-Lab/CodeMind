```python
import sys
from io import BytesIO, IOBase

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray()
        self.curChar = 0
        self.numChars = 0

    def read(self):
        while self.numChars == 0:
            self.curChar = 0
            self.buf = self.stream.read(8192)
            self.numChars = len(self.buf)
        if self.curChar >= self.numChars:
            self.numChars = 0
            return -1
        self.curChar += 1
        return self.buf[self.curChar - 1]

    def read_int(self):
        c = self.read()
        while c <= 32:
            c = self.read()
        sgn = 1 if c > 45 else -1
        if sgn == -1:
            c = self.read()
        res = 0
        while c >= 48:
            res = res * 10 + c - 48
            c = self.read()
        return res * sgn

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream
        self.writer = BytesIO()

    def print(self, *args, sep=' ', end='\n'):
        for i, arg in enumerate(args):
            if i:
                self.writer.write(sep.encode())
            self.writer.write(str(arg).encode())
        self.writer.write(end.encode())

    def flush(self):
        self.stream.write(self.writer.getvalue())
        self.stream.flush()

def main():
    input_stream = BytesIO(sys.stdin.buffer.read())
    input_stream.seek(0)
    sys.stdin = IOBase(input_stream)
    output_stream = BytesIO()
    sys.stdout = IOBase(output_stream)

    in_reader = InputReader(sys.stdin)
    out_writer = OutputWriter(sys.stdout)
    solver = StopOtherwise()
    solver.solve(1, in_reader, out_writer)
    
    out_writer.flush()

class Modulo:
    mod = 998244353
    nors = []
    revs = []

    def __init__(self, value):
        self.value = value

    @staticmethod
    def add(a, b):
        return ((a + b) % Modulo.mod + Modulo.mod) % Modulo.mod

    @staticmethod
    def mlt(a, b):
        return (a * b) % Modulo.mod

    @staticmethod
    def rev(a):
        return (Euclid.extgcd(a, Modulo.mod, [0, 1, 0])[0] % Modulo.mod + Modulo.mod) % Modulo.mod

    @staticmethod
    def pow(a, x):
        ans = 1 % Modulo.mod
        while x > 0:
            if (x & 1) != 0:
                ans = (ans * a) % Modulo.mod
            x >>= 1
            a = (a * a) % Modulo.mod
        return ans

    def add(self, a):
        self.value = Modulo.add(self.value, a)
        return self

    def add_modulo(self, m):
        self.value = Modulo.add(self.value, m.value)
        return self

    def mlt(self, a):
        self.value = Modulo.mlt(self.value, a)
        return self

    @staticmethod
    def build_combination(n):
        Modulo.nors = [0] * (n + 1)
        Modulo.revs = [0] * (n + 1)
        Modulo.nors[0] = 1
        for i in range(1, n + 1):
            Modulo.nors[i] = Modulo.mlt(Modulo.nors[i - 1], i)
        
        Modulo.revs[n] = Modulo.rev(Modulo.nors[n])
        for i in range(n - 1, -1, -1):
            Modulo.revs[i] = Modulo.mlt(Modulo.revs[i + 1], i + 1)

    @staticmethod
    def h(n, k):
        return 1 if k <= 0 else Modulo(Modulo.nors[n + k - 1]).mlt(Modulo.revs[n]).mlt(Modulo.revs[k - 1]).value

    @staticmethod
    def c(n, k):
        return 0 if n - k < 0 else Modulo(Modulo.nors[n]).mlt(Modulo.revs[k]).mlt(Modulo.revs[n - k]).value

    def get_value(self):
        return self.value

    def set_value(self, value):
        self.value = value

class Euclid:
    @staticmethod
    def extgcd(a, b, is_):
        if a == 0:
            is_[0] = 0
            is_[1] = 1
            is_[2] = b
        else:
            Euclid.extgcd(b % a, a, is_)
            x = is_[1] - b // a * is_[0]
            is_[1] = is_[0]
            is_[0] = x

def calc(i, n, k):
    ret = Modulo(0)
    p = 0
    for j in range(1, i - j):
        if i - j <= k:
            p += 1
    l = k - 2 * p - (1 if i % 2 == 0 else 0)
    for q in range(min(n, p) + 1):
        if l == 0 and q == 0:
            continue
        tmp = Modulo(1)
        tmp.mlt(Modulo.c(p, q))
        tmp.mlt(Modulo.pow(2, q))
        tmp.mlt(Modulo.h(n - q, q + l))
        ret.add(tmp)
    return ret.get_value()

class StopOtherwise:
    def solve(self, test_number, in_reader, out_writer):
        k = in_reader.read_int()
        n = in_reader.read_int()

        Modulo.mod = Modulo.mod
        Modulo.build_combination(5000)
        
        for i in range(2, 2 * k + 1):
            ans = Modulo(0)
            ans.add(calc(i, n, k))
            if i % 2 == 0:
                ans.add(calc(i, n - 1, k))
            out_writer.print(ans)

if __name__ == "__main__":
    main()
```
