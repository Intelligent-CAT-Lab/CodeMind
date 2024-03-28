import sys

class BigInt:
    def __init__(self, N):
        self.N = list(map(int, N))

    def multiply(self, n):
        carry = 0
        for i in range(len(self.N)):
            temp = self.N[i] * n + carry
            self.N[i] = temp % 10
            carry = temp // 10

    def add(self, n):
        carry = n
        for i in range(len(self.N)):
            temp = self.N[i] + carry
            self.N[i] = temp % 10
            carry = temp // 10

    def digitSum(self):
        return sum(self.N)

    def clone(self):
        return BigInt(self.N.copy())

def canMake(n, bigint):
    bigint.add(n)
    return bigint.digitSum() <= n

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

def main():
    N = sys.stdin.readline().strip()
    print(solve(N))

if __name__ == "__main__":
    main()