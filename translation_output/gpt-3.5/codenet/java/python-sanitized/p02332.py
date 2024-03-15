import sys
import threading

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
        return (self.fact[n] * self.finv[r] % mod * self.finv[n - r] % mod)

    def permutation(self, n, r):
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[n - r] % mod)

    def homogeneous(self, n, r):
        if n == 0 and r == 0:
            return 1
        return self.combination(n + r - 1, r)

class FastScanner:
    def __init__(self):
        self.inp = sys.stdin.buffer.read().split()
        self.ptr = 0

    def next(self):
        return self.inp[self.ptr]

    def nextInt(self):
        return int(self.next())

def main():
    sc = FastScanner()
    n = sc.nextInt()
    k = sc.nextInt()

    c = Combinatrics(k)

    print(c.permutation(k, n))

if __name__ == '__main__':
    threading.stack_size(16 * 1024 * 1024)
    sys.setrecursionlimit(10 ** 7)
    thread = threading.Thread(target=main)
    thread.start()
    thread.join()