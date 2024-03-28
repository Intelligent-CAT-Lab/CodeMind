import sys

class Combinatrics:
    
    def __init__(self, n):
        mod = 1000000007
        N = max(2, n + 1)
        fact = [0] * N
        inv = [0] * N
        finv = [0] * N
        fact[0] = fact[1] = 1
        finv[0] = finv[1] = 1
        inv[1] = 1
        for i in range(2, n + 1):
            fact[i] = fact[i - 1] * i % mod
            inv[i] = mod - inv[mod % i] * (mod // i) % mod
            finv[i] = finv[i - 1] * inv[i] % mod

    def inv(self, n):
        return self.inv[n]

    def factorial(self, n):
        return self.fact[n]

    def fact_inv(self, n):
        return self.finv[n]

    def combination(self, n, r):
        mod = 1000000007
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[r] % mod * self.finv[n - r] % mod)

    def permutation(self, n, r):
        mod = 1000000007
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[n - r] % mod)

    def homogeneous(self, n, r):
        mod = 1000000007
        if n == 0 and r == 0:
            return 1
        return self.combination(n + r - 1, r)

    def surjection(self, n, k):
        mod = 1000000007
        ans = 0
        sign = 1
        if k % 2 == 0:
            sign = -1
        for i in range(1, k + 1):
            if sign == 1:
                ans += self.combination(k, i) * self.iteration_pow(i, n)
                ans %= mod
            else:
                ans -= self.combination(k, i) * self.iteration_pow(i, n)
                ans %= mod
            sign *= -1
        ans = self.mod(ans)
        return ans

    @staticmethod
    def iteration_pow(x, n):
        mod = 1000000007
        sum = 1
        while n > 0:
            if n & 1 == 1:
                sum *= x
                sum %= mod
            x *= x
            x %= mod
            n >>= 1
        return sum

    @staticmethod
    def mod(a):
        mod = 1000000007
        return (a % mod + mod) % mod

    def stirling(self, n, k):
        mod = 1000000007
        return (self.surjection(n, k) * self.fact_inv(k) % mod)

    def bell(self, n, k):
        mod = 1000000007
        ans = 0
        for i in range(1, k + 1):
            ans += self.stirling(n, i)
            ans %= mod
        return ans


class FastScanner:
    
    def __init__(self):
        self.inp = sys.stdin.buffer
        self.buffer = b""
        self.ptr = 0
        self.buflen = 0
    
    def _has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buflen = self.inp.readinto(self.buffer)
            if self.buflen <= 0:
                return False
        return True
    
    def _read_byte(self):
        if self._has_next_byte():
            return self.buffer[self.ptr:self.ptr + 1]
        else:
            return -1
    
    @staticmethod
    def _is_printable_char(c):
        return 33 <= c <= 126
    
    def _has_next(self):
        while self._has_next_byte() and not self._is_printable_char(int.from_bytes(self.buffer[self.ptr:self.ptr + 1], byteorder='big')):
            self.ptr += 1
        return self._has_next_byte()
    
    def next(self):
        if not self._has_next():
            raise StopIteration
        sb = bytearray()
        b = self._read_byte()
        while self._is_printable_char(int.from_bytes(b, byteorder='big')):
            sb.extend(b)
            b = self._read_byte()
        return sb.decode()
    
    def next_long(self):
        n = 0
        minus = False
        b = self._read_byte()
        if b == b"-":
            minus = True
            b = self._read_byte()
        
        while b[0] >= 48 and b[0] <= 57:
            n *= 10
            n += b[0] - 48
            b = self._read_byte()
        
        if b == -1 or not self._is_printable_char(b[0]):
            return -n if minus else n
        else:
            raise ValueError
    
    def next_int(self):
        nl = self.next_long()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError
        return int(nl)
      

def main():
    sc = FastScanner()
    n = sc.next_int()
    k = sc.next_int()
    
    c = Combinatrics(k)

    print(c.bell(n, k))


if __name__ == "__main__":
    main()