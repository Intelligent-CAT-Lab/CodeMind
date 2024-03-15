```python
import sys

def is_printable_char(c):
    return 33 <= c <= 126

class FastScanner:
    def __init__(self):
        self.buffer = []
        self.ptr = 0

    def has_next_byte(self):
        if self.ptr < len(self.buffer):
            return True
        else:
            self.ptr = 0
            self.buffer = sys.stdin.buffer.read(1024)
            return len(self.buffer) > 0

    def read_byte(self):
        if self.has_next_byte():
            byte = self.buffer[self.ptr]
            self.ptr += 1
            return byte
        else:
            return -1

    def next(self):
        while self.has_next_byte() and not is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        
        sb = []
        b = self.read_byte()
        
        while is_printable_char(b):
            sb.append(chr(b))
            b = self.read_byte()
        
        return ''.join(sb)

    def next_int(self):
        nl = int(self.next())
        if nl < -sys.maxsize-1 or nl > sys.maxsize:
            raise ValueError("Integer out of range")
        return nl

    def next_long(self):
        return int(self.next())
		
class Combinatrics:
    mod = 1000000007
    
    def __init__(self, n):
        self.fact = [0] * (n+1)
        self.inv = [0] * (n+1)
        self.finv = [0] * (n+1)
        self.fact[0] = self.fact[1] = 1
        self.finv[0] = self.finv[1] = 1
        self.inv[1] = 1
        
        for i in range(2,n+1):
            self.fact[i] = (self.fact[i-1] * i) % self.mod
            self.inv[i] = self.mod - (self.inv[self.mod % i] * (self.mod // i)) % self.mod
            self.finv[i] = (self.finv[i-1] * self.inv[i]) % self.mod
    
    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[r] % self.mod * self.finv[n-r] % self.mod)

def main():
    sc = FastScanner()
    
    n = sc.next_int()
    k = sc.next_int()
    
    c = Combinatrics(k)
    
    print(c.combination(k, n))

if __name__ == "__main__":
    main()
```

