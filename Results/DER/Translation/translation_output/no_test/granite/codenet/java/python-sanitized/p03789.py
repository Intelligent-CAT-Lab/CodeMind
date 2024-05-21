def solve(N):
    bigint = BigInt(N)
    bigint.multiply(9)

    ok = len(N) * 10
    ng = 0
    while abs(ok - ng) > 1:
        med = (ok + ng) // 2
        if canMake(med, bigint.clone()):
            ok = med
        else:
            ng = med
    return (ok + 8) // 9

def canMake(n, bigint):
    bigint.add(n)
    return bigint.digitSum() <= n

class BigInt:
    def __init__(self, w):
        self.w = w

    def clone(self):
        return BigInt(self.w[:])

    def digitSum(self):
        return sum(digitSum(wi) for wi in self.w)

    def add(self, n):
        self.w[0] += n
        for i in range(len(self.w)-1):
            if self.w[i] < 100000000:
                break
            up = self.w[i] // 100000000
            self.w[i] %= 100000000
            self.w[i+1] += up

    def multiply(self, n):
        c = 0
        for i in range(len(self.w)):
            self.w[i] *= n
            self.w[i] += c
            c = self.w[i] // 100000000
            self.w[i] %= 100000000

def digitSum(n):
    w = 0
    while n > 0:
        w += n % 10
        n //= 10
    return w