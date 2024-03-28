```python
import sys
import math

class BigInt:
    def __init__(self, arr):
        self.w = arr
        self.MOD = 100000000

    def clone(self):
        return BigInt(self.w[:])

    def digit_sum(self):
        total_sum = 0
        for num in self.w:
            total_sum += self.digit_sum_helper(num)
        return total_sum

    def digit_sum_helper(self, num):
        digit_sum = 0
        while num >= 1:
            digit_sum += num % 10
            num //= 10
        return digit_sum

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

def can_make(n, bigint):
    bigint.add(n)
    return bigint.digit_sum() <= n

def solve(N):
    n = len(N)
    bigint = BigInt([int(char) for char in N])
    bigint.multiply(9)
    
    ok = n * 10
    ng = 0
    while abs(ok - ng) > 1:
        med = (ok + ng) // 2
        if can_make(med, bigint.clone()):
            ok = med
        else:
            ng = med
    return (ok + 8) // 9

def main():
    N = input().strip()
    print(solve(N))

if __name__ == '__main__':
    main()
```
```python```
