from sys import stdin, stdout

class Modular:
    def __init__(self, m):
        self.m = m
    
    def value_of(self, x):
        x %= self.m
        if x < 0:
            x += self.m
        return x
    
    def mul(self, x, y):
        return self.value_of(x * y)
    
    def plus(self, x, y):
        return self.value_of(x + y)

class Combination:
    def __init__(self, factorial):
        self.factorial = factorial
        self.modular = factorial.modular

class Factorial:
    def __init__(self, fact, inv, in_val, limit, modular):
        self.modular = modular
        self.fact = fact
        self.inv = inv
        self.fact[0] = self.inv[0] = 1
        for i in range(1, limit + 1):
            self.fact[i] = self.modular.mul(self.fact[i - 1], i)
            self.inv[i] = self.modular.mul(self.inv[i - 1], in_val.inv[i])

class InverseNumber:
    def __init__(self, inv, limit, modular):
        self.inv = inv
        self.inv[1] = 1
        p = modular.m
        for i in range(2, limit + 1):
            k = p // i
            r = p % i
            self.inv[i] = modular.mul(-k, self.inv[r])

class FastInput:
    def __init__(self, fp):
        self.fp = fp
        self.buf = [0] * (1 << 20)
        self.buf_len = 0
        self.buf_offset = 0
        self.next = 0

    def read(self):
        while self.buf_len == self.buf_offset:
            self.buf_offset = 0
            self.buf_len = self.fp.readinto(self.buf)
            if self.buf_len == 0:
                return -1
        return self.buf[self.buf_offset]
    
    def skip_blank(self):
        while self.next >= 0 and self.next <= 32:
            self.next = self.read()
    
    def read_int(self):
        sign = 1

        self.skip_blank()
        if self.next == 43 or self.next == 45: # ASCII values of '+' and '-'
            sign = 1 if self.next == 43 else -1
            self.next = self.read()

        val = 0
        if sign == 1:
            while self.next >= 48 and self.next <= 57: # ASCII values of '0' to '9'
                val = val * 10 + self.next - 48
                self.next = self.read()
        else:
            while self.next >= 48 and self.next <= 57:
                val = val * 10 - self.next + 48
                self.next = self.read()

        return val

class FastOutput:
    def __init__(self, fp):
        self.fp = fp
        self.cache = []
    
    def append(self, csq):
        self.cache.append(csq)
        return self

    def flush(self):
        self.fp.write(''.join(map(str, self.cache)))
        self.fp.flush()
        self.cache = []

def main():
    in_val = FastInput(stdin.buffer)
    out = FastOutput(stdout.buffer)

    n = in_val.read_int() * 3
    mod = Modular(in_val.read_int())
    a = [0] * (n + 1)
    for i in range(n + 1):
        a[i] = [0] * (n + n + 1)
        
    for i in range(n + 1):
        for j in range(n + n + 1):
            a[i][j] = -1
    
    zero = n

    def f(i, j):
        nonlocal a
        if i == 0:
            return 1 if j == zero else 0
        if i < 0 or j >= len(a[i]) or j < 0:
            return 0
        if a[i][j] == -1:
            a[i][j] = f(i - 1, j - 1)
            a[i][j] = mod.plus(a[i][j], mod.mul(i - 1, f(i - 2, j + 1)))
            a[i][j] = mod.plus(a[i][j], mod.mul(pick2(i - 1), f(i - 3, j)))
        return a[i][j]

    def pick2(n):
        return mod.mul(n, (n - 1))

    ans = 0
    for i in range(n + 1):
        ans = mod.plus(ans, f(n, i + zero))

    out.append(str(ans)).append('\n')
    out.flush()

if __name__ == '__main__':
    main()