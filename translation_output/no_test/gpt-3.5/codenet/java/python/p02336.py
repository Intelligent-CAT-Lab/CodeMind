```python
import sys
from collections import defaultdict

class Combinatrics:
    
    mod = 10**9 + 7
    
    def __init__(self, n):
        N = max(2, n + 1)
        self.fact = [0] * N
        self.inv = [0] * N
        self.finv = [0] * N
        self.fact[0] = self.fact[1] = 1
        self.finv[0] = self.finv[1] = 1
        self.inv[1] = 1
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % self.mod
            self.inv[i] = self.mod - self.inv[self.mod % i] * (self.mod // i) % self.mod
            self.finv[i] = self.finv[i - 1] * self.inv[i] % self.mod
        
    def inv(self, n):
        return self.inv[n]
    
    def factorial(self, n):
        return self.fact[n]
    
    def fact_inv(self, n):
        return self.finv[n]
    
    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[r] % self.mod * self.finv[n - r] % self.mod)
    
    def permutation(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[n - r] % self.mod
    
    def homogeneous(self, n, r):
        if n == 0 and r == 0:
            return 1
        return self.combination(n + r - 1, r)


class FastScanner:
    
    def __init__(self):
        self.inp = sys.stdin.buffer
        self.buffer = bytearray()
        self.ptr = 0
        self.buflen = 0
        
    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buffer = self.inp.read(1024)
            if not self.buffer:
                return False
            self.buflen = len(self.buffer)
            return True
        
    def readByte(self):
        if self.hasNextByte():
            self.ptr += 1
            return self.buffer[self.ptr - 1]
        return -1
    
    @staticmethod
    def isPrintableChar(c):
        return 33 <= c <= 126
    
    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()
    
    def next(self):
        if not self.hasNext():
            raise StopIteration
        sb = bytearray()
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(b)
            b = self.readByte()
        return sb.decode()
    
    def next_long(self):
        if not self.hasNext():
            raise StopIteration
        n = 0
        minus = False
        b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        if not ord('0') <= b <= ord('9'):
            raise ValueError
        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError
            b = self.readByte()
    
    def next_int(self):
        x = self.next_long()
        if x < -2147483648 or x > 2147483647:
            raise ValueError
        return x

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

def main():
    sc = FastScanner()

    n = sc.next_int()
    k = sc.next_int()
    
    c = Combinatrics(n - 1)

    print(c.homogeneous(k, n - k))

if __name__ == '__main__':
    main()

```
