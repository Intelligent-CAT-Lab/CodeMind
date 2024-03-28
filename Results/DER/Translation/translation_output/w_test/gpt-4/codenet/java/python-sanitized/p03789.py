# No need for an input reader in Python as input handling is direct and simple

def solve(N):
    n = len(N)
    bigint = BigInt(N)
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


def can_make(n, bigint):
    bigint.add(n)
    return bigint.digit_sum() <= n


class BigInt:
    MOD = 100000000

    def __init__(self, value):
        if isinstance(value, str):
            revint = [int(digit) for digit in value[::-1]] + [0] * 64  # +64 extra space
            self.w = [0] * ((len(value) + 7) // 8 + 4)
            for i in range(len(self.w)):
                for j in range(8*i, min(8*(i+1), len(revint))):
                    self.w[i] *= 10
                    self.w[i] += revint[j]
        elif isinstance(value, list):
            self.w = value

    def clone(self):
        return BigInt(self.w.copy())

    def digit_sum(self):
        return sum(self._digit_sum(wi) for wi in self.w)

    def _digit_sum(self, wi):
        s = 0
        while wi >= 1:
            s += wi % 10
            wi //= 10
        return s

    def multiply(self, n):
        carry = 0
        for i, val in enumerate(self.w):
            self.w[i] = val * n + carry
            carry, self.w[i] = divmod(self.w[i], self.MOD)

    def add(self, n):
        self.w[0] += n
        for i in range(len(self.w) - 1):
            if self.w[i] < self.MOD:
                break
            else:
                carry, self.w[i] = divmod(self.w[i], self.MOD)
                self.w[i+1] += carry


# Sample Test
input_number = input()  # Test input: 80
print(solve(input_number))  # Expected output: 2