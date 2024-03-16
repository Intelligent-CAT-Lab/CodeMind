class BigInt:
    def __init__(self, str):
        self.w = []
        self.MOD = 100000000
        self.str = str
        self.n = (len(str) + 7) // 8 + 4
        self.w = [0] * self.n
        for i in range(self.n):
            fr = (i+1)*8-1
            to = i*8
            for l in range(fr, to-1, -1):
                self.w[i] *= 10
                self.w[i] += ord(str[l]) - ord('0')

    def clone(self):
        big = BigInt(self.str)
        big.w = self.w.copy()
        return big

    def digitSum(self):
        sum = 0
        for wi in self.w:
            sum += self.digitSum(wi)
        return sum

    def digitSum(self, wi):
        w = 0
        while wi >= 1:
            w += wi % 10
            wi //= 10
        return w

    def multiply(self, n):
        c = 0
        for i in range(self.n):
            self.w[i] *= n
            self.w[i] += c
            c = self.w[i] // self.MOD
            self.w[i] %= self.MOD

    def add(self, n):
        self.w[0] += n
        for i in range(self.n):
            if self.w[i] < self.MOD:
                break
            up = self.w[i] // self.MOD
            self.w[i] %= self.MOD
            self.w[i+1] += up

def canMake(n, bigint):
    bigint.add(n)
    return bigint.digitSum() <= n

def solve(N):
    n = len(N)
    bigint = BigInt(N)
    bigint.multiply(9)

    ok = n * 10
    ng = 0
    while abs(ok - ng) > 1:
        med = (ok + ng) // 2
        if canMake(med, bigint.clone()):
            ok = med
        else:
            ng = med

    return (ok + 8) // 9

if __name__ == '__main__':
    N = input()
    print(solve(N))