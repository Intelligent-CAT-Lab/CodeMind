import sys

MOD = 1000000007

class Combinatrics:
    def __init__(self, n):
        N = max(2, n + 1)
        self.fact = [0] * N
        self.inv = [0] * N
        self.finv = [0] * N
        self.fact[0] = self.fact[1] = 1
        self.finv[0] = self.finv[1] = 1
        self.inv[1] = 1
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % MOD
            self.inv[i] = MOD - self.inv[MOD % i] * (MOD // i) % MOD
            self.finv[i] = self.finv[i - 1] * self.inv[i] % MOD
        
    def inv(self, n):
        return self.inv[n]

    def factorial(self, n):
        return self.fact[n]

    def fact_inv(self, n):
        return self.finv[n]
    
    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[r] % MOD * self.finv[n - r] % MOD)

    def permutation(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[n - r] % MOD

    def homogeneous(self, n, r):
        if n == 0 and r == 0:
            return 1
        return self.combination(n + r - 1, r)

    def surjection(self, n, k):
        ans = 0
        sign = 1

        if k % 2 == 0:
            sign = -1

        for i in range(1, k + 1):
            if sign == 1:
                ans += self.combination(k, i) * self.iteration_pow(i, n)
                ans %= MOD
            else:
                ans -= self.combination(k, i) * self.iteration_pow(i, n)
                ans %= MOD
            sign *= -1

        ans = self.mod(ans)
        return ans

    @staticmethod
    def iteration_pow(x, n):
        sum = 1
        while n > 0:
            if n & 1 == 1:
                sum *= x
                sum %= MOD
            x *= x
            x %= MOD
            n >>= 1
        return sum

    @staticmethod
    def mod(a):
        return (a % MOD + MOD) % MOD

    def stirling(self, n, k):
        return self.surjection(n, k) * self.fact_inv(k) % MOD

    def bell(self, n, k):
        ans = 0
        for i in range(1, k + 1):
            ans += self.stirling(n, i)
            ans %= MOD
        return ans

class FastScanner:
    def __init__(self):
        self.input_stream = sys.stdin
        self.buffer = bytearray()
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.input_stream.readinto(self.buffer)
            except IOError:
                return False
            if self.buflen <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte():
            value = self.buffer[self.ptr]
            self.ptr += 1
            return value
        else:
            return -1

    @staticmethod
    def is_printable_char(c):
        return 33 <= c <= 126

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration
        sb = bytearray()
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(b)
            b = self.read_byte()
        return sb.decode()

    def next_long(self):
        if not self.has_next():
            raise StopIteration
        n = 0
        minus = False
        b = self.read_byte()
        if b == ord('-'):
            minus = True
            b = self.read_byte()
        if b < ord('0') or b > ord('9'):
            raise ValueError
        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus else n
            else:
                raise ValueError
            b = self.read_byte()

    def next_int(self):
        nl = self.next_long()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError
        return nl

# Test input
n, k = map(int, input().split())

sc = FastScanner()
c = Combinatrics(k)

print(c.bell(n, k))