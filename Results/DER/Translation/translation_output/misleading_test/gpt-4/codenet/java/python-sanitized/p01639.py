import sys

class P01639:
    def __init__(self, n, k, x0):
        self.n = n
        self.k = k - 1
        self.x0 = x0
        self.solve()

    def solve(self):
        if self.x0 == 0:
            print("0")
            return

        x = self.x0
        s = int(1e4)
        count = [0] * s
        offset = 2**63
        M = s / 2**64

        for i in range(self.n):
            at = int(((x + offset) * M))
            at = max(0, min(at, s - 1))
            count[at] += 1
            x ^= x << 13
            x &= (2**64 - 1)  # Emulating 64-bit unsigned integer behavior
            x ^= x >> 7
            x ^= x << 17
            x &= (2**64 - 1)  # Emulating 64-bit unsigned integer behavior

        sum_ = 0
        length = -1
        target = -1
        for i in range(s):
            if sum_ <= self.k < sum_ + count[i]:
                target = i
                length = count[i]
                break
            sum_ += count[i]

        now = 0
        is_ = []
        x = self.x0
        for i in range(self.n):
            at = int(((x + offset) * M))
            at = max(0, min(at, s - 1))  # Clamp at between 0 and s-1
            if at == target:
                is_.append(x)
                now += 1
            x ^= x << 13
            x &= (2**64 - 1)  # Emulating 64-bit unsigned integer behavior
            x ^= x >> 7
            x ^= x << 17
            x &= (2**64 - 1)  # Emulating 64-bit unsigned integer behavior

        is_.sort()
        print(is_[self.k - sum_])

if __name__ == '__main__':
    n, k, x0 = map(int, sys.stdin.readline().split())
    P01639(n, k, x0)