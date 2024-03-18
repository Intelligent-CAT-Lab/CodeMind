import sys
import math
import random

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

    def plus(self, x, y):
        return self.value_of(x + y)

    def subtract(self, x, y):
        return self.value_of(x - y)

class BitOperator:
    def bit_at(self, x, i):
        return (x >> i) & 1

class Composite:
    def __init__(self, limit, mod):
        self.factorial = Factorial([0]*(limit+1), [0]*(limit+1), InverseNumber(limit, mod), limit, mod)
        self.modular = mod

    def composite(self, m, n):
        if n > m:
            return 0
        return self.modular.mul(self.modular.mul(self.factorial.fact[m], self.factorial.inv[n]), self.factorial.inv[m - n])

class FastIO:
    def __init__(self, charset):
        self.is = sys.stdin
        self.os = sys.stdout
        self.charset = charset
        self.buf = bytearray(1 << 20)
        self.buf_len = 0
        self.buf_offset = 0
        self.next = 0

    def read(self):
        while self.buf_len == self.buf_offset:
            self.buf_offset = 0
            self.buf_len = self.is.readinto(self.buf)
            if self.buf_len == 0:
                return -1
        result = self.buf[self.buf_offset]
        self.buf_offset += 1
        return result

    def skip_blank(self):
        while self.next >= 0 and self.next <= 32:
            self.next = self.read()

    def read_int(self):
        sign = 1
        self.skip_blank()
        if self.next == 43 or self.next == 45:  # '+' or '-'
            sign = 1 if self.next == 43 else -1
            self.next = self.read()
        val = 0
        if sign == 1:
            while 48 <= self.next <= 57:  # '0' to '9'
                val = val * 10 + self.next - 48
                self.next = self.read()
        else:
            while 48 <= self.next <= 57:
                val = val * 10 - self.next + 48
                self.next = self.read()
        return val

    def flush(self):
        self.os.write(self.cache.encode(self.charset))
        self.os.flush()
        self.cache = bytearray()

mod = Modular(1000000007)
comp = Composite(1000000, mod)
bit_op = BitOperator()

def solve(n, m, l, r):
    l_part = m
    r_part = n - m
    cache1 = [0] * (r + 1)
    cache2 = [0] * (r + 1)
    for x in range(1, len(cache1)):
        local_sum = 0
        for j in range(r_part + 1):
            c = comp.composite(r_part, j)
            number_of_x = l_part + j
            sub = number_of_x * x
            if number_of_x * x > r:
                break
            plus = mod.mul(c, mod.subtract(in_range(n, r - sub), in_range(n, l - 1 - sub)))
            if bit_op.bit_at(j, 0) == 1:
                plus = -plus
            local_sum = mod.plus(local_sum, plus)
        cache1[x] = mod.mul(local_sum, comp.composite(n, l_part))
    
    for x in range(1, len(cache2)):
        local_sum = 0
        for j in range(r_part + 1):
            c = comp.composite(r_part, j)
            number_of_x = l_part + j
            sub = number_of_x * x + l_part
            if number_of_x * x + l_part > r:
                break
            plus = mod.mul(c, mod.subtract(in_range(n, r - sub), in_range(n, l - 1 - sub)))
            if bit_op.bit_at(j, 0) == 1:
                plus = -plus
            local_sum = mod.plus(local_sum, plus)
        cache2[x] = mod.mul(local_sum, comp.composite(n, l_part))
    
    sum_val = mod.subtract(in_range(n, r), in_range(n, l - 1))
    for i in range(r + 1):
        plus = mod.subtract(cache1[i], cache2[i])
        sum_val = mod.subtract(sum_val, plus)
    
    return sum_val

def in_range(n, m):
    return comp.composite(m + n, n)

def main():
    io = FastIO("ascii")
    n = io.read_int()
    m = io.read_int()
    l = io.read_int()
    r = io.read_int()
    result = solve(n, m, l, r)
    io.os.write(str(result).encode(io.charset))
    io.flush()

if __name__ == "__main__":
    main()