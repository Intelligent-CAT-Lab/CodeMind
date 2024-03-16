```python
import sys
import math

class BigInt:
    def __init__(self, w):
        self.w = w
        self.MOD = 100000000

    def clone(self):
        return BigInt(self.w.copy())

    def digitSum(self):
        total_sum = 0
        for wi in self.w:
            total_sum += self.digitSumSingle(wi)
        return total_sum

    def digitSumSingle(self, wi):
        total = 0
        while wi >= 1:
            total += wi % 10
            wi //= 10
        return total

    def multiply(self, n):
        carry = 0
        for i in range(len(self.w)):
            self.w[i] *= n
            self.w[i] += carry
            carry = self.w[i] // self.MOD
            self.w[i] %= self.MOD

    def add(self, n):
        self.w[0] += n
        for i in range(len(self.w) - 1):
            if self.w[i] < self.MOD:
                break
            carry = self.w[i] // self.MOD
            self.w[i] %= self.MOD
            self.w[i + 1] += carry


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

def main():
    input_stream = sys.stdin.buffer
    output_stream = sys.stdout

    s = input_stream.readline().rstrip().decode()
    ans = solve(list(map(int, s)))
    output_stream.write(str(ans) + '\n')
    output_stream.flush()

if __name__ == "__main__":
    main()
```
```
