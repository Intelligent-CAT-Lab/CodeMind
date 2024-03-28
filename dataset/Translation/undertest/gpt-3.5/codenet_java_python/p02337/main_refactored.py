class main:
    mod = 1000000007
    
    class Combinatrics:
        def __init__(self, n):
            N = max(2, n+1)
            self.fact = [0] * N
            self.inv = [0] * N
            self.finv = [0] * N
            self.fact[0] = self.fact[1] = 1
            self.finv[0] = self.finv[1] = 1
            self.inv[1] = 1
            for i in range(2, n+1):
                self.fact[i] = self.fact[i-1] * i % mod
                self.inv[i] = mod - self.inv[mod % i] * (mod // i) % mod
                self.finv[i] = self.finv[i-1] * self.inv[i] % mod
        
        def inv(self, n):
            return self.inv[n]
        
        def factorial(self, n):
            return self.fact[n]
        
        def factInv(self, n):
            return self.finv[n]
        
        def combination(self, n, r):
            if n < r or r < 0:
                return 0
            return (self.fact[n] * self.finv[r] % mod * self.finv[n-r] % mod)
    
        # additional methods here...
    
        def stirling(self, n, k):
            return (self.surjection(n, k) * self.factInv(k)) % mod
    
        def bell(self, n, k):
            ans = 0
            for i in range(1, k+1):
                ans += self.stirling(n, i)
                ans %= mod
            return ans
    
    import sys
    from collections.abc import Iterable
    
    class FastScanner:
        def __init__(self):
            self.inp = sys.stdin
            self.buffer = bytearray()
            self.ptr = 0
            self.buflen = 0
    
        def has_next_byte(self):
            if self.ptr < self.buflen:
                return True
            else:
                self.ptr = 0
                try:
                    self.buflen = self.inp.readinto(self.buffer)
                except EOFError:
                    self.buflen = 0
                if self.buflen <= 0:
                    return False
            return True
    
        def read_byte(self):
            if self.has_next_byte():
                return self.buffer[self.ptr]
            else:
                return -1
    
        @staticmethod
        def is_printable_char(c):
            return 33 <= c <= 126
    
        def has_next(self):
            while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
                self.ptr += 1
            return self.has_next_byte()
    
        def read_string(self):
            if not self.has_next():
                raise StopIteration
            sb = bytearray()
            b = self.read_byte()
            while self.is_printable_char(b):
                sb.append(b)
                b = self.read_byte()
            return sb.decode().strip()
    
        def read_long(self):
            if not self.has_next():
                raise StopIteration
            n = 0
            minus = False
            b = self.read_byte()
            if b == 45:  # '-'
                minus = True
                b = self.read_byte()
            if b < 48 or b > 57:
                raise ValueError
            while True:
                if 48 <= b <= 57:
                    n *= 10
                    n += b - 48
                elif b == -1 or not self.is_printable_char(b):
                    return -n if minus else n
                else:
                    raise ValueError
                b = self.read_byte()
    
        def read_int(self):
            nl = self.read_long()
            if nl < -sys.maxsize-1 or nl > sys.maxsize:
                raise ValueError
            return int(nl)
    
    scanner = FastScanner()
    n = scanner.read_int()
    k = scanner.read_int()
    
    c = Combinatrics(k)
    print(c.bell(n, k))