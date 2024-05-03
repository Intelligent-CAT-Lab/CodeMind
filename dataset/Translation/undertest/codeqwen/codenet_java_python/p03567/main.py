class UnionFind:
    def __init__(self, n):
        self.Parent = [-1] * n

    def root(self, A):
        if self.Parent[A] < 0:
            return A
        self.Parent[A] = self.root(self.Parent[A])
        return self.Parent[A]

    def size(self, A):
        return -self.Parent[self.root(A)]

    def connect(self, A, B):
        A = self.root(A)
        B = self.root(B)
        if A == B:
            return False
        if self.size(A) < self.size(B):
            A, B = B, A
        self.Parent[A] += self.Parent[B]
        self.Parent[B] = A
        return True

class p03567:
    scan = FastScanner()
    scanner = scanner = scanner.Scanner(sys.stdin)
    rand = random.Random()
    mod = 1000000007
    eps = 0.0000000001
    big = sys.maxsize
    
    @staticmethod
    def modint(a, m):
        b = m
        u = 1
        v = 0
        while b != 0:
            t = a // b
            a -= t * b
            x = a
            a = b
            b = x

            u -= t * v
            x = u
            u = v
            v = x
        u %= m
        if u < 0:
            u += m
        return u

    @staticmethod
    def modpow(x, n, mo):
        sum = 1
        while n > 0:
            if (n & 1) == 1:
                sum = sum * x % mo
            x = x * x % mo
            n >>= 1
        return sum

    @staticmethod
    def revch(ch):
        ret = [0] * len(ch)
        for i in range(len(ch) - 1, -1, -1):
            ret[len