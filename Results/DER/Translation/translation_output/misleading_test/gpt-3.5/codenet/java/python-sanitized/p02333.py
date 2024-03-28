mod = 1000000007
fact = None
inv = None
finv = None


class Combinatrics:
    @staticmethod
    def modify(a):
        return (a % mod + mod) % mod

    def __init__(self, n):
        N = max(2, n + 1)
        global fact, inv, finv
        fact = [0] * N
        inv = [0] * N
        finv = [0] * N
        fact[0] = fact[1] = 1
        finv[0] = finv[1] = 1
        inv[1] = 1

        for i in range(2, n + 1):
            fact[i] = fact[i - 1] * i % mod
            inv[i] = mod - inv[mod % i] * (mod // i) % mod
            finv[i] = finv[i - 1] * inv[i] % mod

    def inverse(self, n):
        return inv[n]

    def factorial(self, n):
        return fact[n]

    def factorial_inverse(self, n):
        return finv[n]

    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return (fact[n] * finv[r] % mod * finv[n - r] % mod)

    def permutation(self, n, r):
        if n < r or r < 0:
            return 0
        return (fact[n] * finv[n - r] % mod)

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
                ans += self.combination(k, i) * self.iteration_pow(i, n)
                ans %= mod
            else:
                ans -= self.combination(k, i) * self.iteration_pow(i, n)
                ans %= mod

            sign *= -1

        return int(self.modify(ans))

    @staticmethod
    def iteration_pow(x, n):
        sum_val = 1

        while n > 0:
            if (n & 1) == 1:
                sum_val *= x
                sum_val %= mod

            x *= x
            x %= mod
            n >>= 1

        return sum_val


class FastScanner:
    def __init__(self):
        pass

    @staticmethod
    def has_next():
        ptr = 0
        buflen = 0
        while True:
            if ptr < buflen:
                return True
            else:
                ptr = 0
                try:
                    buflen = sys.stdin.read(1024)
                except IOError:
                    raise

                if buflen <= 0:
                    return False

        return True

    @staticmethod
    def read_byte():
        if FastScanner.has_next():
            return sys.stdin[ptr]
        else:
            return -1

    @staticmethod
    def is_printable_char(c):
        return 33 <= c <= 126

    @staticmethod
    def next():
        if not FastScanner.has_next():
            raise ValueError("No more input")

        sb = ''
        b = FastScanner.read_byte()
        while FastScanner.is_printable_char(b):
            sb += chr(b)
            b = FastScanner.read_byte()
        return sb

    @staticmethod
    def next_long():
        if not FastScanner.has_next():
            raise ValueError("No more input")

        n = 0
        minus = False
        b = FastScanner.read_byte()
        if b == '-':
            minus = True
            b = FastScanner.read_byte()

        if b < ord('0') or ord('9') < b:
            raise ValueError("Invalid input")

        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not FastScanner.is_printable_char(b):
                return -n if minus else n
            else:
                raise ValueError("Invalid input")

            b = FastScanner.read_byte()

    def next_int():
        nl = FastScanner.next_long()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError("Out of range")

        return int(nl)


def main():
    sc = FastScanner()
    n = sc.next_int()
    k = sc.next_int()

    c = Combinatrics(k)

    print(c.surjection(n, k))


if __name__ == "__main__":
    import sys
    sys.stdin = open(0)

    main()