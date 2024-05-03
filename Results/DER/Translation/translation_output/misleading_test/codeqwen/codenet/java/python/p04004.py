Here is the Python version of the provided Java code:

```python
MOD = 1000000007

def pow(a, x):
    res = 1
    while x > 0:
        if x % 2 != 0:
            res = (res * a) % MOD
        a = (a * a) % MOD
        x //= 2
    return res

def inv(a):
    return pow(a, MOD - 2) % MOD

def comb(ln, lr):
    n = int(ln)
    r = int(lr)
    if n < 0 or r < 0 or r > n:
        return 0
    if r > n // 2:
        r = n - r
    return (((_fact[n] * _invfact[n - r]) % MOD) * _invfact[r]) % MOD

def prec(n):
    global _fact, _invfact
    _fact = [1] * (n + 1)
    _invfact = [1] * (n + 1)
    for i in range(1, n + 1):
        _fact[i] = _fact[i - 1] * i % MOD
        _invfact[i] = inv(_fact[i])

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.cur_char = 0
        self.num_chars = 0

    def next_ints(self, n):
        return [self.next_int() for _ in range(n)]

    def next_int_table(self, n, m):
        return [[self.next_int() for _ in range(m)] for _ in range(n)]

    def next_longs(self, n):
        return [self.next_long() for _ in range(n)]

    def next_long_table(self, n, m):
        return [[self.next_long() for _ in range(m)] for _ in range(n)]

    def next_doubles(self, n):
        return [self.next_double()
