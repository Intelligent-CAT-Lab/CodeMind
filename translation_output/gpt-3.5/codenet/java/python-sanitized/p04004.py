import sys

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
    if r > n / 2:
        r = n - r
    return (((_fact[n] * _invfact[n - r]) % MOD) * _invfact[r]) % MOD

def prec(n):
    global _fact, _invfact
    _fact = [0] * (n + 1)
    _invfact = [0] * (n + 1)
    _fact[0] = 1
    _invfact[0] = 1
    for i in range(1, n+1):
        _fact[i] = _fact[i - 1] * i % MOD
        _invfact[i] = inv(_fact[i])

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray()
        self.curChar = 0
        self.numChars = 0

    def nextInts(self, n):
        ret = []
        for _ in range(n):
            ret.append(self.nextInt())
        return ret

    def nextIntTable(self, n, m):
        ret = []
        for _ in range(n):
            ret.append(self.nextInts(m))
        return ret

    def nextLongs(self, n):
        ret = []
        for _ in range(n):
            ret.append(self.nextLong())
        return ret

    def nextLongTable(self, n, m):
        ret = []
        for _ in range(n):
            ret.append(self.nextLongs(m))
        return ret

    def nextDoubles(self, n):
        ret = []
        for _ in range(n):
            ret.append(self.nextDouble())
        return ret

    def next(self):
        if self.numChars == -1:
            raise InputMismatchException()
        if self.curChar >= self.numChars:
            self.curChar = 0
            self.buf = self.stream.read(1024)
            self.numChars = len(self.buf)
            if self.numChars <= 0:
                return -1
        return self.buf[self.curChar]
        
    def nextChar(self):
        c = self.next()
        while self.isSpaceChar(c):
            c = self.next()
        if ord('a') <= c <= ord('z'):
            return chr(c)
        if ord('A') <= c <= ord('Z'):
            return chr(c)
        raise InputMismatchException()
    
    def nextToken(self):
        c = self.next()
        while self.isSpaceChar(c):
            c = self.next()
        res = bytearray()
        while not self.isSpaceChar(c):
            res.append(c)
            c = self.next()
        return res.decode()
    
    def nextInt(self):
        c = self.next()
        while self.isSpaceChar(c):
            c = self.next()
        sgn = 1
        if c == ord('-'):
            sgn = -1
            c = self.next()
        res = 0
        while not self.isSpaceChar(c):
            if c < ord('0') or c > ord('9'):
                raise InputMismatchException()
            res *= 10
            res += c - ord('0')
            c = self.next()
        return res * sgn
    
    def nextLong(self):
        c = self.next()
        while self.isSpaceChar(c):
            c = self.next()
        sgn = 1
        if c == ord('-'):
            sgn = -1
            c = self.next()
        res = 0
        while not self.isSpaceChar(c):
            if c < ord('0') or c > ord('9'):
                raise InputMismatchException()
            res *= 10
            res += c - ord('0')
            c = self.next()
        return res * sgn

    def nextDouble(self):
        return float(self.nextToken())

    def isSpaceChar(self, c):
        return c == ord(' ') or c == ord('\n') or c == ord('\r') or c == ord('\t') or c == -1

def main():
    in_stream = InputReader(sys.stdin.buffer)

    x = in_stream.nextInt()
    y = in_stream.nextInt()
    z = in_stream.nextInt()
    B = min(y, z)
    C = max(y, z)
    prec(1000000)

    pow3 = [0] * 1000000
    pow3[0] = 1
    for i in range(1, len(pow3)):
        pow3[i] = pow3[i - 1] * 3 % MOD

    ans = [0] * (x + y + z + 2)
    last = 0
    for l in range(x + 1, x + y + z + 2):
        space = l - 2
        base = comb(space, x - 1)
        row = space - (x - 1)
        if row == 0:
            last = 1
        elif row <= B:
            last = (last * 2) % MOD
        elif row <= C:
            last = (last * 2 - comb(row - 1, B) + MOD) % MOD
        else:
            d = (row - 1) - C
            last = (last * 2 - comb(row - 1, B) - comb(row - 1, d) + MOD + MOD) % MOD
        ans[l] = base * last % MOD * pow3[x + y + z + 1 - l] % MOD

    total_sum = sum(ans)
    print(total_sum % MOD)

if __name__ == "__main__":
    main()