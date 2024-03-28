import sys

class p02697:
    @staticmethod
    def repow(b, p):
        a = b
        res = 1
        while p > 0:
            if p % 2 == 1:
                res *= a
            a *= a
            p //= 2
        return res

    @staticmethod
    def repow_modder(b, p, modder):
        a = b % modder
        res = 1
        while p > 0:
            if p % 2 == 1:
                res = (res * a) % modder
            a = (a * a) % modder
            p //= 2
        return res

    @staticmethod
    def gcd(c, d):
        while True:
            f = c % d
            if f == 0:
                return d
            c, d = d, f

    @staticmethod
    def lcm(c, d):
        return c // p02697.gcd(c, d) * d

    @staticmethod
    def div_list(n):
        div = []
        for i in range(1, int(n**0.5)+1):
            if n % i == 0:
                div.append(i)
                if i * i != n:
                    div.append(n // i)
        return div

    @staticmethod
    def div_set(n):
        div = set()
        for i in range(1, int(n**0.5)+1):
            if n % i == 0:
                div.add(i)
                div.add(n // i)
        return div

    @staticmethod
    def pfac_map(x):
        mp = {}
        t = x
        for i in range(2, int(x**0.5)+1):
            if t % i == 0:
                num = 0
                while t % i == 0:
                    t //= i
                    num += 1
                mp[i] = num
        if t != 1:
            mp[t] = 1
        return mp

    @staticmethod
    def is_prime(n):
        if n == 2:
            return True
        if n % 2 == 0 or n == 1:
            return False
        if n > sys.maxsize:
            return p02697.tameshiwari(n)
        d = n - 1
        s = 0
        while d % 2 == 0:
            d //= 2
            s += 1
        aa = [2, 3, 5, 7, 11, 13, 17]
        for a in aa:
            t = d
            y = p02697.repow(a, t, n)
            while t != n - 1 and y != 1 and y != n - 1:
                y = (y * y) % n
                t <<= 1
            if y != n - 1 and (t % 2) == 0:
                return False
        return True

    @staticmethod
    def tameshiwari(n):
        for i in range(2, int(n**0.5)+1):
            if n % i == 0:
                return False
        return True

    @staticmethod
    def div_list_long(n):
        div = []
        for i in range(1, int(n**0.5)+1):
            if n % i == 0:
                div.append(i)
                if i * i != n:
                    div.append(n // i)
        return div

    class NCK:
        def __init__(self, max_val=510000, mod_val=1000000007):
            self.max = max_val
            self.mod = mod_val
            self.fac = [0] * max_val
            self.finv = [0] * max_val
            self.inv = [0] * max_val
            self.fac[0] = self.fac[1] = 1
            self.finv[0] = self.finv[1] = 1
            self.inv[1] = 1
            for i in range(2, max_val):
                self.fac[i] = (self.fac[i-1] * i) % mod_val
                self.inv[i] = mod_val - self.inv[mod_val % i] * (mod_val // i) % mod_val
                self.finv[i] = (self.finv[i-1] * self.inv[i]) % mod_val

        def nCk(self, n, k):
            if n < k:
                return 0
            if n < 0 or k < 0:
                return 0
            return (self.fac[n] * (self.finv[k] * self.finv[n-k] % self.mod)) % self.mod

    @staticmethod
    def kmp(t, p):
        f = [0] * (len(p)+1)
        i = 0
        j = 1
        f[1] = 0
        while j < len(p):
            if i == 0 or p[i-1] == p[j-1]:
                i += 1
                j += 1
                f[j] = i
            else:
                i = f[i]
        i = 1
        j = 1
        while i <= len(p) and j <= len(t):
            if i == 0 or p[i-1] == t[j-1]:
                i += 1
                j += 1
            else:
                i = f[i]
        return j-i if i == len(p)+1 else -1

    @staticmethod
    def stsort(s):
        res = []
        for i in range(len(s)):
            res.append(s[:i] + s[i+1])
        return sorted(res)

    @staticmethod
    def next_permutation(per):
        if len(per) < 2:
            return False
        i = len(per) - 1
        while i > 0:
            if per[i-1] < per[i]:
                break
            i -= 1
        if i > 0:
            i -= 1
            j = len(per) - 1
            while j > i:
                if per[j] > per[i]:
                    break
                j -= 1
            per[i], per[j] = per[j], per[i]
            for k in range(i+1, (i+1+len(per)) // 2):
                per[k], per[len(per)-k+i] = per[len(per)-k+i], per[k]
            return True
        for k in range(len(per)):
            per[k], per[len(per)-k-1] = per[len(per)-k-1], per[k]
        return False

    @staticmethod
    def next_bits(b):
        for i in range(len(b)):
            if b[i]:
                b[i] = False
            else:
                b[i] = True
                return True
        return False

    class Scnr:
        def __init__(self, inp=sys.stdin):
            self.ins = inp
            self.buffer = bytearray()
            self.ptr = 0
            self.buflen = 0

        def has_next_byte(self):
            if self.ptr < self.buflen:
                return True
            else:
                self.ptr = 0
                try:
                    self.buffer = self.ins.read(1024)
                    self.buflen = len(self.buffer)
                except IOError as e:
                    print("An error occurred while reading input:", e)
                if self.buflen <= 0:
                    return False
            return True

        def read_byte(self):
            if self.has_next_byte():
                byte_val = self.buffer[self.ptr]
                self.ptr += 1
                return byte_val
            else:
                return -1

        def is_printable_char(self, c):
            return 33 <= c <= 126

        def has_next(self):
            while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
                self.ptr += 1
            return self.has_next_byte()

        def next(self):
            if not self.has_next():
                raise StopIteration("No more input available")
            sb = ""
            while True:
                b = self.read_byte()
                if self.is_printable_char(b):
                    sb += chr(b)
                else:
                    break
            return sb

        def next_double(self):
            return float(self.next())

        def next_long(self):
            if not self.has_next():
                raise StopIteration("No more input available")
            n = 0
            minus = False
            b = self.read_byte()
            if b == 45:  # '-' character
                minus = True
                b = self.read_byte()
            if b < 48 or b > 57:  # '0' to '9' characters
                raise ValueError("Invalid input format for a long number")
            while True:
                if 48 <= b <= 57:
                    n = n * 10 + (b - 48)
                elif b == -1 or not self.is_printable_char(b):
                    return -n if minus else n
                else:
                    raise ValueError("Invalid input format for a long number")
                b = self.read_byte()

        def next_int(self):
            nl = self.next_long()
            if not -2147483648 <= nl <= 2147483647:
                raise ValueError("Value out of range for an integer")
            return int(nl)

    sc = Scnr()
    out = sys.stdout

    @staticmethod
    def main():
        solve()

    @staticmethod
    def solve():
        n = sc.next_int()
        m = sc.next_int()
        if n % 2 == 1:
            f = 1
            t = n
            for i in range(m):
                out.write(f + " " + t + "\n")
                f += 1
                t -= 1
        else:
            f = 1
            t = n
            i = 0
            for i in range((m+1) // 2):
                out.write(f + " " + t + "\n")
                f += 1
                t -= 1
            t -= 1
            for i in range(i, m):
                out.write(f + " " + t + "\n")
                f += 1
                t -= 1
        out.flush()

if __name__ == "__main__":
    p02697.main()