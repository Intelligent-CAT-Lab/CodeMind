```python
import sys

class FastScanner:
    def __init__(self, source):
        self.in_stream = source
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.in_stream.readinto(self.buffer)
            except IOError as e:
                print(e)
            if self.buflen <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            val = self.buffer[self.ptr]
            self.ptr += 1
            return val
        else:
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

    def nextLong(self):
        if not self.hasNext():
            raise StopIteration
        n = 0
        minus = False
        b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        if b < ord('0') or b > ord('9'):
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

    def nextInt(self):
        nl = self.nextLong()
        if nl < -sys.maxsize - 1 or nl > sys.maxsize:
            raise ValueError
        return nl

    def nextDouble(self):
        return float(self.next())

def hz_COMinit(fac, finv, inv, MAX, MOD):
    fac[0] = fac[1] = 1
    finv[0] = finv[1] = 1
    inv[1] = 1
    for i in range(2, MAX):
        fac[i] = fac[i - 1] * i % MOD
        inv[i] = MOD - inv[MOD % i] * (MOD // i) % MOD
        finv[i] = finv[i - 1] * inv[i] % MOD

def hz_COM(fac, finv, n, k, MOD):
    if n < k:
        return 0
    if n < 0 or k < 0:
        return 0
    return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD

def hz_swap(a, b):
    return a if a >= b else b

def hz_modSub(a, b, mod):
    v = a - b
    if v < 0:
        v += mod
    return v % mod

def hz_modDiv(a, b, mod):
    return (a % mod) * hz_modInv(b, mod) % mod

def hz_modInv(a, mod):
    return hz_modPow(a, mod - 2, mod)

def hz_modPow(n, k, mod):
    result = 1
    
    while k > 0:
        if k & 1:
            result = (result * n) % mod
        n = (n * n) % mod
        k >>= 1
    
    return result

class HZ_UF:
    def __init__(self, n):
        self.par = [-1] * (n + 1)
        self.rank = [0] * (n + 1)

    def unite(self, x, y):
        self.link(self.root(x), self.root(y))

    def link(self, x, y):
        if x == y:
            return False
        if self.rank[x] > self.rank[y]:
            self.par[x] += self.par[y]
            self.par[y] = x
        else:
            self.par[y] += self.par[x]
            self.par[x] = y
            if self.rank[x] == self.rank[y]:
                self.rank[y] += 1
        return True

    def isSame(self, x, y):
        return self.root(x) == self.root(y)

    def root(self, x):
        if self.par[x] < 0:
            return x
        else:
            self.par[x] = self.root(self.par[x])
            return self.par[x]

    def size(self, x):
        return -self.par[self.root(x)]

def solve_abc178_b():
    sc = FastScanner(sys.stdin)
    
    a = sc.nextLong()
    b = sc.nextLong()
    c = sc.nextLong()
    d = sc.nextLong()
    
    ans = a * c
    ans = max(ans, a * d)
    ans = max(ans, b * c)
    ans = max(ans, b * d)
    
    print(ans)

if __name__ == "__main__":
    solve_abc178_b()
```
```
