class FastInput:
    def __init__(self, is):
        self.is_stream = is
        self.buf = bytearray(2 ** 13)
        self.buf_len = 0
        self.buf_offset = 0
        self.next_byte = 0

    def read(self):
        while self.buf_len == self.buf_offset:
            self.buf_offset = 0
            try:
                self.buf_len = self.is_stream.readinto(self.buf)
            except OSError:
                self.buf_len = -1
            if self.buf_len == -1:
                return -1
        return self.buf[self.buf_offset]

    def skip_blank(self):
        while self.next_byte >= 0 and self.next_byte <= 32:
            self.next_byte = self.read()

    def read_int(self):
        sign = 1
        self.skip_blank()
        if self.next_byte == ord('+') or self.next_byte == ord('-'):
            sign = 1 if self.next_byte == ord('+') else -1
            self.next_byte = self.read()

        val = 0
        if sign == 1:
            while self.next_byte >= ord('0') and self.next_byte <= ord('9'):
                val = val * 10 + self.next_byte - ord('0')
                self.next_byte = self.read()
        else:
            while self.next_byte >= ord('0') and self.next_byte <= ord('9'):
                val = val * 10 - self.next_byte + ord('0')
                self.next_byte = self.read()

        return val

class FastOutput:
    def __init__(self, os):
        self.cache = bytearray()
        self.os = os

    def append(self, obj):
        if isinstance(obj, int):
            self.cache.extend(str(obj).encode())
        elif isinstance(obj, str):
            self.cache.extend(obj.encode())
        elif isinstance(obj, bytearray):
            self.cache.extend(obj)

    def println(self, obj=None):
        if obj is not None:
            self.append(obj)
        self.cache.extend(b'\n')

    def flush(self):
        self.os.write(self.cache)
        self.os.flush()
        self.cache = bytearray()

    def close(self):
        self.flush()
        self.os.close()

if __name__ == "__main__":
    import sys

    def solve(h, w, t):
        hh = h // gcd(h, t)
        ww = w // gcd(w, t)

        MOD = 10**9 + 7

        def gcd(a, b):
            return a if b == 0 else gcd(b, a % b)

        def power(x, n):
            if n == 0:
                return 1
            r = power(x, n // 2)
            r = r * r % MOD
            if n % 2 == 1:
                r = r * x % MOD
            return r

        way = 1
        way = (way + (power(2, hh) - 2) % MOD) % MOD
        way = (way + (power(2, ww) - 2) % MOD) % MOD
        way = (way + power(2, gcd(hh, ww))) % MOD

        powMod = MOD - 1
        p = (h // hh) * (w // ww) % powMod
        way = power(way, p)

        return way

    input_stream = sys.stdin.buffer
    output_stream = sys.stdout.buffer

    in_stream = FastInput(input_stream)
    out_stream = FastOutput(output_stream)

    h, w, t = in_stream.read_int(), in_stream.read_int(), in_stream.read_int()
    result = solve(h, w, t)
    out_stream.println(result)
    out_stream.flush()