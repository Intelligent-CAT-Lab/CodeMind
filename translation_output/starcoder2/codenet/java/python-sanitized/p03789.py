class BigInt:
    def __init__(self, w):
        self.w = w

    def clone(self):
        return BigInt(self.w.copy())

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
            c = self.w[i] // 100000000
            self.w[i] %= 100000000

    def add(self, n):
        self.w[0] += n
        for i in range(len(self.w)):
            if self.w[i] < 100000000:
                break
            up = self.w[i] // 100000000
            self.w[i] %= 100000000
            self.w[i+1] += up


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


def main():
    s = input()
    print(solve(s))


if __name__ == '__main__':
    main()