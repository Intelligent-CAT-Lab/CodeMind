import io
import sys

class FastScanner:
    def __init__(self, stream=None):
        self.stream = stream if stream else sys.stdin.buffer
        self.buffer = bytearray()
        self.ptr = 0

    def read(self):
        self.buffer.extend(self.stream.read())
        pos = 0
        while True:
            if pos == len(self.buffer):
                break
            b = self.buffer[pos]
            if 33 <= b <= 126:
                break
            pos += 1
        self.ptr = pos

    def next(self):
        self.read()
        if self.ptr == len(self.buffer):
            raise EOFError()
        start = self.ptr
        while self.ptr < len(self.buffer) and 33 <= self.buffer[self.ptr] <= 126:
            self.ptr += 1
        return self.buffer[start:self.ptr].decode('ascii')

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())
    

def hz_com_init(fac, finv, inv, MAX, MOD):
    fac[0] = fac[1] = 1
    finv[0] = finv[1] = 1
    inv[1] = 1
    for i in range(2, MAX):
        fac[i] = fac[i - 1] * i % MOD
        inv[i] = MOD - inv[MOD % i] * (MOD // i) % MOD
        finv[i] = finv[i - 1] * inv[i] % MOD

def hz_com(fac, finv, n, k, MOD):
    if n < k or n < 0 or k < 0:
        return 0
    return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD

def hz_swap(a, b):
    return max(a, b)

def hz_mod_sub(a, b, mod):
    v = a - b
    if v < 0:
        v += mod
    return v % mod

def hz_mod_div(a, b, mod):
    return a % mod * hz_mod_inv(b, mod) % mod

def hz_mod_inv(a, mod):
    return hz_mod_pow(a, mod - 2, mod)

def hz_mod_pow(n, k, mod):
    result = 1
    while k > 0:
        if k & 1:
            result = (result * n) % mod
        n = n * n % mod
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

    def is_same(self, x, y):
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
    sc = FastScanner()
    
    a = sc.next_long()
    b = sc.next_long()
    c = sc.next_long()
    d = sc.next_long()
    
    ans = a * c
    ans = max(ans, a * d)
    ans = max(ans, b * c)
    ans = max(ans, b * d)
    
    print(ans)


if __name__ == '__main__':
    solve_abc178_b()