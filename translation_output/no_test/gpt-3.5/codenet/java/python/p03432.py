```python
import sys

class FastFourierTransformModulo:
    def __init__(self, MODULO):
        for i in range(2, int(MODULO ** 0.5) + 1):
            if MODULO % i == 0:
                raise ValueError("Invalid modulo")
        self.MODULO = MODULO
        p2 = self.get_p2(MODULO)
        if p2 == 0:
            raise ValueError("Invalid modulo")
        self.roots = [0] * (p2 + 1)
        self.allpows = []
        self.allinvpows = []
        start = 2
        while pow(start, (MODULO - 1) // 2, MODULO) != 1:
            start += 1
        pw = MODULO - 1
        for i in range(p2 + 1):
            self.roots[i] = pow(start, pw, MODULO)
            self.allpows.append(self.make_pows(self.roots[i], (MODULO - 1) // pw))
            self.allinvpows.append(self.make_pows(pow(self.roots[i], MODULO - 2, MODULO), (MODULO - 1) // pw))

    @staticmethod
    def get_p2(MODULO):
        t = MODULO - 1
        p2 = 0
        while t % 2 == 0:
            t //= 2
            p2 += 1
        return p2

    def make_pows(self, a, k):
        res = [0] * (k + 1)
        res[0] = 1
        for i in range(1, k + 1):
            res[i] = a * res[i - 1] % self.MODULO
        return res

    def mul(self, a, b):
        n = self.next_power_of_two(len(a) + len(b) - 1)
        a += [0] * (n - len(a))
        b += [0] * (n - len(b))
        return self.pointwise_multiply(self.fft(a, False), self.fft(b, False))

    def pointwise_multiply(self, a, b):
        if len(a) != len(b):
            raise ValueError("Arrays should be of same length")
        c = [(a[i] * b[i]) % self.MODULO for i in range(len(a))]
        return c

    def pow(self, a, k):
        if k == 0:
            return 1
        if k % 2 == 0:
            return self.pow(a * a % self.MODULO, k // 2)
        return a * self.pow(a, k - 1) % self.MODULO

    def fft(self, arr, inv):
        n = len(arr)
        invbits = [self.calc_inv_bits(i, n) for i in range(n)]
        for i in range(n):
            j = invbits[i]
            if j > i:
                arr[i], arr[j] = arr[j], arr[i]
        for p2 in range(1, n):
            pow2 = 1
            w = self.roots[pow2]
            ap = self.allpows[pow2]
            if inv:
                w = self.pow(w, self.MODULO - 2)
                ap = self.allinvpows[pow2]
            big = 0
            while big < n:
                cur, curp = 1, 0
                small = big
                while small < big + p2:
                    i, j = small, small + p2
                    u, o = arr[i], arr[j]
                    v = (o * cur) % self.MODULO
                    arr[i] = (u + v) % self.MODULO
                    arr[j] = (u - v) % self.MODULO
                    curp += 1
                    cur = ap[curp]
                    small += 1
                big += 2 * p2
        return arr

    def calc_inv_bits(self, at, total):
        res = 0
        rev = total >> 1
        p2 = 1
        while p2 < total:
            if at & p2 != 0:
                res |= rev
            p2 <<= 1
            rev >>= 1
        return res

    @staticmethod
    def next_power_of_two(x):
        if x <= 0 or x > 1 << 30:
            raise ValueError("Invalid input")
        if x == 0 or x & (x - 1) == 0:
            return x
        return 1 << x.bit_length()

def pow(a, k, MODULO):
    if k == 0:
        return 1
    if k % 2 == 0:
        return pow((a * a) % MODULO, k // 2, MODULO)
    return (a * pow(a, k - 1, MODULO)) % MODULO

MODULO = 998244353
ROOTS = FastFourierTransformModulo(MODULO)
INVFACTS = []
FACTS = []
INVS = [0] * 8012
INVS[1] = 1
for i in range(2, 8012):
    INVS[i] = (MODULO - (MODULO // i) * INVS[MODULO % i] * MODULO) % MODULO
FACTS = [0] * 8012
INVFACTS = [0] * 8012
FACTS[0] = 1
INVFACTS[0] = 1
for i in range(1, 8012):
    FACTS[i] = (FACTS[i - 1] * i) % MODULO
    INVFACTS[i] = (INVFACTS[i - 1] * INVS[i]) % MODULO

def solve():
    m, n = map(int, input().split())
    w = [0] * (m + 1)
    nw = [0] * (m + 1)
    tw = [0] * (m + 1)
    for i in range(m + 1):
        w[i] = (FACTS[m] * INVFACTS[m - i]) % MODULO

    other = [0] * (m + 1)
    for i in range(3, m + 3):
        other[m + 2 - i] = INVFACTS[i]

    for step in range(n):
        for i in range(m + 1):
            tw[i] = (w[i] * (i + 1) * (i + 2)) % MODULO
        prod = ROOTS.mul(tw, other)
        for i in range(m + 1):
            s = prod[m + i]
            s %= MODULO
            s = (s + w[i] * (1 + i * (i + 1) // 2)) % MODULO
            nw[i] = s

        w, nw = nw, w

    res = w[0]
    print(res)

if __name__ == "__main__":
    solve()
```
