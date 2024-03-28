class Combinatrics:
    mod = 1000000007

    def __init__(self, n):
        N = max(2, n + 1)
        self.fact = [1] * N
        self.inv = [1] * N
        self.finv = [1] * N
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % self.mod
            self.inv[i] = self.mod - self.inv[self.mod % i] * (self.mod // i) % self.mod
            self.finv[i] = self.finv[i - 1] * self.inv[i] % self.mod

    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[r] % self.mod * self.finv[n - r] % self.mod

    def surjection(self, n, k):
        ans = 0
        sign = -1 if k % 2 == 0 else 1
        for i in range(1, k + 1):
            ans += self.combination(k, i) * self.iteration_pow(i, n) * sign
            ans %= self.mod
            sign *= -1
        return self.modulus(ans)

    @staticmethod
    def iteration_pow(x, n):
        result = 1
        while n > 0:
            if n & 1:
                result = result * x % Combinatrics.mod
            x = x * x % Combinatrics.mod
            n >>= 1
        return result

    @staticmethod
    def modulus(a):
        return (a % Combinatrics.mod + Combinatrics.mod) % Combinatrics.mod

    def stirling(self, n, k):
        return self.surjection(n, k) * self.finv[k] % self.mod

    def bell(self, n, k):
        ans = 0
        for i in range(1, k + 1):
            ans += self.stirling(n, i)
            ans %= self.mod
        return ans


def main():
    n, k = map(int, input().split())
    c = Combinatrics(k)
    print(c.bell(n, k))


if __name__ == "__main__":
    main()