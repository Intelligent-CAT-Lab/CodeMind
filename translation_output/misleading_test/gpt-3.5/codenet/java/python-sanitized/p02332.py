import sys

mod = 1000000007

class Combinatrics:
    def __init__(self, n):
        self.fact = [0] * (n + 1)
        self.inv = [0] * (n + 1)
        self.finv = [0] * (n + 1)
        
        self.fact[0] = self.fact[1] = 1
        self.finv[0] = self.finv[1] = 1
        self.inv[1] = 1
        
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % mod
            self.inv[i] = mod - self.inv[mod % i] * (mod // i) % mod
            self.finv[i] = self.finv[i - 1] * self.inv[i] % mod
        
    def inv(self, n):
        return self.inv[n]

    def factorial(self, n):
        return self.fact[n]

    def fact_inv(self, n):
        return self.finv[n]

    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[r] % mod * self.finv[n - r] % mod)
    
    def permutation(self, n, r):
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[n - r] % mod)
    
    def homogeneous(self, n, r):
        if n == 0 and r == 0:
            return 1
        return self.combination(n + r - 1, r)


class FastScanner:
    def __init__(self):
        self.inp = sys.stdin
        self.ptr = 0
        self.buffer = b''
    
    def has_next_byte(self):
        return self.ptr < len(self.buffer)

    def read_byte(self):
        if self.has_next_byte():
            res = self.buffer[self.ptr]
            self.ptr += 1
            return res
        else:
            self.buffer = self.inp.buffer.read(1024)
            if not self.buffer:
                return -1
            self.ptr = 0
            return self.buffer[self.ptr]
    
    def is_printable_char(self, c):
        return 33 <= c <= 126

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration
        sb = ''
        b = self.read_byte()
        while self.is_printable_char(b):
            sb += chr(b)
            b = self.read_byte()
        return sb

    def next_long(self):
        if not self.has_next():
            raise StopIteration
        n = 0
        minus = False
        b = self.read_byte()
        if b == 45:
            minus = True
            b = self.read_byte()
        if b < 48 or b > 57:
            raise ValueError
        while True:
            if 48 <= b and b <= 57:
                n *= 10
                n += b - 48
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus else n
            else:
                raise ValueError
            b = self.read_byte()

    def next_int(self):
        nl = self.next_long()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError
        return int(nl)

sc = FastScanner()

n = sc.next_int()
k = sc.next_int()

c = Combinatrics(k)

print(c.permutation(k, n))