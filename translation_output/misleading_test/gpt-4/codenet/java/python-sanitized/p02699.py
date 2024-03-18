from itertools import permutations

class p02699:
    INF = float('inf')
    MOD = 1_000_000_007
    SIZE = 1_000_000
    fac = [0] * SIZE
    inv = [0] * SIZE
    finv = [0] * SIZE
    
    def __init__(self):
        self.initCOMB()
    
    def solve(self):
        s, w = map(int, input().split())
        
        if w >= s:
            print("unsafe")
        else:
            print("safe")

    @staticmethod
    def gcd(a, b):
        while b:
            a, b = b, a % b
        return a

    @staticmethod
    def lcm(a, b):
        return a * b // p02699.gcd(a, b)

    def pow(self, a, r):
        result = 1
        a %= self.MOD
        while r > 0:
            if r & 1:
                result = result * a % self.MOD
            a = a * a % self.MOD
            r >>= 1
        return result

    def inv(self, a):
        return self.pow(a, self.MOD - 2)

    def fact(self, n):
        if n == 0:
            return 1
        return n * self.fact(n - 1)

    def initCOMB(self):
        self.fac[0] = self.fac[1] = 1
        self.inv[1] = 1
        self.finv[0] = self.finv[1] = 1
        for i in range(2, self.SIZE):
            self.fac[i] = self.fac[i - 1] * i % self.MOD
            self.inv[i] = self.MOD - self.inv[self.MOD % i] * (self.MOD // i) % self.MOD
            self.finv[i] = self.finv[i - 1] * self.inv[i] % self.MOD

    def modComb(self, n, r):
        if n < r or n < 0 or r < 0:
            return 0
        return self.fac[n] * self.finv[r] % self.MOD * self.finv[n - r] % self.MOD

    def comb(self, n, r):
        num = 1
        for i in range(1, r + 1):
            num = num * (n - i + 1) // i
        return num

    @staticmethod
    def isPrime(a):
        if a <= 1:
            return False
        for i in range(2, int(a ** 0.5) + 1):
            if a % i == 0:
                return False
        return True

    @staticmethod
    def nextPermutation(s):
        perms = sorted(set(list(permutations(s))))
        try:
            return "".join(perms[perms.index(tuple(s)) + 1])
        except (ValueError, IndexError):
            return None

    @staticmethod
    def elimination(a, b):
        n = len(a)
        for k in range(n - 1):
            for i in range(k + 1, n):
                f = -a[i][k] / a[k][k]
                for j in range(k + 1, n):
                    a[i][j] += f * a[k][j]
                b[i] += f * b[k]

        for i in range(n - 1, -1, -1):
            for j in range(i + 1, n):
                b[i] -= a[i][j] * b[j]
            b[i] /= a[i][i]

# Example usage
p = p02699()
p.solve()