class Modular:
    def __init__(self, m):
        self.m = m

    def value_of(self, x):
        x %= self.m
        if x < 0:
            x += self.m
        return x

    def mul(self, x, y):
        return self.value_of((x * y) % self.m)

    def plus(self, x, y):
        return self.value_of(x + y)

    def subtract(self, x, y):
        return self.value_of(x - y)

    def get_modular_for_power_computation(self):
        return Modular(self.m - 1)

class Power:
    def __init__(self, modular):
        self.modular = modular

    def pow(self, x, n):
        if n == 0:
            return self.modular.value_of(1)
        r = self.pow(x, n >> 1)
        r = self.modular.value_of(r * r)
        if n & 1:
            r = self.modular.value_of(r * x)
        return r

class GCDs:
    @staticmethod
    def gcd(a, b):
        return a if b == 0 else GCDs.gcd(b, a % b)

class FastInput:
    def __init__(self, input_stream):
        self.is = input_stream
        self.buf = bytearray(1 << 13)
        self.buf_len = 0
        self.buf_offset = 0
        self.next = 0

    def read(self):
        while self.buf_len == self.buf_offset:
            self.buf_offset = 0
            try:
                self.buf_len = self.is.readinto(self.buf)
            except Exception as e:
                self.buf_len = -1
            if self.buf_len == -1:
                return -1
        return self.buf[self.buf_offset]

    def skip_blank(self):
        while 0 <= self.next <= 32:
            self.next = self.read()

    def read_int(self):
        sign = 1
        self.skip_blank()
        if self.next == 43 or self.next == 45:
            sign = 1 if self.next == 43 else -1
            self.next = self.read()
        val = 0
        if sign == 1:
            while 48 <= self.next <= 57:
                val = val * 10 + self.next - 48
                self.next = self.read()
        else:
            while 48 <= self.next <= 57:
                val = val * 10 - self.next + 48
                self.next = self.read()
        return val

class FastOutput:
    def __init__(self, output_stream):
        self.cache = bytearray()
        self.os = output_stream

    def append(self, csq):
        self.cache.extend(csq.encode())

    def append_line(self, c):
        self.append(str(c) + '\n')

    def flush(self):
        self.os.write(self.cache)
        self.os.flush()
        self.cache = bytearray()

if __name__ == "__main__":
    import io, sys
    input_data = '2 2 1\n'
    
    sys.stdin = io.StringIO(input_data)
    sys.stdout = io.StringIO()
    
    in_stream = FastInput(sys.stdin)
    out_stream = FastOutput(sys.stdout)
    
    h = in_stream.read_int()
    w = in_stream.read_int()
    t = in_stream.read_int()

    hh = h // GCDs.gcd(h, t)
    ww = w // GCDs.gcd(w, t)

    mod = Modular(10**9 + 7)
    power = Power(mod)

    way = 1
    way = mod.plus(way, mod.subtract(power.pow(2, hh), 2))
    way = mod.plus(way, mod.subtract(power.pow(2, ww), 2))
    way = mod.plus(way, power.pow(2, GCDs.gcd(hh, ww)))

    pow_mod = mod.get_modular_for_power_computation()
    p = pow_mod.mul(h // hh, w // ww)
    
    way = power.pow(way, p)
    out_stream.append_line(way)

    sys.stdout.seek(0)
    print(sys.stdout.read().strip())