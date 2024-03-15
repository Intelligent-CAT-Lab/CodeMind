```python
import sys
import math

class InputReader:
    def __init__(self):
        self.stream = sys.stdin
        self.buf = bytearray()
        self.pointer = 0
        self.buffer_size = 0

    def read(self):
        if self.buffer_size == -1:
            raise Exception('Input Mismatch Exception')
        
        if self.pointer >= self.buffer_size:
            self.pointer = 0
            self.buf = bytearray(self.stream.read(1024))
            if not self.buf:
                return -1
            self.buffer_size = len(self.buf)
        
        return self.buf[self.pointer]
    
    def next_line(self):
        try:
            return input()
        except EOFError:
            return None
    
    def next_int(self):
        value = self.read()
        
        while self.is_space_char(value):
            value = self.read()
        
        sign = 1
        if value == ord('-'):
            sign = -1
            value = self.read()
        
        result = 0
        while not self.is_space_char(value):
            if value < ord('0') or value > ord('9'):
                raise Exception('Input Mismatch Exception')
            result = result * 10 + value - ord('0')
            value = self.read()
        
        return result * sign
    
    def next_long(self):
        value = self.read()
        
        while self.is_space_char(value):
            value = self.read()
        
        sign = 1
        if value == ord('-'):
            sign = -1
            value = self.read()
        
        result = 0
        while not self.is_space_char(value):
            if value < ord('0') or value > ord('9'):
                raise Exception('Input Mismatch Exception')
            result = result * 10 + value - ord('0')
            value = self.read()
        
        return result * sign
    
    def next_double(self):
        # Not implemented in this conversion

    def read_string(self):
        value = self.read()
        
        while self.is_space_char(value):
            value = self.read()
        
        result = bytearray()
        while not self.is_space_char(value):
            result.append(value)
            value = self.read()
        
        return result.decode()
    
    def is_space_char(self, char):
        return char == ord(' ') or char == ord('\n') or char == ord('\r') or char == ord('\t') or char == -1

class p02685:
    def __init__(self):
        self.out = sys.stdout
        self.sc = InputReader()
        self.mod = 998244353

    def main(self):
        n = self.sc.next_int()
        m = self.sc.next_long()
        k = self.sc.next_long()
        ans = 0
        self.fact = [0]*(n+1)
        self.ifact = [0]*(n+1)

        self.fact[0] = self.fact[1] = self.ifact[0] = self.ifact[1] = 1
        
        for i in range(2, n+1):
            self.fact[i] = self.mul(self.fact[i-1], i)
            self.ifact[i] = self.mod_inv(self.fact[i], self.mod)

        for i in range(0, k+1):
            ans = self.add(ans, self.mul(m, self.mul(self.mod_pow(m-1, n-(i+1), self.mod), self.nCr(n-1, i))))
        
        self.out.write(str(ans) + '\n')
        self.out.flush()

    def mod_pow(self, a, p, m):
        if a == 1:
            return 1
        
        ans = 1
        while p > 0:
            if p % 2 == 1:
                ans = (ans * a) % m
            a = (a * a) % m
            p >>= 1
        
        return ans

    def mod_inv(self, a, m):
        return self.mod_pow(a, m-2, m)

    def nCr(self, n, r):
        return self.mul(self.fact[n], self.mul(self.ifact[r], self.ifact[n-r]))

    def sub(self, a, b):
        a %= self.mod
        b %= self.mod
        return ((a - b) % self.mod + self.mod) % self.mod

    def mul(self, a, b):
        a %= self.mod
        b %= self.mod
        return (a * b) % self.mod

    def add(self, a, b):
        a %= self.mod
        b %= self.mod
        return (a + b) % self.mod

if __name__ == '__main__':
    p = p02685()
    p.main()
```

