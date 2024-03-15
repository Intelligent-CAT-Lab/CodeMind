import sys

class FastInput:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = b''
        self.buffer_pos = 0

    def read(self):
        while self.buffer_pos >= len(self.buffer):
            self.buffer = self.stream.read(1 << 13)
            self.buffer_pos = 0
            if not self.buffer:
                return -1
        self.buffer_pos += 1
        return self.buffer[self.buffer_pos - 1]

    def skip_blank(self):
        while 0 <= self.read() <= 32:
            pass

    def read_int(self):
        sign = 1
        self.skip_blank()
        if self.read() in (43, 45):
            sign = 1 if self.buffer[self.buffer_pos - 1] == 43 else -1
            self.buffer_pos += 1

        val = 0
        if sign == 1:
            while 48 <= self.buffer[self.buffer_pos-1] <= 57:
                val = val * 10 + self.buffer[self.buffer_pos-1] - 48
                self.buffer_pos += 1
        else:
            while 48 <= self.buffer[self.buffer_pos-1] <= 57:
                val = val * 10 - self.buffer[self.buffer_pos-1] + 48
                self.buffer_pos += 1

        return val


class FastOutput:
    def __init__(self, stream):
        self.stream = stream
        self.cache = bytearray()
    
    def append(self, c):
        self.cache.append(c)
        return self

    def println(self, c):
        return self.append(c).println()
    
    def println(self):
        self.cache.extend(b'\n')
        return self

    def flush(self):
        self.stream.write(self.cache)
        self.stream.flush()
        self.cache = bytearray()

    def close(self):
        self.flush()
        self.stream.close()

class FDISCOSMOS:
    def solve(self, test_number, in_reader, out_writer):
        h = in_reader.read_int()
        w = in_reader.read_int()
        t = in_reader.read_int()

        hh = h // gcd(h, t)
        ww = w // gcd(w, t)

        mod = Modular(10**9 + 7)
        pow = Power(mod)
        way = 1
        way = mod.add(way, mod.subtract(pow.power(2, hh), 2))
        way = mod.add(way, mod.subtract(pow.power(2, ww), 2))
        way = mod.add(way, pow.power(2, gcd(hh, ww)))

        pow_mod = mod.get_modular_for_power_computation()
        p = pow_mod.mul(h // hh, w // ww)
        way = pow.power(way, p)
        out_writer.println(way)

def gcd(a, b):
    return a if b == 0 else gcd(b, a % b)

class Modular:
    def __init__(self, m):
        self.m = m

    def value_of(self, x):
        x %= self.m
        if x < 0:
            x += self.m
        return x

    def mul(self, x, y):
        return self.value_of(x * y)

    def add(self, x, y):
        return self.value_of(x + y)

    def subtract(self, x, y):
        return self.value_of(x - y)

    def get_modular_for_power_computation(self):
        return Modular(self.m - 1)


class Power:
    def __init__(self, modular):
        self.modular = modular

    def power(self, x, n):
        if n == 0:
            return self.modular.value_of(1)
        r = self.power(x, n >> 1)
        r = self.modular.value_of(r * r)
        if n & 1:
            r = self.modular.value_of(r * x)
        return r


def main():
    in_reader = FastInput(sys.stdin.buffer)
    out_writer = FastOutput(sys.stdout.buffer)
    solver = FDISCOSMOS()
    solver.solve(1, in_reader, out_writer)
    out_writer.close()

if __name__ == '__main__':
    main()