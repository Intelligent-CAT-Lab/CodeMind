import sys

class In:
    def __init__(self):
        self.lines = sys.stdin.readlines()
        self.index = 0

    def next(self):
        self.index += 1
        return self.lines[self.index - 1].strip()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextFloat(self):
        return float(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextChar(self):
        return self.next()

    def nextCharArray(self, n):
        return [self.next() for _ in range(n)]

    def nextIntArray(self, n):
        return [int(x) for x in self.next().split()]

    def nextLongArray(self, n):
        return [long(x) for x in self.next().split()]

    def nextFloatArray(self, n):
        return [float(x) for x in self.next().split()]

    def nextDoubleArray(self, n):
        return [float(x) for x in self.next().split()]

class Out:
    def __init__(self):
        self.lines = []

    def println(self, *objects):
        self.lines.append(" ".join(map(str, objects)))

    def flush(self):
        print("\n".join(self.lines))

in_ = In()
out = Out()

def getPrimeFactors(n):
    primeFactors = {}
    c = n
    for i in range(2, int(n ** 0.5) + 1):
        count = 0
        while c % i == 0:
            count += 1
            c /= i
        if count > 0:
            primeFactors[i] = count
    if c > 1:
        primeFactors[c] = 1
    return primeFactors

def check(p, n):
    while n % p == 0:
        n /= p
        if n % p == 1:
            return True
    return False

def solve():
    n = in_.nextLong()
    ans = 0
    primeFactors2 = getPrimeFactors(n - 1)
    for p in range(2, int(n ** 0.5) + 1):
        if p * p == n:
            ans += 1
            continue
        if n % p == 0:
            if check(p, n):
                ans += 1
            if check(n / p, n):
                ans += 1
    a1 = 1
    for p, c in primeFactors2.items():
        a1 *= c + 1
    out.println(a1 + ans)

solve()
out.flush()