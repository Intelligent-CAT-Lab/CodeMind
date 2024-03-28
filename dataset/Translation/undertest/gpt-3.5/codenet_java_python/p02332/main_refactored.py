class main:
    import sys
    import math
    
    mod = 1000000007
    
    class Combinatrics:
        
        def __init__(self, n):
            self.fact = [0] * (n+1)
            self.inv = [0] * (n+1)
            self.finv = [0] * (n+1)
            self.fact[0] = self.fact[1] = 1
            self.finv[0] = self.finv[1] = 1
            self.inv[1] = 1
            for i in range(2, n+1):
                self.fact[i] = (self.fact[i-1] * i) % mod
                self.inv[i] = mod - self.inv[mod % i] * (mod // i) % mod
                self.finv[i] = (self.finv[i-1] * self.inv[i]) % mod
    
        def permutation(self, n, r):
            if n < r or r < 0:
                return 0
            return (self.fact[n] * self.finv[n-r]) % mod
    
    class FastScanner:
        
        def __init__(self):
            self.inp = sys.stdin.buffer.raw.read
            self.ptr = 0
            self.buffer = b''
        
        def hasNextByte(self):
            if self.ptr < len(self.buffer):
                return True
            while True:
                self.buffer = self.inp(1 << 15)
                if not self.buffer:
                    break
                self.ptr = 0
                if self.ptr < len(self.buffer):
                    return True
            return False
        
        def readByte(self):
            if self.hasNextByte():
                result = self.buffer[self.ptr]
                self.ptr += 1
                return result
            else:
                return -1
        
        def isPrintableChar(self, c):
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
        
        def nextInt(self):
            return int(self.next())
    
    if __name__ == "__main__":
        sc = FastScanner()
        n = sc.nextInt()
        k = sc.nextInt()
        
        c = Combinatrics(k)
        
        print(c.permutation(n, k))