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

def canMake(n, bigint):
    bigint.add(n)
    return bigint.digitSum() <= n

class BigInt:
    def __init__(self, str):
        self.MOD = 100000000
        self.w = [0] * ((len(str) + 7) // 8 + 4)
        for i in range(len(str)):
            self.w[i // 8] += int(str[len(str) - 1 - i]) * (10 ** (i % 8))

    def clone(self):
        return BigInt(self.w[:])

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
        for i in range(len(self.w)):
            self.w[i] *= n
            self.w[i] += c
            c = self.w[i] // self.MOD
            self.w[i] %= self.MOD

    def add(self, n):
        self.w[0] += n
        for i in range(len(self.w) - 1):
            if self.w[i] < self.MOD:
                break
            up = self.w[i] // self.MOD
            self.w[i] %= self.MOD
            self.w[i + 1] += up

if __name__ == '__main__':
    N = input()
    print(solve(N))