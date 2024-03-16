import sys

class FastScanner:
    def __init__(self):
        self.inp = sys.stdin.read()
        self.ptr = 0
        self.buflen = len(self.inp)
    
    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        return False
    
    def readByte(self):
        if self.hasNextByte():
            char = self.inp[self.ptr]
            self.ptr += 1
            return char
        return -1
    
    def isPrintableChar(self, c):
        return 33 <= c <= 126
    
    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(ord(self.inp[self.ptr])):
            self.ptr += 1
        return self.hasNextByte()
    
    def next(self):
        if not self.hasNext():
            raise StopIteration
        result = ""
        b = ord(self.readByte())
        while self.isPrintableChar(b):
            result += chr(b)
            b = ord(self.readByte())
        return result
    
    def nextLong(self):
        if not self.hasNext():
            raise StopIteration
        n = 0
        minus = False
        b = self.readByte()
        if b == 45:
            minus = True
            b = self.readByte()
        if not 48 <= b <= 57:
            raise ValueError
        while True:
            if 48 <= b <= 57:
                n *= 10
                n += int(chr(b))
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError
            b = self.readByte()
    
    def nextInt(self):
        nl = self.nextLong()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError
        return nl

class Combinatrics:
    mod = 1000000007
    
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
    
    def factInv(self, n):
        return self.finv[n]
    
    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[r] % self.mod * self.finv[n - r] % self.mod)
    
    def permutation(self, n, r):
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[n - r] % self.mod)
    
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
                ans += self.combination(k, i) * self.iterationPow(i, n)
                ans %= self.mod
            else:
                ans -= self.combination(k, i) * self.iterationPow(i, n)
                ans %= self.mod
            sign *= -1
        ans = self.mod(ans)
        return ans
    
    @staticmethod
    def iterationPow(x, n):
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

def main():
    sc = FastScanner()
    n = sc.nextInt()
    k = sc.nextInt()
    c = Combinatrics(k)
    print(c.surjection(n, k))

if __name__ == "__main__":
    main()